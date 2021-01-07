package com.open.capacity.monitor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

/**
 * @author 作者 owen
 * @version 创建时间：2017年11月24日 下午5:34:47 类说明
 */
@RestController
public class MailController {
    @Autowired
    private JavaMailSender javaMailSender;

    @GetMapping("/send")
    public String send() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("597926353@qq.com");
        message.setTo("2548490406@qq.com");
        message.setSubject("测试邮件");
        message.setText("好好学习");
        javaMailSender.send(message);
        return "hello";
    }

    @GetMapping("/send1")
    public String send1() throws MessagingException {

        MimeMessage msg = javaMailSender.createMimeMessage();
        MimeMessageHelper msgHelper = new MimeMessageHelper(msg, true, "utf-8");

        msgHelper.setFrom("597926353@qq.com");
        msgHelper.setTo("2548490406@qq.com");
        msgHelper.setSubject("测试发送带附件的邮件");
        msgHelper.setText("测试邮件");

        FileSystemResource file = new FileSystemResource(new File("D:" + File.separator + "20171124150927.jpg"));
        msgHelper.addAttachment("20171124150927.jpg", file); // 添加附件

        // Properties prop = new Properties();
        // prop.put("mail.smtp.auth", "true");
        // prop.put("mail.smtp.timeout", "25000");
        // javaMailSender.setJavaMailProperties(prop);

        javaMailSender.send(msg);

        return "hello";
    }
}

/**
 * 初始化返回数据类型下拉框
 * @param cssSelect 下拉框cssId
 * @param url 下拉选择框的请求路径，必须要传入的参数
 * @param searchValue  需要查找的字典参数
 * @return req 回调函数以json格式返回数据
 */

function select(url,searchValue,cssSelect) {
    layui.use(['form', 'util', 'config', 'admin', 'formSelects'], function () {
        var form = layui.form;
        var config = layui.config;
        var layer = layui.layer;
        var util = layui.util;
        var admin = layui.admin;
        var formSelects = layui.formSelects;

        layer.load(2);
        admin.req(url, {
            searchKey: 'dictId',
            searchValue: searchValue
        }, function (req) {
            layer.closeAll('loading');
            if (req.code == 0) {
                // 渲染下拉框选项
                $.each(req.data, function () {
                    var orderOption = $("<option></option>").append(this.label).attr("value", this.value);
                    orderOption.appendTo(cssSelect);
                })
            } else {
                layer.msg('下拉框加载失败', {icon: 2, time: 2000});
            }
        }, 'GET');
    })
}

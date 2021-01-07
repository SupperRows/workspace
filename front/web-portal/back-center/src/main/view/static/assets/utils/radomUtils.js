/**
 * 随机数生成器
 */
function random_N0(j) {
    var random_no = "";
    let currDate = new Date();
    let year = currDate.getFullYear();
    let month = currDate.getMonth() + 1 < 10 ? "0" + (currDate.getMonth() + 1)
        : currDate.getMonth() + 1;
    let day = currDate.getDate() < 10 ? "0" + currDate.getDate() : currDate
        .getDate();
    // 获取年月日
    let date = year + month + day; // 20190524
    // 获取当时时间戳
    let timestamp = Date.parse(currDate); // 155866554500
    for (var i = 0; i < j; i++) // j位随机数，用以加在时间戳后面。
    {
        random_no += Math.floor(Math.random() * 10);
    }
    // 生成订单
    return date + random_no;
}
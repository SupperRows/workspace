/**
 * 时间处理工具类
 */
function getTime() {
    var myDate = new Date();
    let thisYear = myDate.getYear(); // 获取当前年份(2位)
    let thisFullYear = myDate.getFullYear(); // 获取完整的年份(4位,1970-????)
    let thisMouth = myDate.getMonth() + 1; // 获取当前月份(0-11,0代表1月)
    let thisDate = myDate.getDate(); // 获取当前日(1-31)
    let thisDay = myDate.getDay(); // 获取当前星期X(0-6,0代表星期天)
    let thisTime = myDate.getTime(); // 获取当前时间(从1970.1.1开始的毫秒数)
    let thisHours = myDate.getHours(); // 获取当前小时数(0-23)
    let thisMinutes = myDate.getMinutes(); // 获取当前分钟数(0-59)
    let thisSeconds = myDate.getSeconds(); // 获取当前秒数(0-59)
    let thisMilliseconds = myDate.getMilliseconds(); // 获取当前毫秒数(0-999)
    let mydate = myDate.toLocaleDateString(); // 获取当前日期
    var mytime = myDate.toLocaleTimeString(); // 获取当前时间
    if (thisMouth < 10) {
        thisMouth = '0' + thisMouth
    } else if (thisDate < 10) {
        thisDate = '0' + thisDate
    }
    var time = thisFullYear + '-' + thisMouth + '-' + thisDate
    return time;
}

function getDateTime() {
    var myDate = new Date();
    let thisYear = myDate.getYear(); // 获取当前年份(2位)
    let thisFullYear = myDate.getFullYear(); // 获取完整的年份(4位,1970-????)
    let thisMouth = myDate.getMonth() + 1; // 获取当前月份(0-11,0代表1月)
    let thisDate = myDate.getDate(); // 获取当前日(1-31)
    let thisDay = myDate.getDay(); // 获取当前星期X(0-6,0代表星期天)
    let thisTime = myDate.getTime(); // 获取当前时间(从1970.1.1开始的毫秒数)
    let thisHours = myDate.getHours(); // 获取当前小时数(0-23)
    let thisMinutes = myDate.getMinutes(); // 获取当前分钟数(0-59)
    let thisSeconds = myDate.getSeconds(); // 获取当前秒数(0-59)
    let thisMilliseconds = myDate.getMilliseconds(); // 获取当前毫秒数(0-999)
    let mydate = myDate.toLocaleDateString(); // 获取当前日期
    var mytime = myDate.toLocaleTimeString(); // 获取当前时间
    if (thisMouth < 10) {
        thisMouth = '0' + thisMouth
    } else if (thisDate < 10) {
        thisDate = '0' + thisDate
    }
    var datetime = thisFullYear + '-' + thisMouth + '-' + thisDate + ' ' + myDate.toString().substring(16, 24)
    return datetime;
}
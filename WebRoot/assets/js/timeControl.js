/**
 * Created by Administrator on 2017/10/17.
 */
$(function () {
    setInterval( function  getTime(){
        var myDate =new Date();
        var nowTime=myDate.toLocaleString();
        $("#time").text("当前时间是："+nowTime);
    },1000); //每隔一秒执行一次
});
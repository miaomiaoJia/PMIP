/**
 * Created by Administrator on 2017/11/1.
 */
$(function(){
    /*
     Ajax 三级联动
     settings 参数说明
     -----------------------
     url:省市数据josn文件路径
     department:默认院系
     domain:默认专业
     grade:默认班级
     nodata:无数据状
     required:必选项
     */
    (function($){
        $.fn.ddgSelect=function(settings){
            if(this.length<1){return;}
            settings=$.extend({
                url:"assets/js/major.min.js",
                department:"计算机与信息学院",
                domain:"计算机科学与技术",
                grade:"5班",
                nodata:null,
                required:true
            },settings);

            var box_obj=this;
            var depart_obj=box_obj.find("#department");
            var domain_obj=box_obj.find("#domain");
            var grade_obj=box_obj.find("#grade");
            var depart_val=settings.department;
            var domain_val=settings.domain;
            var grade_val=settings.grade;
            var select_prehtml=(settings.required) ? "" : "<option value=''>请选择</option>";
            var departmentSpecialty_json;

            // 赋值专业函数
            var domainStart=function(){
                var depart_id=depart_obj.get(0).selectedIndex;
                if(!settings.required){
                    depart_id--;
                };
                domain_obj.empty().attr("disabled",true);
                grade_obj.empty().attr("disabled",true);

                if(depart_id<0||typeof(departmentSpecialty_json.majorlist[depart_id].c)=="undefined"){
                    if(settings.nodata=="none"){
                        domain_obj.css("display","none");
                        grade_obj.css("display","none");
                    }else if(settings.nodata=="hidden"){
                        domain_obj.css("visibility","hidden");
                        grade_obj.css("visibility","hidden");
                    };
                    return;
                };

                // 遍历赋值专业下拉列表
                temp_html=select_prehtml;
                $.each(departmentSpecialty_json.majorlist[depart_id].c,function(i,domain){
                    temp_html+="<option value='"+domain.n+"'>"+domain.n+"</option>";
                });
                domain_obj.html(temp_html).attr("disabled",false).css({"display":"","visibility":""});
                gradeStart();
            };

            // 赋值班级函数
            var gradeStart=function(){
                var depart_id=depart_obj.get(0).selectedIndex;
                var domain_id=domain_obj.get(0).selectedIndex;
                if(!settings.required){
                    depart_id--;
                    domain_id--;
                };
                grade_obj.empty().attr("disabled",true);

                if(depart_id<0||domain_id<0||typeof(departmentSpecialty_json.majorlist[depart_id].c[domain_id].a)=="undefined"){
                    if(settings.nodata=="none"){
                        grade_obj.css("display","none");
                    }else if(settings.nodata=="hidden"){
                        grade_obj.css("visibility","hidden");
                    };
                    return;
                };

                // 遍历班级下拉列
                temp_html=select_prehtml;
                $.each(departmentSpecialty_json.majorlist[depart_id].c[domain_id].a,function(i,grade){
                    temp_html+="<option value='"+grade.s+"'>"+grade.s+"</option>";

                });
                grade_obj.html(temp_html).attr("disabled",false).css({"display":"","visibility":""});
            };

            var init=function(){
                // 遍历赋值学院下拉列表
                temp_html=select_prehtml;
                $.each(departmentSpecialty_json.majorlist,function(i,department){
                    temp_html+="<option value='"+department.p+"'>"+department.p+"</option>";
                });
                depart_obj.html(temp_html);

                // 若有传入学院与专业的值，则选中。（setTimeout为兼容IE6而设置）
                setTimeout(function(){
                    if(settings.department!=null){
                        depart_obj.val(settings.department);
                        domainStart();
                        setTimeout(function(){
                            if(settings.domain!=null){
                                domain_obj.val(settings.domain);
                                domainStart();
                                setTimeout(function(){
                                    if(settings.grade!=null){
                                        grade_obj.val(settings.grade);
                                    };
                                },1);
                            };
                        },1);
                    };
                },1);

                // 选择学院时发生事件
                depart_obj.on("change",function(){
                    domainStart();
                });

                // 选择专业时发生事件
                domain_obj.on("change",function(){
                    gradeStart();
                });
            };

            // 设置省市json数据
            if(typeof(settings.url)=="string"){
                $.getJSON(settings.url,function(json){
                    departmentSpecialty_json=json;
                    init();
                });
            }else{
                departmentSpecialty_json=settings.url;
                init();
            };
        };
    })(jQuery);
    
    /**
     * 设置日期控件
     * @author WBF
     * **/
//    $("#date").datetimepicker({
//        startView:4,
//        maxView:4,
//        minView:2,
//        format: "yyyy-mm-dd ",
//        autoclose: true,
//        todayBtn: true,
//        todayHighlight:true
//    });

    /**
     * 设置定时器
     * @author WBF
     * */
    setInterval( function  getTime(){
        var myDate =new Date();
        var nowTime=myDate.toLocaleString();
        $("#time").text(nowTime);
    },1000); //每隔一秒执行一次

    $("#button1").on("click",function () {
        $("#selector").addClass("hidden")
        $("#selectedStudents").removeClass("hidden");
    })

    $("#leading-in").on("click",function () {
        $("#title").text("单个添加学生信息")
        $("#control").toggleClass("hidden")
        $("#introduction").addClass("hidden")
        $("#studentInfo").removeClass("hidden")
    })

    $("#batch-import").on("click",function () {
        $("#control").toggleClass("hidden")
        $("#title").text("批量导入学生信息")
        $("#introduction").addClass("hidden")
        $("#studentsInfo").removeClass("hidden")
    })

   

    /**
     * 设置鼠标聚焦和鼠标离开事件
     * @author wbf
     */
    var inputs=$("#inputs").find("input")

    inputs.each(function(i,element) {
        $(element).on("focus",function () {
            this.value=" "
        }).on("blur",function () {
                if(this.value===" "||this.value==null){
                    this.value=$(this).attr("placeholder");
                }
                var c=this.name;
                switch(c){
                    case "studentId":idCheck(this);break;
                    case "studentName":nameCheck(this);break;
                }
        })
    });

    /**
     * 表单校验
     * @author wbf
     */
    function idCheck(id) {
        var reg=/^\d{10}(\d{2})?$/;
        var item=$(id).parent();
        if(reg.test(id.value)==true){
            if(item.hasClass("has-error")){
                item.removeClass("has-error").addClass("has-success")
            }else {
                item.addClass("has-success")
            }
        }else{
            item.addClass("has-error")
        }
    }

    function nameCheck(name) {
        var reg=/^[\u4e00-\u9fa5]{1}[\u4e00-\u9fa5\·]{0,8}[\u4e00-\u9fa5]{1}$/;     //汉字  · 空格 是合法的
        var rel = new RegExp("^([a-zA-Z\\s]+)$");//英文
        var item=$(name).parent();
        if(reg.test(name.value)==true||rel.test(name.value)==true){
            if(item.hasClass("has-error")) {
                item.removeClass("has-error").addClass("has-success");
            }else {
                item.addClass("has-success")
            }
        }else{
            item.addClass("has-error")
        }

    }


    $("#myform").on("submit",function () {
        return checkForm();
    })
    function checkForm() {

    }



    /*实现三级联动*/
    $("#departmentSpecialty").ddgSelect({
        url:"assets/js/major.min.js",
        department:"计算机与信息学院",
        domain:"计算机科学与技术",
        grade:"5班",
        nodata:"none"
    });


    获取搜索的学生记录
     var students={
         "selectedStudents":[
             {   department:"计算机与信息学院",
                 grade:"2015级",
                 domain:"计算机科学与技术",
                 classes:"5",
                 id:1506010512,
                 name:"金培源",
                 sex:"男",
                 politicalStatus:"预备党员",
                 GPA:5.0
             },
             {   department:"计算机与信息学院",
                 grade:"2015级",
                 domain:"计算机科学与技术",
                 classes:"5",
                 id:1506010513,
                 name:"王秉发",
                 sex:"男",
                 politicalStatus:"入党积极分子",
                 GPA:5.0
             }
         ]
     }

    var records=6;           //查询到的记录数
    var column=10            //表格的列数
    var index=new Array("department","grade","domain","classes","id","name","sex","politicalStatus","GPA");

   for(var i=0;i<records;i++){
       //创建行结点
       var $tr=$("<tr></tr>")
       for(var j=0;j<10;j++){
           var $th=$("<th></th>");
           var $href=$("<a href='manageStudent.html'>更多>></a>")
           var c=index[j];
           switch(c) {
               case "department":$th.html(students.selectedStudents[i].department);break;
               case "grade":$th.html(students.selectedStudents[i].grade);break;
               case "domain":$th.html(students.selectedStudents[i].domain);break;
               case "classes":$th.html(students.selectedStudents[i].classes);break;
               case  "id":$th.html(students.selectedStudents[i].id);break;
               case  "name":$th.html(students.selectedStudents[i].name);break;
               case "sex":$th.html(students.selectedStudents[i].sex);break;
               case "GPA":$th.html(students.selectedStudents[i].GPA);break;
               case "politicalStatus":$th.html(students.selectedStudents[i].politicalStatus);break;
               default:$th.append($href);break;
           }
           $th.appendTo($tr)
       }
       $tr.appendTo("tbody")
   }

})

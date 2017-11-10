package cn.hhu.ssm.pojo;

import java.util.Date;

public class Student {
    private Integer id;

    private String studentname;

    private String studentnumber;

    private String sex;

    private String password;

    private String studentclass;

    private String email;

    private Integer state;

    private Date indirectingtime;

    private Date activisttime;

    private Date developementtime;

    private Date probationarytime;

    private Date fullmembertime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname == null ? null : studentname.trim();
    }

    public String getStudentnumber() {
        return studentnumber;
    }

    public void setStudentnumber(String studentnumber) {
        this.studentnumber = studentnumber == null ? null : studentnumber.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getStudentclass() {
        return studentclass;
    }

    public void setStudentclass(String studentclass) {
        this.studentclass = studentclass == null ? null : studentclass.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getIndirectingtime() {
        return indirectingtime;
    }

    public void setIndirectingtime(Date indirectingtime) {
        this.indirectingtime = indirectingtime;
    }

    public Date getActivisttime() {
        return activisttime;
    }

    public void setActivisttime(Date activisttime) {
        this.activisttime = activisttime;
    }

    public Date getDevelopementtime() {
        return developementtime;
    }

    public void setDevelopementtime(Date developementtime) {
        this.developementtime = developementtime;
    }

    public Date getProbationarytime() {
        return probationarytime;
    }

    public void setProbationarytime(Date probationarytime) {
        this.probationarytime = probationarytime;
    }

    public Date getFullmembertime() {
        return fullmembertime;
    }

    public void setFullmembertime(Date fullmembertime) {
        this.fullmembertime = fullmembertime;
    }
}
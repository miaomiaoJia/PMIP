package cn.hhu.ssm.pojo;

import java.util.Date;

public class News {
    private Integer id;

    private String newstitle;

    private String newscontent;

    private Date newstime;

    private Integer newsstate;

    private Integer studentId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNewstitle() {
        return newstitle;
    }

    public void setNewstitle(String newstitle) {
        this.newstitle = newstitle == null ? null : newstitle.trim();
    }

    public String getNewscontent() {
        return newscontent;
    }

    public void setNewscontent(String newscontent) {
        this.newscontent = newscontent == null ? null : newscontent.trim();
    }

    public Date getNewstime() {
        return newstime;
    }

    public void setNewstime(Date newstime) {
        this.newstime = newstime;
    }

    public Integer getNewsstate() {
        return newsstate;
    }

    public void setNewsstate(Integer newsstate) {
        this.newsstate = newsstate;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }
}
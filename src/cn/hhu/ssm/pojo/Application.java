package cn.hhu.ssm.pojo;

public class Application {
    private Integer id;

    private String category;

    private String applicationname;

    private String applicationurl;

    private Integer studentId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getApplicationname() {
        return applicationname;
    }

    public void setApplicationname(String applicationname) {
        this.applicationname = applicationname == null ? null : applicationname.trim();
    }

    public String getApplicationurl() {
        return applicationurl;
    }

    public void setApplicationurl(String applicationurl) {
        this.applicationurl = applicationurl == null ? null : applicationurl.trim();
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }
}
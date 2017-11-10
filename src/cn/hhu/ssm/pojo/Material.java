package cn.hhu.ssm.pojo;

public class Material {
    private Integer id;

    private Integer studentId;

    private String materialname;

    private String materialurl;

    private Integer state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getMaterialname() {
        return materialname;
    }

    public void setMaterialname(String materialname) {
        this.materialname = materialname == null ? null : materialname.trim();
    }

    public String getMaterialurl() {
        return materialurl;
    }

    public void setMaterialurl(String materialurl) {
        this.materialurl = materialurl == null ? null : materialurl.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
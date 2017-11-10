package cn.hhu.ssm.pojo;

public class Grade {
    private Integer id;

    private Integer studentId;

    private Double grade;

    private Double cet4grade;

    private Double cet6grade;

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

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    public Double getCet4grade() {
        return cet4grade;
    }

    public void setCet4grade(Double cet4grade) {
        this.cet4grade = cet4grade;
    }

    public Double getCet6grade() {
        return cet6grade;
    }

    public void setCet6grade(Double cet6grade) {
        this.cet6grade = cet6grade;
    }
}
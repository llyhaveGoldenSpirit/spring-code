package com.lly.springbootmybatis.pojo;

public class Teachers {
    private Integer tid;
    private String tpwd;
    private String tname;
    private String tacademy;

    public Teachers() {
    }

    public Teachers(Integer tid, String tpwd, String tname, String tacademy) {
        this.tid = tid;
        this.tpwd = tpwd;
        this.tname = tname;
        this.tacademy = tacademy;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTpwd() {
        return tpwd;
    }

    public void setTpwd(String tpwd) {
        this.tpwd = tpwd;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getTacademy() {
        return tacademy;
    }

    public void setTacademy(String tacademy) {
        this.tacademy = tacademy;
    }

    @Override
    public String toString() {
        return "Teachers{" +
                "tid=" + tid +
                ", tpwd='" + tpwd + '\'' +
                ", tname='" + tname + '\'' +
                ", tacademy='" + tacademy + '\'' +
                '}';
    }
}

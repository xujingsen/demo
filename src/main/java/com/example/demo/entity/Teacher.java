package com.example.demo.entity;

public class Teacher {
    private int Tid;
    private String Tname;

    public Teacher(int tid, String tname) {
        Tid = tid;
        Tname = tname;
    }

    public Teacher() {
    }

    public int getTid() {
        return Tid;
    }

    public void setTid(int tid) {
        Tid = tid;
    }

    public String getTname() {
        return Tname;
    }

    public void setTname(String tname) {
        Tname = tname;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "Tid=" + Tid +
                ", Tname='" + Tname + '\'' +
                '}';
    }
}

package by.bsu.student.utils;

import java.util.Date;

public class Student extends Person {

    private String facultet;
    private int kurs;
    private int group;

    public Student(int id, String secondname, String name, String otchestvo, int databirthday, String adress, String phone,
                   String facultet, int kurs, int group) {
        super(id, secondname, name, otchestvo, databirthday, adress, phone);
        this.facultet = facultet;
        this.kurs = kurs;
        this.group = group;
    }

    public String getFacultet() {
        return facultet;
    }

    public void setFacultet(String facultet) {
        this.facultet = facultet;
    }

    public int getKurs() {
        return kurs;
    }

    public void setKurs(int kurs) {
        this.kurs = kurs;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" + this.toString2() +
                "facultet='" + facultet + '\'' +
                ", kurs=" + kurs +
                ", group=" + group +
                '}';
    }
}

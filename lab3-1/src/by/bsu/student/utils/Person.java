package by.bsu.student.utils;

import java.util.Date;

public class Person {

    private int id;
    private String secondname;
    private String name;
    private String otchestvo;
    private int databirthday;
    private String adress;
    private String phone;

    public Person(int id, String secondname, String name, String otchestvo, int databirthday, String adress, String phone) {
        this.id = id;
        this.secondname = secondname;
        this.name = name;
        this.otchestvo = otchestvo;
        this.databirthday = databirthday;
        this.adress = adress;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOtchestvo() {
        return otchestvo;
    }

    public void setOtchestvo(String otchestvo) {
        this.otchestvo = otchestvo;
    }

    public int getDatabirthday() {
        return databirthday;
    }

    public void setDatabirthday(int databirthday) {
        this.databirthday = databirthday;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public String toString2() {
        return "Person{" +
                "id=" + id +
                ", familiya='" + secondname + '\'' +
                ", name='" + name + '\'' +
                ", otchestvo='" + otchestvo + '\'' +
                ", databirthday=" + databirthday +
                ", adress='" + adress + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}

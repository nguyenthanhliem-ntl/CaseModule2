package model;

import java.io.Serializable;

public class Employee implements Serializable {
    private String id;
    private String name;
    private int age;
    private String address;
    private String gender;
    private String phone;
    private String email;
    private int congNV;

    public Employee() {

    }

    public Employee(String id, String name, int age, String address, String gender, String phone, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
    }

    public Employee(String id, String name, int age, String address, String gender, String phone, String email, int congNV) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
        this.congNV = congNV;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail(String s) {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCongNV() {
        return congNV;
    }

    public void setCongNV(int congNV) {
        this.congNV = congNV;
    }

    @Override
    public String toString() {
        return "model.Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", congNV=" + congNV +
                '}' + "\n";
    }

}

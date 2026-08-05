package com.MVC.Spring_MVC.dto;

import java.time.LocalDate;

public class Employeedto {
    private Long empid;
    private String name;
    private String email;
    private Integer age;
    private LocalDate doj;
    private boolean isActive;

    public Long getEmpid() {
        return empid;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Integer getAge() {
        return age;
    }

    public Employeedto() {
    }

    public Employeedto(Long empid, String name, String email, Integer age, LocalDate doj, boolean isActive) {
        this.empid = empid;
        this.name = name;
        this.email = email;
        this.age = age;
        this.doj = doj;
        this.isActive = isActive;
    }

    public void setEmpid(Long empid) {
        this.empid = empid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setDoj(LocalDate doj) {
        this.doj = doj;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public LocalDate getDoj() {
        return doj;
    }

    public boolean isActive() {
        return isActive;
    }
}

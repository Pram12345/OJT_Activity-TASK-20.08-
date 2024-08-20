package com.crud.model;

import org.springframework.format.annotation.DateTimeFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private String dob;

    private String mail;
    private String city;
    private String pass;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDob() { return dob; }
    public void setDob(String dob) { this.dob = dob; }
    public String getMail() { return mail; }
    public void setMail(String mail) { this.mail = mail; }
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
    public String getPass() { return pass; }
    public void setPass(String pass) { this.pass = pass; }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", dob=" + dob + ", mail=" + mail + ", city=" + city + ", pass=" + pass + "]";
    }
}

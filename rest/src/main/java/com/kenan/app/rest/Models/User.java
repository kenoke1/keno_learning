package com.kenan.app.rest.Models;

import jakarta.persistence.*;
//novi branch
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private int age;
    @Column
    private String occupation;
    // username, password, email, licna karta, 

    public void setId(long id){
        this.id = id;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstname){
        this.firstName = firstname;
    }
    public String getLastName(){
        return lastName;

    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getOccupation(){
        return occupation;
    }
    public void setOccupation(String occupation){
        this.occupation = occupation;
    }

}

package com.dbs.hackathon.model;

import javax.persistence.*;

@Entity
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="personid")
    private int id;

    public int getId() {
        return id;
    }

    @Column(name="fullname")
    private String name;

    public String getName(){
        return name;
    }

}

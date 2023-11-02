package com.example.backend_forms;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class User {
    @Id
    private ObjectId _id;
    private String name;
    private String surname;
    private String username;
    private Country country;
    private String id;

    public User(String name, String surname, String username, String id, Country country) {
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.id = id;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Country getCountry() {
        return country;
    }

    public String getUsername() {
        return username;
    }

    public String getId() {
        return id;
    }
}


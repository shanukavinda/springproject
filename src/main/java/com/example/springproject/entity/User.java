package com.example.springproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor //constructor with all parameters
@NoArgsConstructor //default constructor
@Data //getters and setters
public class User {
    @Id //annotates the primary id
    private int id;
    private String name;
    private String address;
}

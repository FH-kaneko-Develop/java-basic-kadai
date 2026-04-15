package com.example.springkadaitodo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "todos")
public class ToDo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 50)
    private String title;

    @Column(nullable = false, length = 10)
    private String priority;

    @Column(nullable = false, length = 10)
    private String status;

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getPriority() {
        return priority;
    }

    public String getStatus() {
        return status;
    }
}

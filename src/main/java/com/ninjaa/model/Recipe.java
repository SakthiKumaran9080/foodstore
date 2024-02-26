package com.ninjaa.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;

    //one user can create multiple
    @ManyToOne
    private User user;
    private String image;
    private String description;
    private boolean vegitarian;
    private LocalDateTime createdAt;
    private List<Long> likes=new ArrayList<>();


}

package com.shop.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Board {

    @Id
    @Column(name = "board_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private String content;

    private String filename;

    private String filepath;

}

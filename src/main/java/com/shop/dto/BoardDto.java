package com.example.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardDto {

    private Integer id;

    private String title;

    private String content;

    private String filename;

    private String filepath;
}

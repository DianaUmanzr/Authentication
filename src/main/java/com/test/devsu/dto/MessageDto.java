package com.test.devsu.dto;

import lombok.Data;

@Data
public class MessageDto {
    private String message;
    private String to;
    private String from;
    private int timeToLifeSec;
}

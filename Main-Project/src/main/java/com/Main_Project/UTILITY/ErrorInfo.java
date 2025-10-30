package com.Main_Project.UTILITY;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ErrorInfo {

    private String errorMessage;
    private Integer errorCode;
    private LocalDateTime timeStamp;
}

package com.baseprojecttemplate.test.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReturnResult<T> {
    private int code;
    private String msg;
    private T data;
}

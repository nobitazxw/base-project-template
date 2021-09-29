package com.baseprojecttemplate.test.service;

import com.baseprojecttemplate.test.bean.ReturnResult;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DemoTest {

    @Autowired
    private Demo demo;

    @Test
    public void test(){
        ReturnResult<List<String>> test = demo.test();
        System.out.println(test);
    }

}
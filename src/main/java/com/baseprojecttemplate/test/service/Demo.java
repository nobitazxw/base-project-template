package com.baseprojecttemplate.test.service;

import com.baseprojecttemplate.test.bean.ReturnResult;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Demo {
    //测试方式
    public ReturnResult<List<String>> test(){
        List list = new ArrayList();
        list.add("你好");
        list.add("世界");
        list.add("!");
        ReturnResult result = new ReturnResult();
        result.setData(list);
        return result ;
    }
}

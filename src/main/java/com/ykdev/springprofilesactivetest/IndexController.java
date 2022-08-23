package com.ykdev.springprofilesactivetest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class IndexController {
    @Value("${prof.data1}")
    private String data1;

    @Value("${prof.data2}")
    private String data2;

    @Value("${prof.data3}")
    private String data3;

    @Value("${prof.data4}")
    private String data4;

    @GetMapping("/")
    public Map<String,String> index() {
        return new HashMap<>() {
            {
                put("key1", data1);
                put("key2", data2);
                put("key3", data3);
                put("key4", data4);
            }
        };
    }
}

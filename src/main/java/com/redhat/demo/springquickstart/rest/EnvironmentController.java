package com.redhat.demo.springquickstart.rest;

import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class EnvironmentController {

    @Autowired
    private Environment env;

    @Value("${demo.message}")
    private String environmentMessage;
    
    @GetMapping("/environment")
    public String getEnvironment() {
        return environmentMessage;
    }

    @GetMapping("/environment/active")
    public List<String> getActive() {
        return Arrays.asList(env.getActiveProfiles());
    }

    @GetMapping("/environment/configmap")
    public Map<String, String> getConfig() {
        Map<String, String> configMap = new HashMap<>();
        configMap.put("env", "dev");
        return configMap;
    }
}
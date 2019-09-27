package com.ry.config.configclient;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RefreshScope
@RequestMapping("/rest")
@RestController
public class MessageResource {    
    
    @Autowired
	private Configuration configuration;

    @GetMapping("/message")
    public String message() {
        return configuration.getMessage();
    }
}

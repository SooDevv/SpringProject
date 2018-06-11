package com.example.demo;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiMessageController {

    @Autowired
    private MessageService service;

    @GetMapping("/api/v1/messages")
    public List<Message> messages(Model model) {
       
    	List<Message> list = service.getRecentMessages(100);
    	list.add(new Message("TEST", "Test contents", "127.0.0.1"));
        return list;
    }

}





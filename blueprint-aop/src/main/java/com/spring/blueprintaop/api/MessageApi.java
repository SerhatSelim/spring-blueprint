package com.spring.blueprintaop.api;

import com.spring.blueprintaop.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageApi {

    @Autowired
    private MessageService messageService;


    @PostMapping
    public ResponseEntity<String> example(@RequestBody String message) {
        return ResponseEntity.ok(messageService.mesajVer(message));
    }
}

package com.edsoncosta.msemail.controllers;


import com.edsoncosta.msemail.dtos.EmailDto;
import com.edsoncosta.msemail.models.EmailModel;
import com.edsoncosta.msemail.services.EmailService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    private EmailService emailService;

    public EmailController()
    {
        this.emailService=emailService;
    }

    @PostMapping("/sending-email")
    public ResponseEntity<EmailModel> sendingEmail(@RequestBody  EmailDto emailDto)
    {
        EmailModel emailModel=new EmailModel();
        BeanUtils.copyProperties(emailDto,emailModel);
        emailService.sendEmail(emailModel);
        return new ResponseEntity<>(emailModel, HttpStatus.CREATED);
    }


}

package com.edsoncosta.msemail.dtos;


import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class EmailDto {


    private String OwnerRef;

    private String emailFrom;

    private String emailTo;

    private String subject;

    private String text;

}

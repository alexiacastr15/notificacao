package com.alexiadev.notificacao.infrastructure.exceptions;

import com.alexiadev.notificacao.business.EmailService;

public class EmailException extends RuntimeException {

    public EmailException(String mensagem){
       super(mensagem);
    }

    public EmailException(String mensagem, Throwable throwable){
        super(mensagem, throwable);
    }
}
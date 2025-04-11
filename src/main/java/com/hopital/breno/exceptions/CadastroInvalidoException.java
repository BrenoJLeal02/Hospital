package com.hopital.breno.exceptions;

public class CadastroInvalidoException extends RuntimeException {
    public CadastroInvalidoException(String mensagem) {
        super(mensagem);
    }
}

package com.izavasconcelos.bank.heranca;

public class SaldoInsuficienteException extends RuntimeException{
    public SaldoInsuficienteException(String msg) {
        super(msg);
    }
}

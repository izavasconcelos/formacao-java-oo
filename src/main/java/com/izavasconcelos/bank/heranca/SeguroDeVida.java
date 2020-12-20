package com.izavasconcelos.bank.heranca;

public class SeguroDeVida implements Tributavel {
    @Override
    public double getValorImposto() {
        return 42;
    }
}

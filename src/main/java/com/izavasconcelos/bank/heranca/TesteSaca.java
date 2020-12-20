package com.izavasconcelos.bank.heranca;

public class TesteSaca {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente(1212, 111);
        cc.deposita(100);
        cc.saca(50);

        System.out.println(cc.getSaldo());
        try{
            cc.saca(51);
        } catch (SaldoInsuficienteException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

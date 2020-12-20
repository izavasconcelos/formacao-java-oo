package com.izavasconcelos.bank.test;


import com.izavasconcelos.bank.modelo.CalculadorDeImposto;
import com.izavasconcelos.bank.modelo.ContaCorrente;
import com.izavasconcelos.bank.modelo.SeguroDeVida;

//classe Teste
public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc= new ContaCorrente(222, 333);
		cc.deposita(100.0);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		calc.registra(cc);
		calc.registra(seguro);
		
		System.out.println(calc.getTotalImposto());

	}

}

package com.izavasconcelos.bank.test;


import com.izavasconcelos.bank.modelo.Conta;
import com.izavasconcelos.bank.modelo.ContaCorrente;
import com.izavasconcelos.bank.modelo.GuardadorDeContas;

public class TesteGuardadorContas {

	public static void main(String[] args) {
		
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Conta cc = new ContaCorrente(22, 11);
		guardador.adiciona(cc);

		Conta cc2 = new ContaCorrente(22, 22);
		guardador.adiciona(cc2);
		
		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);
		
		Conta ref = guardador.getReferencia(1);
		System.out.println(ref.getNumero());
		
	}

}

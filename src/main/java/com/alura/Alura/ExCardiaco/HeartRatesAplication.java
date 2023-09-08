//LINK EXERCICIO -- https://cursos.alura.com.br/forum/topico-desafios-para-iniciantes-java-61719

package com.alura.Alura.ExCardiaco;

import java.util.Calendar;

public class HeartRatesAplication {

	public static void main (String args[]) {
		
		Calendar dataNascimento = Calendar.getInstance();
		
		dataNascimento.set(Calendar.DAY_OF_MONTH, 21);
		dataNascimento.set(Calendar.MONTH, Calendar.AUGUST);
		dataNascimento.set(Calendar.YEAR, 1992);
		HeartRates renato = new HeartRates("Renato", "Bittencourt", dataNascimento.getTime());
		
		dataNascimento.set(Calendar.DAY_OF_MONTH, 14);
		dataNascimento.set(Calendar.MONTH, Calendar.JUNE);
		dataNascimento.set(Calendar.YEAR, 1996);
		HeartRates mozao = new HeartRates("Ingrid", "Chaves", dataNascimento.getTime());
		
		System.out.println(renato.getNome() + " " + renato.getSobrenome());
		System.out.println("Idade: " + renato.getIdade());
		System.out.println("CardMax: " + renato.getFrequenciaCardiacaMaxima());
		System.out.println("CardAlvo: " + renato.getFrequenciaCardiacaAlvo());
		
		System.out.println("");
		
		System.out.println(mozao.getNome() + " " + mozao.getSobrenome());
		System.out.println("Idade: " + mozao.getIdade());
		System.out.println("CardMax: " + mozao.getFrequenciaCardiacaMaxima());
		System.out.println("CardAlvo: " + mozao.getFrequenciaCardiacaAlvo());
	}
}

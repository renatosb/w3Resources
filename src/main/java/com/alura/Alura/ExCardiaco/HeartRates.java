package com.alura.Alura.ExCardiaco;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class HeartRates {

	private String nome;
	private String sobrenome;
	private Date dataNascimento;
	
	public int getIdade() {
	    Calendar dataAtual = Calendar.getInstance();
	    Calendar dataNascimentoToCalendar = Calendar.getInstance();
	    dataNascimentoToCalendar.setTime(dataNascimento);
		return dataAtual.get(Calendar.YEAR) - dataNascimentoToCalendar.get(Calendar.YEAR);
	}
	
	public int getFrequenciaCardiacaMaxima() {
		return 220 - getIdade();
	}
	
	public int getFrequenciaCardiacaAlvo() {
		return (getFrequenciaCardiacaMaxima() * 50 + new Random().nextInt(16))/100;
	}
}

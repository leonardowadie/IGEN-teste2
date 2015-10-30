package br.com.igen.bo;

import java.util.Calendar;
import java.util.GregorianCalendar;

import br.com.igen.bean.Idoso;

public class IdosoBO {
	
	public double valor(Calendar dia) {
		
		int porcentagem = getPorcentagemDeDesconto(dia);
		Idoso idoso = new Idoso();
		double valorAtual = idoso.getValorDoIngresso();
		
		return valorAtual - (valorAtual/100*porcentagem);
	}
	
	public Integer getPorcentagemDeDesconto(Calendar dia) {
		int diaDaSemana = dia.get(GregorianCalendar.DAY_OF_WEEK);

		switch (diaDaSemana) {

		case 1: 
			return 5;
		case 2:
			return 10;
		case 3:
			return 15;
		case 4:
			return 40;
		case 5:
			return 30;
		case 6:
			return 0;
		case 7:
			return 5;

		
		}
		return 0;
	}


}

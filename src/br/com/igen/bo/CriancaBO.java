package br.com.igen.bo;

import java.util.Calendar;
import java.util.GregorianCalendar;

import br.com.igen.bean.Crianca;

public class CriancaBO {
	
	public double valor(Calendar dia) {
		
		int porcentagem = getPorcentagemDeDesconto(dia);
		Crianca crianca = new Crianca();
		double valorAtual = crianca.getValorDoIngresso();
		
		return valorAtual - (valorAtual/100*porcentagem);
	}
	
	
	private Integer getPorcentagemDeDesconto(Calendar dia) {
		int diaDaSemana = dia.get(GregorianCalendar.DAY_OF_WEEK);

		switch (diaDaSemana) {

		case 1: 
			return 0;
		case 2:
			return 10;
		case 3:
			return 15;
		case 4:
			return 30;
		case 5:
			return 0;
		case 6:
			return 11;
		case 7:
			return 0;

		
		}
		return 0;
	}

}

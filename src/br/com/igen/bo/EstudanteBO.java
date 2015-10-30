package br.com.igen.bo;

import java.util.Calendar;
import java.util.GregorianCalendar;

import br.com.igen.bean.Estudante;

public class EstudanteBO {
	
public double valor(Calendar dia) {
		
		int porcentagem = getPorcentagemDeDesconto(dia);
		Estudante estudante = new Estudante();
		double valorAtual = estudante.getValorDoIngresso();
		
		return valorAtual - (valorAtual/100*porcentagem);
	}
	
	
	public Integer getPorcentagemDeDesconto(Calendar dia) {
		int diaDaSemana = dia.get(GregorianCalendar.DAY_OF_WEEK);

		switch (diaDaSemana) {

		case 1: 
			return 0;
		case 2:
			return 35;
		case 3:
			return 35;
		case 4:
			return 50;
		case 5:
			return 35;
		case 6:
			return 35;
		case 7:
			return 0;

		
		}
		return 0;
	}


}

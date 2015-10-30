package br.com.igen.bean;

import java.util.Calendar;

import br.com.igen.bo.CriancaBO;

public class Crianca implements IPessoa{
	
	private final Double VALOR_DO_INGRESSO = 5.50;
	
	private Double valorComDesconto;
	
	public void setValorComDesconto(Calendar dia) {
		CriancaBO c = new CriancaBO();
		this.setValorComDesconto( c.valor(dia) );
	}

	public void setValorComDesconto(Double valorComDesconto) {
		this.valorComDesconto = valorComDesconto;
	}
	
	public Double getValorDoIngresso() {
		
		return VALOR_DO_INGRESSO;
	}
	
	public Double getValorComDesconto(){
		return valorComDesconto;
	}
	
	public String toString(){
		
		return "Valor do ingresso para criança é: " + valorComDesconto;
	}

}

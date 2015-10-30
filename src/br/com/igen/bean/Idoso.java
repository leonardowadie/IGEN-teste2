package br.com.igen.bean;

import java.util.Calendar;

import br.com.igen.bo.IdosoBO;

public class Idoso implements IPessoa{
	
	private final Double VALOR_DO_INGRESSO = 6.00;
	
	private Double valorComDesconto;
	
	public void setValorComDesconto(Calendar dia) {
		IdosoBO c = new IdosoBO();
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
		
		return "Valor do ingresso para idoso é: " + valorComDesconto;
	}
	
	

}

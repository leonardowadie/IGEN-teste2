package br.com.igen.bean;

import java.util.Calendar;

import br.com.igen.bo.EstudanteBO;

public class Estudante implements IPessoa {

	private final Double VALOR_DO_INGRESSO = 8.00;
	
	private Double valorComDesconto;
	
	public void setValorComDesconto(Calendar dia) {
		EstudanteBO c = new EstudanteBO();
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
		
		return "Valor do ingresso para estudante é: " + valorComDesconto;
	}
	

}

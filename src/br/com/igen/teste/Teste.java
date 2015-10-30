package br.com.igen.teste;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;

import br.com.igen.bean.Crianca;
import br.com.igen.bean.Estudante;
import br.com.igen.bean.IPessoa;
import br.com.igen.bean.Idoso;

public class Teste {

	public static void main(String[] args) {
		
		
		IPessoa pessoa = new Crianca();
		
		IPessoa pessoa2 = new Idoso();
		
		IPessoa pessoa3 = new Estudante();
		
		
		Calendar dia = Calendar.getInstance();
		
		
		
		pessoa.setValorComDesconto(dia);
		
		pessoa2.setValorComDesconto(dia);
		pessoa3.setValorComDesconto(dia);
		
		System.out.println(pessoa.toString());
		System.out.println(pessoa2.toString());
		System.out.println(pessoa3.toString());

	}
	
	@SuppressWarnings("deprecation")
	@Test
	  public void valorIngressoPessoaNoDomingo() {
		 IPessoa pessoa = new Crianca();
		 Calendar dia = Calendar.getInstance();
		 dia.set(Calendar.DAY_OF_WEEK, 1);
		 pessoa.setValorComDesconto(dia);
		 
		 Double valor = pessoa.getValorComDesconto();
		 
		 assertEquals(5.5, valor.doubleValue(), 0);
		 
	  } 
	@SuppressWarnings("deprecation")
	@Test
	  public void valorIngressoPessoaNaSegunda() {
		 IPessoa pessoa = new Crianca();
		 Calendar dia = Calendar.getInstance();
		 dia.set(Calendar.DAY_OF_WEEK, 2);
		 pessoa.setValorComDesconto(dia);
		 
		 Double valor = pessoa.getValorComDesconto();
		 
		 assertEquals(4.95, valor.doubleValue(), 0);
		 
	  }
	 
	 @SuppressWarnings("deprecation")
		@Test
		  public void valorIngressoPessoaNaTerca() {
			 IPessoa pessoa = new Crianca();
			 Calendar dia = Calendar.getInstance();
			 dia.set(Calendar.DAY_OF_WEEK, 3);
			 pessoa.setValorComDesconto(dia);
			 
			 Double valor = pessoa.getValorComDesconto();
			 
			 assertEquals(4.675, valor.doubleValue(), 0);
		
			 
		  }
	 @SuppressWarnings("deprecation")
		@Test
		  public void valorIngressoPessoaNaQuarta() {
			 IPessoa pessoa = new Crianca();
			 Calendar dia = Calendar.getInstance();
			 dia.set(Calendar.DAY_OF_WEEK, 4);
			 pessoa.setValorComDesconto(dia);
			 
			 Double valor = pessoa.getValorComDesconto();
			 
			 assertEquals(3.85, valor.doubleValue(), 0);
		
			 
		  }
	 
	 @SuppressWarnings("deprecation")
		@Test
		  public void valorIngressoPessoaNaQuinta() {
			 IPessoa pessoa = new Crianca();
			 Calendar dia = Calendar.getInstance();
			 dia.set(Calendar.DAY_OF_WEEK, 5);
			 pessoa.setValorComDesconto(dia);
			 
			 Double valor = pessoa.getValorComDesconto();
			 
			 assertEquals(5.50, valor.doubleValue(), 0);
		
			 
		  }
	 @SuppressWarnings("deprecation")
		@Test
		  public void valorIngressoPessoaNaSexta() {
			 IPessoa pessoa = new Crianca();
			 Calendar dia = Calendar.getInstance();
			 dia.set(Calendar.DAY_OF_WEEK, 6);
			 pessoa.setValorComDesconto(dia);
			 
			 Double valor = pessoa.getValorComDesconto();
			 
			 assertEquals(4.895, valor.doubleValue(), 0);
		
			 
		  }
	 @SuppressWarnings("deprecation")
		@Test
		  public void valorIngressoPessoaNoSabado() {
			 IPessoa pessoa = new Crianca();
			 Calendar dia = Calendar.getInstance();
			 dia.set(Calendar.DAY_OF_WEEK, 7);
			 pessoa.setValorComDesconto(dia);
			 
			 Double valor = pessoa.getValorComDesconto();
			 
			 assertEquals(5.5, valor.doubleValue(), 0);
			 
		  } 
	 
	 @SuppressWarnings("deprecation")
		@Test
		  public void valorIngressoPessoaNoDomingo1() {
			 IPessoa pessoa = new Idoso();
			 Calendar dia = Calendar.getInstance();
			 dia.set(Calendar.DAY_OF_WEEK, 1);
			 pessoa.setValorComDesconto(dia);
			 
			 Double valor = pessoa.getValorComDesconto();
			 
			 assertEquals(5.7, valor.doubleValue(), 0);
		
			 
		  }
	 @SuppressWarnings("deprecation")
		@Test
		  public void valorIngressoPessoaNaSegunda1() {
			 IPessoa pessoa = new Idoso();
			 Calendar dia = Calendar.getInstance();
			 dia.set(Calendar.DAY_OF_WEEK, 2);
			 pessoa.setValorComDesconto(dia);
			 
			 Double valor = pessoa.getValorComDesconto();
			 
			 assertEquals(5.4, valor.doubleValue(), 0);
			 
		  }
		 
		 @SuppressWarnings("deprecation")
			@Test
			  public void valorIngressoPessoaNaTerca1() {
				 IPessoa pessoa = new Idoso();
				 Calendar dia = Calendar.getInstance();
				 dia.set(Calendar.DAY_OF_WEEK, 3);
				 pessoa.setValorComDesconto(dia);
				 
				 Double valor = pessoa.getValorComDesconto();
				 
				 assertEquals(5.1, valor.doubleValue(), 0);
			
				 
			  }
		 @SuppressWarnings("deprecation")
			@Test
			  public void valorIngressoPessoaNaQuarta1() {
				 IPessoa pessoa = new Idoso();
				 Calendar dia = Calendar.getInstance();
				 dia.set(Calendar.DAY_OF_WEEK, 4);
				 pessoa.setValorComDesconto(dia);
				 
				 Double valor = pessoa.getValorComDesconto();
				 
				 assertEquals(3.6, valor.doubleValue(), 0);
			
				 
			  }
		 
		 @SuppressWarnings("deprecation")
			@Test
			  public void valorIngressoPessoaNaQuinta1() {
				 IPessoa pessoa = new Idoso();
				 Calendar dia = Calendar.getInstance();
				 dia.set(Calendar.DAY_OF_WEEK, 5);
				 pessoa.setValorComDesconto(dia);
				 
				 Double valor = pessoa.getValorComDesconto();
				 
				 assertEquals(4.2, valor.doubleValue(), 0);
			
				 
			  }
		 @SuppressWarnings("deprecation")
			@Test
			  public void valorIngressoPessoaNaSexta1() {
				 IPessoa pessoa = new Idoso();
				 Calendar dia = Calendar.getInstance();
				 dia.set(Calendar.DAY_OF_WEEK, 6);
				 pessoa.setValorComDesconto(dia);
				 
				 Double valor = pessoa.getValorComDesconto();
				 
				 assertEquals(6, valor.doubleValue(), 0);
			
				 
			  }
		 @SuppressWarnings("deprecation")
			@Test
			  public void valorIngressoPessoaNoSabado1() {
				 IPessoa pessoa = new Idoso();
				 Calendar dia = Calendar.getInstance();
				 dia.set(Calendar.DAY_OF_WEEK, 7);
				 pessoa.setValorComDesconto(dia);
				 
				 Double valor = pessoa.getValorComDesconto();
				 
				 assertEquals(5.7, valor.doubleValue(), 0);
			
				 
			  }
		 
		 @SuppressWarnings("deprecation")
			@Test
			  public void valorIngressoPessoaNoDomingo2() {
				 IPessoa pessoa = new Estudante();
				 Calendar dia = Calendar.getInstance();
				 dia.set(Calendar.DAY_OF_WEEK, 1);
				 pessoa.setValorComDesconto(dia);
				 
				 Double valor = pessoa.getValorComDesconto();
				 
				 assertEquals(8.0, valor.doubleValue(), 0);
				 
			  } 
			@SuppressWarnings("deprecation")
			@Test
			  public void valorIngressoPessoaNaSegunda2() {
				 IPessoa pessoa = new Estudante();
				 Calendar dia = Calendar.getInstance();
				 dia.set(Calendar.DAY_OF_WEEK, 2);
				 pessoa.setValorComDesconto(dia);
				 
				 Double valor = pessoa.getValorComDesconto();
				 
				 assertEquals(5.199999999999999, valor.doubleValue(), 0);
				 
			  }
			 
			 @SuppressWarnings("deprecation")
				@Test
				  public void valorIngressoPessoaNaTerca2() {
					 IPessoa pessoa = new Estudante();
					 Calendar dia = Calendar.getInstance();
					 dia.set(Calendar.DAY_OF_WEEK, 3);
					 pessoa.setValorComDesconto(dia);
					 
					 Double valor = pessoa.getValorComDesconto();
					 
					 assertEquals(5.199999999999999, valor.doubleValue(), 0);
				
					 
				  }
			 @SuppressWarnings("deprecation")
				@Test
				  public void valorIngressoPessoaNaQuarta2() {
					 IPessoa pessoa = new Estudante();
					 Calendar dia = Calendar.getInstance();
					 dia.set(Calendar.DAY_OF_WEEK, 4);
					 pessoa.setValorComDesconto(dia);
					 
					 Double valor = pessoa.getValorComDesconto();
					 
					 assertEquals(4.0, valor.doubleValue(), 0);
				
					 
				  }
			 
			 @SuppressWarnings("deprecation")
				@Test
				  public void valorIngressoPessoaNaQuinta2() {
					 IPessoa pessoa = new Estudante();
					 Calendar dia = Calendar.getInstance();
					 dia.set(Calendar.DAY_OF_WEEK, 5);
					 pessoa.setValorComDesconto(dia);
					 
					 Double valor = pessoa.getValorComDesconto();
					 
					 assertEquals(5.199999999999999, valor.doubleValue(), 0);
				
					 
				  }
			 @SuppressWarnings("deprecation")
				@Test
				  public void valorIngressoPessoaNaSexta2() {
					 IPessoa pessoa = new Estudante();
					 Calendar dia = Calendar.getInstance();
					 dia.set(Calendar.DAY_OF_WEEK, 6);
					 pessoa.setValorComDesconto(dia);
					 
					 Double valor = pessoa.getValorComDesconto();
					 
					 assertEquals(5.199999999999999, valor.doubleValue(), 0);
				
					 
				  }
			 @SuppressWarnings("deprecation")
				@Test
				  public void valorIngressoPessoaNoSabado2() {
					 IPessoa pessoa = new Estudante();
					 Calendar dia = Calendar.getInstance();
					 dia.set(Calendar.DAY_OF_WEEK, 7);
					 pessoa.setValorComDesconto(dia);
					 
					 Double valor = pessoa.getValorComDesconto();
					 
					 assertEquals(8.0, valor.doubleValue(), 0);
					 
				  } 
	 

}

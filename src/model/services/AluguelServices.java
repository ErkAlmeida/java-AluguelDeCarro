package model.services;

import model.entidades.AluguelCarro;
import model.entidades.Fatura;

public class AluguelServices 
{
	private Double precoPorHora;
	private Double precoPorDia;
	
	private BrasilImpostoServices taxaServico;
	
	public AluguelServices() {
		
	}

	public AluguelServices(Double precoPorHora, Double precoPorDia, BrasilImpostoServices taxaServico) {
		this.precoPorHora = precoPorHora;
		this.precoPorDia = precoPorDia;
	}
	
	public void processandoValor(AluguelCarro aluguelCarro) 
	{
		//Converter a hora para milisegundos getTime()
	   long temp1 = aluguelCarro.getdInicio().getTime();
	   
	   long temp2 = aluguelCarro.getdFinal().getTime();
	   
	   //Calcula a diferença em milisegundo e converte para hora 
	   double horas = (double)(temp2 - temp1) / 1000 / 60 / 60;
	   
	   Double pagamentoBasico;
	   
	   if(horas <=12.0) 
	   {
		   //Math.ceil arredonda Hora 
		   pagamentoBasico = precoPorHora * Math.ceil(horas); 
	   }
	   else {
		   pagamentoBasico = precoPorDia * Math.ceil(horas /24);
	   }
	   
	   Double taxa = taxaServico.taxa(pagamentoBasico);
	   
	   aluguelCarro.setFatura(new Fatura(pagamentoBasico, taxa));

	}
}
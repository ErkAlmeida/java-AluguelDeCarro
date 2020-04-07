package model.entidades;

import java.util.Date;

public class AluguelCarro {

	private Date dInicio;
	private Date dFinal;
	
	private Veiculo veiculo;
	private Fatura fatura;
	
	public AluguelCarro() {
		
	}

	public AluguelCarro(Date dInicio, Date dFinal, Veiculo veiculo) {
		this.dInicio = dInicio;
		this.dFinal = dFinal;
		this.veiculo = veiculo;
	}

	public Date getdInicio() {
		return dInicio;
	}

	public void setdInicio(Date dInicio) {
		this.dInicio = dInicio;
	}

	public Date getdFinal() {
		return dFinal;
	}

	public void setdFinal(Date dFinal) {
		this.dFinal = dFinal;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Fatura getFatura() {
		return fatura;
	}

	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}
}

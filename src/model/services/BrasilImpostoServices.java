package model.services;

public class BrasilImpostoServices {

	public double impostoPais(double pagamentoBasico) 
	{
		if (pagamentoBasico <= 100) {

			return pagamentoBasico * 0.2;

		} else {
			return pagamentoBasico * 0.15;
		}
	}

}

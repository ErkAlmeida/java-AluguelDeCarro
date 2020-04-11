package model.services;

public class BrasilImpostoServices {
	
	
	public Double taxa(Double montante) 
	{
		if(montante < 100.00) 
		{
		return	montante * 0.2; 
			
		}else {
			return montante *0.15;
		}
	}

}

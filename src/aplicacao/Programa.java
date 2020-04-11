

/*Uma locadora brasileira de carros cobra um valor por hora para locações de até
12 horas. Porém, se a duração da locação ultrapassar 12 horas, a locação será
cobrada com base em um valor diário. Além do valor da locação, é acrescido no
preço o valor do imposto conforme regras do país que, no caso do Brasil, é 20%
para valores até 100.00, ou 15% para valores acima de 100.00. Fazer um
programa que lê os dados da locação (modelo do carro, instante inicial e final da
locação), bem como o valor por hora e o valor diário de locação. O programa
deve então gerar a nota de pagamento (contendo valor da locação, valor do
imposto e valor total do pagamento) e informar os dados na tela. Veja os
exemplos.*/

package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entidades.AluguelCarro;

public class Programa {

	public static void main(String[] args) 
	{
		try {
	
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			SimpleDateFormat sdf = new SimpleDateFormat();
			
			System.out.println("Entre com os Dados");
			
			System.out.print("Modelo do Carro: ");
			String modelo = sc.nextLine();
			
			System.out.print("Data retirada: ");
			Date dIniticial = sdf.parse(sc.next());
			
			System.out.print("Data retorno: ");
			Date dFinal = sdf.parse(sc.next());
			
			System.out.print("Preço por hora: ");
			double precoHora = sc.nextDouble();
			
			System.out.print("Preço por dia: ");
			double precoDia = sc.nextDouble();
			
			
			
		}catch(ParseException erro){
			
			System.out.print("Erro de entrada de dados " + erro.getMessage() );
		}	
		
		
				
		
	}
}

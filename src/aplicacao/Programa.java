

/*Uma locadora brasileira de carros cobra um valor por hora para loca��es de at�
12 horas. Por�m, se a dura��o da loca��o ultrapassar 12 horas, a loca��o ser�
cobrada com base em um valor di�rio. Al�m do valor da loca��o, � acrescido no
pre�o o valor do imposto conforme regras do pa�s que, no caso do Brasil, � 20%
para valores at� 100.00, ou 15% para valores acima de 100.00. Fazer um
programa que l� os dados da loca��o (modelo do carro, instante inicial e final da
loca��o), bem como o valor por hora e o valor di�rio de loca��o. O programa
deve ent�o gerar a nota de pagamento (contendo valor da loca��o, valor do
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
			
			System.out.print("Pre�o por hora: ");
			double precoHora = sc.nextDouble();
			
			System.out.print("Pre�o por dia: ");
			double precoDia = sc.nextDouble();
			
			
			
		}catch(ParseException erro){
			
			System.out.print("Erro de entrada de dados " + erro.getMessage() );
		}	
		
		
				
		
	}
}

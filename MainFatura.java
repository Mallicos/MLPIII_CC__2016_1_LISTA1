package JavaP4;
import java.util.Scanner;

public class MainFatura {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe o n�mero do produto:");
		String numero = input.nextLine();
		
		System.out.println("Informe a descri��o do produto:");
		String descricao = input.nextLine();
		
		System.out.println("Informe a quantidade de produtos dispon�veis:");
		int quantidade = input.nextInt();
		
		System.out.println("Informe o pre�o do produto:");
		double preco = input.nextDouble();
		
		input.close();
		
		Fatura fatura = new Fatura(numero, descricao, quantidade, preco);
		
		fatura.setNumero(numero);
		fatura.setDescricao(descricao);
		fatura.setQuantidade(quantidade);
		fatura.setPreco(preco);
		
		System.out.println("---------------------------------------------------");
		
		System.out.println("N�mero do produto: " +fatura.getNumero());
		System.out.println("Descri��o do produto: " +fatura.getDescricao());
		System.out.println("Quatidade dispon�vel: " +fatura.getQuantidade());
		System.out.println("Preco do produto: " +fatura.getPreco());
		System.out.println("Valor da fatura: " +fatura.getValorFatura());
		
	}

}

package JavaP4;
import java.util.Scanner;

public class MainFatura {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe o número do produto:");
		String numero = input.nextLine();
		
		System.out.println("Informe a descrição do produto:");
		String descricao = input.nextLine();
		
		System.out.println("Informe a quantidade de produtos disponíveis:");
		int quantidade = input.nextInt();
		
		System.out.println("Informe o preço do produto:");
		double preco = input.nextDouble();
		
		input.close();
		
		Fatura fatura = new Fatura(numero, descricao, quantidade, preco);
		
		fatura.setNumero(numero);
		fatura.setDescricao(descricao);
		fatura.setQuantidade(quantidade);
		fatura.setPreco(preco);
		
		System.out.println("---------------------------------------------------");
		
		System.out.println("Número do produto: " +fatura.getNumero());
		System.out.println("Descrição do produto: " +fatura.getDescricao());
		System.out.println("Quatidade disponível: " +fatura.getQuantidade());
		System.out.println("Preco do produto: " +fatura.getPreco());
		System.out.println("Valor da fatura: " +fatura.getValorFatura());
		
	}

}

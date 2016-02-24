package JavaP4;
import java.util.Scanner;

public class MainCarro {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe a cor do carro:");
		String cor = input.nextLine();
		
		System.out.println("Informe o modelo do carro:");
		String modelo = input.nextLine();
		
		System.out.println("Informe a velocidade atual do carro:");
		double velocidadeAtual = input.nextDouble();
		
		System.out.println("Informe a velocidade máxima suportada pelo carro:");
		double velocidadeMaxima = input.nextDouble();
		
		System.out.println("Informe a quantidade que deseja acelerar:");
		double acelerar = input.nextDouble();
		
		System.out.println("---------------------------------------------------");
		input.close();
		
		Carro carro = new Carro(cor, modelo, velocidadeAtual, velocidadeMaxima);
		
		carro.setCor(cor);
		carro.setModelo(modelo);
		carro.setVelocidadeAtual(velocidadeAtual);
		carro.setVelocidadeMaxima(velocidadeMaxima);
		
		System.out.println("Cor: " +carro.getCor());
		System.out.println("Modelo: " +carro.getModelo());
		System.out.println("Velocidade Atual: " +carro.getVelocidadeAtual()+ " km/h");
		System.out.println("Velocidade Máxima: " +carro.getVelocidadeMaxima());
		System.out.println(carro.acelerar(acelerar)+ ": " +carro.getVelocidadeAtual()+ " km/h");
		System.out.println("Ligado: " +carro.ligar());
		
	}

}

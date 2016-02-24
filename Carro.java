package JavaP4;

public class Carro {
	
	private String cor;
	private String modelo;
	private double velocidadeAtual;
	private double velocidadeMaxima;
	
	public Carro(String cor, String modelo, double velocidadeAtual, double velocidadeMaxima){
		
		this.cor = cor;
		this.modelo = modelo;
		this.velocidadeAtual = velocidadeAtual;
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	public String getCor(){
		
		return this.cor;
	}
	
	public void setCor(String cor){
		
		this.cor = cor;
	}
	
	public String getModelo(){
		
		return this.modelo;
	}
	
	public void setModelo(String modelo){
		
		this.modelo = modelo;
	}
	
	public double getVelocidadeAtual(){
		
		return this.velocidadeAtual;
	}
	
	public void setVelocidadeAtual(double velocidadeAtual){
		
		this.velocidadeAtual = velocidadeAtual;
	}
	
	public double getVelocidadeMaxima(){
		
		return this.velocidadeMaxima;
	}
	
	public void setVelocidadeMaxima(double velocidadeMaxima){
		
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	public boolean ligar(){
		
		if(this.velocidadeAtual > 0)
			return true;
		
		else
			return false;
	}
	
	public String acelerar(double velocidade){
		
		if(velocidade == 0)
			this.velocidadeAtual = 0;
		
		else
		    this.velocidadeAtual += velocidade;
		
		if(this.velocidadeAtual > this.velocidadeMaxima)
			return "VELOCIDADE MÁXIMA ATINGIDA";
		
		else
			return "VELOCIDADE ATUAL ABAIXO DA MÁXIMA";
	}

}

package JavaP4;

public class FabricaDeCarro {
	
	//padr�o Singleton
	private static FabricaDeCarro instaciaUnica = new FabricaDeCarro();
	
	private FabricaDeCarro(){
		
	}
	
	public static FabricaDeCarro getInstanciaUnica(){
		
		return instaciaUnica;
	}

}

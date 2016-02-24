package JavaP4;

public class FabricaDeCarro {
	
	//padrão Singleton
	private static FabricaDeCarro instaciaUnica = new FabricaDeCarro();
	
	private FabricaDeCarro(){
		
	}
	
	public static FabricaDeCarro getInstanciaUnica(){
		
		return instaciaUnica;
	}

}

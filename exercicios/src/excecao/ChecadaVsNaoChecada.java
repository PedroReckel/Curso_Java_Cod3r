package excecao;

public class ChecadaVsNaoChecada {

	public static void main(String[] args) {
		try {
			geraErro1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			geraErro2();
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim :)");
	}
	
	// Exceção NÃO checada ou NÃO verificada
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro bem legal! #01!");
	}
	
	// Exceção checada ou verificada
	static void geraErro2() throws Exception {
		throw new Exception("Ocorreu um erro bem legal! #02!");
	}
	
//	Diferença entre uma exceção checada e não checada é que a checada não conseguirá passar desapercebida
//	por todos os metodos que eventualmente ela possa passar (Ou vc trata ou passa para outro metodo tratar). 
//	Já a não checada (runtimeException) ela consegue passar desapercebido pelo metodos pois ela só é tratada se
//	quiser.  
	
//	Sempre é melhor usar exceções não checada (runtime) 
	
}
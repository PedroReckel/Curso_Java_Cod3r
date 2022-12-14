package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		double a = 1; // Conversão do tipo implícita
		System.out.println(a);
		
		float b = (float) 1.123487788655555; // Conversão do tipo explícita (CAST) 
		System.out.println(b);
		
		int c = 300;
		byte d = (byte) c; // Explícita (CAST)
		System.out.println(d);
		
		double e = 6.999999;
		int f = (int) e;
		System.out.println(f);
		
	}
	
}

package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {
		
//		O super na declaração Consumer<? super Integer> é utilizado para permitir que a variável do 
//		tipo Consumer possa receber um objeto que seja do tipo Integer ou de uma superclasse do 
//		Integer na hierarquia de classes.
		
		Consumer<? super Integer> print = System.out::println;
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		Function<Integer, String> intToStr = n -> Integer.toBinaryString(n);
		UnaryOperator<String> reverse = s -> new StringBuilder(s).reverse().toString();
		Function<String, Integer> strToInt = n -> Integer.parseInt(n, 2);
		
		nums.stream()
			.map(intToStr)
			.map(reverse)
			.map(strToInt)
			.forEach(print);
		
	}
	
	/*
	 * 1. Número para string binária... 6 => "110"
	 * 2. Inverter a string... "110" => "011"
	 * 3. Converter de volta para inteiro => "011" => 3
	 * 
	 * Integer.
	 * */
}
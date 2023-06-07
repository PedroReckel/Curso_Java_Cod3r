package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Joao", 10.0);
		Aluno a2 = new Aluno("Pedro", 8.0);
		Aluno a3 = new Aluno("Kaua", 6.8);
		Aluno a4 = new Aluno("Vitoia", 4.5);
		Aluno a5 = new Aluno("Jorge", 7.4);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);
	
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Function<Aluno, Double> apenasNota = a -> a.nota;
		BinaryOperator<Double> somatorio = (a, b) -> a + b;
		
		alunos.parallelStream()
			.filter(aprovado)
			.map(apenasNota)
			.reduce(somatorio)
			.ifPresent(System.out::println);
		
	}
	
}
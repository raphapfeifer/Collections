package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {
		
		Set<String> alunos = new HashSet<>();
		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza");
		alunos.add("Nico Seppart");
		alunos.add("Sergio Lopes");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio Aniche");
		alunos.add("Alberto Souza");
		
		

		/*for (String aluno : alunos) {
			System.out.println(aluno);
		}*/
		
		alunos.forEach(aluno -> {
			System.out.println(aluno);
			
		});
		
		boolean raphaelEstaMatriculado = alunos.contains("Raphael");
		alunos.remove("Sergio Lopes");
		System.out.println(raphaelEstaMatriculado);
		System.out.println(alunos.size());
		
	}

}

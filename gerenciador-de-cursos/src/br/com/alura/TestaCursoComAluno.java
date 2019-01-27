package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do Java ", "Raphael");

		javaColecoes.adiciona(new Aula("Trabalhando com ArryaLis", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando coleções", 24));
		
		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme SIlveira",5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17645);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		//Set<Aluno> alunos = javaColecoes.getAlunos();
		
	
		
		System.out.println("Todos os alunos matriculados: ");
		
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();
		
		while(iterador.hasNext()) {
			Aluno proximo = iterador.next();
			System.out.println(proximo);
		}
		
		/*javaColecoes.getAlunos().forEach(a -> {
			System.out.println(a);
		});*/
		
		System.out.println("O aluno "+ a1 + "está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		
		Aluno turini = new Aluno("Rodrigo Turini",34672);
		System.out.println("O turini está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(turini));
		
		
		System.out.println("O a1 é equals ao Turini");
		System.out.println(a1.equals(turini));
		
	}

	
}

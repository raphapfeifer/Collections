package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ExemploCursos {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python",45));
		cursos.add(new Curso("JavaScript",150));
		cursos.add(new Curso("Java 8",113));
		cursos.add(new Curso("C",55));
		
		cursos.sort(Comparator.comparing(Curso::getAlunos));
		
		//cursos.forEach(c -> System.out.println(c.getNome()));
		
		/*cursos.stream()
		.filter(c -> c.getAlunos() >= 100)
		.forEach(c -> System.out.println(c.getNome()));*/
		
		//imprimir totais de alunos
		/*cursos.stream()
		.filter(c -> c.getAlunos() >= 100)
		.map(Curso::getAlunos)
		.forEach(System.out::println);*/
		
		
		//Exemplo de somar alunos dos cursos
		int sum = cursos.stream()
				.filter(c -> c.getAlunos() >= 100)
				.mapToInt(Curso::getAlunos)
				.sum();
		
		System.out.println(sum);
		
		// exemplo de optional
		/*Optional<Curso> optionalCurso = cursos.stream().filter(c -> c.getAlunos() >= 100)
			.findAny();
		
		optionalCurso.ifPresent(c -> System.out.println(c.getNome()));*/
		
		
		//outro exemplo sem optional
		/*cursos.stream().filter(c -> c.getAlunos() >= 100)
			.findAny()
			.ifPresent(c -> System.out.println(c.getNome()));*/
		
		
		//guardar um stream dentro de uma list exemplo
		 /*cursos = cursos.stream()
				.filter(c -> c.getAlunos() >= 100)
				.collect(Collectors.toList());
		 		
		 
		 cursos.stream()
		 .forEach(c -> System.out.println(c.getNome()));*/
		 
		 
		 //exemplo com map
		/*Map<String,Integer> map = cursos.stream()
		 .filter(c -> c.getAlunos() >= 100)
		 .collect(Collectors.toMap(c -> c.getNome(),
						 c -> c.getAlunos()));*/
		 
		//Exemplo sem receber em objeto
		cursos.stream()
				 .filter(c -> c.getAlunos() >= 100)
				 .collect(Collectors.toMap(c -> c.getNome(),
								 c -> c.getAlunos()))
				 .forEach((nome,alunos) -> System.out.println(nome + " tem " + alunos + " alunos" ));
		
		
		//System.out.println(map);
		
		
	}

}

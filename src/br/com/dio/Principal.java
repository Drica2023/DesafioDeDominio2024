package br.com.dio;

import java.time.LocalDate;

import br.com.dio.bootcamp.Conteudo;
import br.com.dio.bootcamp.Cursos;
import br.com.dio.bootcamp.Mentoria;

public class Principal {

	public static void main(String[] args) {
		Cursos cursos1 = new Cursos();
		Mentoria mentoria1 = new Mentoria();
		
		cursos1.setTitulo("Java");
		cursos1.setDescricao(" bootcamp Java");
		cursos1.setCargaHoraria(80);
		
		Conteudo conteudo = new Cursos();
		
		mentoria1.setTitulo("MentoriaJava");
		mentoria1.setDescricao(" Mentoria bootcamp Java");
		mentoria1.setData(LocalDate.now());
		
		
		System.out.println(cursos1);
		System.out.println(mentoria1);

	}

}

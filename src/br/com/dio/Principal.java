package br.com.dio;

import java.time.LocalDate;

import br.com.dio.bootcamp.BootcampJava;
import br.com.dio.bootcamp.Conteudo;
import br.com.dio.bootcamp.Cursos;
import br.com.dio.bootcamp.DevJava;
import br.com.dio.bootcamp.DevJava;
import br.com.dio.bootcamp.Mentoria;

public class Principal {

	public static void main(String[] args) {
		Cursos cursos1 = new Cursos();
		Cursos cursos2 = new Cursos();
		Mentoria mentoria1 = new Mentoria();
		
		cursos1.setTitulo("Java");
		cursos1.setDescricao(" bootcamp Java");
		cursos1.setCargaHoraria(80);
		
		cursos2.setTitulo("Phyton");
		cursos2.setDescricao(" bootcamp Phyton");
		cursos2.setCargaHoraria(8);
		
		Conteudo conteudo = new Cursos();
		
		mentoria1.setTitulo("MentoriaJava");
		mentoria1.setDescricao(" Mentoria bootcamp Java");
		mentoria1.setData(LocalDate.now());
		
		
		//System.out.println(cursos1);
		//System.out.println(mentoria1);
		
		BootcampJava bootcamp = new BootcampJava();
		bootcamp.setNome("Bootcamp java Developer");
		bootcamp.setDescricao("Descrição Bootcamp java Developer");
		bootcamp.getConteudos().add(cursos1);
		bootcamp.getConteudos().add(cursos2);
		bootcamp.getConteudos().add(mentoria1);
		
		
		DevJava devjava1 = new DevJava();
		devjava1.setNome("Adriana");
		devjava1.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos" + devjava1.getConteudosInscritos());
		devjava1.progredir();
		devjava1.progredir();
		System.out.println("Conteudos Concluidos" + devjava1.getConteudosConcluidos());
		System.out.println("XP: " + devjava1.calcularTotalXp());
		
		DevJava devjava2 = new DevJava();
		devjava2.setNome("Arthur");
		devjava2.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos Arthur: " + devjava2.getConteudosInscritos());
		devjava2.progredir();
		devjava2.progredir();
		devjava2.progredir();
		System.out.println("Conteudos inscritos Arthur: " + devjava2.getConteudosInscritos());
		System.out.println("Conteudos Concluidos" + devjava2.getConteudosConcluidos());
		System.out.println("XP: " + devjava2.calcularTotalXp());
		
		
		
		
		
		

	}

}

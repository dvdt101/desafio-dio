package br.com.dio.desafio;

import br.com.dio.desafio.domain.Bootcamp;
import br.com.dio.desafio.domain.Course;
import br.com.dio.desafio.domain.Dev;
import br.com.dio.desafio.domain.Mentoring;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course();
        course1.setTitle("Course java");
        course1.setDescription("descrição Course java");
        course1.setWorkload(8);

        Course course2 = new Course();
        course2.setTitle("Course js");
        course2. setDescription("descrição Course js");
        course2.setWorkload(4);

        Mentoring mentoring = new Mentoring();
        mentoring.setTitle("Mentoring de java");
        mentoring.setDescription("descrição Mentoring java");
        mentoring.setDate(LocalDate.now());

        /*System.out.println(course1);
        System.out.println(course2);
        System.out.println(mentoring);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescription("Descrição Bootcamp Java developer");
        bootcamp.getContents().add(course1);
        bootcamp.getContents().add(course2);
        bootcamp.getContents().add(mentoring);

        Dev dev01 = new Dev();
        dev01.setName("David");
        dev01.subscribeBootcamp(bootcamp);


        System.out.printf("Dev %s Conteudos Incristos : %s \n", dev01.getName(), dev01.getContentsSubscribed());

        dev01.progress();
        System.out.println("-");
        System.out.printf("Dev %s Conteudos Concluidos : %s \n", dev01.getName(), dev01.getContentsConcluded());
        System.out.printf("Dev %s Conteudos Incristos : %s \n", dev01.getName(), dev01.getContentsSubscribed());
        System.out.printf("XP: %.2f \n", dev01.calcTotalXp());
        System.out.println("------------------------");

        Dev dev02 = new Dev();
        dev02.setName("Beatriz");
        dev02.subscribeBootcamp(bootcamp);

        System.out.printf("Dev %s Conteudos Incristos : %s \n", dev02.getName(), dev02.getContentsSubscribed());

        dev02.progress();
        System.out.println("-");
        System.out.printf("Dev %s Conteudos Incristos : %s \n", dev02.getName(), dev02.getContentsSubscribed());
        System.out.printf("Dev %s Conteudos Concluidos : %s \n", dev02.getName(), dev02.getContentsConcluded());
        System.out.printf("XP: %.2f", dev02.calcTotalXp());
    }
}

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("Curso Java Collections");
        curso.setDescricao("Aprendendo a manipular coleções");
        curso.setCargaHoraria(100);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Aprendendo a animar telas");
        curso2.setCargaHoraria(90);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Ajudando devs Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Java Developer");
        bootcampJava.setDescricao("Imersão Java");
        bootcampJava.getConteudos().add(curso);
        bootcampJava.getConteudos().add(curso2);

        Dev felippe = new Dev();
        felippe.setNome("Felippe");
        System.out.println("XP: " + felippe.calcularTotalXp());
        System.out.println("Conteudos Inscritos: " + felippe.getConteudosInscritos());
        felippe.inscreverBootcamp(bootcampJava);
        System.out.println("Conteudos Inscritos: " + felippe.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: " + felippe.getConteudosConcluidos());
        felippe.progredir();
        System.out.println("Conteudos Concluidos: " + felippe.getConteudosConcluidos());
        System.out.println("XP: " + felippe.calcularTotalXp());
        System.out.println("Progredir novamente");
        felippe.progredir();
        System.out.println("XP: " + felippe.calcularTotalXp());

    }
}

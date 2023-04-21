import br.com.dio.desafio.dominio.Curso;
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

        System.out.println(mentoria);

    }
}

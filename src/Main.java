import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso");
        curso1.setCargaHoraria(8);

        System.out.println(curso1);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição da mentoria");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Carlos");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Carlos: " + dev1.getConteudosInscritos() + "\n");
        dev1.progredir();
        System.out.println("Conteúdos inscritos Carlos: " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Carlos: " + dev1.getConteudosConcluidos() + "\n");
        System.out.println("XP: " + dev1.calcularTotalXp());

        Dev dev2 = new Dev();
        dev2.setNome("Eduarda");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Eduarda: " + dev2.getConteudosInscritos() + "\n");
        dev2.progredir();
        System.out.println("Conteúdos inscritos Eduarda: " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Eduarda: " + dev2.getConteudosConcluidos() + "\n");
        System.out.println("XP: " + dev2.calcularTotalXp());
    }
}

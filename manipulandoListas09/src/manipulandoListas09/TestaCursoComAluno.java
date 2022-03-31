package manipulandoListas09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TestaCursoComAluno {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções do Java",
                "Paulo Silveira");

        javaColecoes.adiciona(new Aulas("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aulas("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aulas("Modelando com coleções", 24));

        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a3 = new Aluno("Mauricio Aniche", 17645);
        
        javaColecoes.matricula(a3);  
       
        
        
        System.out.println("Todos os alunos matriculados: ");
        javaColecoes.getAlunos().forEach(aluno -> {
            System.out.println(aluno);
            
           
        });
        System.out.println("o aluno"  + a3+ "esta matriculado?");
        System.out.println(javaColecoes.estaMatriculado(a3));	
        
        Aluno turini = new Aluno("Rodrigo Turini" ,  34672);
        
        
        
       System.out.println(a1.equals(turini));	
       
       
      
         
      
   }
}
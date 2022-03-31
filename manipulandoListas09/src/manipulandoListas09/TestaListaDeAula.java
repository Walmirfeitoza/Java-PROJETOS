package manipulandoListas09;

import java.util.ArrayList;
import java.util.List;

public abstract class TestaListaDeAula {

	public static void main(String[] args) {
         //Aulas a =new Aulas("walmir" , 15);//criei a instancia da classe Aulas
         
         List<Aulas> aulas = new ArrayList<>();//criei uma lista do tipo aulas criacao fora da classe curso
         
       //  aulas.add(a); // adicionei a instancia a que esta as variaveis walmir e 15
         
         System.out.println("aqui esta a instacia da classe e tostring");
         
       //  System.out.println(a.toString());
         
         
         System.out.println("LISTA DE AULA" + "" + aulas);
         
         
         Curso JavaColecoes = new Curso("java" , "walmir");
         
       //  System.out.println("essa seria a lista com relaçoes");
         
         System.out.println(JavaColecoes.toString());
         List<Aulas> aula = JavaColecoes.getAula(); //criacao de uma nova classe
         
         System.out.println("INSTANCIA DE CURSO" + JavaColecoes);
         //System.out.println(JavaColecoes.getCurso());
         
         //aula.add(new Aulas("Nova lista" , 15));     //criacao de uma lista passando os argumentos para o construtor , criacao dentro da classe cursos
        // System.out.println("relacionamento de classe" + JavaColecoes.getAula());
        // System.out.println(aula);
         
         //JavaColecoes.getAula().add(new Aulas("trabalhando com arrays" , 21)); jeito que deixa o add expostos
         JavaColecoes.adiciona(new Aulas("trabalhando com arrays" , 21)); //criou um metodo de adiciona dentro de curso
         
        System.out.println(JavaColecoes.getAula());
         
	}

}

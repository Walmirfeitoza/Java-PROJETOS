package manipulandoListas09;

import java.util.List;

public class TestaCuso2 {

	public static void main(String[] args) {
		  Curso JavaColecoes = new Curso("java" , "walmir"); //cria curso
		//  Curso c = new Curso("nome" , "instrutor");
		  
		  
		  JavaColecoes.adiciona(new Aulas("trabalhando com arrays 1 " , 21)); //cria lista de aulas
		  JavaColecoes.adiciona(new Aulas("trabalhando com arrays 2 " , 21));
		  JavaColecoes.adiciona(new Aulas("trabalhando com arrays 3" , 21));
		  
		 
		  
		 List<Aulas> aula =  JavaColecoes.getAula();
		 System.out.println(aula);
		 
		 System.out.println(JavaColecoes.getTempoTotal());
		 
		 
		 System.out.println(JavaColecoes);
	}

}

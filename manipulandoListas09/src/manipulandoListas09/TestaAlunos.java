package manipulandoListas09;

import java.text.CollationElementIterator;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {
           Collection<String> alunos = new HashSet<>(); //hastset nao é uma lista garanti que nao tenha elementos duplicados
            
            alunos.add("rodrigo turinini");
            alunos.add("walmir");
            
            boolean walmirEstaMatriculado = alunos.contains("walmir");//a maior vantagem de ser usar set é a facil localizacao dentro das colletions
            System.out.println(  walmirEstaMatriculado);
            alunos.add("igor");
      
            for (String aluno : alunos) {
            	System.out.println(  aluno);
				
			}
            alunos.remove("walmir");
            System.out.println(  alunos);
	
            
        
            
	}

}

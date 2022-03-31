package manipulandoListas09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;



public class Curso {
           private String nome;
           private String instrutor;
           private List<Aulas> aula =  new ArrayList<Aulas>(); //relacionamento de classes onde ha a associaçao da lista de classes e aula que esta dentro das lista uma lista do tipo aula
           
           private Set<Aluno> alunos = new HashSet<>(); //lista que faz fica mais facil a localizaçao dentro da lista nao preciso pergunta um a um
          
          
			public Curso(String nome, String instrutor) {
				super();
				this.nome = nome;
				this.instrutor = instrutor;
				
			}


			public List<Aulas> getAula() { //ESSE METODO TEM RETORNO E RETORNA UMA LISTA
				return Collections.unmodifiableList(aula); //COM ESSE COLLETIONS É DEVOLVIDA UMA LISTA APENAS PARA LEITURA E NAO PARA ALTERACAO
			}

			public void setAula(List<Aulas> aula) {
				this.aula = aula;
			}

			public String getNome() {
				return nome;
			}

			public String getInstrutor() {
				return instrutor;
			}
			public void adiciona(Aulas  aula) {
				this.aula.add(aula);
			}
			public Set<Aluno> getAlunos() {
			    return Collections.unmodifiableSet(alunos);
			}
			public int getTempoTotal() {
				int tempoTotal = 0;
				for (Aulas aula : aula) { //para cada aula dentro de lista
					
					tempoTotal += aula.getTempo(); //para cada aula dentro de lista some tempo + ele mesmo
					
					
				}
				
				return tempoTotal;
				
			}
			public void matricula(Aluno aluno) {
				this.alunos.add(aluno);
				
			}


			public boolean estaMatriculado(Aluno aluno) {
				// TODO Auto-generated method stub
				return  this.alunos.contains(aluno);
			}
		
			

			
			

		}

package manipulandoListas09;

import java.util.List;

public class Aluno {

    private String nome;
    private int numeroMatricula;
   

    public Aluno(String nome, int numeroMatricula) {
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
        
        if(nome ==null) {
        	throw new NullPointerException("nome nao pode ser null");
        }
    }

    public String getNome() {
        return nome;
    }
    @Override
    public boolean equals(Object obj) {
    	Aluno outro  = (Aluno) obj;//referencia recebida inserida em outro
    	return this.nome.equals(outro.nome);//nova comparacao que permite que os nomes sejam comparados pois no metodo equals da classe mae nao consegue fazer
    	
    }//sobreescrevendo o metodo equals para a comparacao de objetos e strings
    

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    @Override
    public String toString() {
        return "[Aluno: " + this.nome + ", matricula: " + this.numeroMatricula + "]";
    }
}

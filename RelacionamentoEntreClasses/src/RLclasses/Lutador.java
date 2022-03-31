package RLclasses;

public class Lutador {

private String nome; 
private String nacionalidade;
private int idade;
private double altura;
private double peso;
private String categoria;
private int vitorias;
private int derrotas;
private int empates;


public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias,
		int derrotas, int empates) {
	this.nome = nome;
	this.nacionalidade = nacionalidade;
	this.idade = idade;
	this.altura = altura;
	this.setPeso(peso);
	this.vitorias = vitorias;
	this.derrotas = derrotas;
	this.empates = empates;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getNacionalidade() {
	return nacionalidade;
}
public void setNacionalidade(String nacionalidade) {
	this.nacionalidade = nacionalidade;
}
public int getIdade() {
	return idade;
}
public void setIdade(int idade) {
	this.idade = idade;
}
public double getAltura() {
	return altura;
}
public void setAltura(double altura) {
	this.altura = altura;
}
public double getPeso() {
	return peso;
}
public String getCategoria() {
	return categoria;
}
public void setPeso(double peso) {
	this.peso = peso;
	this.setCategoria();
}

private void setCategoria() {
     if(this.peso < 52.2) {
	 this.categoria = "invalido";
 }
     else if(this.peso >52 && this.peso < 60) {
    	 this.categoria = "medio";
     }
     else if(this.peso > 60) {
    	 this.categoria = "pesado";
     }
}

public int getVitorias() {
	return vitorias;
}
public void setVitorias(int vitorias) {
	this.vitorias = vitorias;
}
public int getDerrotas() {
	return derrotas;
}
public void setDerrotas(int derrotas) {
	this.derrotas = derrotas;
}
public int getEmpates() {
	return empates;
}
public void setEmpates(int empates) {
	this.empates = empates;
}

public String Apresentar() {
	return "Lutador [nome=" + nome + ", idade=" + idade + ", altura=" + altura
			+ ", categoria=" + this.categoria + ", vitorias=" + vitorias + ", derrotas=" + derrotas
			+ ", empates=" + empates + "]";
}


public void ganharLuta() {
	this.setVitorias(this.getVitorias() + 1 );
}
public void perderLuta() {
	this.setDerrotas(this.getDerrotas() - 1 );
}
public void empatar() {
	this.setDerrotas(this.getEmpates() + 1 );
}
}

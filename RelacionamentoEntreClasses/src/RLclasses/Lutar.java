package RLclasses;

import java.util.Random;

import lutar2.Lutador;

public class Lutar {
private Lutador desafiado;/*cria a relacao entre a classe lutador e a classe luta*/
private Lutador desafiante;
private boolean aprovada;
private int rounds;

public Lutador getDesafiado() {
	return desafiado;
}

public void setDesafiado(Lutador desafiado) {
	this.desafiado = desafiado;
}

public Lutador getDesafiante() {
	return desafiante;
}

public void setDesafiante(Lutador desafiante) {
	this.desafiante = desafiante;
}

public boolean isAprovada() {
	return aprovada;
}

public void setAprovada(boolean aprovada) {
	this.aprovada = aprovada;
}

public int getRounds() {
	return rounds;
}

public void setRounds(int rounds) {
	this.rounds = rounds;
}

public void marcaLuta(Lutador l1 , Lutador l2) {
	
	if(l1.getCategoria() == l2.getCategoria()) {
	    this.aprovada = true;
		System.out.print("a luta foi marcada");
		this.desafiante = l1;
		this.desafiado = l2;
	}
	else {
		this.aprovada = false;
		this.desafiado = null;
		this.desafiante = null;
	}
}
public void lutar() {
	if(this.aprovada == true) {
		System.out.println("desafiante");
		this.desafiante.Apresentar();
		
		System.out.println("desafiado");
		this.desafiado.Apresentar();
		
		Random c = new Random();
		int vencedor = c.nextInt(3);
		
		switch (vencedor) {
		
		case 0 :
			System.out.print("empatou");
			this.desafiado.empatar();
			this.desafiante.empatar();
			break;
		
		  case 1 :
				System.out.print("lutado de nome de " + this.desafiado.getNome() + "venceu");
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				break;	
			
		  case 2:
				System.out.print("lutado de nome de " + this.desafiante.getNome() + "venceu");
				this.desafiante.ganharLuta();
				this.desafiado.perderLuta();
				break;	
	
		
		}	
	}
}
}

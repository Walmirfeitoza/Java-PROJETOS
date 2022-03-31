package Polimofismo;

public class main {

	public static void main(String[] args) {
             mamifero n = new mamifero();
             
             n.alimentar();
             
             Reptil m = new Reptil();
             m.alimentar();
             
             Cachorro c = new Cachorro();
             c.emitirSom();
             Lobo l = new Lobo();
             
             l.emitirSom();
             
             c.reagir(true);
             c.reagir(20);
	}               

}

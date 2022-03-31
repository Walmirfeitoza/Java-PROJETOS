package Polimofismo;

public class mamifero extends Animal {

	
	
	//extendendo a classe ha obrigaoriedade das classe em alterar os metodos
	@Override
	public void locomover() {
	   System.out.print("rastejando	");
		
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.print(" bebendo leite");
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.print("som de mamifero");
	}

}

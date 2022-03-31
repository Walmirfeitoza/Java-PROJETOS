package Polimofismo;

public class Reptil extends Animal {
	private String corEscama;

	@Override
	public void locomover() {
		System.out.print("corrrendo");		
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.print("comendo carne");
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.print("som de reptil");
	}

}

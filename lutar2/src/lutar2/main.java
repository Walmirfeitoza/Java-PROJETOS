package lutar2;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		
		Lutador lucas = new Lutador("lucas" , "basileiro" , 22 , 1.72 , 70.1f , 6 , 1 , 1);
		Lutador walmir = new Lutador("walmir" , "basileiro" , 22 , 1.72 , 70.1f , 6 , 1 , 1);
		ArrayList<Lutador>criandLutador = new ArrayList<>();
		
		criandLutador.add(lucas);
		criandLutador.add(walmir);
		System.out.println(lucas.Apresentar());
		System.out.println(walmir.Apresentar());
		
		 Lutar lt = new Lutar();
		 
		 lt.marcaLuta(lucas, walmir);
		 
		 lt.lutar();
		
                
	}

}

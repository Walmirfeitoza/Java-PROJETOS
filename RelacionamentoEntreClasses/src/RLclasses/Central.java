package RLclasses;

import lutar2.Lutador;

public class Central {

	public static void main(String[] args) {
		Lutador l[] = new Lutador[6];
		
	          l[0] = new Lutador("lucas" , "basileiro" , 22 , 1.72 , 70.1f , 6 , 1 , 1);
	          l[1] = new Lutador("batata" , "basileiro" , 22 , 1.72 , 72.1f , 10 , 1 , 1);
	          l[0].ganharLuta();
	          
		System.out.print(l[0].Apresentar());
		System.out.println(" ");
		System.out.print(l[1].Apresentar());
		System.out.println(" ");
		Lutar uf = new Lutar();
		
		uf.marcaLuta(l[0] , l[1]);
		uf.lutar();
	
	}

}

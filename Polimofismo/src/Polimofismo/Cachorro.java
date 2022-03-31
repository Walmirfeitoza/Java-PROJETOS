package Polimofismo;

public class Cachorro extends Reptil {
       private String cordoPelo;
       
       public String getCordoPelo() {
		return cordoPelo;
	}

	public void setCordoPelo(String cordoPelo) {
		this.cordoPelo = cordoPelo;
	}

	@Override
       public void emitirSom() {
    	   System.out.println("latindoo aua uau");
    	   
       }
	
	public void reagir(String frase) {
		if(frase =="ola") {
           System.out.println("Abanando o rabinho");
		}
	}
public void reagir(int hora) { 
	         
	          if(hora == 10) {
	              System.out.println("carin");

	          }else if(hora == 20) {
	              System.out.println("esquece");

	          }
		
	}
public void reagir(boolean dono) {
	if(dono == false) {
        System.out.println("mordendo");

	}
	else {
        System.out.println("Abanando o rabinho");

	}
}
}

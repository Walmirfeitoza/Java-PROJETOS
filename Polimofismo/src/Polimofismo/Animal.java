package Polimofismo;

public abstract class Animal {
   private float peso;
   private int idade;
   private int membros;
   
   //metodos abstrados que podem ser sobrescritos em outras classes.
 public abstract void locomover();
 public abstract void alimentar();
 public abstract void emitirSom();
  
}

package manipulandoListas09;

public class Aulas {

	private String aula;
	private int tempo;
	public String getAula() {
		return aula;
	}
	public Aulas(String aula, int tempo) {
		super();
		this.aula = aula;
		this.tempo = tempo;
	}
	public void setAula(String aula) {
		this.aula = aula;
	}
	public int getTempo() {
		return tempo;
	}
	@Override
	public String toString() {
		return "Aulas [aula=" + aula + ", tempo=" + tempo + "]";
	}

	
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	
	
	
}

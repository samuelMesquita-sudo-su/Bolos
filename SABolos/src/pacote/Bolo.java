package pacote;

public class Bolo {
	String massa;
	String formato;
	double tamanho;
	
	public Bolo(String massa, String formato, double tamanho) {
		this.massa = massa;
		this.formato=formato;
		this.tamanho=tamanho;
	}
	
	public String informacao() {
		return "Massa do bolo: " + massa 
				+"\nFormato do bolo: " + formato 
				+"\nTamanho do bolo: " + tamanho;
	}
	
}
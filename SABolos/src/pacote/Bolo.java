package pacote;

public class Bolo {
	String massa;
	String formato;
	String tamanho;
	String data;
	String especificacao;
	String endereco;
	String nome;
	
	public Bolo(String nome, String massa, String formato,String tamanho, String data, String especificacao, String endereco ) {
		this.nome=nome;
		this.massa = massa;
		this.formato = formato;
		this.tamanho = tamanho;
		this.data = data;
		this.especificacao = especificacao;
		this.endereco=endereco;
	}
	
	public String informacao() {
		return "Nome: " + nome
				+"\nEndereço: " + endereco
				+"\nMassa do bolo: " + massa 
				+"\nFormato do bolo: " + formato 
				+"\nTamanho do bolo: " + tamanho
				+"\nEspecificações: " + especificacao
				+"\nData: " + data;
	}
	
}

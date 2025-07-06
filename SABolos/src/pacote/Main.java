package pacote;

import javax.swing.JOptionPane;
import java.util.ArrayList;
public class Main {
	static ArrayList<Bolo> bolos = new ArrayList<>();
	public static void main(String[] args) {
		boolean saindo = false;
		do {
			String[] inf = {"Fazer pedido","Exibir informações dos pedidos","Sair"};
			String escolha = (String) JOptionPane.showInputDialog(
					null, "Selecione uma opção" , "", JOptionPane.QUESTION_MESSAGE, null, inf , inf[0]);
			//
			if (escolha.equalsIgnoreCase(inf[0])) {
				String nome = JOptionPane.showInputDialog(null , "Qual o seu nome?", "Pedido de bolo", JOptionPane.QUESTION_MESSAGE);
				String endereco = JOptionPane.showInputDialog(null , "Qual o seu endereço?", "Pedido de bolo", JOptionPane.QUESTION_MESSAGE);
				String massa = JOptionPane.showInputDialog(null , "Qual será a massa do bolo?", "Pedido de bolo", JOptionPane.QUESTION_MESSAGE);
				String formato = JOptionPane.showInputDialog(null , "Qual será o formato do bolo?", "Pedido de bolo", JOptionPane.QUESTION_MESSAGE);
				String[] tam = {"Pequeno","Médio","Grande"};
				String tamanho = (String) JOptionPane.showInputDialog(null , "Qual será o tamanho do bolo?", "Pedido de bolo", JOptionPane.QUESTION_MESSAGE, null, tam, tam[0]);
				String data = JOptionPane.showInputDialog(null, "Insira a data de entrega?", "Pedido de bolo", JOptionPane.QUESTION_MESSAGE);
				String especificacao = JOptionPane.showInputDialog(null, "Observações de pedidos? (Sabor do recheio, tipo de decoração, etc...)" , "Pedido de bolo" , JOptionPane.QUESTION_MESSAGE);
				
				//
				int o= JOptionPane.showConfirmDialog(null, "Você deseja confirmar o pedido?");
				if (o == 0) {
					JOptionPane.showMessageDialog(null, "Seu pedido foi enviado para a entrega");
					bolos.add(new Bolo(nome, massa, formato, tamanho , data, especificacao, endereco));
				}else {
					JOptionPane.showMessageDialog(null, "Pedido cancelado", null, JOptionPane.CANCEL_OPTION);
				}
				//

			}else if (escolha.equalsIgnoreCase(inf[1])) {
				String resul = "";
				for (Bolo b : bolos) {
					resul  = resul + b.informacao()+"\n--------------------\n";
				}
				JOptionPane.showMessageDialog(null, resul);
			
			}else if (escolha.equalsIgnoreCase(inf[2])) {
				JOptionPane.showMessageDialog(null, "SAINDO...", "SAINDO", JOptionPane.WARNING_MESSAGE, null);
				saindo = true;
			}else if (escolha.equalsIgnoreCase(null)){
				JOptionPane.showMessageDialog(null, "Saindo");
				saindo = true;
			}
			else {
				JOptionPane.showMessageDialog(null, "SAINDO...", "SAINDO", JOptionPane.WARNING_MESSAGE, null);
				saindo = true;
			}
		}while(saindo == false);
	}

}

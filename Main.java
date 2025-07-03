package pacote;
import javax.swing.JOptionPane;
import java.util.ArrayList;
public class Main {
	static ArrayList<Bolo> bolos = new ArrayList<>();
	public static void main(String[] args) {
		int opcoes = JOptionPane.showConfirmDialog(null, "Você quer fazer um pedido?", "Pedido de bolo" ,JOptionPane.YES_NO_OPTION);
		if (opcoes == JOptionPane.YES_OPTION) {
			String massa = JOptionPane.showInputDialog(null , "Qual será a massa do bolo?", "Pedido de bolo", JOptionPane.QUESTION_MESSAGE);
			String formato = JOptionPane.showInputDialog(null , "Qual será o formato do bolo?", "Pedido de bolo", JOptionPane.QUESTION_MESSAGE);
			double tamanho = Double.parseDouble(JOptionPane.showInputDialog(null , "Qual será o tamanho do bolo?", "Pedido de bolo", JOptionPane.QUESTION_MESSAGE));
			
			int o= JOptionPane.showConfirmDialog(null, "Você deseja confirmar o pedido?");
			JOptionPane.showMessageDialog(null, o);
			if (o == 0) {
				JOptionPane.showMessageDialog(null, "Seu pedido foi enviado para a entrega");
				bolos.add(new Bolo(massa, formato, tamanho));
			}else {
				JOptionPane.showMessageDialog(null, "Pedido cancelado");
			}
		}

	}

}

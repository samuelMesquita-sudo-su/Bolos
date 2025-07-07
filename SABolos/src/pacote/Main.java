package pacote;

import javax.swing.JOptionPane;
import java.util.ArrayList;
public class Main {
        static ArrayList<Bolo> bolos = new ArrayList<>();
        public static void main(String[] args){        
                boolean saindo = false;
                do {
                        String[] tipoUsuario = {"Cliente", "Atendente", "Sair"};
                        String tipo = (String) JOptionPane.showInputDialog(null, "Você é:", "Tipo de Usuário", JOptionPane.QUESTION_MESSAGE, null, tipoUsuario, tipoUsuario[0]);

                        if (tipo == null || tipo.equalsIgnoreCase("Sair")) {
                            JOptionPane.showMessageDialog(null, "Saindo...");
                                saindo = true;
                        }else if (tipo.equals("Cliente")){
                                menuCliente();
                        }else if (tipo.equals("Atendente")){
                                String senha = JOptionPane.showInputDialog(null, "Digite a senha", "Senha do atendente", JOptionPane.QUESTION_MESSAGE);
                                if (senha.equals("senha123")){
                                        menuAtendente();        
                                }
                                else {
                                        JOptionPane.showMessageDialog(null, "Senha incorreta, acesso negado");
                                } 

                        }
                }while(saindo == false);
        }

        public static void menuAtendente() {
            boolean sair = false;
            do {
                String[] opcoes = {"Consultar pedidos por nome", "Consultar todos os pedidos" ,"Sair"};
                String escolha = (String) JOptionPane.showInputDialog(null, "Menu Atendente", "Atendente", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

                if (escolha == null || escolha.equalsIgnoreCase("Sair")) {
                    sair = true;
                } else if (escolha.equals("Consultar pedidos por nome")) {
                    if (bolos.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhum pedido cadastrado ainda.");
                        continue;
                    }

                    String nomeBusca = JOptionPane.showInputDialog(null, "Digite o nome do cliente:");
                    if (nomeBusca == null || nomeBusca.trim().isEmpty()) continue;

                    String resultado = "";
                    for (Bolo b : bolos) {
                        if (b.nome.equalsIgnoreCase(nomeBusca.trim())) {
                            resultado += b.informacao() + "\n----------------------\n";
                        }
                    }

                    if (resultado.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhum pedido encontrado para o nome informado.");
                    } else {
                        JOptionPane.showMessageDialog(null, resultado);
                    }
                }else if(escolha.equals("Consultar todos os pedidos")){
                                if(bolos.isEmpty())
                                {
                                        JOptionPane.showMessageDialog(null, "Nenhum pedido cadastrado ainda");
                                        continue;        
                                }

                                String resul = "";
                                for (Bolo b: bolos){
                                        resul += b.informacao()+"\n--------------------\n";
                                }
                                JOptionPane.showMessageDialog(null ,resul);
                        }
            } while (!sair);
        }

        public static void menuCliente() {
                boolean saindo = false;
                do {
                        String[] inf = {"Fazer pedido","Exibir informações dos pedidos","Sair"};
                        String escolha = (String) JOptionPane.showInputDialog(
                                        null, "Selecione uma opção" , "Cliente", JOptionPane.QUESTION_MESSAGE, null, inf , inf[0]);
                        //
                        if (escolha == null){
                                JOptionPane.showMessageDialog(null, "Saindo");
                                saindo = true;
                        }else if (escolha.equalsIgnoreCase(inf[0])) {
                                String nome = JOptionPane.showInputDialog(null , "Qual o seu nome?", "Pedido de bolo", JOptionPane.QUESTION_MESSAGE);
                                if (nome == null) continue;
                                String endereco = JOptionPane.showInputDialog(null , "Qual o seu endereço?", "Pedido de bolo", JOptionPane.QUESTION_MESSAGE);
                                if (endereco == null) continue;
                                String massa = JOptionPane.showInputDialog(null , "Qual será a massa do bolo?", "Pedido de bolo", JOptionPane.QUESTION_MESSAGE);
                                if (massa ==null) continue;
                                String formato = JOptionPane.showInputDialog(null , "Qual será o formato do bolo?", "Pedido de bolo", JOptionPane.QUESTION_MESSAGE);
                                if (formato == null) continue;
                                String[] tam = {"Pequeno","Médio","Grande"};
                                if (tam == null) continue;
                                String tamanho = (String) JOptionPane.showInputDialog(null , "Qual será o tamanho do bolo?", "Pedido de bolo", JOptionPane.QUESTION_MESSAGE, null, tam, tam[0]);
                                if (tamanho == null) continue;
                                String data = JOptionPane.showInputDialog(null, "Insira a data de entrega?", "Pedido de bolo", JOptionPane.QUESTION_MESSAGE);
                                if (data==null) continue;
                                String especificacao = JOptionPane.showInputDialog(null, "Observações de pedidos? (Sabor do recheio, tipo de decoração, etc...)" , "Pedido de bolo" , JOptionPane.QUESTION_MESSAGE);
                                if (especificacao == null) continue;
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
                                if (bolos.isEmpty()){
                                        JOptionPane.showMessageDialog(null, "Nenhum pedido cadastrado ainda");
                                        continue;
                                }

                                String resul = "";
                                for (Bolo b : bolos) {
                                        resul  = resul + b.informacao()+"\n--------------------\n";
                                }
                                JOptionPane.showMessageDialog(null, resul);

                        }else if (escolha.equalsIgnoreCase(inf[2])) {
                                JOptionPane.showMessageDialog(null, "SAINDO...", "SAINDO", JOptionPane.WARNING_MESSAGE, null);
                                saindo = true;
                        }else {
                                JOptionPane.showMessageDialog(null, "SAINDO...", "SAINDO", JOptionPane.WARNING_MESSAGE, null);
                                saindo = true;
                        }
                }while(saindo == false);
        }

}
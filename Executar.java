import java.util.Scanner;
import javax.swing.JOptionPane;

public class Executar {
	public static void main (String[] args){
		//Scanner input = new Scanner(System.in);
		JOptionPane.showMessageDialog(null, "****** Bem vindo ao banco JAVOU ! ******");
		
		boolean exit = false;
		Banco banco = new Banco();


		while(!exit) {
			String option = JOptionPane.showInputDialog("Escolha uma das opções abaixo:\n[1] Abrir Conta\n[2] Mostrar contas\n[3] Acessar Conta\n[4] Sair");
			switch (option){
			case "1":
				Cliente cliente = new Cliente();
				String cpf = JOptionPane.showInputDialog("Digite seu CPF:");
				cliente.setCpf(cpf);
				
				String idade = JOptionPane.showInputDialog("Qual sua idade ? ");
				cliente.setIdade(Integer.parseInt(idade)); //Convertendo de string para inteiro, p/ pode receber.
				
				String nome = JOptionPane.showInputDialog("Qual seu nome ? ");
				cliente.setNome(nome);
				
				String sexo = JOptionPane.showInputDialog("Qual seu gênero ?\n [M] - Masculino\n[F] - Feminino");
				if(sexo.toLowerCase() == "M") {
					cliente.setSexo('M');
				}else if (sexo.toLowerCase() == "F") {
					cliente.setSexo('F');
				}else {
					JOptionPane.showMessageDialog(null, "Opção inválida !");
				}
				
				Endereco endereco = new Endereco();
				String rua = JOptionPane.showInputDialog("Nome da rua onde reside: ");
				endereco.setRua(rua);
				
				String numero = JOptionPane.showInputDialog("Numero da residência: ");
				endereco.setNumero(Integer.parseInt(numero));
				
				String bairro = JOptionPane.showInputDialog("Nome do Bairro: ");
				endereco.setBairro(bairro);
				
				String cidade = JOptionPane.showInputDialog("Nome da cidade: ");
				endereco.setCidade(cidade);
				
				Contato contato = new Contato();
				
				String email = JOptionPane.showInputDialog("E-mail: ");
				contato.setEmail(email);
				
				String telefone = JOptionPane.showInputDialog("Telefone: ");
				contato.setTelefone(telefone);
				
				String celular = JOptionPane.showInputDialog("Celular:" );
				contato.setCelular(celular);
				
				JOptionPane.showMessageDialog(null, "***** DADOS BANCÁRIOS *****");
				
				Conta conta = new Conta();
				
				String agencia = JOptionPane.showInputDialog("Agência: ");
				conta.setAgencia(Integer.parseInt(agencia));
				
				String numeroConta = JOptionPane.showInputDialog("Conta: ");
				conta.setAgencia(Integer.parseInt(numeroConta));
				
				conta.setConta(conta);
				cliente.setContato(contato);
				cliente.setEndereco(endereco);
				banco.cadastrar(cliente);
				break;
				
			case "2":
				
			case "3":
				
			case "4":
				exit = true;
				break;
			default:
				JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA");
			}
		}

	}
}




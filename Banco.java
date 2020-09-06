import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class Banco {

    private List<Cliente> clientes;

    public Banco(){
        this.clientes = new ArrayList<Cliente>();
    }


    public void cadastrar (Cliente cliente){
        boolean exist = false;
        for(Cliente c : clientes){
            if(c.getCpf() == cliente.getCpf()){
                exist = true;
                break;
            }
        }
        if(exist){
            JOptionPane.showMessageDialog(null, "Cliente ja possui cadastro.");
        }else{
            this.clientes.add(cliente);
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso :D");    
        } 
    }
    
    public void mostrar() {
    	String str = "";
    	for(Cliente c : clientes) {
    		str += c.toString();
    	}
    	JOptionPane.showMessageDialog(null, str);
    }
    
    
    public double depositar(double saldo) {	
    	String valor = JOptionPane.showInputDialog("Quanto deseja depositar ?");
    	double novoSaldo = saldo;
    	if(Double.parseDouble(valor) <=0) {
    		JOptionPane.showMessageDialog(null,"Deposito Incorreto !");
    	}else {
    		novoSaldo += Double.parseDouble(valor);
    	}
    	return novoSaldo;
    }
    
    
    public Conta findConta(int agencia, int numConta) {
    	for(Cliente c : clientes) {
    		if(c.getConta().getAgencia() == agencia && c.getConta().getNumeroConta() == numConta) {
    			return c.getConta();
    		}
    	}
    	return null;	
    }
    
    
    public double sacar(double saldo) {
    	String valor = JOptionPane.showInputDialog("Quanto deseja sacar ?");
    	double novoSaldo = saldo;
    	if(Double.parseDouble(valor) <= saldo) {
    		novoSaldo -= Double.parseDouble(valor);
    		JOptionPane.showMessageDialog(null, "Valor sacado: " + valor + "\nNovo Saldo: " + novoSaldo);
    	}else {
    		JOptionPane.showMessageDialog(null, "Saque indevido !");
    	}
    	return novoSaldo;
    }
    
    public void menuUsuario(Conta conta) {
    	boolean back = false;
    	
    	while(!back) {
    		String op = JOptionPane.showInputDialog("Bem vindo a tela do usuário JAVOU :D\n\nQual operação deseja realizar?\n[1]Depositar\n[2]Sacar\n[3]Transferir\n[4]Ver Saldo\n[5]Voltar ao menu principal");
        	switch(op) {
        	case "1":
        		double novoSaldo = depositar(conta.getSaldo());
        		conta.setSaldo(novoSaldo);
        		break;
        	case "2":
        		double novoSaldoSaque = sacar(conta.getSaldo());
        		conta.setSaldo(novoSaldoSaque);
        		
        		break;
        	case "3":
        		String agenciaTransf = JOptionPane.showInputDialog("Agência destino: ");
        		String numeroContaTransf = JOptionPane.showInputDialog("Conta Destino: ");
        		String valorTransf = JOptionPane.showInputDialog("Valor a ser transferido: ");
        		Conta contaTransf = findConta(Integer.parseInt(agenciaTransf), Integer.parseInt(numeroContaTransf));
        		
        		if(contaTransf != null && conta.getSaldo() > Double.parseDouble(valorTransf)) {
        			double novoSaldoTransf = conta.getSaldo();
        			conta.setSaldo(novoSaldoTransf - Double.parseDouble(valorTransf));
        			novoSaldoTransf = contaTransf.getSaldo();
        			contaTransf.setSaldo(novoSaldoTransf + Double.parseDouble(valorTransf));
        			
        			JOptionPane.showMessageDialog(null, "Transferência realizada com sucesso !!\n\nNovo Saldo: " + contaTransf.getSaldo() + "R$");
        		}else {
        			JOptionPane.showMessageDialog(null, "Conta inexistente ou Valor de transferência MAIOR que saldo disponível !" , null, JOptionPane.ERROR_MESSAGE );
        		}
        		break;
        	case "4":
        		JOptionPane.showMessageDialog(null, "Seu saldo é: " + conta.getSaldo() + " R$");
        		break;
        	case "5":
        		back = true;
        		break;
        	
        	}
        }
    }
    	
     

  
  }


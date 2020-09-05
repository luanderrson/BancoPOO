import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

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
    
    public void mostrar(Cliente cliente) {
    	for(Cliente c : clientes) {
    		JOptionPane.showMessageDialog(null, "[CLIENTES CADASTRADOS]\n" + c);
    	}
    }


  
  }


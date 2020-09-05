import java.util.ArrayList;
import java.util.List;

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
            System.out.println("Cliente ja cadastrado !");
        }else{
            this.clientes.add(cliente);
            System.out.println("Cliente cadastrado com sucesso !");
        }
    }


//    public mostrar();
//    public sacar();
//    public depositar();
}
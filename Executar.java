import java.util.Scanner;

public class Executar {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("****** Bem vindo ao banco JAVOU ! ******");
        Banco banco = new Banco();
        
        Cliente cliente = new Cliente();
        cliente.setCpf("123");
        cliente.setIdade(18);
        cliente.setNome("Luan");
        cliente.setSexo('m');
        banco.cadastrar(cliente);
    }
}
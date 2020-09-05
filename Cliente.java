public class Cliente {
    private String nome;
    private int idade;
    private char sexo;
    private String cpf;
    private Conta conta;
    private Endereco endereco;
    private Contato contato;

    public Cliente (){

    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public char getSexo(){
        return sexo;
    }

    public void setSexo(char sexo){
        this.sexo = sexo;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Contato getContato(){
        return contato;
    }

    public void Contato setContato(Contato contato){
        this.contato = contato;
    }

}


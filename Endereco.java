public class Endereco {
   private String rua;
   private int numero;
   private char bairro;
   private String cidade;

   public String getRua(){
       return rua;
   }

   public void setRua(String rua){
       this.rua = rua;
   }

   public int getNumero(){
       return numero;
   }

   public void setNumero(int numero){
       this.numero = numero;
   }

   public char getBairro(){
       return bairro;
   }

   public void setBairro(char bairro) {
        this.bairro = bairro;
   }

   public String getCidade(){
       return cidade;
   }

   public void setCidade(String cidade){
       this.cidade = cidade;
   }

}
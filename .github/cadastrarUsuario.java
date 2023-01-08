import java.sql.Date;

public class cadastrarUsuario{
    private String nome;
    private String email;
    private Date dataNascimento;
    private Endereco endereco;

    private void setName(String nome) {
        this.nome = nome;    
    }
    private String getNome(){
        return nome;
    }
    
    private void setEmail(String email){
        this.email = email;
    }
    private String getEmail(){
        return email;
    }
    
    private Date getdataNascimento(){
        return dataNasciemnto;
    }

    private void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    private Endereco getEndereco(){
        return this.endereco;
    }

    public class Endereco {
        private String rua;
        private String numero;
        private String cep;
        private String cidade;
        private String estado;
        private String pais;
    }
    public String getRua(){
        return rua;
    }
    public void setRua(String rua){
        this.rua = rua;
    }
    public String getNumero(){
        return numero;
    }
    public String setNumero(String numero){
        this.numero = numero;
    }

}
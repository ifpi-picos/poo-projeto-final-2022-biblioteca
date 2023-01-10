import java.time.LocalDate;

public class Usuario {
    private String nome;
    private String email;
    private LocalDate dataNascimento;
    Endereco endereco;
   
    


    public Usuario(String nome, String email, LocalDate dataNascimento, Endereco endereco){
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;

    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;        
    }
    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;    
    }
    public LocalDate getDataNascimento() {
        return this.dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public Endereco getEndereco() {
        return this.endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}

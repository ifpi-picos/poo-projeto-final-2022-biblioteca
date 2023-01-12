import java.sql.Date;
public class registrarEmprestimoLivro {
    private Date data;
    private String livro;
    private String nome;

    public registrarEmprestimoLivro(Date data, String livro, String nome){
        this.data = data;
        this.livro = livro;
        this.nome = nome;
    }
    public Date getData(){
        return this.data;
    }
    public String getLivro(){
        return this.livro;
    }
    public String getNome(){
        return this.nome;
    }
}

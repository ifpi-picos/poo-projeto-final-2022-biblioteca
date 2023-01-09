import java.time.LocalDate;

public class Emprestimo {
    private LocalDate dataEmprestimo;
    Livro livro;
    Usuario usuario;

   
    


    public Emprestimo(LocalDate dataEmprestimo, Livro livro, Usuario usuario){
        this.dataEmprestimo = dataEmprestimo;
        this.livro = livro;
        this.usuario = usuario;

    }

    public LocalDate getDataEmprestimo() {
        return this.dataEmprestimo;
    }

    public Livro getLivro() {
        return this.livro;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }

}

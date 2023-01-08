import java.time.LocalDate;

public class Livro {
    private String titulo;
    private String autor;
    private String areaDeConhecimento;
    private LocalDate dataDePublicacao;
    private int quantidadeCopias;


    public Livro(String titulo, String autor, String areaDeConhecimento, LocalDate dataDePublicacao, int quantidadeCopias){
        this.titulo = titulo;
        this.autor = autor;
        this.areaDeConhecimento = areaDeConhecimento;
        this.dataDePublicacao = dataDePublicacao;
        this.quantidadeCopias = quantidadeCopias;

    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }
    public String getAreaDeConhecimento() {
        return this.areaDeConhecimento;
    }
    public LocalDate getDataDePublicacao() {
        return this.dataDePublicacao;
    }

    public int getQuantidadeCopias() {
        return this.quantidadeCopias;
    }
}



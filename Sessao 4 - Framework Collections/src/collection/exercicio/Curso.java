package collection.exercicio;

import java.nio.file.Path;

public class Curso {
    private Integer codigoCurso;
    private String nome;
    private Double valor;
    private Path url;

    public Curso(Integer codigoCurso, String nome, Double valor, Path url) {
        this.codigoCurso = codigoCurso;
        this.nome = nome;
        this.valor = valor;
        this.url = url;
    }

    public Integer getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(Integer codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Path getUrl() {
        return url;
    }

    public void setUrl(Path url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                '}';
    }
}

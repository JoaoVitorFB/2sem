package Musica;

public class Musica {

    private String nome;
    private String artista;
    private String genero;
    private Double duracao = 0.0;

    public Musica(String nome, String artista, String genero, Double duracao) {
        this.nome = nome;
       this.artista = artista;
       this.genero = genero;
       this.duracao = duracao;
    }

    public String exibirInformacoes(){

        String retorno = """
                Música: %s
                Artista: %s
                Gênero: %s
                Duração: %f   
                """, nome, artista, genero, duracao;

        return retorno;
    }

    public String getNome() {
        return nome;
    }

    public String getArtista() {
        return artista;
    }

    public String getGenero() {
        return genero;
    }

    public Double getDuracao() {
        return duracao;
    }
}



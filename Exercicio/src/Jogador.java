public class Jogador {
    //atributos
    String nome;
    int camisa;
    String posicao;
    int golsMarcados;

    //construtor padrão
    public Jogador(){
        this.golsMarcados = 0;
    }

    //construtor com dados do atleta
    public Jogador(String nome, int camisa, String posicao){
        this.nome = nome;
        this.camisa = camisa;
        this.posicao = posicao;
        this.golsMarcados = 0;
    }

    //metodos
    public void marcarGol(){
        this.golsMarcados++;
    }

    //metodo toString
    @Override
    public String toString(){
        return "nome = " + this.nome + ", camisa = " + this.camisa + ", posicao = " + this.posicao + ", gols marcados = " + this.golsMarcados;
    }
}
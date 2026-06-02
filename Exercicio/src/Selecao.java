import java.util.ArrayList;
import java.util.List;

public class Selecao {
    //atributos
    String pais;
    String tecnico;
    List<Jogador> jogadores;

    //construtor padrão
    public Selecao(){
        this.jogadores = new ArrayList<>();
    }

    //construtor com pais e tecnico
    public Selecao(String pais, String tecnico){
        this.pais = pais;
        this.tecnico = tecnico;
        this.jogadores = new ArrayList<>();
    }

    //metodos
    public void adicionarJogador(Jogador jogador){
        jogadores.add(jogador);
        System.out.println(jogador.nome + " adicionado na seleção!");
    }

    public void exibirEscalacao(){
        System.out.println("\n===== SELEÇÃO DE " + this.pais + " =====");
        System.out.println("Tecnico: " + tecnico);
        System.out.println("Jogadores:");
        for (Jogador jogador : jogadores){
            System.out.println(jogador);  //chama o toString()
        }
    }

    public void registrarGol(String nomeJogador) {
        for (Jogador jogador : jogadores) {
            if (jogador.nome.equalsIgnoreCase(nomeJogador)) {
                jogador.marcarGol();
                System.out.println("Gol de " + jogador.nome + "!");
                return;
            }
        }
        System.out.println("Jogador " + nomeJogador + " não encontrado.");
    }
}
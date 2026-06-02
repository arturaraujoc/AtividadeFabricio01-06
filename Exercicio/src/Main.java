public class Main {
    public static void main(String[] args) {
        //instanciamento dos jogadores
        Jogador neymar   = new Jogador("Neymar",10,"Atacante");
        Jogador vinicius = new Jogador("Vinicius Jr",7,"Atacante");
        Jogador alisson  = new Jogador("Alisson",1,"Goleiro");
        Jogador endrick  = new Jogador("Endrick",9,"Atacante");

        //gols
        endrick.marcarGol();
        endrick.marcarGol();  
        vinicius.marcarGol();

        //exibir dados
        System.out.println("=== DADOS DOS JOGADORES ===");
        System.out.println(neymar);
        System.out.println(vinicius);
        System.out.println(alisson);
        System.out.println(endrick);

        //selecao
        Selecao brasil = new Selecao("Brasil", "Ancelotti");

        brasil.adicionarJogador(alisson);
        brasil.adicionarJogador(neymar);
        brasil.adicionarJogador(vinicius);
        brasil.adicionarJogador(endrick);

        //registrar gols
        brasil.registrarGol("Endrick");
        brasil.registrarGol("Vinicius Jr");

        //escalacao
        brasil.exibirEscalacao();
    }
}

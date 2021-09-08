package poo_aula_8;

public class Teste {
    public static void main(String[] args) {
        Personagem mario = new Personagem("Mario",1.50,52);
        Personagem luigi = new Personagem("Luigi",1.75,32);

        Jogo jogo = new Jogo(mario,luigi);
        jogo.statusDoJogador();
        jogo.playGame();
        jogo.statusDoJogador();


    }

}

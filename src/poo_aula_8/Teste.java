package poo_aula_8;

import Interfaces.TestContract;

public class Teste extends TestContract {
    public static void main(String[] args) {
        Personagem mario = new Personagem("Mario",1.50,52);
        Personagem luigi = new Personagem("Luigi",1.75,32);

        Jogo jogo = new Jogo(mario,luigi);
        log("------------------SUPER MARIO GAME----------------");
        linha();
        jogo.statusDoJogador();
        linha();
        log("---------------------GAME START-------------------");
        jogo.playGame();
        linha();
        log("----------------------END GAME--------------------");
        jogo.statusDoJogador();

    }
}

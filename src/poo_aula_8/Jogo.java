package poo_aula_8;

import java.util.Random;

public class Jogo {
    private Personagem playerOne;   //Importei o objeto Personagem
    private Personagem playerTwo;

    public Jogo(Personagem p1, Personagem p2) { //Criei o método construct
        this.playerOne = p1;
        this.playerTwo = p2;
    }
    public void statusDoJogador(){
        this.playerOne.chamaCaracteristicas();
        this.playerTwo.chamaCaracteristicas();
    }
    public void playGame(){
        Random aleatorio = new Random();
        int playerOneMoedas = aleatorio.nextInt(30);
        int playerTwoMoedas = aleatorio.nextInt(30);

        System.out.println("O Jogador "+ this.playerOne.getNome() + " Coletou: "+ playerOneMoedas + " moedas");
        System.out.println("O Jogador " + this.playerTwo.getNome() + " Coletou: " + playerTwoMoedas + " moedas");

        for (int i=0; i < playerOneMoedas; i++){
            this.playerOne.coleteMoeda();
        }
        for (int i=0; i < playerTwoMoedas; i++){
            this.playerTwo.coleteMoeda();
        }

    }


}

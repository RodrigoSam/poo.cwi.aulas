package poo_aula_10;

import static Interfaces.TestContract.linha;

public class Teste {
    public static void main(String[] args) {
        Mario mario = new Mario("Mario", 1.50, 40);
        Luigi luigi = new Luigi("Luigi", 1.80, 30);
        Yoshi yoshiVerde = new Yoshi("Yoshi verde", 1.20, 3);
        Yoshi yoshiAzul = new Yoshi("Yoshi azul", 1.20, 4);
        linha();
        linha();
        //Testes das implementações da classe Mario
        mario.chamaCaracteristicas();
        mario.chamaPoderes();

        linha();
        for (int i = 0; i < 5; i++) {
            mario.perdStamina();
        }
        for (int i = 0; i < 10; i++) {
            mario.coleteMoeda();
        }
        mario.chamaCaracteristicas();
        mario.ganhaStamina();
        mario.ganhaStamina();
        linha();
        mario.chamaCaracteristicas();
        linha();
        mario.revigorar();
        mario.chamaCaracteristicas();
        mario.saltar();
        mario.crescer();
        mario.chamaCaracteristicas();
        linha();
        mario.saltar();
        mario.saltar(1.50);
        linha();
        mario.montadoNoYoshi();
        mario.sobeNoYoshi(yoshiVerde);
        mario.qualNomeYoshi();
        mario.montadoNoYoshi();
        mario.descerDoYoshi();
        mario.montadoNoYoshi();
        mario.diminuir();
        mario.morrer();
        mario.chamaCaracteristicas();
        linha();
        linha();

        //Testes das implementações da classe Luigi
        luigi.voar();
        luigi.pousar();
        luigi.saltar();
        luigi.saltar(1.20);
        luigi.montadoNoYoshi();
        luigi.sobeNoYoshi(yoshiAzul);

        linha();
        linha();

        //Testes das implementações da classe Yoshi
        yoshiVerde.saltar();
        yoshiVerde.comerFrutas();
        yoshiVerde.comerFrutas();
        yoshiVerde.chamaCaracteristicas();
        yoshiVerde.saltar(0.90);


    }
}

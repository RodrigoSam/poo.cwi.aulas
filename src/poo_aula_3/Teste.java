package poo_aula_3;

public class Teste {
    public static void main(String[] args) {
        mario_classe_Visibilidade mario = new mario_classe_Visibilidade();
        mario.especie= "Homo nintendonus";
        mario.nome="Mario Bros";
        mario.altura= 1.55;
        mario.idade= 25;
        mario.nacionalidade="Italiano";
        mario.comidaPreferida="Cogumelos";
       // mario.hobby="Salvar a princesa Peach!!";

        mario.chamaCaracteristicas();
        mario.chamaPoderes();
    }
}

package poo_aula_2;

public class Teste {
    public static void main(String[] args) {
        Mario_classe mario = new Mario_classe();
        mario.especie= "Homo nintendonus";
        mario.nome="Mario Bros";
        mario.altura= 1.55;
        mario.idade= 25;
        mario.nacionalidade="Italiano";
        mario.comidaPreferida="Cogumelos";
        mario.hobby="Salvar a princesa Peach!!";

        mario.chamaCaracteristicas();
        mario.chamaPoderes();

    }
}
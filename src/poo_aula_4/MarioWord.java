package poo_aula_4;

public class MarioWord {
    public static void main(String[] args) {
Mario mario = new Mario();
mario.chamaCaracteristicas();
mario.chamaPoderes();
        System.out.println("-------------------------------------------------");

Mario mario1 = new Mario("Mario Bros",1.50,40,100);
mario1.chamaCaracteristicas();
mario1.chamaPoderes();
        System.out.println("--------------------------------------------------");

        Mario mario2 = new Mario();
        mario2.setEspecie("Homo nintendonos");
        mario2.setNome("Mario Bross inc");
        mario2.setAltura(1.50);
        mario2.setIdade(25);
        mario2.setNacionalidade("Italiano");
        mario2.setStamina(80);
        mario2.setComidaPreferida("cogumelos");
        mario2.setHobby("Salvar a princesa e práticar esportes");
        mario2.chamaCaracteristicas();
        mario2.chamaPoderes();
    }
}

package poo_aula_7;



public class Teste {
        public static void main(String[] args) {
                Personagem mario = new Personagem("Mario",1.50,40);
                System.out.println("Mario correu sem parar!");
                mario.perdStamina();
                System.out.println("Mario comeu um cogumelo!");
                mario.crescer();
                mario.saltar();
                mario.chamaCaracteristicas();
                mario.chamaPoderes();
                System.out.println("-------------------------------------------------");

                Personagem luigi = new Personagem("luigi",1.75,35);
                System.out.println("Luigi correu e encontrou um bloco trancando a passagem!!");
                luigi.saltar();

        }
}

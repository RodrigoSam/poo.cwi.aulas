package poo_aula_5;
public class Teste {
        public static void main(String[] args) {
                Mario1 mario = new Mario1();
                System.out.println("Mario correu sem parar!");
                mario.perdStamina();
                System.out.println("Mario comeu um cogumelo!");
                mario.crescer();
                mario.chamaCaracteristicas();
                mario.chamaPoderes();
                System.out.println("-------------------------------------------------");

Mario1 mario1 = new Mario1("Mario Bros",1.50,40,100);
mario1.chamaCaracteristicas();
mario1.chamaPoderes();
        System.out.println("--------------------------------------------------");

        Mario1 mario2 = new Mario1();
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

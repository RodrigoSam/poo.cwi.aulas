package poo_aula_6;


public class MarioWord2 {
        public static void main(String[] args) {
                Mario2 mario = new Mario2();
                System.out.println("Mario correu sem parar!");
                mario.perdStamina();
                System.out.println("Mario comeu um cogumelo!");
                mario.crescer();
                mario.chamaCaracteristicas();
                mario.chamaPoderes();
                System.out.println("-------------------------------------------------");


                Mario2 mario2 = new Mario2();
                mario2.chamaCaracteristicas();
                mario2.perdStamina();
                mario2.perdStamina();
                mario2.perdStamina();
                mario2.ganhaStamina();
                mario2.chamaCaracteristicas();
                mario2.revigorar();
                mario2.chamaCaracteristicas();
                System.out.println("-------------------------------------------------");
                System.out.println("-------------------------------------------------");

                Mario2 mario3 = new Mario2();
                mario3.chamaCaracteristicas();
                mario3.coleteMoeda();
                mario3.coleteMoeda();
                mario3.coleteMoeda();
                mario3.chamaCaracteristicas();

                System.out.println("-------------------------------------------------");
                System.out.println("-------------------------------------------------");


                Mario2 mario4 = new Mario2();
                mario4.chamaCaracteristicas();
                for (int i = 0; i < 20; i++){
                       mario4.coleteMoeda();
                }
                mario4.chamaCaracteristicas();

                System.out.println("-------------------------------------------------");
                System.out.println("-------------------------------------------------");

                Mario2 mario5 = new Mario2();
                mario5.chamaCaracteristicas();
                for (int i = 0; i <10 ; i++){
                        mario5.coleteMoeda();
                }
                mario5.chamaCaracteristicas();
                mario5.morrer();
                mario5.chamaCaracteristicas();

                System.out.println("--------------------------------------------------");
                System.out.println("--------------------------------------------------");


                Mario2 mario6 = new Mario2();

                mario6.chamaCaracteristicas();
                for(int i = 0; i < 10 ; i++){
                        mario6.coleteMoeda();
                }
                mario6.chamaCaracteristicas();
                mario6.perdStamina();
                mario6.perdStamina();
                mario6.chamaCaracteristicas();
                mario6.morrer();
                mario6.chamaCaracteristicas();

                System.out.println("--------------------------------------------------");
                System.out.println("--------------------------------------------------");

                Mario2 mario7= new Mario2();
                mario7.chamaCaracteristicas();
                mario7.morrer();
                mario7.morrer();
                mario7.morrer();
                mario7.chamaCaracteristicas();



                }



        }



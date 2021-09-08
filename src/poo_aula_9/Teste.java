package poo_aula_9;

public class Teste {
    public static void main(String[] args) {
        Mario mario = new Mario("Mario",1.50,40);
        mario.montadoNoYoshi();
        Yoshi yoshi =  new Yoshi("yoshi verde",1.20,3);
        mario.montaNoYoshi(yoshi);
        mario.montadoNoYoshi();
        mario.qualNomeYoshi();
        Luigi luigi = new Luigi("luigi",1.80,30);
        luigi.voar();
        yoshi.eatFruits();
        yoshi.eatFruits();
        yoshi.chamaCaracteristicas();


          }
}

package poo_aula_9;

public class Yoshi extends Personagem {
    public Yoshi(String nome, double altura, int idade) {
        super(nome, altura, idade);
    }
    int fruits = 0;
    int speed = 10;

    public int getSpeed() {
        return speed;
    }

    public void eatFruits(){
        this.fruits++;
        if(this.fruits % 2 ==0 ){
           this.speed *= 2;
        }
    }

    public void chamaCaracteristicas() {
        System.out.println(" Nome: " + nome + ", Altura: " + altura + ", Idade : " + idade + ", Velocidade: " + speed + ", Frutas: " + fruits + ", Vidas: " + life);


    }

}

package poo_aula_10;

public class Yoshi extends Personagem {
    public Yoshi(String nome, double altura, int idade) {
        super(nome, altura, idade);
    }

    int frutas = 0;
    int velocidade = 10;

    public int getVelocidade() {
        return velocidade;
    }

    public void comerFrutas() {
        this.frutas++;
        if (this.frutas % 2 == 0) {
            this.velocidade *= 2;
        }
    }

    @Override
    public void chamaCaracteristicas() {
        System.out.println("Nome: " + nome + ", Altura: " + altura + ", Idade : " + idade + ", Velocidade: " + velocidade + ", Frutas: " + frutas + ", Vidas: " + life);
    }

    @Override
    public void crescer() {
        this.altura *= 0.1 + altura;
    }
  
}

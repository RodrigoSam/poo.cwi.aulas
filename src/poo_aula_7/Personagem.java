package poo_aula_7;

public class Personagem {
    private String nome;
    private double altura;
    private int idade;
    private int stamina;
    private int coins;
    private int life;


    public Personagem(String nome, double altura, int idade) {
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
        this.stamina = 100;
        this.coins = 0;
        this.life = 1;
    }

    public void chamaCaracteristicas() {
        System.out.println(" Nome: " + nome + ", Altura: " + altura + ", Idade : " + idade + ", Stamina: " + stamina + ", Moedas: " + coins + ", Vidas: " + life);


    }

    public void chamaPoderes() {
        System.out.println("Poderes: Força sobre humana, Salto e salto sobre humanos, durabilidade sobre-humana, pirocinese e outras... ");

    }

    public void perdStamina() {
        this.stamina -= 10;
        if (this.stamina < 0) {
            this.stamina = 0;
        }
    }

    public void ganhaStamina() {
        this.stamina += 5;
        if (this.stamina > 100) {
            this.stamina = 100;
        }
    }

    public void crescer() {

        this.altura *= 2;
    }

    public void revigorar() {
        this.stamina = 100;
    }

    public void morrer() {
        this.stamina = 0;
        this.life -= 1;
        if (life < 0) {
            this.life = 0;
        } else {
            this.revigorar();
        }
    }

    public void coleteMoeda() {
        this.coins++;
        if (this.coins % 10 == 0) {
            this.life++;
        }
    }

    public void saltar() {

        if (this.nome .equals("Mario") ||this.nome .equals("mario")) {
            System.out.println("Mario Saltou " + altura * 0.5 + " de altura");
        } else if (this.nome .equals("Luigi")  || this.nome .equals("luigi") ) {
            System.out.println("Luigi Saltou " + altura * 2 + " de altura");
        }
    }
}

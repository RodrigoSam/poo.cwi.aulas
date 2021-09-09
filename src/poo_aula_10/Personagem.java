package poo_aula_10;

public abstract class Personagem {
    protected String nome;
    protected double altura;
    protected int idade;
    protected int stamina;
    protected int coins;
    protected int life;


    public Personagem(String nome, double altura, int idade) {
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
        this.stamina = 100;
        this.coins = 0;
        this.life = 1;
    }
    public String getNome(){
        return this.nome;
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

    public abstract void crescer();

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
      double pulo = this.altura * 0.5;
      System.out.println(this.nome + " saltou " + pulo + " mts de altura");
    }

    public void saltar(double alturaObjeto){
        double pulo = alturaObjeto * 1.5;
        System.out.println(this.nome + " saltou um objeto de " + alturaObjeto + " mts pulando " + String.format("%.2f", pulo) + " de altura, que salto enorme!!!! ");
    }

}

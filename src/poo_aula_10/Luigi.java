package poo_aula_10;

public class Luigi extends Personagem {
    private Yoshi yoshi;

    public Luigi(String nome, double altura, int idade) {
        super(nome, altura, idade);
    }

    public void sobeNoYoshi(Yoshi yoshi) {
        this.yoshi = yoshi;
    }

    public void descerDoYoshi() {
        yoshi = null;
        System.out.println("Mario desceu do yoshi");
    }

    public void montadoNoYoshi() {
        if (yoshi == null) {
            System.out.println("Mario não está montado no Yoshi");
        } else {
            System.out.println("Mario está montado no Yoshi");
        }
    }

    public void qualNomeYoshi() {
        System.out.println("Luigi está com o  " + yoshi.getNome());
    }

    public void voar() {
        System.out.println("Luigi está voando");
    }

    @Override
    public void crescer() {
        this.altura *= 0.75 + this.altura;
    }

}

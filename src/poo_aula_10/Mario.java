package poo_aula_10;

public class Mario extends Personagem {
    private Yoshi yoshi;

    public Mario(String nome, double altura, int idade) {
        super(nome, altura, idade);
    }
    public void montaNoYoshi(Yoshi yoshi){
        this.yoshi=yoshi;
    }
    public void montadoNoYoshi(){
        if (yoshi == null){
            System.out.println("Mario não está montado no Yoshi");
        }else{
            System.out.println("Mario está montado no Yoshi");
        }
    }
    public void qualNomeYoshi(){
        System.out.println("Mario está com o  "+ yoshi.getNome());
    }
    @Override
    public void crescer(){
        this.altura *= 0.5 + this.altura;
    }

}


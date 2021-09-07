package poo_aula_3;

public class caneta_class {public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    public boolean tampada;
    public void status() {
        System.out.println("Uma Caneta "+this.cor);
        System.out.println("Está tampada? "+ this.tampada);
        System.out.println("Sua Ponta é "+this.ponta);
        System.out.println("Sua Carga está em "+this.carga);
        System.out.println("Uma Caneta modelo "+this.modelo);
    }

    public void rabiscar() {
        if (this.tampada==true) {
            System.out.println("Erro!Não posso rabiscar");
        }else {
            System.out.println("Estou Rabiscando!");
        }
    }
    public void tampar( ) {
        this.tampada=true;
    }
    public void destampar() {
        this.tampada=false;
    }
}

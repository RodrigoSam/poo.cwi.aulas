package poo_aula_4;

import jdk.swing.interop.SwingInterOpUtils;

public class caneta_classe_getSet {
   public String modelo;
     private double ponta;
    private boolean tampada;
    private String cor;

     public caneta_classe_getSet(String m, String c,double p ){ //este é o método construtor, identifica pelo mesmo nome da classe!
        this.tampar();                   //assim que eu criar a caneta ela vai estar tampada
        this.setModelo(m);
        this.setCor(c);
        this.setPonta(p);

     }


     public String getModelo(){
         return this.modelo;
     }
    public void setModelo(String m){
        this.modelo = m;
    }
    public double getPonta(){
         return this.ponta;
    }
    public void setPonta(double p){
         this.ponta = p;
    }
    public String getCor(){
         return this.cor;
    }
    public void setCor(String c){
         this.cor = c;
    }


    public void status() {
        System.out.println("SOBRE A CANETA:");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Tampada: " + this.tampada);
    }
    public void tampar(){
         this.tampada=true;
    }
    public void destampada() {
         this.tampada=false;
    }

}

package poo_aula_3;

public class canetaObjeto {

    public static void main(String[] args) {
        caneta_class c1 = new caneta_class();
        c1.modelo = "Bic Cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
        c1.carga = 90;
        c1.tampada = true;
        c1.status();

    }
}

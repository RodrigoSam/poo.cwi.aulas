package poo_aula_5;

public class BancoObjeto {
    public static void main(String[] args) {
        Conta_classe p1 = new Conta_classe(0, false);
        p1.setNumConta(182125);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");
        p1.depositar(300);
        p1.estadoAtual();

        Conta_classe p2 = new Conta_classe(0, false);
        p2.setNumConta(5236859);
        p2.setDono("Creuza");
        p2.abrirConta("CP");
        p2.depositar(500);
        p2.sacar(100);
        p2.estadoAtual();

    }
}
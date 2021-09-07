package poo_aula_3;

public class mario_classe_Visibilidade { String nome;
  public double altura;
    public int idade ;
    private String hobby;
    protected String comidaPreferida;
    protected String nacionalidade;
    public String especie;

    public void chamaCaracteristicas(){
        System.out.println("Espécie: " +especie+ ", Nome: " +nome+ ", Altura: " +altura+ ", Idade : " +idade+ ", Hobby: " +hobby+ ", Comida preferida: " +comidaPreferida+ ", Nacionalidade: " + nacionalidade);


    }
    public void chamaPoderes() {
        System.out.println("Poderes: Força sobre humana, Salto e salto sobre humanos, durabilidade sobre-humana, pirocinese e outras... ");

    }

}

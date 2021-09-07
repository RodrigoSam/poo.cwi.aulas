package poo_aula_4;

public class Mario {
    private String nome;
    private double altura;
    private int idade ;
    private String hobby;
    private String comidaPreferida;
    private String nacionalidade;
    private String especie;
    private int stamina;

    public Mario() {
        this.nome = "Mario Bros";
        this.altura = 1.50;
        this.idade = 40;
        this.stamina = 100;
    }

    public Mario(String nome, double altura, int idade, int stamina) {
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
        this.stamina = stamina;
    }
    public void chamaCaracteristicas(){
        System.out.println("Espécie: " +especie+ ", Nome: " +nome+ ", Altura: " +altura+ ", Idade : " +idade+ ", Hobby: " +hobby+ ", Comida preferida: " +comidaPreferida+ ", Nacionalidade: " + nacionalidade);


    }
    public void chamaPoderes() {
        System.out.println("Poderes: Força sobre humana, Salto e salto sobre humanos, durabilidade sobre-humana, pirocinese e outras... ");

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double alt) {
        this.altura = alt;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int i) {
        this.idade = i;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hby) {
        this.hobby = hby;
    }

    public String getComidaPreferida() {
        return comidaPreferida;
    }

    public void setComidaPreferida(String comPref) {
        this.comidaPreferida = comPref;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacio) {
        this.nacionalidade = nacio;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String esp) {
        this.especie = esp;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stam) {
        this.stamina = stam;
    }


}


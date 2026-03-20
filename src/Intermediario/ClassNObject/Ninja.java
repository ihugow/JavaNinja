package Intermediario.ClassNObject;

public class Ninja {
    String name;
    String village;
    int age;
    String clan;

    public Ninja (String name, String village, int age, String clan) {
        this.name = name;
        this.village = village;
        this.age = age;
        this.clan = clan;
    }

    public void ExibirDados() {
        System.out.println();
    }

    public String Saudacao(String name) {
        return "Olá, meu nome é " + name + " e eu sou um(a) ninja!";
    }

    public String FalarClan(String cla) {
        return "Eu sou do clã " + cla;
    }
}

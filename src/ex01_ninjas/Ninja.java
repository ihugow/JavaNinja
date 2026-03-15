package ex01_ninjas;

public class Ninja {
    String name;
    int age;
    String mission;
    char missionRank;
    boolean missionComplete;

    public Ninja(String name, int age, String mission, char missionRank) {
        this.name = name;
        this.age = age;
        this.mission = mission;
        this.missionRank = missionRank;
    }

    public static void exibirNinjas() {
        Ninja ninja1 = new Ninja("Naruto", 16, "Ajudar um velho atravessar uma ponte", 'S');
        Ninja ninja2 = new Ninja("Sasuke", 16, "Treinar com o kakashi", 'B');
        Ninja ninja3 = new Ninja("Sakura", 16, "Encontrar um cachorro perdido", 'C');
        Ninja ninja4 = new Ninja("Konohamaru", 12, "Restagar um gato", 'D');
        Ninja ninja5 = new Ninja("Rock Lee", 14, "Resgatar o Sasuke do Orochimaru", 'S');
        Ninja[] listaNinjas = {ninja1, ninja2, ninja3, ninja4, ninja5};

        for(Ninja n : listaNinjas) {
            System.out.println("-------------------------");
            System.out.println("Nome: " + n.name);
            System.out.println("Idade: " + n.age);
            System.out.println("Missão: " + n.mission);
            System.out.println("Rank da missão: " + n.missionRank);

            if (n.age < 15 && !(n.missionRank == 'C' || n.missionRank == 'D')) {
                System.out.println("Erro: Ninjas com menos de 15 anos só podem aceitar missões de rank D e C.");
            }

            n.missionComplete = true;
            System.out.println("Missão aceita e concluída!");
        }
    }

    public static void main(String[] args) {
        exibirNinjas();
    }
}

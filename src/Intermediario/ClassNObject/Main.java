package Intermediario.ClassNObject;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Criando objetos ninja na mão:
        Ninja Naruto = new Ninja("Naruto", "Konoha", 16, "Uzumaki");
        Ninja Sasuke = new Ninja("Sasuke", "Konoha", 17, "Uchiha");
        Ninja Sakura = new Ninja("Sakura", "Konoha", 17, "Haruno");
        List<Ninja> ninjaList = new ArrayList<>(Arrays.asList(Naruto, Sasuke, Sakura));

        //Criando objetos ninja por entrada de usuário:
        int ninjaListWidth = 2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos criar uma lista com " + ninjaListWidth + " ninjas");

        for (int i = 0; i < ninjaListWidth; i++) {
            System.out.println("\nDados do " + (i + 1) + "° ninja");
            System.out.print("Nome: ");
            String name = scanner.nextLine();
            System.out.print("Aldeia: ");
            String village = scanner.nextLine();
            System.out.print("Idade: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.print("Clan: ");
            String clan = scanner.nextLine();
            Ninja n = new Ninja(name, village, age, clan);
            ninjaList.add(n);
        }

        for (Ninja n : ninjaList) {
            System.out.println("\n" + n.Saudacao(n.name));
            System.out.println(n.FalarClan(n.clan));
        }
    }
}

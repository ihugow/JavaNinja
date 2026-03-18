package d02_cadastro_ninjas;

/* DESCRIÇÃO
Você foi encarregado pelo Hokage para gerenciar o cadastro de ninjas na Vila da Folha. Sua missão é criar um
sistema simples em Java para cadastrar novos ninjas e listar todos os ninjas cadastrados.

Tópicos a serem utilizados:
Arrays: Para armazenar os nomes dos ninjas.
Switch Cases: Para implementar um menu interativo.
Loops: Para navegar pelas opções do menu e iterar sobre os ninjas cadastrados.
Condicionais: Para controlar a execução das opções do menu e validar o número de ninjas cadastrados.

Dicas extras:
Permita ao usuário cadastrar o nome de um ninja.
Exiba a lista de todos os ninjas cadastrados.
Imprima os dados: Use System.out.println para mostrar as informações.
O usuário pode encerrar o programa a qualquer momento.
*/

import java.util.Scanner;

public class D02 {
    static Scanner userInput = new Scanner(System.in);
    static String[] ninjas = new String[10];
    static short count = 0;
    static boolean continuer = true;

    public static void main(String[] args) {
        while (continuer) {
            System.out.println(
                    "\n------------------------------\n" +
                            " M U R A L  D E  K O N O H A\n" +
                            "------------------------------\n" +
                            "Selecione a opção desejada:\n" +
                            "1 - Exibir ninjas cadastrados\n" +
                            "2 - Adicionar um ninja\n" +
                            "3 - Sair\n" +
                            "------------------------------\n"
            );

            short operation = Short.parseShort(userInput.nextLine());

            switch (operation) {
                case 1 -> listNinjas();
                case 2 -> addNinja();
                case 3 -> continuer = false;
                default -> System.out.println("Opção inválida.");
            }
        }
    }

    public static void addNinja() {
        if (count < 10) {
            System.out.println("\nDigite o nome do ninja:");
            String ninjaName = userInput.nextLine();
            ninjas[count] = ninjaName;
            count++;
            System.out.println("O ninja (" + ninjaName + ") foi adicionado!\n" +
                    "\nVocê deseja adicionar outro ninja? (1) Sim (0) Não:");
            short addOtherNinja = Short.parseShort(userInput.nextLine());

            switch (addOtherNinja) {
                case 1 -> addNinja();
                case 0 -> System.out.println("Voltando...");
                default -> System.out.println("Opção inválida, voltando ao menu inicial...");
            }
        } else {
            System.out.println("\nA lista atingiu o tamanho máximo, não há mais espaço para adicionar novos ninjas.");
        }
    }

    public static void listNinjas() {
        if (count == 0) {
            System.out.println("Ainda não há ninjas cadastrados.");
        } else {
            System.out.println("------ LISTA DE NINJAS ------");
            for (String n : ninjas) {
                if (n != null) {
                    System.out.println(n);
                }
            }
            System.out.println("-----------------------------");
        }
        System.out.println("Pressione Enter para continuar...");
        userInput.nextLine();
    }
}
package Academia;

import java.util.Scanner;

public class AcademiaMain {

    public static void main(String[] args) {

    }

    public static void MenuP() {// Inicio MENU
        System.out.println("\n+----------------------+");
        System.out.println("|     Academia   STAR  |");
        System.out.println("+----------------------+");
        System.out.println("| 1 - Ger. Cliente     |");
        System.out.println("| 2 - Ger. Venda       |");
        System.out.println("| 3 - Ger. Treino      |");
        System.out.println("| 0 - Sair             |");
        System.out.println("+----------------------+");
        System.out.print("  Escolha uma opção: ");

    }//fimMenuP

    public static void subMenu(int op) {
        String tpCad = null;
        switch (op) {
            case 1:
                break;
            case 2 :
                break;
            case 3 : 
                break;
        } 
        System.out.println("Ger Academia "+ tpCad + ": .");
        System.out.println("1 - Cadastrar Cliente ");
        
    }//fimsubmenu

    public static int leiaNumInt() {
        Scanner leiaNum = new Scanner(System.in);
        int num = 99;
        try {
            num = leiaNum.nextInt();
        } catch (Exception e) {
            System.out.println("Tente novamente!");
            leiaNum.nextLine();
        }
        return num;
    }
}//fimMain

package ProjetoTrempoCerto;

import java.util.Scanner;

public class Menu {

    public static Scanner in = new Scanner(System.in);
    private int opcao;

    public void exibeMenu() {
        System.out.println("-=-=-=-=-=-=-=- Trempo Certo -=-=-=-=-=-=-=-" +
                "\nDigite a opção desejada:\n1- Verificar o tempo que o trém chegará na estação" +
                "\n2- Fazer uma sugestão ou reclamação \n3- Entrar na área administrativa" +
                "\n4- Verificar Horário de Funcionamento");


    }

}

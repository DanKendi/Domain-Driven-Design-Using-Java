package ProjetoTrempoCerto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int opcao = 0;
        ContadorTimer timer = new ContadorTimer(10);
        timer.start();
        Menu menu = new Menu();
        Linha Linha9 = new Linha();
        ArrayList<Feedback> listaFeedback = new ArrayList<>();
        Linha9.setNomeDaLinha("Linha 9 - Esmeralda");
        AreaAdmin areaAdmin = new AreaAdmin();
        HorarioDeFuncionamento horarioDeFuncionamento = new HorarioDeFuncionamento();
        do {
            menu.exibeMenu();
            System.out.print("Digite a opção desejada: ");
            opcao = in.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("O tempo é de " + timer.getInterval() + " segundos.");
                    System.in.read();
                    break;
                case 2:
                    Feedback f = new Feedback();
                    f.mensagemFeedback();
                    f.setFeedback(in.next());
                    listaFeedback.add(f);
                    System.in.read();
                    break;
                case 3:
                    areaAdmin.entrarAreaAdm();
                    System.in.read();
                    break;
                case 4:
                    if (horarioDeFuncionamento.estaDentroDoHorario())
                        System.out.println("As linhas da CCR estão abertas!");
                    else
                        System.out.println("As linhas da CCR estão fechadas!");
                    System.in.read();
                    break;
                case 9:
                    System.out.println("Fechando aplicação...");
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        } while (opcao != 9);

        in.close();
    }
}

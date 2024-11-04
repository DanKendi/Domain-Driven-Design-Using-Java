//package ProjetoTrempoCerto;
//
//import java.util.Scanner;
//
//public class AlterarStatusLinha {
//    private String AlterarStatusLinha;
//    private int opcaoASL;
//    public void Alterar(){
//        Scanner in = new Scanner(System.in);
//        Linha StatusLinha9 = new Linha();
//        System.out.println("Digite a opção desejada: \n1- Operação Normal \n2- Operação com Maior Tempo de Parada" +
//                "\n3- Operação Lenta (Sem Previsão de Tempo entre os Trens) \nDemais Números - Sair sem alterar");
//        opcaoASL = in.nextInt();
//        switch (opcaoASL){
//            case 1:
//                StatusLinha9.setStatusLinha9("Operação Normal");
//                break;
//            case 2:
//                StatusLinha9.setStatusLinha9("Operação com Maior Tempo de Parada");
//                break;
//            case 3:
//                StatusLinha9.setStatusLinha9("Operação Lenta (Sem Previsão de Tempo entre os Trens)");
//                break;
//            default:
//                System.out.println("Voltando para o Menu Principal. . .");
//                break;
//        }
//        in.close();
//    }
//}

package ProjetoTrempoCerto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class AreaAdmin {
    private String usuario = "123";
    private String senha = "123";
    private boolean verifLogin = false;
    public static Scanner in = new Scanner(System.in);
    private ArrayList<Manutencao> listaManutencao = new ArrayList<>();

    public void entrarAreaAdm() {

        System.out.print("Digite o login de Administrador: ");
        String tentativaLogin = in.next();
        System.out.print("Digite a senha de Administrador: ");
        String tentativaSenha = in.next();

        if (tentativaLogin.equals(usuario) && tentativaLogin.equals(senha)){
            MenuAdmin();
        }

    }
    public void MenuAdmin() {

        System.out.println("----- Menu Administrativo -----");
        System.out.println("Digite a opção desejada: \n1- Alterar status da via: \n2- Alterar tempo entre os trens \n3- Alterar Usuário" +
                "\n4- Alterar senha \n5- Adicionar Manutenção \n6- Listar Manutenções \n9- Sair");

        int opcaoAdm = in.nextInt();

        switch (opcaoAdm) {
            case 1:
                verifLogin = true;
                break;
            case 2:
                System.out.print("Digite o novo intervalo de tempo entre os trens: ");
                int tempo = in.nextInt();
                ConfigurarTempo(tempo);
                break;
            case 3:
                AlterarSenha();
                break;
            case 4:
                AlterarUsuario();
                break;
            case 5:
                Manutencao m = new Manutencao();
                int ano, mes, dia;
                System.out.printf("Defina o Id de manutenção: ");
                m.setIdManutencao(in.nextInt());
                System.out.printf("Informe a descrição da manutenção: ");
                m.setDescricao(in.next());
                System.out.printf("Informe o dia do incio da manutenção: ");
                dia = in.nextInt();
                System.out.printf("Informe o mes do incio da manutenção: ");
                mes = in.nextInt();
                System.out.printf("Informe o ano do incio da manutenção: ");
                ano = in.nextInt();
                m.setDataInicio(LocalDate.of(ano, mes, dia));
                System.out.printf("Informe o dia da finalização da manutenção: ");
                dia = in.nextInt();
                System.out.printf("Informe o mes da finalização da manutenção: ");
                mes = in.nextInt();
                System.out.printf("Informe o ano da finalização da manutenção: ");
                ano = in.nextInt();
                m.setDataFim(LocalDate.of(ano, mes, dia));
                listaManutencao.add(m);
                break;
            case 6:
                for (Manutencao manutencao: listaManutencao){
                    System.out.println(manutencao);
                }
            case 9:
                break;
            default:
                System.out.println("Opcao Inválida!");
                break;
        }
    }

    public boolean getVerifLogin(){
        return verifLogin;
    }

    public void ConfigurarTempo(int tempo) {
        ContadorTimer.tempoIncial = tempo;
    }

    private void AlterarUsuario(){
        System.out.print("Digite a nova senha: ");
        senha = in.next();
    }

    private void AlterarSenha(){
        System.out.print("Digite o novo login do usuário: ");
        usuario = in.next();
    }
}

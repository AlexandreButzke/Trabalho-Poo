import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcaoOperacional = 0;

        while (opcaoOperacional != 6) {
            Puuts.telaInicial();
            opcaoOperacional = Integer.parseInt(input.nextLine());

            switch (opcaoOperacional) {
                case 1:
                    Puuts.telaTipoGasto();
                    String tg = input.nextLine();
                    if ("99".equals(tg)){
                        System.out.println("Operação Cancelada.Voltando à tela inicial.... ");
                        System.out.println();
                        break;
                    }
                    Puuts.telaData();
                    String data = input.nextLine();

                    Puuts.telaValor();
                    double valor = Double.parseDouble(input.nextLine());

                    Puuts.telaFormaPagamento();
                    String tipoPag = input.nextLine();

                    Gasto gasto = new Gasto(tg,data,valor,tipoPag);
                    Praca.adicionarGasto(gasto);
                    break;
                case 2:
                    Puuts.telaTipoGanho();
                    String tipoGanho = input.nextLine();
                    if (tipoGanho == "99"){
                        break;
                    }

                    Puuts.telaData();
                    String dataGanho = input.nextLine();

                    Puuts.telaValor();
                    double valorGanho = Double.parseDouble(input.nextLine());

                    Ganho ganho = new Ganho(tipoGanho,dataGanho,valorGanho);
                    Praca.adicionarGanho(ganho);
                    break;
                case 3:
                    Praca.gerarRelatorioGasto();
                    break;
                case 4:
                    Praca.gerarRelatorioGanho();
                    break;
                case 5:
                    Praca.gerarRelatorioMensal();
                    break;
                case 6:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("[ERRO] Opção inválida! Tente novamente.");
                    System.out.println();
            }
        }
    }
}
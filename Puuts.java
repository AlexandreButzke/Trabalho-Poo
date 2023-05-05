public class Puuts{
    public static void telaInicial(){
        System.out.println("Gestão Financeira");
        System.out.println("-----------------------");
        System.out.println("1 - Adicionar Gasto");
        System.out.println("2 - Adicionar Ganho");
        System.out.println("3 - Relatório de Gastos");
        System.out.println("4 - Relatório de Ganhos");
        System.out.println("5 - Relatório Mensal");
        System.out.println("6 - Sair");
        System.out.println();
        System.out.print("Selecione uma opção: ");
    }
    public static void telaTipoGasto(){
        System.out.println();
        System.out.println("Adicionar Tipo de gasto");
        System.out.println("-----------------------");
        System.out.println("1 - Habitação");
        System.out.println("2 - Entretenimento");
        System.out.println("3 - Alimentação");
        System.out.println("4 - Transporte");
        System.out.println("X - SEU GASTO");
        System.out.println("99 - Voltar");
        System.out.println();
        System.out.println("Selecione o tipo de gasto");
    }
    public static void telaData(){
        System.out.println();
        System.out.println("Adicionar a data de gasto ou ganho");
        System.out.println("-----------------------");
        System.out.println("Informe a data: ");
    }

    public static  void telaValor(){
        System.out.println("Informe o valor");
        System.out.println("-----------------------");
        System.out.println("Valor: ");
    }

    public static void telaFormaPagamento(){
        System.out.println();
        System.out.println("Selecione a forma de pagamento");
        System.out.println("-----------------------");
        System.out.println("1 - Cheque");
        System.out.println("2 - Pix");
        System.out.println("3 - Débito");
    }


    public static void telaTipoGanho(){
        System.out.println();
        System.out.println("Adicionar Tipo de ganho");
        System.out.println("-----------------------");
        System.out.println("1 - Salário");
        System.out.println("2 - Freelancer");
        System.out.println("3 - Dividendos");
        System.out.println("99 - Voltar");

        System.out.println("Selecione o tipo de ganho");
    }
}
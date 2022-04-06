import java.util.Scanner;

public class top {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //teste de git
        //segundo teste
        String[][][] compromisso = new String[12][31][24];
        boolean sair = false;
        byte opcao;
        while (!sair){

            System.out.println("Digite 1 para adicionar compromisso");
            System.out.println("Digite 2 para verificar compromisso");
            System.out.println("Digite 0 para sair");
            opcao = scanner.nextByte();
            if (opcao == 1){
                boolean mesValido = false;
                int mes =0;
                while (!mesValido){
                    System.out.println("Entre com mês");
                    mes = scanner.nextInt();
                    if (mes > 0 && mes <= 12){
                        mesValido = true;
                    }else {
                        System.out.println("Dia inválido, digite novamente");
                    }
                }

                boolean diaValido = false;
                int dia=0;
                while (!diaValido){
                    System.out.println("Entre com o dia do mês");
                    dia = scanner.nextInt();
                    if (dia > 0 && dia <= 31){
                        diaValido = true;
                    }else {
                        System.out.println("Dia inválido, digite novamente");
                    }
                }
                boolean horaValida = false;
                int hora=0;
                while (!horaValida) {
                    System.out.println("Entre com a hora do mês");
                    hora = scanner.nextInt();
                    if (hora >= 0 && hora <= 24) {
                        horaValida = true;
                    } else {
                        System.out.println("Hora inválida, digite novamente");
                    }
                }
                dia--;
                System.out.println("Digite o compromisso");
                compromisso[mes][dia][hora] = scanner.next();

            }else if (opcao == 2){
                boolean mesValido = false;
                int mes =0;
                while (!mesValido){
                    System.out.println("Entre com mês");
                    mes = scanner.nextInt();
                    if (mes > 0 && mes <= 12){
                        mesValido = true;
                    }else {
                        System.out.println("Dia inválido, digite novamente");
                    }
                }

                boolean diaValido = false;
                int dia=0;
                while (!diaValido){
                    System.out.println("Entre com o dia do mês");
                    dia = scanner.nextInt();
                    if (dia > 0 && dia <= 31){
                        diaValido = true;
                    }else {
                        System.out.println("Dia inválido, digite novamente");
                    }
                }
                boolean horaValida = false;
                int hora=0;
                while (!horaValida) {
                    System.out.println("Entre com a hora do mês");
                    hora = scanner.nextInt();
                    if (hora >= 0 && hora <= 24) {
                        horaValida = true;
                    } else {
                        System.out.println("Hora inválida, digite novamente");
                    }
                }
                dia--;
                System.out.println("O compromisso agendado é: ");
                System.out.println(compromisso[mes][dia][hora]);


            }else if (opcao == 0){
                sair = true;
            }else System.out.println("Não é um número válido, digite novamente");

        }
}}

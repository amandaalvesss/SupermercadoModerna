import java.sql.SQLException;
import java.util.Scanner;

public class TelaInicial {
        public static void main(String[] args) throws SQLException {

            // Instanciando Scanner para capturar o que for digitado na tela
            Scanner scn = new Scanner(System.in);

            // Menu de Opcoes
            System.out.println("=================================");
            System.out.println("ESCOLHA UMA OPÇÃO ABAIXO:");
            System.out.println("=================================");
            System.out.println("1 -  Cadastrar novo Produto");
            System.out.println("2 -  Cadastrar nova Seção");
            System.out.println("3 -  Listar Produto");
            System.out.println("4 -  Listar Seção");
            System.out.println("5 -  Excluir Produto");
            System.out.println("6 -  Excluir Seção");
            System.out.println("7 - Finalizar menu");
            System.out.println("---------------------------------");

            int num1 = scn.nextInt();
            scn.nextLine();

            //Garantir que recebera um numero valido
            //Enquanto nao receber ficara solicitando uma opcao valida
            while (num1 > 7) {

                System.out.println("Dado inválido, escolha a opção 1 a 7");
                num1 = scn.nextInt();
                scn.nextLine();
            }

            //inicio das opcoes
            switch (num1) {
                case 1:
                    CadastrarProduto.InserirProduto();
                    break;
                case 2:
                    System.out.println("TESTE");
                    break;
                case 3:
                    System.out.println("TESTE");
                    break;
                case 4:
                    System.out.println("TESTE");
                    break;
                case 5:
                    System.out.println("TESTE");
                    break;
                case 6:
                    System.out.println("TESTE");
                    break;
                case 7:
                    System.out.println("TESTE");
                    break;
                default:
                    System.out.println("Dado inválido, escolha a opção 1 a 7");

            }

            //fecha o scanner
            scn.close();
        }

    }

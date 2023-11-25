package br.com.av2.estruturadedados;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ArvoreAVL arvore = new ArvoreAVL();
        int escolha;


        do {
            System.out.println("Escolha uma opção:");
            System.out.println("<1> Inserir");
            System.out.println("<2> Excluir");
            System.out.println("<3> Pesquisar");
            System.out.println("<4> Caminhamento em pré-ordem");
            System.out.println("<5> Sair");

            System.out.print("Digite o número da opção desejada: ");
            escolha = leitura.nextInt();

            switch (escolha) {
                case 1:
                    try {

                        System.out.println("Número 1 escolhido!");
                        System.out.println();
                        // Criar um objeto Scanner para ler o arquivo
                        Scanner scanner = new Scanner(new File("C:\\Users\\12116455\\IdeaProjects\\ExemplosEstruturaDados\\Av2_Estrutura_de_dados_2023\\src\\br\\com\\av2\\estruturadedados\\dados.txt"));

                        // Ler o conteúdo do arquivo linha por linha
                        while (scanner.hasNextLine()) {
                            String linha = scanner.nextLine();
                            System.out.println(linha);
                        }


                        // Fechar o Scanner após a leitura
                        scanner.close();
                    } catch (FileNotFoundException e) {
                        // Tratar exceção se o arquivo não for encontrado
                        System.err.println("Arquivo não encontrado: " + e.getMessage());
                    }


                    break;
                case 2:
                    System.out.println("Digite um numero a ser excluido");
                    break;
                case 3:
                    //pesquisar();
                    break;
                case 4:
                    //caminhamentoPreOrdem();
                    break;
                case 5:
                    System.out.println("Saindo do programa. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (escolha != 5);
        leitura.close();

    }
}

package application;

import java.io.File;
import java.util.Scanner;

public class Aula188 {
    public static void buscaNome(Scanner scan){
        //SUPONHA QUE QUERO ACESSAR APENAS O NOME DO ARQUIVO
        System.out.print("Entre com caminho: ");
        String caminho = scan.nextLine();

        File path = new File(caminho);


        System.out.println("nome do arquivo: " + path.getName());

    }

    public static void buscaCaminho(Scanner scan){
        System.out.print("Entre com o caminho e arquivo: ");
        String caminho = scan.nextLine();

        File path = new File(caminho);

        System.out.println("Caminho do Arquivo: " + path.getParent());


    }

    public static void buscaCaminhoCompleto(Scanner scan){
        System.out.print("Entre com o caminho e arquivo: ");
        String caminho = scan.nextLine();

        File path = new File(caminho);

        System.out.println("Caminho: " + path.getPath());

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        buscaNome(scan);
        System.out.println("=================================================");
        buscaCaminho(scan);
        System.out.println("=================================================");
        buscaCaminhoCompleto(scan);

    }


}

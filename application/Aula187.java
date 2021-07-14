package application;

import java.io.File;
import java.util.Scanner;

public class Aula187 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        configFile(scan);


    }
    public static void configFile(Scanner scan){


        System.out.print("local para cRIAR pastas: ");
        String caminho = scan.nextLine();
        //BUSCA DE PASTAS
        File file = new File(caminho);

        File [] folders = file.listFiles(File::isDirectory);
        System.out.println("Folders: ");

        for(File folder:folders){
            System.out.println(folder);
        }
        //BUSCAS DE ARQUIVO
        System.out.println("============= Pesquisa de Arquivos =========================Z");
        File [] files = file.listFiles(File::isFile);
        System.out.println("Arquivos: ");
        for(File f: files){
            System.out.println(f);
        }

        // criar sub pastas
        System.out.print("Nome para pasta a ser Criada: ");
        String past = scan.nextLine();
        boolean sucess = new File(caminho + "\\"  + past).mkdir();
        System.out.println("Diretorio Criado com sucesso " + sucess);

    }
}

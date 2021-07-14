package application;

import java.io.*;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws IOException {
       String path = "c:\\temp\\in.txt";

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){

            String line = bufferedReader.readLine();

            while(line != null){
                System.out.println(line);
                line = bufferedReader.readLine();
            }

        }catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Erro File "+e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Erro Io: "+e.getMessage());
        }

    }

}
//C:\Users\welton\Documents\Arquivos txt
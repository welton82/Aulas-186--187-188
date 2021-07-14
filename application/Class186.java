package application;

import java.io.*;
import java.util.Scanner;

public class Class186 {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        boolean bContinue = true;
        while(bContinue){


            System.out.print("Escreva algo: ");
            String []lines = new String[]{scan.nextLine()};
            String path = "C:\\temp\\out.txt";
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
                for(String line: lines){
                    bw.write(line);
                    bw.newLine();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }


            FileReader fileReader = null;
            BufferedReader bufferedReader = null;

            try{
                String file = path;
                fileReader = new FileReader(file);
                bufferedReader = new BufferedReader(fileReader);
                String line = bufferedReader.readLine();
                while(line != null){
                    System.out.println(line);
                    line = bufferedReader.readLine();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }


            System.out.print("Deseja Continuar escrevendo? ");
            char c = scan.nextLine().charAt(0);
            bContinue =  (c == 's' || c == 'S') ? true:false;


        }




    }
}

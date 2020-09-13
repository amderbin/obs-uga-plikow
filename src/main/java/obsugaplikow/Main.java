package obsugaplikow;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podja nazwę pliku, który chcesz wczytać: ");
        final String fileName = scanner.next();

        BufferedReader reader = new BufferedReader(new FileReader(fileName));
         final int arraySize = Integer.parseInt(reader.readLine());
         int [] numbers = new int [arraySize];

         for( int i =0; i < arraySize; i++){
             numbers[i] = Integer.parseInt(reader.readLine());
         }
            reader.close();

         int sum = 0;
         for(int number : numbers){
             sum += number;
         }
        System.out.println("Suma liczb z pliku to: " + sum);
    }
}

package tasks15.task04;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try(InputStream input = Files.newInputStream(Paths.get(scanner.nextLine()));
            OutputStream output = Files.newOutputStream(Paths.get(scanner.nextLine()))){

            byte[] buffer = new byte[2];
            while (input.available() > 0){
                int real = input.read(buffer);
                if (real == 2){
                    output.write(buffer, 1, 1);
                    output.write(buffer, 0 , 1);
                }else{
                    output.write(buffer, 0, 1);
                }
            }

        } catch (IOException e){
            System.out.println("Poblem is :" + e);
        }
    }
}


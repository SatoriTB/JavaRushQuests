package tasks15.task06;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/* 
Фейсконтроль
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try(Scanner scanner = new Scanner(System.in)){
            List<String> answer = Files.readAllLines(Paths.get(scanner.nextLine()));
            for (String str : answer){
                System.out.println(str.replaceAll("[, .]",""));
            }
        }

        }
    }



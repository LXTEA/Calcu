import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException{
        Scanner reader = new Scanner(System.in);
        String calc = reader.nextLine();
        System.out.println(calc(calc));
    }
    public static String calc(String input) throws IOException{
        int sum = 0;
        String[] probel = input.split(" ");
        int a, b;
        a = Integer.parseInt(probel[0]);
        b = Integer.parseInt(probel[2]);
        String znak = probel[1];
        if (probel.length != 3){
            throw new IOException();
        }
        if (a > 10 || a < 1){
            throw new IOException();
        }
        if (b > 10 || b < 1){
            throw new IOException();
        }
        switch (znak) {
            case "+" : sum = a + b;
                break;
            case "-" : sum = a - b;
                break;
            case "*" : sum = a * b;
                break;
            case "/" : sum = a / b;
                break;
            default:  throw new IOException("Ошибка! Введите корректный знак");
        }
        return String.valueOf(sum);
    }
}

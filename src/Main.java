import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException{

        Scanner reader = new Scanner(System.in);
        System.out.print("Введите пример:");
        int cifra1 = reader.nextInt();
        if(cifra1 > 10) {
                throw new IOException("Первое число больше 10");
        }
        if(cifra1 == 0) {
            throw new IOException("Первое число меньше 1");
        }
        char znak = reader.next().charAt(0);

        int cifra2 = reader.nextInt();
        if(cifra2 > 10) {
            throw new IOException("Второе число больше 10");
        }
        if(cifra2 == 0) {
            throw new IOException("Второе число меньше 1");
        }
        int o = 0;

        switch (znak) {
            case '+' : o = cifra1 + cifra2;
                break;
            case '-' : o = cifra1 - cifra2;
                break;
            case '*' : o = cifra1 * cifra2;
                break;
            case '/' : o = cifra1 / cifra2;
                break;
            default:  System.out.printf("Ошибка! Введите корректный знак");
                return;
        }
        System.out.print("\nОтвет:\n");
        System.out.printf(cifra1 + " " + znak + " " + cifra2 + " = " + o);



    }
}
//Scanner space = new Scanner(System.in);
//        String calc = space.nextLine();
//        int sum = 0;
//        String[] probel = calc.split(" ");
//        int a, b;
//        a = Integer.parseInt(probel[0]);
//        b = Integer.parseInt(probel[2]);
//        if (probel.length == 3){
//            sum = a + b;
//            System.out.print("= " +sum);
//        }
//        else {
//            throw new IOException();
//        }
//        if (probel.length < 3){
//            throw new IOException();
//        }
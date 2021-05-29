import java.util.Scanner;

public class Unit2Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Введите целое положительное число: ");
        int number = sc.nextInt();
        if (number <= 0){
            System.out.println("Введите положительное число!");
        }
        for (int i=0; i<=number; i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}

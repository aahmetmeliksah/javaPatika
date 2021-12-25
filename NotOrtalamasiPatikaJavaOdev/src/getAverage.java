import java.util.Scanner;

public class getAverage {
    public static void main(String[] args) {
        int math, physics, chemistry, turkish, history, music;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter math score: ");
        math = input.nextInt();

        System.out.print("Enter physics score: ");
        physics = input.nextInt();

        System.out.print("Enter chemistry score: ");
        chemistry = input.nextInt();

        System.out.print("Enter turkish language score: ");
        turkish = input.nextInt();

        System.out.print("Enter history score: ");
        history = input.nextInt();

        System.out.print("Enter music score");
        music = input.nextInt();

        double average = (music + history + turkish + chemistry + physics + math) / 6.0;
        System.out.println("Your GPA is: " + average);
        System.out.println(average > 60 ? "Passed" : "Failed");
    }
}

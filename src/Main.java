import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        clear();
        intro();
        wait(1500);
        clear();
        question1();
    }
    public static void clear() {

        System.out.print("\033[H\033[2J");
    }
    public static void wait(int ms) {
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
    public static void intro(){
        System.out.println("This is a test. Answer 10 questions correctly to complete it.");
    }
    public static void question1(){
        System.out.println("What is 1+1?");
        int answer=sc.nextInt();
        if (answer == 2){
            wait(100);
            clear();
            System.out.print("Correct!");
            wait(500);
            clear();
        } else {
            wait(100);
            clear();
            System.out.println("Incorrect...");
            wait(500);
            clear();
            question1();
        }
    }
    public static void question2(){
        System.out.println("What is 1+1?");
        int answer=sc.nextInt();
        if (answer == 2){
            wait(100);
            clear();
            System.out.print("Correct!");
            wait(500);
            clear();
        } else {
            wait(100);
            clear();
            System.out.println("Incorrect...");
            wait(500);
            clear();
            question1();
        }
    }
    public static void question3(){
        System.out.println("What is 1+1?");
        int answer=sc.nextInt();
        if (answer == 2){
            wait(100);
            clear();
            System.out.print("Correct!");
            wait(500);
            clear();
        } else {
            wait(100);
            clear();
            System.out.println("Incorrect...");
            wait(500);
            clear();
            question1();
        }
    }
    public static void question4(){
        System.out.println("What is 1+1?");
        int answer=sc.nextInt();
        if (answer == 2){
            wait(100);
            clear();
            System.out.print("Correct!");
            wait(500);
            clear();
        } else {
            wait(100);
            clear();
            System.out.println("Incorrect...");
            wait(500);
            clear();
            question1();
        }
    }
    public static void question5(){
        System.out.println("What is 1+1?");
        int answer=sc.nextInt();
        if (answer == 2){
            wait(100);
            clear();
            System.out.print("Correct!");
            wait(500);
            clear();
        } else {
            wait(100);
            clear();
            System.out.println("Incorrect...");
            wait(500);
            clear();
            question1();
        }
    }
    public static void question6(){
        System.out.println("What is 1+1?");
        int answer=sc.nextInt();
        if (answer == 2){
            wait(100);
            clear();
            System.out.print("Correct!");
            wait(500);
            clear();
        } else {
            wait(100);
            clear();
            System.out.println("Incorrect...");
            wait(500);
            clear();
            question1();
        }
    }
    public static void question7(){
        System.out.println("What is 1+1?");
        int answer=sc.nextInt();
        if (answer == 2){
            wait(100);
            clear();
            System.out.print("Correct!");
            wait(500);
            clear();
        } else {
            wait(100);
            clear();
            System.out.println("Incorrect...");
            wait(500);
            clear();
            question1();
        }
    }
    public static void question8(){
        System.out.println("What is 1+1?");
        int answer=sc.nextInt();
        if (answer == 2){
            wait(100);
            clear();
            System.out.print("Correct!");
            wait(500);
            clear();
        } else {
            wait(100);
            clear();
            System.out.println("Incorrect...");
            wait(500);
            clear();
            question1();
        }
    }
    public static void question9(){
        System.out.println("What is 1+1?");
        int answer=sc.nextInt();
        if (answer == 2){
            wait(100);
            clear();
            System.out.print("Correct!");
            wait(500);
            clear();
        } else {
            wait(100);
            clear();
            System.out.println("Incorrect...");
            wait(500);
            clear();
            question1();
        }
    }
    public static void question10(){
        System.out.println("What is 1+1?");
        int answer=sc.nextInt();
        if (answer == 2){
            wait(100);
            clear();
            System.out.print("Correct!");
            wait(500);
            clear();
        } else {
            wait(100);
            clear();
            System.out.println("Incorrect...");
            wait(500);
            clear();
            question1();
        }
    }
}
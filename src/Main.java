import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static int p = 10;

    public static void main(String[] args) {
        clear();
        intro();
        wait(1500);
        clear();
        question1();
        wait(1500);
        clear();
        question2();
        wait(1500);
        clear();
        question3();
        wait(1500);
        clear();
        question4();
        wait(1500);
        clear();
        question5();
        wait(1500);
        clear();
        question6();
        wait(1500);
        clear();
        question7();
        wait(1500);
        clear();
        question8();
        wait(1500);
        clear();
        question9();
        wait(1500);
        clear();
        question10();
        wait(1500);
        clear();
        outro();
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
            p = p - 1;
            wait(100);
            clear();
            System.out.println("Incorrect...");
            wait(500);
            clear();
            question1();
        }
    }
    public static void question2(){
        System.out.println("What is 10*10?");
        int answer=sc.nextInt();
        if (answer == 100){
            wait(100);
            clear();
            System.out.print("Correct!");
            wait(500);
            clear();
        } else {
            p = p - 1;
            wait(100);
            clear();
            System.out.println("Incorrect...");
            wait(500);
            clear();
            question2();
        }
    }
    public static void question3(){
        System.out.println("What is 100-57?");
        int answer=sc.nextInt();
        if (answer == 43){
            wait(100);
            clear();
            System.out.print("Correct!");
            wait(500);
            clear();
        } else {
            p = p - 1;
            wait(100);
            clear();
            System.out.println("Incorrect...");
            wait(500);
            clear();
            question3();
        }
    }
    public static void question4(){
        System.out.println("What is 10-15?");
        int answer=sc.nextInt();
        if (answer == -5){
            wait(100);
            clear();
            System.out.print("Correct!");
            wait(500);
            clear();
        } else {
            p = p - 1;
            wait(100);
            clear();
            System.out.println("Incorrect...");
            wait(500);
            clear();
            question4();
        }
    }
    public static void question5(){
        System.out.println("What is 9*-5?");
        int answer=sc.nextInt();
        if (answer == -45){
            wait(100);
            clear();
            System.out.print("Correct!");
            wait(500);
            clear();
        } else {
            p = p - 1;
            wait(100);
            clear();
            System.out.println("Incorrect...");
            wait(500);
            clear();
            question5();
        }
    }
    public static void question6(){
        System.out.println("What is -9*-9?");
        int answer=sc.nextInt();
        if (answer == 81){
            wait(100);
            clear();
            System.out.print("Correct!");
            wait(500);
            clear();
        } else {
            p = p - 1;
            wait(100);
            clear();
            System.out.println("Incorrect...");
            wait(500);
            clear();
            question6();
        }
    }
    public static void question7(){
        System.out.println("What is 0.5+0.75?");
        float answer=sc.nextFloat();
        if (answer == 1.25){
            wait(100);
            clear();
            System.out.print("Correct!");
            wait(500);
            clear();
        } else {
            p = p - 1;
            wait(100);
            clear();
            System.out.println("Incorrect...");
            wait(500);
            clear();
            question7();
        }
    }
    public static void question8(){
        System.out.println("What is 5*0.5?");
        float answer=sc.nextFloat();
        if (answer == 2.5){
            wait(100);
            clear();
            System.out.print("Correct!");
            wait(500);
            clear();
        } else {
            p = p - 1;
            wait(100);
            clear();
            System.out.println("Incorrect...");
            wait(500);
            clear();
            question8();
        }
    }
    public static void question9(){
        System.out.println("What is 10+8*7?");
        int answer=sc.nextInt();
        if (answer == 66){
            wait(100);
            clear();
            System.out.print("Correct!");
            wait(500);
            clear();
        } else {
            p = p - 1;
            wait(100);
            clear();
            System.out.println("Incorrect...");
            wait(500);
            clear();
            question9();
        }
    }
    public static void question10(){
        System.out.println("What is (10*10)/2+15)?");
        int answer=sc.nextInt();
        if (answer == 65){
            wait(100);
            clear();
            System.out.print("Correct!");
            wait(500);
            clear();
        } else {
            p = p - 1;
            wait(100);
            clear();
            System.out.println("Incorrect...");
            wait(500);
            clear();
            question10();
        }
    }
    public static void outro(){
        if (p == 10){
            clear();
            System.out.println("100%! Nice job!");
        } else {
            clear();
            System.out.println(p+"/10 were correct first try. Try again!");
        }

    }
}
import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        clear();
        intro();
        wait(1500);
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

    }
    public static void question2(){

    }
    public static void question3(){

    }
    public static void question4(){

    }
    public static void question5(){

    }
    public static void question6(){

    }
    public static void question7(){

    }
    public static void question8(){

    }
    public static void question9(){

    }
    public static void question10(){

    }
}
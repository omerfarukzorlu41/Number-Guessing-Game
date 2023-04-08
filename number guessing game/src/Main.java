import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);

        Scanner scanner = new Scanner(System.in);
        int right = 0;
        int selected;
        boolean isWin = false;
        int[] wrong = new int[5];
        System.out.println(number);

        while(right < 5 ){
            System.out.print("Please guess the number: ");
            selected = scanner.nextInt();

            if(selected < 0 ||selected > 99){
                System.out.println("PLEASE enter numbers between 0 and 100");
                continue;
            }

            if(selected == number){
                System.out.println("Congrats on the right guess! The number you guessed: "+number);
                isWin = true;
                break;
            }else{
                System.out.println("You entered the wrong number");
                if(selected > number){
                    System.out.println(selected+" number is greater than the hidden number.");
                }else{
                    System.out.println(selected+" number is less than the secret number.");
                }
                wrong[right++] = selected;
                System.out.println("remaining right "+(5-right));
            }
        }
        if(!isWin){
            System.out.println("you lost!!");
            System.out.println("your guesses: "+Arrays.toString(wrong));
        }
    }
}

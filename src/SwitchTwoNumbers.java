import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;

public class SwitchTwoNumbers {

    private static int number;
    private Scanner scanner;
    private int tries;
    private int variable = 1;
    private String temp;

    public SwitchTwoNumbers(int tries) {
        this.scanner = new Scanner(System.in);
        this.tries = tries;
    }

    public void switchTwoNumbers(String letter){
        System.out.println("Enter q");
        while (tries > 0){
            if (scanner.nextLine().equals("q")) {
                variable = variable == 1 ? 2 : 1;
            }
            System.out.println(variable);
            tries--;
        }
    }


    public void switchTwoNumbersWithIf(String letter){
        System.out.println("Enter q");
        while (tries > 0){
            if (scanner.nextLine().equals("q")) {
                if(variable == 1) {
                    variable = 2;
                } else {
                    variable = 1;
                }
            }
            System.out.println(variable);
            tries--;
        }
    }

}


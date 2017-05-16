/**
 * Created by abuchanan57 on 5/16/17.
 */

import java.util.Scanner;

public class MainString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        //Prompt user to enter a string to be reversed
        System.out.println("Please enter a string you wish to be reversed.");

        //Accept user input and store as a string
        String input = scanner.nextLine();

        //Shows the user input before reversal
        System.out.println("You entered: ");
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++){
            System.out.print(charArray[i]);
        }

        System.out.println("");

        //Shows the result after reversal
        System.out.println("Your entry, reversed: ");
        for (int x = ((charArray.length) - 1); x >= 0; x--){
            System.out.print(charArray[x]);
        }


    }


}

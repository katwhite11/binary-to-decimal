/*
author: Kathryn White
purpose: This program receives a binary string input from the user and converts it into decimal form. 
The program will report an error to the user if they input any string characters other than 1 or 0.
*/
import java.util.Scanner;

public class Lab08 {
    
    //method converts a binary string int to a decimal number
    public static int bin2Dec(String binaryString){
        int dec=0;
        
        //checks if any characters in string are not 1 or 0, throws exception if not binary
        for(int i=0;i<binaryString.length();i++){
            if(binaryString.charAt(i) != '0' && binaryString.charAt(i) != '1')
                throw new NumberFormatException("Not a binary number: " + binaryString);
        }
        
        //converts binary string into decimal
        for(int j=0;j<binaryString.length();j++){
          dec = dec*2 + (binaryString.charAt(j)-'0');
        }
        
        //return decimal integer
        return dec;
    
    }

    public static void main(String[] args) {
        
        //instance fields
        Scanner in = new Scanner(System.in);
        String userInput;
        boolean continueInput = true;
    
        do{
            try{
                System.out.print("Enter a binary number: ");
                userInput = in.nextLine(); //receives input from user
           
                System.out.println("The decimal value for binary number "+ userInput+ " is: "+ bin2Dec(userInput));
                continueInput = false; //stops while loop if no exception thrown
            }
            catch(NumberFormatException obj){
                System.out.println(obj.getMessage()); //prints error message to the user
            }
        }while(continueInput); //continues input if exception is thrown so new input can be made by user
    }
    
}

package simpletasks;

import java.util.Scanner;

public class Task029_HexToBin {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input hex: ");
        String hex = input.nextLine();
        
        int dec = Integer.parseInt(hex, 16);
        String bin = Integer.toString(dec, 2);
        
        System.out.println("Binary is egual to: " + bin);
    }
}

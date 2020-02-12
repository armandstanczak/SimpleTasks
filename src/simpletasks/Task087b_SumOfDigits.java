package simpletasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task087b_SumOfDigits {

    public static void main(String[] args) {
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            int sum = 0;
            System.out.print("Input a number: ");
            String string = input.readLine();
            char number[] = string.toCharArray();
            
            for (int i = 0; i < number.length; i++) {
                sum += number[i] - '0';
            }
            System.out.println("Original number: " + string);
            print_number(sum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void print_number(int n) {
            
        int x; 
        int y; 
        int z;
        String number[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        System.out.println("Sum of the digits of the said number: " + n);
            
        if (n < 10) {
            System.out.println(number[n]);
        }
        else if (n < 100) {
            x = n / 10;
            y = n - x * 10;
            
            System.out.println("In English: " + number[x] + " " + number[y]);
        }
        else {
            x = n / 100;
            y = (n - x * 100) / 10;
            z = n - x * 100 - y * 10;
            
            System.out.println("In English: " + number[x] + " " + number[y] + " " + number[z]);
        }

    }
    
}

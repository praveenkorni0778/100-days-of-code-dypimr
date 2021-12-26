import java.util.Scanner;

/*
Question:
    Input a year and find whether it is a leap year or not.
*/

class leapYear{
    public static void main(String[] args){
        // Initialize scanner. 
        Scanner sc = new Scanner(System.in);
        // Take no. of test cases input.
        int T = sc.nextInt();
        // Iterate through test cases.
        while(T>0){
            int year = sc.nextInt();
            // If a year is divisible by 4 
            // then it is a leap year else it is not.
            if(year % 4 == 0) System.out.println("Leap year.");
            else System.out.println("Not a leap year.");
            T--;
        }
    }
}
import java.util.Scanner;

/*
Question:
    Take two numbers and print the sum of both.
*/

class sum{
    public static void main(String[] args){
        // Initialize scanner. 
        Scanner sc = new Scanner(System.in);
        // Take no. of test cases input.
        int T = sc.nextInt();
        // Iterate through test cases.
        while(T>0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a+b);
            T--;
        }
    }
}
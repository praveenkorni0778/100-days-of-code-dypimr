import java.util.Scanner;

/*
Question:
    Print multiplication table of a number.
*/

class multiplication{
    public static void main(String[] args){
        // Initialize scanner. 
        Scanner sc = new Scanner(System.in);
        // Take no. of test cases input.
        int T = sc.nextInt();
        // Iterate through test cases.
        while(T>0){
            int a = sc.nextInt();
            for(int i =0; i< 11; i++)
            {
                System.out.println(a +" x "+ i + " = "+(a*i));
            }
            T--;
        }
    }
}
import java.util.Scanner;

/*
Question:
    Take 2 numbers as inputs and find their HCF and LCM.
*/

class multiplication{
    public static void main(String[] args){
        // Initialize scanner. 
        Scanner sc = new Scanner(System.in);
        // Take no. of test cases input.
        int T = sc.nextInt();
        
        // Iterate through test cases.
        while(T>0){
            int hcf = 0;
            int lcm = 0;    
            int a = sc.nextInt();
            int b = sc.nextInt();
            
             for(i = 1; i <= a || i <= b; i++) {
                // checks if both the numbers are divisible 
                // by the given number.
                if( a%i == 0 && b%i == 0 )
                hcf = i;
            }
            lcm = (a*b)/hcf;
            System.out.println("hcf: "+hcf +" lcm: "+lcm);
            T--;
        }
    }
}
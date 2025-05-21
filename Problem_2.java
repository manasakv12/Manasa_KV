import java.util.*;
public class Problem_2 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to form the series");
        int n=sc.nextInt();
        System.out.println("The series is:");
        for(int i=0;i<n;i++){
            System.out.print(2 * i + 1 );
        
        if(i<n-1){
            System.out.print(", ");
        }
    }
    }
    
}

// Performing Adition Operation Using Java
import java.util.Scanner;

public class Addition {

    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int Number_1;
        int Number_2;
        int sum;

        System.out.println("Enter the Frist Number:");
        Number_1=input.nextInt();

        System.out.println("Enter the Second Number:");
        Number_2=input.nextInt();

        sum=Number_1+Number_2;

        System.out.printf("Addition=%d",+sum);
    }

    
}

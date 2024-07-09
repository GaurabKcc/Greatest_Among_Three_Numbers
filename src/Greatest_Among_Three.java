import java.util.Scanner;
public class Greatest_Among_Three {
    public static void main(String[] args) {
        System.out.println("Enter an integer:");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        System.out.println("Enter second integer: ");
        int num2 = input.nextInt();
        System.out.println("Enter third integer: ");
        int num3 = input.nextInt();
        if(num1 > num2 && num1 > num3){
            System.out.println(num1 +" is the greatest number");
        }
        else if(num2 > num1 && num2 > num3){
            System.out.println(num2 +" is the greatest number");
        }
        else if(num3 > num1 && num3 > num2){
            System.out.println(num3 +" is the greatest number");
        }
        else if(num1==num2 && num1==num3){
            System.out.println("All of them are equal");
        }
        input.close();
    }
}
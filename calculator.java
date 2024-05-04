import java.util.Scanner;
public class calculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number One:");
        int a=sc.nextInt();
        System.out.print("Enter the Number Two:");
        int b=sc.nextInt();
        System.out.println("Enter the option to perform:\n1)Addition(+)\n2)Subtraction(-)\n3)Multiplication(*)\n4)Division(/)\n5)Modulus(%)");
        int option=sc.nextInt();
        switch(option)
        {
            case 1:System.out.println("The Addition of "+a+" and "+b+" is:"+(a+b)); break;
            case 2:System.out.println("The Subtraction of "+a+" and "+b+" is:"+(a-b)); break;
            case 3:System.out.println("The Multiplication of "+a+" and "+b+" is:"+(a*b)); break;
            case 4:System.out.println("The Division of "+a+" and "+b+" is:"+(a/b)); break;
            case 5:System.out.println("The Remainder of "+a+" and "+b+" is:"+(a%b)); break;
            default: System.out.println("Please choose Valid option");
        }
        sc.close();
    }
}   
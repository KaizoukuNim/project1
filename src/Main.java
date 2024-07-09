import java.security.PublicKey;
import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

class SumArea{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter 1st number: ");
//        int n1 = sc.nextInt();
//        System.out.println("Enter 2nd number: ");
//        int n2 = sc.nextInt();
//        int sum = n1 + n2;
//        System.out.println(sum);
//
//        System.out.println("Enter radius: ");
//        int r = sc.nextInt();
//        double pi= 3.14;
//        double area = pi*r*r;
//        System.out.println("The area of the circle is "+area);
        int principle;
        int rate;
        int time;
        System.out.println("Enter the principle");
        principle = sc.nextInt();
        System.out.println("Enter the rate");
        rate = sc.nextInt();
        System.out.println("Enter the time");
        time = sc.nextInt();

        int SI= (principle*time*rate)/100;
        System.out.println("The simple interest is:"+SI);

        int number;
        System.out.println("enter the number");
        number = sc.nextInt();
        if (number%2==0){
            System.out.println("The number is even");
        }
        else {
            System.out.println("The number is odd");
        }


    }
}

//Wap to find SI
//Wap to check if the num is even or odd

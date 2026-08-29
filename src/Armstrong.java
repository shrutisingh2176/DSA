import java.util.Scanner;
public class Armstrong {
    public static void main (String[] arg){
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int original = n ;
        int arm=0;
        int count =0;
        int temp =n;
        while (temp>0){
            count++;
            temp=temp/10;
        };

        temp = n;

        while (temp>0){
            int digit = temp %10;
            arm = arm+ (int) Math.pow(digit, count);
            temp=temp/10;


        }
        if (original==arm){
            System.out.println("This is armstrong number ");
        } else {System.out.print("This is not armstrong number ");}

        sc.close();
    }

}

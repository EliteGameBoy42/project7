package ConditionalStatement;

import java.util.Scanner;

public class CompareValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter two numbers: ");//sc.nextInt());
        int num1=sc.nextInt(),num2=sc.nextInt();
        if(num1>num2){
            System.out.println("Num1 is greater than num2");
        }else if(num1==num2){
            System.out.println("Num2 is equal to num1");
        }else{
            System.out.println("Num2 is greater that num1.");
        }

    }
}

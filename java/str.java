import java.util.Scanner;
class str{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the strings:");
        String s1,s2;
         s1= sc.nextLine();
         s2 = sc.nextLine();
        String s3=s1.concat(s2);
        System.out.println("concatenation of two strings:"+ s3);


    }
}
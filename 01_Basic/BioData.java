import java.util.*;

public class BioData{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String fullName = sc.nextLine();
        System.out.println("Enter your Hobby : ");
        String hobby = sc.next();
        System.out.println("Enter your mobile number : ");
        long mobileNumber = sc.nextLong();
        System.out.println("Enter your salary : ");
        double salary = sc.nextDouble();
        System.out.println("Are you below poverty line : ");
        boolean isPoor = sc.nextBoolean();

        //print the details
        System.out.println("My name is "+fullName);
        System.out.println("My hobby is "+hobby);
        System.out.println("Call me on "+mobileNumber);
        System.out.println("My salary is "+salary);
        System.out.println("Am i below poverty line "+isPoor);
    }
}
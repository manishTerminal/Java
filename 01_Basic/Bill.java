import java.util.*;
public class Bill{
    public static void main(String args[]){
        int gst = 18;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the price of pen : ");
        float pencilPrice = sc.nextFloat();
        System.out.print("Enter the price of pencil : ");
        float eraserPrice = sc.nextFloat();
        System.out.print("Enter the price of eraser : ");
        float penPrice = sc.nextFloat();

        float gstAmount = ((pencilPrice + penPrice + eraserPrice)*gst)/100;

        float bill = pencilPrice + penPrice + eraserPrice +gstAmount;

        System.out.println("Bill = " + bill);

    }
}
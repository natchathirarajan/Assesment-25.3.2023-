
import java.util.Scanner;

public class Array5 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Size of Array: ");
        int size=sc.nextInt();
        int[] src=new int[size];
        System.out.println("Enter Source Array");
        for(int i=0;i<size;i++)
        {
            src[i] = sc.nextInt();
        }
        int[] dest=new int[size];
        for(int i=0;i<size;i++)
        {
            dest[i]=src[i];
        }
        System.out.println("Destination Array");
        for(int i=0;i<size;i++)
        {
            System.out.print(dest[i]+" ");
        }
    }
}
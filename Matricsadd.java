 import java.util.Scanner;

public class Matricsadd {
    public static void main(String[] args)
    {
        int row1,col1,row2,col2;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Row Of First Matrix: ");
        row1=sc.nextInt();
        System.out.print("Enter Column Of First Matrix: ");
        col1=sc.nextInt();
        int[][] a=new int[row1][col1];
        System.out.println("Enter First matrix:");
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<col1;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter Row Of Second Matrix: ");
        row2=sc.nextInt();
        System.out.print("Enter Column Of Second Matrix: ");
        col2=sc.nextInt();
        int[][] b=new int[row2][col2];
        System.out.println("Enter Second matrix:");
        for(int i=0;i<row2;i++)
        {
            for(int j=0;j<col2;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        if(row1==row2 && col1==col2)
        {
            int[][] sum = new int[row1][col1];
            for (int i = 0; i < row1; i++)
            {
                for (int j = 0; j < col1; j++)
                {
                    sum[i][j] = a[i][j] + b[i][j];
                }
            }
            System.out.println("The Resultant Matrix:");
            for(int i=0;i<row1;i++)
            {
                for(int j=0;j<col1;j++)
                {
                    System.out.print(sum[i][j]+" ");
                }
                System.out.println();
            }
        }
        else
        {
            System.out.println("The Size Of Two Matrix Not Equal");
        }
    }

}

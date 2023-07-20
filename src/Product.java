import java.util.Scanner;

public class Product {
    public static int[][] Multiply(int [][] Array,int Multiply,int Row,int Column)
    {
        for(int i=0;i< Row;i++)
        {
            for(int j=0;j< Column;j++)
            {
                Array[i][j]=Multiply*Array[i][j];
            }
        }
        return Array;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int Row= scanner.nextInt();
        int Column= scanner.nextInt();
        int [][] Array=new int[Row][Column];
        for(int i=0;i<Row;i++)
        {
            for(int j=0;j<Column;j++)
            {
                Array[i][j]= scanner.nextInt();
            }
        }
        int Multiply= scanner.nextInt();
        int output[][]=Multiply(Array,Multiply,Row,Column);
        for(int i=0;i<Row;i++)
        {
            for(int j=0;j<Column;j++)
            {
                System.out.print(output[i][j]+" ");
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

class array
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array"); // taking size of an array from user
        int s=sc.nextInt();
        int a[]=new int[s];  // array declaration
        System.out.println("Enter the array elements");
        for(int i=0;i<s;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Original array");
        for(int i=0;i<s;i++)
        {
            System.out.println(a[i]);
        }
        //reversing array
        System.out.println("Reversed array");
        for(int j=(s-1);j>=0;j--)
        {
            System.out.println(a[j]);
        }
    }
}
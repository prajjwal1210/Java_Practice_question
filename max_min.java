import java.util.Scanner;

class max_min
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        int s=sc.nextInt();
        int[] a=new int[s];
        System.out.println("Enter the array elements");
        for(int i=0;i<s;i++)
        {
            a[i]=sc.nextInt();
        }
        int max=a[0];
        int min=a[0];
        for(int i=0;i<s;i++)
        {
            if(a[i]>max)
                max=a[i];
        }
        System.out.println("Maximum element of an array is: " +max);
        for(int i=0;i<s;i++)
        {
            if(a[i]<min)
                min=a[i];
        }
        System.out.println("Minimum element of an array is: "+min);
    }
}

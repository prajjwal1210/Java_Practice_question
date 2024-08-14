import java.util.Scanner;

class Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int s = sc.nextInt();
        int[] a = new int[s];
        System.out.println("Enter the array elements");
        for (int i = 0; i < s; i++)
        {
            a[i] = sc.nextInt();
        }
        int c=0;
        System.out.println("Enter the element whose duplicate is to be found: ");
        int d=sc.nextInt();
        for(int i=0;i<s;i++)
        {
            if(a[i]==d)
                c=c+1;
        }
        if(c==2)
            System.out.println("Duplicate number is present!");
        else
            System.out.println("duplicate number is not found!");
    }
}

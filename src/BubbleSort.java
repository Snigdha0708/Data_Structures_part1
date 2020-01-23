import java.util.Scanner;

public class BubbleSort
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int si=s.nextInt();
        int ar[]=new int[si];
        for (int i=0;i<si;i++ )
        {
            ar[i]=s.nextInt();
        }
        for (int i=0;i<si;i++)
        {
            for(int j=0;j<si-i-1;j++)
            {
                if(ar[j]>ar[j+1])
                {
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
        for (int i=0;i<si;i++)
        {
            System.out.println(ar[i]);
        }
    }
}

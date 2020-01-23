import java.util.Scanner;

public class BinarySerach {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int size = s.nextInt();
       int ar[]=new int[size];
        for (int i=0;i<size;i++)
        {
            ar[i]=s.nextInt();
        }
       // int mid=size/2;
        int search=s.nextInt();
        int left=0;
        int right = size-1;

        binarySearch(search,ar,left,right);
    }
    static void binarySearch(int search,int ar[],int left,int right)
    {
        while (left<=right)
        {
        int mid=(left+right)/2;
        if(ar[mid]==search)
        {
            System.out.println("found at"+mid);
            break;
        }
        else if(search<ar[mid])
        {
            right=mid-1;
        }
        else
        {
            left=mid+1;
        }
        binarySearch(search,ar,left,right);
    }}
}

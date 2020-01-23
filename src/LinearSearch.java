import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = s.nextInt();
        int ar[]=new int[size];
        System.out.println("Enter elements");
        for (int i=0;i<size;i++)
        {
            ar[i]=s.nextInt();
        }
        System.out.println("enter element to be searched");
        int search=s.nextInt();
        for (int i=0;i<size;i++)
        {
            if(ar[i]==search){
                System.out.println(i);
                break;
            }
        }
    }
}

public class Main 
{
    static void bsort(int ar[])
    {
        int n = ar.length;
        for(int i=0;i<n-1;i++)
            for(int j=0;j<n-i-1;j++)
                if(ar[j]>ar[j+1])
                {
                    int temp = ar[j+1];
                    ar[j] = ar[j+1];
                    ar[j] = temp;
                }
    }
    public static void main(String args[])
    {
        int data[] = {-2,-3,0,8,6};
        Main.bsort(data);
        System.out.println(data);
    }
}

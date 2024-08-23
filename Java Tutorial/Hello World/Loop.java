public class Loop 
{
    public static void main(String a[]) 
    {
        // While Loop
        System.out.println("While Loop:");
        int i = 0;
        while(i < 5)
        {
            System.out.println(i);
            i++;
        }

        // Do While Loop
        System.out.println("Do While Loop:");
        int j = 0;
        do 
        {
            System.out.println(j);
            j++;
        } while (j < 5);

        // For Loop
        System.out.println("For Loop:");
        for(int k = 0; k < 5; k++)
        {
            System.out.println(k);
        }
    }
}
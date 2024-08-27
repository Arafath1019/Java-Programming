public class Array {
    public static void main(String a[])
    {
        // One dimensional array
        int nums[] = {3,7,2,4};
        nums[1] = 6;
        System.out.println(nums[0]);

        for(int i=0; i<4; i++)
        {
            System.out.println(nums[i]);
        }

        int num[] = new int[4];
        System.out.println(num[0]);

        // Multi-dimensional array
        int num1[][] = new int[3][4];

        for(int i=0; i<3; i++)
        {
            for(int j=0; j<4; j++)
            {
                num1[i][j] = (int)(Math.random() * 100);
            }
        }

        for(int i=0; i<3; i++)
        {
            for(int j=0; j<4; j++)
            {
                System.out.print(num1[i][j] + " ");
            }
            System.out.println("");
        }

        for(int n[] : num1)
        {
            for(int m: n)
            {
                System.out.print(m + " ");
            }
            System.out.println("");
        }
    }
}

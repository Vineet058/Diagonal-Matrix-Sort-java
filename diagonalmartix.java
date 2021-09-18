// Sorting diagonal elements of matrix.
// This code is developed at BlueJ software.

//          1 4 2 3     ->     1 2 3 4   Diagonal Element -> 1,6,7,8
//          5 9 7 6     ->     5 6 7 9
//          7 3 4 8     ->     3 4 7 8
//          4 2 3 8     ->     2 3 4 8

import java.util.*;
class diagonalsort
{
    public static void main()
    {
        Scanner in = new Scanner (System.in);
        int a[][]=new int[4][4];
        int i,j;
        System.out.print("Enter 16 Number : ");
        for (i=0;i<4;i++)
        {
            for (j=0;j<4;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
        for (i=0;i<4;i++)
        {
            for (j=0;j<4;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        int c;
        int b[]=new int[4];
        for (i=0;i<4;i++)
        {
            b[i]=a[i][i];
        }
        for (i=0;i<3;i++)
        {
            for (j=0;j<3;j++)
            {
                if (b[j]>b[j+1])
                {
                    c=b[j];
                    b[j]=b[j+1];
                    b[j+1]=c;
                }
            }
        }
        for (i=0;i<4;i++)
        {
            a[i][i]=b[i];
        }
        for (i=0;i<4;i++)
        {
            for (j=0;j<4;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
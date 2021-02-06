class Array
{
    public static void main(String[] args)
    {
        String s[]={"Raju","Ramesh","Ravi"};
        for(int i=0;i<s.length;i++)
            System.out.println(i+" index student name is "+s[i]);

        //Array Modification

        s[0]="Ramu";
        System.out.println("Updated 0 index student name is "+s[0]);

        //2D array

        int a[][]={{1,2,3},{4,5}};
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.println(a[i][j]);
            }
        }
    }
}

output:
0 index student name is Raju
1 index student name is Ramesh
2 index student name is Ravi
Updated 0 index student name is Ramu
1
2
3
4
5
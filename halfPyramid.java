import java.util.*;
public class halfPyramid
{
public static void main(String gg[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of rows:");
int x=sc.nextInt();
for(int i=1;i<=x;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print("*");
}
System.out.println();
}
}
}


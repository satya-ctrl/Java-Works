import java.util.*;
class Add
{
public static void main(String args[])
{
int r, c,i,j;
Scanner in = new Scanner(System.in);
System.out.println("Enter the number of rows");
r = in.nextInt();
System.out.println("Enter the number columns");
c = in.nextInt();
int mat1[][] = new int[r][c];
int mat2[][] = new int[r][c];
int sum[][] = new int[r][c];
System.out.println("Enter the elements of matrix1");
for ( i= 0 ; i < r ; i++ )
{ 
for ( j= 0 ; j < c ;j++ )
mat1[i][j] = in.nextInt();
System.out.println();
}
System.out.println("Enter the elements of matrix2");
for ( i= 0 ; i < r ; i++ )
{
for ( j= 0 ; j < c ;j++ )
mat2[i][j] = in.nextInt();
System.out.println();
}
for ( i= 0 ; i < r ; i++ )
for ( j= 0 ; j < c ;j++ )
sum[i][j] = mat1[i][j] + mat2[i][j] ; 
System.out.println("Sum of matrices:-");
for ( i= 0 ; i < r ; i++ )
{ 
for ( j= 0 ; j < c ;j++ )
System.out.print(sum[i][j]+"\t");
System.out.println();
}
}
}
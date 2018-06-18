class madhav1

{
 public static void main(String args[])
 {
  int i,j,k;
	 int c[][];
	 c=new int[2][2];
   System.out.println("array:");
	 int a[][]={{1,2},{3,4}};
	 int b[][]={{1,2},{3,4}};
  for(i=0;i<a.length;i++)
  {
   for(j=0;j<a.length;j++)
   {
      c[i][j]=0;
    for(k=0;k<a.length;k++)
    {
     c[i][j]+=a[i][k]*b[k][j];
    }
    System.out.println("mul is:"+c[i][j]);
    }
    }
 }}

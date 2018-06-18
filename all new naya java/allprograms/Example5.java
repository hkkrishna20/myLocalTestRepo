class Example5
{
public static void main(String args[])
{
int x=Integer.parseInt(args[0]);
int y=Integer.parseInt(args[1]);
int z=Integer.parseInt(args[2]);
int max;

max=x;

if(max<y)
max=y;

if(max<z)
max=z;
 System.out.println(" Max= " + max);

}
}



	




/*  Second Method 
if(x>y)
{
     if(x>z)
     {
      max=x;
     }
     else
     {
      max=z;
     } 
}
else
{
     if(y>z)
     {
      max=y;
      }
     else
      {
      max=z;
      }
} 

*/ 
/* First Method
if(x>y&&x>z)
{
max=x;
}
else if(y>x&&y>z)
{
max=y;
}
else
{
max=z;
}
*/


































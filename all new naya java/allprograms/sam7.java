
public class sam7
{
public static void main(String[] args)
{
int[] numbers={10,45,67,89,90};
int i;
for(i=0;i<5;i++)
System.out.println("Array [ " + i + " ] " + numbers[i]);

int[] arr= numbers;
System.out.println(" Second Array:  ");
for(i=0;i<5;i++)
System.out.println("Array [ " + i + " ] " + arr[i]);

arr[2]=100;
System.out.println(" Second Array:  ");
for(i=0;i<5;i++)
System.out.println("Array [ " + i + " ] " + arr[i]);

System.out.println("numbers [ 2 ] " + numbers[2]);

}
}











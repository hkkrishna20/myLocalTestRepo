


import java.io.*;
class uniform
{
public static void main(String args[]) 
throws IOException {

String tmp="abcdefghijklmnopqrstuvwxyz";
int length=tmp.length();
char c[]=new char[length];
tmp.getChars(0,length,c,0);
int freq[]=new int[26];

int u[]=new int[26];
int p[]=new int[26];


InputStream f=new FileInputStream(args[0]);
char s;
int j;
int len=f.available();
for(int i=1;i<len;i++)
{
s=(char)f.read(); 
for(j=0;j<length;j++)
{
    if(c[j]==s)
	{
	freq[j]++;

	//p[j]=i;
	if(freq[j]==2)
	u[j]=i-u[j];
	else
	{
		
		if(u[j]!=(i-u[j])&&u[j]!=0)
		u[j]=0;
		u[j]=i;
	}
	}
}
}

for(j=0;j<length;j++)
System.out.print(" "+c[j]);
System.out.println();

for(j=0;j<length;j++)
{
   if(u[j]==0)
   System.out.println(c[j]+"is uniformly distributed");
}
//System.out.print(" "+u[j]);

System.out.println();

for(j=0;j<length;j++)
System.out.print(" "+freq[j]);


f.close();
}
}



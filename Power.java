# Power
import java.io.*;
import java.util.*;
public class Power
{
public static void main(String args[])throws IOException
{
long n,p,r=1;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number");
n=Long.parseLong(br.readLine());
System.out.println("Enter the Power");
p=Long.parseLong(br.readLine());
if(n>=0&&p==0)
{
r=1;
}
else if(n==0&&p>=1)
{
r=0;
}
else
{
for(i=1;i<=p;i++)
{
r=r*n;
}
}
System.out.println(n+"^"+p+"="+r);
}
}


# posi
import java.util.*;
import java.io.*;
public class Posi
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n=Integer.parseInt(br.readLine());
if(n%2==0)
{
System.out.println("The entered number is EVEN");
}
else
if(n%2!=0)
{
System.out.println("The entered number is ODD");
}
}

}

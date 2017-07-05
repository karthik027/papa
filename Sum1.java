 import java.util.*;
import java.io.*;
public class Sum1
{
  public static void main(String args[])throws IOException
  {
    int sum=0;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    Integer a=Integer.parseInt(br.readLine());
    for(int i=1;i<=a;i=i+2)
    {
      
      sum=sum+i;
      }

        System.out.println(sum);
  }
}

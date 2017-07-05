 import java.util.*;
import java.io.*;
public class Sum
{
  public static void main(String args[])throws IOException
  {
    int sum=0,f,g;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    Integer a=Integer.parseInt(br.readLine());
    String s=String.valueOf(a);
    int z=s.length();
    char[] ch=s.toCharArray();
     f=(int) ch[0];
     int f1=f-48;
     g=(int) ch[z-1];
    int g1=g-48;
    sum=g1+f1;
    //sum=sum+2;
    //System.out.println(f);
    //System.out.println(g);
    System.out.println(sum);
  }
}

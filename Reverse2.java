import java.util.*;
import java.io.*;
public class Reverse2
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the String");
		String s = br.readLine();
		String s1[] = s.split(" ");
		Arrays.sort(s1, Collections.reverseOrder());
		System.out.print("Reversed String : ");
		for (String a : s1) {
			System.out.print(a+ " ");
		}
}
}

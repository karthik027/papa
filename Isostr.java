import java.util.HashMap;
import java.util.Map;
import java.io.*;
public class Isostr {
  
  public boolean isIso(String a, String b) {
    if(a == null || b == null) {
      return false;
    }
    if(a.length() != b.length()) {
      return false;
    }
    Map<Character, Character> characterMap = new HashMap<Character, Character>();
    for(int i=0; i<a.length(); i++) {
      char x = a.charAt(i);
      char y = b.charAt(i);
      if(characterMap.containsKey(x)) {
        if(characterMap.get(x) != y) {
          return false;
        }
      } else {
        if(characterMap.containsValue(y)) {
          return false;
        }
        characterMap.put(x, y);
      }
    }
    return true;
  }
  
  public static void main(String args[])throws IOException {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    Isostr iso = new Isostr();
    String a = br.readLine();
    String b = br.readLine();
    
    
    
    System.out.println(iso.isIso(a,b));
    
  }
}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Szemantika1 {

        static Map<String,Integer> szavak = new HashMap<>();
       // public static void main(String[] args) throws FileNotFoundException {
        //    readFile();

      //  }

        public static void readFile(String path) throws FileNotFoundException {
            String[] s;

            Scanner sc = new Scanner(new File(path)) ;
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                s = line.split(" ");
                for (int i = 0; i < s.length; i++) {
                    if(szavak.containsKey(s[i])){
                        szavak.put(s[i],szavak.get(s[i])+1);
                    } else {
                        szavak.put(s[i],1);
                    }
                }

            }
            System.out.println(szavak);
        }
    }



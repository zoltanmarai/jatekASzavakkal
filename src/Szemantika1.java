import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Szemantika1 {

    static Map<String, Integer> szavak = new TreeMap<>();
    // public static void main(String[] args) throws FileNotFoundException {
    //    readFile();

    //  }

    public static void readFile(String path) throws FileNotFoundException {
        String[] s;


        Scanner sc = new Scanner(new File(path));
        while (sc.hasNextLine()) {
            String line = sc.nextLine();

            s = line.split(" ");


            for (int i = 0; i < s.length; i++) {


                if (s[i].endsWith("ban") || s[i].endsWith("ben") || s[i].endsWith("ból") || s[i].endsWith("bõl") || s[i].endsWith("...")) {
                    s[i] = s[i].substring(0, s[i].length() - 3);
                }

                if (s[i].endsWith(".") || s[i].endsWith(",") || s[i].endsWith(":") || s[i].endsWith("!") || s[i].endsWith("?")) {
                    s[i] = s[i].substring(0, s[i].length() - 1);
                }


                if (szavak.containsKey(s[i])) {
                    szavak.put(s[i], szavak.get(s[i]) + 1);
                } else {
                    szavak.put(s[i], 1);
                }


            }

        }
        first10();
        //System.out.println(szavak);
        System.out.println(szavak.size());
    }

    public static ArrayList<String> first10() {
        ArrayList<String> array = new ArrayList<>();

        TreeMap<Integer, ArrayList<String>> elsoTiz = new TreeMap<>();      //db-szavak par
        for (Map.Entry<String, Integer> entry : szavak.entrySet()) {
            elsoTiz.putIfAbsent(entry.getValue(), new ArrayList<>());  //a TreeMap leguccso entry.value-t adja vissza es kitorli, ami itt egy szo
            elsoTiz.get(entry.getValue()).add(entry.getKey());
        }
        // System.out.println(elsoTiz);

        for (int i = 0; i < 11; i++) {
            for (String actualString : elsoTiz.pollLastEntry().getValue()) {
                array.add(actualString);
            }
        }
        System.out.println(array);
        return array;

    }


}



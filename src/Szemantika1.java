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
        String[] fillers={"az","a","is","hogy", "meg","","-","nem","A","és","csak"};


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
        removeFillers(fillers);System.out.println(szavak);
        first10();

        System.out.println(szavak.size());
    }




    public static void removeFillers(String []fillers){     //kiveszi a szovegtombbol a filler szavakat

        for (Map.Entry<String, Integer> entry : szavak.entrySet()) {
            for(int i=0;i<fillers.length;i++){
                if(entry.getKey().equals(fillers[i])){
                    szavak.put(entry.getKey(), 0);
                }
            }
        }

        /* ArrayList<String>szovegList=new ArrayList<>();
        ArrayList<String>fillerList=new ArrayList<>();
        Arrays.sort(szovegTomb);
        Arrays.sort(fillers);
        for (int i = 0; i < szovegTomb.length; i++) {
            szovegList.add(szovegTomb[i]);
        }
        for (int i = 0; i < fillers.length; i++) {
            fillerList.add(fillers[i]);
        }
        for (String actual:szovegList) {
            for (int j = 0; j < fillerList.size(); j++) {
                if (actual.equals(fillerList.get(j))){
                   // szovegList.remove(actual);
                    szavak.get(fillerList.get(j))=1;
                }
            }
        }
        String[] atomb =new String[szovegList.size()];
        //Collections.addAll(atomb,szovegList);
        for(int i=0;i<szovegList.size();i++){
            atomb[i]=szovegList.get(i);
        }
        return atomb;*/
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



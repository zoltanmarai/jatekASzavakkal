import java.util.ArrayList;
import java.util.List;

public class Mondatgenerator {
     static List<Integer> numbers = new ArrayList<>();


    public static void mondatKeszito(List<String> szoTomb, int num) {
        numbers.clear();

        for (int i = 0; i < num; i++) {
            numbers.add(getRandomNumber());
        }

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print( szoTomb.get(numbers.get(i)-1)+" ");
        }
        System.out.println();
    }
    public static int getRandomNumber(){
        int counter = 0;
        int random = (int) (Math.random()*10)+1;
        System.out.println(random+" *");
        for (int i = 0; i < numbers.size(); i++) {
            if(random == numbers.get(i)){
                counter++;
            }
            System.out.println(counter);
        }
        if(counter != 0){
            return getRandomNumber();
        }

        return random;
    }
}

import java.util.ArrayList;
import java.util.List;

public class Mondatgenerator {

    static int num1 = getRandomNumber();
    static int num2 = getRandomNumber();
    static int num3 = getRandomNumber();
    static int num4 = getRandomNumber();

    public static void mondatKeszito(List<String> szoTomb) {



        System.out.println(szoTomb.get(num1-1)+" "+szoTomb.get(num2-1)+" "+szoTomb.get(num3-1)+" "+szoTomb.get(num4-1));


    }
    public static int getRandomNumber(){

        int random = (int) (Math.random()*10)+1;
        if (random == num1 ||random == num2 ||random == num3 ||random == num4 ){
            return getRandomNumber();
        }
        return random;
    }
}

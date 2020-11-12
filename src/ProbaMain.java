import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


    public class ProbaMain {



        public static void main(String[] args) throws FileNotFoundException {
            logIn();
            //Szemantika1.first10();
        }


        public static void logIn() throws FileNotFoundException{
            Scanner sc = new Scanner(System.in);
            Scanner scPath=new Scanner(System.in);
            int menuSzam;
            do {

                System.out.println("   <<<< Udvozoljuk a SZOJATEK programban >>>>");
                System.out.println();
                System.out.println(" legyen kedves valasztani az alabbi menupontok kozul: ");
                System.out.println();
                System.out.println("Szemantikai elemzes - beepitett referencia szoveggel:   ---> 1");
                System.out.println("Szemantikai elemzes - sajat referencia szoveggel:       ---> 2");
                System.out.println("bullshit generator                                      ---> 3");
                System.out.println("bullshit generator - sajat referencia szoveggel:        ---> 4");

                System.out.println();
                System.out.println(" kilepes:                                               ---> 0");
                System.out.println();

                menuSzam = sc.nextInt();

                switch (menuSzam) {
                    case 1:
                       Szemantika1.readFile("00659.txt");
                        break;

                    case 2:
                        System.out.println("adja meg az eleresi utvonalat a sajat fajlnak!");
                        String path= scPath.nextLine();
                        Szemantika1.readFile(path);
                        break;

                    case 3:

                        Mondatgenerator.mondatKeszito(Szemantika1.first10());
                        break;

                    case 4:

                        //akarmi
                        break;

                    default:
                        break;
                }

            } while (menuSzam != 0);
           // sc.nextInt();
            System.out.println("goooodbye");

    }
}

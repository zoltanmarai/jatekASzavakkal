import java.util.Scanner;
import Szemantika1;

public class ProbaMain {




        public static void main(String[] args) {
            logIn();
        }


        public static void logIn() {
            Scanner sc = new Scanner(System.in);
            int menuSzam;
            do {

                System.out.println("   <<<< Udvozoljuk a SZOJATEK programban >>>>");
                System.out.println();
                System.out.println(" legyen kedves valasztani az alabbi menupontok kozul: ");
                System.out.println();
                System.out.println("Szemantikai elemzes - beepitett referencia szoveggel:    ---> 1");
                System.out.println("Szemantikai elemzes - sajat referencia szoveggel:        ---> 2");
                System.out.println("bullshit generator                                       ---> 3");
                System.out.println("bullshit generator - sajat referencia szoveggel:         ---> 4");

                System.out.println("*****************************************************************************");
                System.out.println(" kilepes:                                               ---> 0");

                menuSzam = sc.nextInt();

                switch (menuSzam) {
                    case 1:
                        Szemantika1.readFile();
                        break;

                    case 2:

                        //valami
                        break;

                    case 3:

                        //to write
                        break;

                    case 4:

                        //akarmi
                        break;

                    default:

                        //default eset
                }

            } while (menuSzam == 0);
            System.out.println("goooodbye");

        }
    }




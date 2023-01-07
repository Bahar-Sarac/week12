
import java.util.Scanner;

/**
 *
 * @author Bahar
 */
public class ortadanbolupterstenyazdirma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bir kelime giriniz:");
        String txt = input.nextLine();

        for (int i = txt.length() / 2 - 1; i >= 0; i--) {
            System.out.print(txt.charAt(i));
        }

        for (int i = txt.length() - 1; i > txt.length() / 2 - 1; i--) {
            System.out.print(txt.charAt(i));
        }
    }

}

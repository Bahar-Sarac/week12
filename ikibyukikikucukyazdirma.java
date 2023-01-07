
import java.util.Scanner;


/**
 *
 * @author Bahar
 */
public class ikibuyukikikucukyazdirma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Küçük harflere bir kelime giriniz: ");
        String txt=input.nextLine();
        int sayac = 0;
        
        for (int i = 0; i < txt.length(); i++) {
            double r = sayac % 4;
            if (r < 2) {
                System.out.print(Character.toUpperCase(txt.charAt(i)));
            }
            else{
                System.out.print(Character.toLowerCase(txt.charAt(i)));
            }
        sayac++;
        System.out.println(txt.charAt(i));
        }
    }
    
}

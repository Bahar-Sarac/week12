
import java.util.Scanner;

/**
 *
 * @author Bahar
 */
public class seslisessizilekelimeyazdirma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Bir kelime giriniz: ");
        String txt = input.nextLine();
        char[] k1 = new char[3];
        char[] k2 = new char[4];
        int sk1 = 0, sk2 = 0;
        char[] sesli = {'a', 'e', 'ı', 'o', 'u'};
        
        for (int i = 0; i < txt.length(); i++) {
            int s = 0;
            for (int j = 0; j < sesli.length; j++) {
                if (txt.charAt(i) == sesli[j]) {
                    s = 1;
                }
            }
            if (s == 1) {
                k1[sk1] = txt.charAt(i);
                sk1++;
            } else if (s == 0) {
                k2[sk2] = txt.charAt(i);
                sk2++;
            }
        }
        
        for (int i = 0; i < k1.length; i++) {
            System.out.print(k1[i]);
        }
        
        System.out.println(" ");
        for (int i = 0; i < k2.length; i++) {
            System.out.print(k2[i]);
        }
    }

}

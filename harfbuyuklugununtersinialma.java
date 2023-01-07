
import java.util.Scanner;


/**
 *
 * @author Bahar
 */
public class harfbuyuklugununtersinialma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Bir cümle giriniz: ");
        String txt = input.nextLine();
        
        for (int i = 0; i < txt.length(); i++) {
            if (txt.charAt(i) >= 65 && txt.charAt(i) <= 90) {
                System.out.print(Character.toUpperCase(txt.charAt(i)+32));    
            }
            else{
                System.out.print(Character.toLowerCase(txt.charAt(i)-32));
            }
        }
    }
    
}

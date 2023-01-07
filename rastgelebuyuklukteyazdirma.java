
import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author Bahar
 */
public class rastgelebuyuklukteyazdirma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        Scanner input = new Scanner (System.in);
        
        System.out.print("Bir cümle giriniz: ");
        String txt = input.nextLine();
        Random rastgele = new Random();
               
        for (int i = 0; i < txt.length(); i++) {
            int random_sayi = rastgele.nextInt(txt.length());
            if(random_sayi % 2 == 1){
                System.out.print(Character.toUpperCase(txt.charAt(i)));
            }
            else{
                System.out.println(Character.toLowerCase(txt.charAt(i)));
            }
        }
    }
    
}

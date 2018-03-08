/*
 * An example of rounding up a number using "DecimalFormat".
 * More info please go to java api.
 * 
 */

package class2;

/**
 *
 * @author jixie2824
 */
import java.text.DecimalFormat;
public class Class2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num=92191.29998;
        DecimalFormat x = new DecimalFormat("###.##");
        System.out.println(x.format(num));
    }
    
}

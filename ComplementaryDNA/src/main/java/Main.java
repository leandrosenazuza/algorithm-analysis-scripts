import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    }

    public static String makeComplement(String dna) {
        char[] listDNA = dna.toCharArray();
        StringBuilder result = new StringBuilder();
        for(char aux : listDNA) {
            if(aux == 'A') {
                result.append('T');
            }
            if(aux == 'C') {
                result.append("G");
            }
            if(aux == 'G') {
                result.append("C");
            }
            if(aux == 'T') {
                result.append("A");
            }
        }
        return result.toString();
    }
}

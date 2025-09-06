package zuza.sena.leandro;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    public static String binaryAddition(int a, int b) {
        int sum = a + b;
        StringBuilder listOfRest = new StringBuilder();
        if(sum == 0) return "0";
        while (sum != 0) {
            int aux = 0;
            aux = sum % 2;
            listOfRest.append(aux);
            sum = sum / 2;
        }

        return listOfRest.reverse().toString();
    }
}

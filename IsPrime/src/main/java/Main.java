public class Main {
    public static void main(String[] args) {

    }

    //This algorithm is no efficient for a very large prime
    public static boolean isPrime(int num) {
        int i = 2;
        if(num <= 1) return false;

        while(i <= num) {
            if(num % i == 0 && num != i) {
                return false;
            }
            i++;
        }
        return true;
    }

    //TODO PRECISA SER CORRIGIDO
    public static boolean isPrimeOptimized(int num) {
            if(num <= 1) return false;
            if(num == 2 || num == 3 || num == 5) return true;
            char[] numAsCharList = String.valueOf(num).toCharArray();
            int sum = 0;

            for(char aux : numAsCharList){
                sum += Integer.parseInt(String.valueOf(aux));
            }

            if(sum % 3 == 0) {
                return false;
            }
            if(num % 2 == 0 || num % 5 == 0) {
                return false;
            }
            return true;
    }
}

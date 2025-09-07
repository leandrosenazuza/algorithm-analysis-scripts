/**
 * [PT] Parentização Ótima das Matrizes
 * */
public class Main {
    public static void main(String[] args) {
    }

    /**
     * O custo de uma multiplicação de matrizes é p * q * r.
     * Ex.: A1(30,5), A2(5,15). Então o custo é: 30 * 5 * 15.
     */
    public static void calculateOrder(int p){
        int n = p - 1; // Número de matrizes que estão sendo multiplicadas
        int[][] m = new int[n+1][n+1]; //Tabela de Custos
        int[][] s = new int[n+1][n+1]; //Tabela de Cortes

        for(int i = 0; i < n+1; i++){
            m[i][i] = 0;
        }

    }
}

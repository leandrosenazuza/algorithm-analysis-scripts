package zuza.sena.leandro;

/**
 * This is the Rod cutting problem. I want to obtain the max revenue but cutting the Rod.
 *
 * The rod length is 4 meters.
 *
 * And I have this table:
 *
 * Size of the cut (m) | Price of the cut ($)
 * --------0-----------|----------0---------- (The length 0 as price 0 will help us)
 * --------1-----------|----------2----------
 * --------2-----------|----------5----------
 * --------3-----------|----------7----------
 * --------4-----------|----------8----------
 * */
public class Main {
    public static void main(String[] args) {
        /*
         Instead creating a multidimensional vector, I'll use the index as
         the size of the road. So, at the index 1
         */
        int[] prices = {0, 2, 5, 7, 8};
        /*
         Size of the rod
        */
        int n = 4;
        System.out.println("The max revenue is with the size " + n + ". Revenue: " + rodCut(n, prices));

    }

    static int rodCut(int n, int[] prices) {
        if(n == 0) return 0;
        int maxRevenue = Integer.MIN_VALUE;

        for(int i = 1; i <= n; i++) {
            int auxMaxRevenue = prices[i] + rodCut(n - i, prices);

            if(auxMaxRevenue > maxRevenue) {
                maxRevenue = auxMaxRevenue;
            }
        }
        return maxRevenue;
    }
}

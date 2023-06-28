//Prg to find minimum number of trips to carry all the weight.
import java.util.*;
public class Weight{
    public static void main (String[] args){
        int shops[][] = {{1,3}, {2,4}, {1,5}, {3,2}};
        int maxWeight = 6;
        
        System.out.println(minTrips(shops,maxWeight));
    }
    
    public static int minTrips(int[][] shops, int maxWeight) {
        Arrays.sort(shops, Comparator.comparingInt(o -> o[1])); // Sort in ascending order of weight
        
        int trips = 0;
        int currWeight = 0;
        
        for (int i = shops.length - 1; i >= 0; i--) {
            int weight = shops[i][1];
            
            if (currWeight + weight <= maxWeight) {
                currWeight += weight;
            } else {
                trips++;
                currWeight = weight;
            }
        }
        
        if (currWeight > 0) {
            trips++;
        }
        
        return trips*2;
    }
}

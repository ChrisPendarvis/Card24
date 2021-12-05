
import java.util.ArrayList;


public class SolutionFinder {
    
//    public static String possibleSolution(Rank a, Rank b, Rank c, Rank d){
//        //Rank[] cardRanks = {a, b, c, d};
//        //Permutation permutation = new Permutation();
//        //permute(cardRanks);
//    }
    public static ArrayList<int[]> permute(int[] cardRanks){
        int[] c = new int[cardRanks.length];
        for(int j = 0; j < cardRanks.length; j++){
            c[j]=0;
        }
        ArrayList<int[]> ret = new ArrayList<>();
        ret.add(cardRanks.clone());
        int i = 0;
        while(i<cardRanks.length){
            if(c[i] < i){
                if(i%2==0){
                    swap(cardRanks, 0, i);
                }
                else{
                    swap(cardRanks, c[i], i );
                }
                ret.add(cardRanks.clone());
                c[i] +=1;
                i = 0;
            }
            else{
                c[i] = 0;
                i+=1;
            }
        }
        
        return ret;
    }
    public static void swap(int[] cardRanks, int index1, int index2){
        int temp;
        temp = cardRanks[index1];
        cardRanks[index1] = cardRanks[index2];
        cardRanks[index2] = temp;
    }
}

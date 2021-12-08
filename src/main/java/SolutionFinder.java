
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
    public static void oper(String args[]){
        String[][] operators = new String[64][3];
                operators[0][0] = "+";
                operators[0][1] = "+";
                operators[0][2] = "+";
                operators[1][0] = "+";
                operators[1][1] = "+";
                operators[1][2] = "-";
                operators[2][0] = "+";
                operators[2][1] = "-";
                operators[2][2] = "-";
                operators[3][0] = "+";
                operators[3][1] = "-";
                operators[3][2] = "+";
                operators[4][0] = "+";
                operators[4][1] = "+";
                operators[4][2] = "/";
                operators[5][0] = "+";
                operators[5][1] = "/";
                operators[5][2] = "/";
                operators[6][0] = "+";
                operators[6][1] = "/";
                operators[6][2] = "+";
                operators[7][0] = "+";
                operators[7][1] = "+";
                operators[7][2] = "*";
                operators[8][0] = "+";
                operators[8][1] = "*";
                operators[8][2] = "*";
                operators[9][0] = "+";
                operators[9][1] = "*";
                operators[9][2] = "+";
                operators[10][0] = "+";
                operators[10][1] = "-";
                operators[10][2] = "/";
                operators[11][0] = "+";
                operators[11][1] = "-";
                operators[11][2] = "*";
                operators[12][0] = "+";
                operators[12][1] = "/";
                operators[12][2] = "-";
                operators[13][0] = "+";
                operators[13][1] = "/";
                operators[13][2] = "*";
                operators[14][0] = "+";
                operators[14][1] = "*";
                operators[14][2] = "-";
                operators[15][0] = "+";
                operators[15][1] = "*";
                operators[15][2] = "/";
                operators[16][0] = "-";
                operators[16][1] = "-";
                operators[16][2] = "-";
                operators[17][0] = "-";
                operators[17][1] = "-";
                operators[17][2] = "+";
                operators[18][0] = "-";
                operators[18][1] = "+";
                operators[18][2] = "+";
                operators[19][0] = "-";
                operators[19][1] = "+";
                operators[19][2] = "-";
                operators[20][0] = "-";
                operators[20][1] = "-";
                operators[20][2] = "/";
                operators[21][0] = "-";
                operators[21][1] = "/";
                operators[21][2] = "/";
                operators[22][0] = "-";
                operators[22][1] = "/";
                operators[22][2] = "-";
                operators[23][0] = "-";
                operators[23][1] = "-";
                operators[23][2] = "*";
                operators[24][0] = "-";
                operators[24][1] = "*";
                operators[24][2] = "*";
                operators[25][0] = "-";
                operators[25][1] = "*";
                operators[25][2] = "-";
                operators[26][0] = "-";
                operators[26][1] = "+";
                operators[26][2] = "/";
                operators[27][0] = "-";
                operators[27][1] = "+";
                operators[27][2] = "*";
                operators[28][0] = "-";
                operators[28][1] = "/";
                operators[28][2] = "+";
                operators[29][0] = "-";
                operators[29][1] = "/";
                operators[29][2] = "*";
                operators[30][0] = "-";
                operators[30][1] = "*";
                operators[30][2] = "+";
                operators[31][0] = "-";
                operators[31][1] = "*";
                operators[31][2] = "/";
                operators[32][0] = "*";
                operators[32][1] = "*";
                operators[32][2] = "*";
                operators[33][0] = "*";
                operators[33][1] = "*";
                operators[33][2] = "+";
                operators[34][0] = "*";
                operators[34][1] = "+";
                operators[34][2] = "+";
                operators[35][0] = "*";
                operators[35][1] = "+";
                operators[35][2] = "*";
                operators[36][0] = "*";
                operators[36][1] = "*";
                operators[36][2] = "-";
                operators[37][0] = "*";
                operators[37][1] = "-";
                operators[37][2] = "-";
                operators[38][0] = "*";
                operators[38][1] = "-";
                operators[38][2] = "*";
                operators[39][0] = "*";
                operators[39][1] = "*";
                operators[39][2] = "/";
                operators[40][0] = "*";
                operators[40][1] = "/";
                operators[40][2] = "/";
                operators[41][0] = "*";
                operators[41][1] = "/";
                operators[41][2] = "*";
                operators[42][0] = "*";
                operators[42][1] = "+";
                operators[42][2] = "/";
                operators[43][0] = "*";
                operators[43][1] = "+";
                operators[43][2] = "-";
                operators[44][0] = "*";
                operators[44][1] = "/";
                operators[44][2] = "+";
                operators[45][0] = "*";
                operators[45][1] = "/";
                operators[45][2] = "-";
                operators[46][0] = "*";
                operators[46][1] = "-";
                operators[46][2] = "+";
                operators[47][0] = "*";
                operators[47][1] = "-";
                operators[47][2] = "/";
                operators[48][0] = "/";
                operators[48][1] = "/";
                operators[48][2] = "/";
                operators[49][0] = "/";
                operators[49][1] = "/";
                operators[49][2] = "+";
                operators[50][0] = "/";
                operators[50][1] = "+";
                operators[50][2] = "+";
                operators[51][0] = "/";
                operators[51][1] = "+";
                operators[51][2] = "/";
                operators[52][0] = "/";
                operators[52][1] = "/";
                operators[52][2] = "-";
                operators[53][0] = "/";
                operators[53][1] = "-";
                operators[53][2] = "-";
                operators[54][0] = "/";
                operators[54][1] = "-";
                operators[54][2] = "/";
                operators[55][0] = "/";
                operators[55][1] = "/";
                operators[55][2] = "*";
                operators[56][0] = "/";
                operators[56][1] = "*";
                operators[56][2] = "*";
                operators[57][0] = "/";
                operators[57][1] = "*";
                operators[57][2] = "/";
                operators[58][0] = "/";
                operators[58][1] = "+";
                operators[58][2] = "-";
                operators[59][0] = "/";
                operators[59][1] = "+";
                operators[59][2] = "*";
                operators[60][0] = "/";
                operators[60][1] = "-";
                operators[60][2] = "+";
                operators[61][0] = "/";
                operators[61][1] = "*";
                operators[61][2] = "+";
                operators[62][0] = "/";
                operators[62][1] = "*";
                operators[62][2] = "-";
                operators[63][0] = "/";
                operators[63][1] = "-";
                operators[63][2] = "*";
                
    }
}

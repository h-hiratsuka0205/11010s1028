import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {
    public List<Integer> generate (Integer number) {

        
        List<Integer> generateList = new ArrayList<Integer>();

        //素数判定：計算が２回のものを格納する（１と自分自身でしか割り切れないため）

        int n = 2; //素数判定の対象
        int count = 0;//２回か判定する対象
        

        for (int i = 0; i < number; n++) { //numberは素数の個数を指定する引数

            count = 0; //countのリセット

            for (int j = 1; j <= n; j++){//１から自分自身の数まで割り算

                if (n % j == 0) {
                    count++;
                }

            }
            if(count == 2) {
                generateList.add(n);

                i++;
            }


        }
        
        return generateList;

        //Integer result;

        //result = generateList.get(number);
        

        
    }
}
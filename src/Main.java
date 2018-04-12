import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int max=0;
        String popular = null;
        int i;
        String Color;

        Scanner sc = new Scanner(System.in);
        i=sc.nextInt();

        //hashmap存储key（键）以及velue（值）
        Map<String,Integer> color = new HashMap<>();

        while (i!=0){
            for (int j = 0;j < i;j++){
                Color = sc.next();
                //判断集合里是否有aa键
                if (color.containsKey(Color)){
                    color.put(Color, color.get(Color) + 1);
                }else {
                    color.put(Color,1);
                }
            }

           /*
            (1) for each map.entrySet()  循环遍历找出最大键值
            Map.entry的应用
           */
            for (Map.Entry<String,Integer> entry : color.entrySet()
                 ) {
                if (max < entry.getValue()){
                    max = entry.getValue();
                    popular = entry.getKey();
                }
            }
            System.out.println(popular);
            i=sc.nextInt();
            /*
            *   初始化变量存储
            */
            color = new HashMap<>();
            max = 0;
            popular =null;
        }
    }
}

package MyJAVALearning.basic_data_structures;
import java.util.ArrayList;


public class TestArrayList {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("李牧");
        list.add("王东东");
        list.add("拉完了");


        for(int i = 0; i < list.size(); i++){
            String s = list.get(i);
            System.out.println(s);
        }

        for(String s: list){
            System.out.println(s);
        }

        list.remove(1);

        for(String s: list){
            System.out.println(s);
        }

        list.set(1, "王二狗");

        for(String s: list){
            System.out.println(s);
        }

    }

}

import java.util.HashSet;
import java.util.AbstractSet;
import java.util.Set;
public class TestHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();

        set.add("李清照");
        set.add("王安石");
        set.add("杜甫");

        System.out.println("set的大小为：" + set.size());
        
        if(set.contains("李清照")){
            System.out.println("set中包含李清照");
        }

        if(set.remove("杜甫")){
            System.out.println("删除杜甫成功");
        }

        System.out.println(set);

        // 编译期间就会报错
        // if(set instanceof HashMap){
        //     System.out.println("set是HashMap的实例");
        // }

        if(set instanceof AbstractSet){
            System.out.println("set是AbstractSet的实例");
        }

        if(set instanceof Set){
            System.out.println("set是Set的实现类");
        }

        Object obj = new HashSet<String>();
        if(obj instanceof HashSet){
            @SuppressWarnings("unchecked")
            HashSet<String> set2 = (HashSet<String>) obj;
        }

        return;
    }
}

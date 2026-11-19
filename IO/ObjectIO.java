package MyJAVALearning.IO;

import java.io.*;

public class ObjectIO {

    public static void main(String[] args) {
        Wanger wanger = new Wanger();
        wanger.setAge(18);
        wanger.setName("zhangsan");
        System.out.println(wanger.toString());

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("IO/object.txt"))) {
            oos.writeObject(wanger);
        } catch(IOException e) {
            e.printStackTrace();
        }

        Wanger.pre = "不沉默";

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("IO/object.txt"))) {
            Wanger wanger1 = (Wanger) ois.readObject();
            System.out.println(wanger1.toString());
        } catch(IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // readObject 额外捕获这个异常：找不到类
            e.printStackTrace();
        }
    }

    static class Wanger implements Serializable{
        private String name;
        private int age;

        public static String pre = "沉默";
        transient String meizi = "王三";

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Wanger{name='" + name + "', age=" + age + ", pre='" + pre + "', meizi='" + meizi +"'}";
        }
    }
}

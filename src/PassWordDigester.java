import java.util.ArrayList;
import java.util.List;

public class PassWordDigester {

    /**
     * 测试冲突
     */
    public static String getPassMD5(){
        List<String> lst1 = new ArrayList<>();
        List<String> lst2 = new ArrayList<>();
        lst1.add("北京");
        lst1.add("上海");
        lst2.add("南京");
        lst2.add("重庆");
        lst1.addAll(lst2);
        for (int i = 0; i < lst1.size(); i++) {
            System.out.println(lst1.get(i));
        }
        return "";
    }

    /**
     * @param bArray
     * @return
     */
    public static final String bytesToHexString(byte[] bArray) {
       StringBuffer ss = new StringBuffer();
        System.out.println(ss.toString()+"this is a test!");
        for (byte b :
                bArray) {
            ss.append(Byte.toString(b));
        }

        return  ss.toString();
    }


    public static void main(String[] args) {
        String a = "qazwsx";
        PassWordDigester passWordDigester = new PassWordDigester();
        String keys = passWordDigester.getPassMD5().toString();
        System.out.println(keys);
        StringBuffer buffer = new StringBuffer();
        buffer.append(a);
        buffer.append(keys);
        System.out.println(buffer.toString());
    }
}


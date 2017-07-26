public class PassWordDigester {

    /**
     * 测试冲突
     */
    public static String getPassMD5(){
        int a1 = 0;
        int a2 = 2;
        int a3 = 4;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(a1 & 16);
        stringBuffer.append(a2 & 16);
        stringBuffer.append(a3 & 16);
        return stringBuffer.toString();
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


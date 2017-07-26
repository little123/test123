import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PassWordDigester {


    public Integer getPassMD5(String password) {
        Integer keys = Integer.valueOf(password);
        String keyStr = "";
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            if (password == null) {
                keys = 0;
            }
            byte[] bPass = password.getBytes("UTF-8");
            md.update(bPass);
            keyStr = bytesToHexString(md.digest());
        } catch (NoSuchAlgorithmException aex) {
            aex.printStackTrace();
        } catch (java.io.UnsupportedEncodingException uex) {
            uex.printStackTrace();
        }
        return new Integer(keyStr);
    }

    /**
     * @param bArray
     * @return
     */
    public static final String bytesToHexString(byte[] bArray) {
       StringBuffer ss = new StringBuffer();
        for (byte b :
                bArray) {
            ss.append(Byte.toString(b));
        }
        return  ss.toString();
    }


    public static void main(String[] args) {
        String a = "qazwsx";
        PassWordDigester passWordDigester = new PassWordDigester();
        String keys = passWordDigester.getPassMD5(a).toString();
        System.out.println(keys);
        StringBuffer buffer = new StringBuffer();
        buffer.append(a);
        buffer.append(keys);
        System.out.println(buffer.toString());
    }
}


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
        StringBuffer sb = new StringBuffer(bArray.length);
        String sTemp;
        for (int i = 0; i < bArray.length; i++) {
            sTemp = Integer.toHexString(0xFF & bArray[i]);
            if (sTemp.length() < 2) {
                sb.append(0);
            }
            sb.append(sTemp.toUpperCase());
        }
        return sb.toString();
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


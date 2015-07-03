import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class PassWordDigester {
	
	
	 public static String getPassMD5(String pass) {
	        String keys = null;
	        try {
	            MessageDigest md = MessageDigest.getInstance("MD5");
	            if (pass == null) {
	                pass = "";
	            }
	            byte[] bPass = pass.getBytes("UTF-8");
	            md.update(bPass);
	            keys = bytesToHexString(md.digest());
	        }
	        catch (NoSuchAlgorithmException aex) {
	        	aex.printStackTrace();
	        }
	        catch (java.io.UnsupportedEncodingException uex) {
	        	uex.printStackTrace();
	        }
	        return keys;
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
	      if (sTemp.length() < 2){
	       sb.append(0);
	      }
	      sb.append(sTemp.toUpperCase());
	     }
	     return sb.toString();
	  }
	 
	 
	  public static void main(String[] args){
	   String a = "qazwsx";
	   System.out.println(getPassMD5(a));
	   System.out.println("再次测试!!!");
	  }
	}


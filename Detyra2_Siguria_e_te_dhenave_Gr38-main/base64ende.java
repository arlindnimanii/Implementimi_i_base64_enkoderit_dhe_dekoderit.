package base64encodingdecoding;


import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import java.util.UUID;


public class base64ende {



	public static void main(String[] args) {
		
		//1
		System.out.println("Basic enoding and decoding....");
		String credential = "Data Security";
		
        Encoder encoder = Base64.getEncoder();
        String encodedStr=encoder.encodeToString(credential.getBytes());
        System.out.println(encodedStr);
       
        Decoder decoder = Base64.getDecoder();
        byte[] decode = decoder.decode(encodedStr.getBytes());
        
        String decodedStr = new String(decode);
        System.out.println(decodedStr);
        
	  System.out.println("  ");
	}
}

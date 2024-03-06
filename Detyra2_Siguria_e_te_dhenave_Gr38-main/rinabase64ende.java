


import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import java.util.UUID;


public class base64ende {



	public static void main(String[] args) {
		//2
        System.out.println("URL enoding and decoding....");
        String URL = "https://kkjavatutorials.com/?s=how+to+create+a+runnable+JAR+file++with+Maven";
        
        Encoder urlEncoder = Base64.getUrlEncoder();
        String encodedUrl = urlEncoder.encodeToString(URL.getBytes());
        System.out.println(encodedUrl);
        
        Decoder urlDecoder = Base64.getUrlDecoder();
        byte[] decode2 = urlDecoder.decode(encodedUrl.getBytes());
        
        String decodedUrl = new String(decode2);
        System.out.println(decodedUrl);
        
        System.out.println("  ");
	}
}
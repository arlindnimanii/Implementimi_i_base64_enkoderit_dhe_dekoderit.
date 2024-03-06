import java.util.Base64;
import java.util.Scanner;

public final class Base64Decoder {

	public static void main(String[] args) {
		System.out.println("  ");
		Scanner scanner =new Scanner(System.in);
        System.out.print("|Base64 Decoder| Enter the text:");
        
        String encoded = scanner.next();
        byte[] base64decoder = Base64.getMimeDecoder().decode(encoded);
        
        System.out.println("  ");
        
        String actualString = new String(base64decoder);
        System.out.println("|The result is|=" + actualString);
        
        System.out.println("  ");
	}

}

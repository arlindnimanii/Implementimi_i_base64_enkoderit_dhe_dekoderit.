import java.util.Base64;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public final class Base64Encoder {

	public static void main(String[] args) throws IOException{
	
		    System.out.println('\u0020');
			BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("|Base64 Encoder| Enter the Text: ");
			String input = scanner.readLine();
			String BasicBase64Format = Base64.getEncoder().encodeToString(input.getBytes());
			
			System.out.println('\u0020');
			System.out.print("|The result is|=" + BasicBase64Format);
		
		
	}

}

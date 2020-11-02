package executionstatus;

import org.apache.xmlbeans.impl.util.Base64;

public class Passwordencode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String pwd = "Str3nkpr0000088888";
		
		byte[] encodedPassword = Base64.encode(pwd.getBytes());
		System.out.println(("EncodedPassword is = "+new String(encodedPassword)));
		
		byte[] decodedPassword = Base64.decode(encodedPassword);
		System.out.println("DecodedPassword is ="+new String(decodedPassword));

	}

}

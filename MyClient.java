import java.util.*;
import java.io.*;
import java.net.*;

public class MyClient 
{
	public static void main(String[] args) 
	{
		try
		{	
			Scanner in = new Scanner(System.in);
			Socket s=new Socket("localhost",6666);
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());
			System.out.println("Enter Message to send to Server : ");
			dout.writeUTF(in.nextLine());
			dout.flush();
			dout.close();
			s.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

import java.net.*;
import java.io.*;
public class client{
public static void main(String args[])
throws Exception{
try {
Socket sk = new Socket
("localhost", 1234);
PrintWriter pw = newPrintWriter(sk.getOutputStream(), true);
pw.println("HELLOSERVER ..!!!!!");
InputStreamReader isr= new InputStreamReader(sk.getInputStream());
BufferedReader br =new BufferedReader(isr);
String str=br.readLine();
System.out.println("MESSAGE FROM SERVER: "+str);
pw.close();
sk.close();
}
catch(Exception e) {
System.out.println("An error occured.." +e);
}}}
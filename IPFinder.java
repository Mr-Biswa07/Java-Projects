import java.net.*;
import java.util.*; 
public class IPFinder
{
    public static void main(String[] args)
    {
        String host;
        InetAddress address;
        Scanner input = new Scanner (System.in); 
        System.out.println("\nEnter host name:");
        host = input.next();

        try
        {
            address = InetAddress.getByName(host);  
            System.out.println("IP address: " + address.toString());  
        }
        catch (UnknownHostException e)
        {
            System.out.println("Could not find " + host);
        }
        input.close();
    }
}
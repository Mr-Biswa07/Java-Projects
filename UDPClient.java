import java.net.*;

public class UDPClient{
    public static void main(String[] args){
        try{
            DatagramSocket s = new DatagramSocket();
            String msg = "Hello, UDP Receiver";
            byte[] buffer = msg.getBytes();
            InetAddress recAdd = InetAddress.getByName("DARKKNIGHT");
            int port = 1234;
            DatagramPacket p = new DatagramPacket(buffer, buffer.length, recAdd, port);
            s.send(p);
            s.close();
        } catch (Exception e){
            System.out.println("Exception "+e);
        }
    }
}
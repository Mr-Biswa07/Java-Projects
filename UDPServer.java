import java.net.*;

public class UDPServer {
    public static void main(String[] args){
        try {
            DatagramSocket s = new DatagramSocket(1234);
            byte[] buffer = new byte[1024];
            DatagramPacket p = new DatagramPacket(buffer, buffer.length);
            s.receive(p);
            String receivedmsg = new String(p.getData(), 0, p.getLength());
            System.out.println(receivedmsg);
            s.close();
        } catch (Exception e) {
            System.out.println("Exception "+e);
        }
    }
}
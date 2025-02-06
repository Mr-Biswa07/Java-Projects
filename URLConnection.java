import java.io.*;
import java.net.*;
public class URLConnection 
{
    public static void main(String[] args) 
    {
        try 
        {
            URI uri = new URI("http://www.gmail.com");
            URL url = uri.toURL();
            java.net.URLConnection connection = url.openConnection();
            connection.setConnectTimeout(50000); 
            connection.setReadTimeout(50000);   
            InputStream inputStream = connection.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream)); 
            String line;
            while ((line = reader.readLine()) != null) 
            { 
                System.out.println(line);
            }
            reader.close();
        } catch (IOException | URISyntaxException e) 
        {
            e.printStackTrace();
}
}
}
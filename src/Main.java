import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        URL url = null;
        try {
            url = new URL("https://api.privatbank.ua/p24api/pubinfo?exchange&coursid=3");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        MyUnmarshaller.myUnmarshallerXML(url);
    }
}

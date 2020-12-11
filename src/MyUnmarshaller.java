import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.net.URL;
import java.util.ArrayList;

public class MyUnmarshaller {
    public static void myUnmarshallerXML (URL url) {
        try { JAXBContext jaxbC = JAXBContext.newInstance(ExchangeratesList.class);
            Unmarshaller unmarshaller = jaxbC.createUnmarshaller();
            ExchangeratesList exchangeratesList = (ExchangeratesList) unmarshaller.unmarshal(url);
            ArrayList<Row> r=  exchangeratesList.getExc();

            for (Row row:r) {
                System.out.println(row.getExchangerate());
            }
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}

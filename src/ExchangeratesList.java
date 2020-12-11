import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
@XmlRootElement(name = "exchangerates")
public class ExchangeratesList {

    private ArrayList<Row> exc = new ArrayList<>();

    public ArrayList<Row> getExc() {
        return exc;
    }
    @XmlElement(name = "row")
    public void setExc(ArrayList<Row> exc) {
        this.exc = exc;
    }
}

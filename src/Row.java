import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "row")
public class Row {
    private Exchangerate exchangerate;

    public Exchangerate getExchangerate() {
        return exchangerate;
    }

    @XmlElement(name = "exchangerate")
    public void setExchangerate(Exchangerate exchangerate) {
        this.exchangerate = exchangerate;
    }

    @Override
    public String toString() {
        return "Row{" +
                "exchangerate=" + exchangerate +
                '}';
    }
}

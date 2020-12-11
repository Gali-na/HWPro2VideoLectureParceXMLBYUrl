import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "exchangerate")
public class Exchangerate {
    private  String exchangeFromCurrency;
    private  String exchangeInCurrency;
    private  String buy;
    private  String sale;

    public Exchangerate(String exchangeFromCurrency, String exchangeInCurrency, String buy, String sale) {
        this.exchangeFromCurrency = exchangeFromCurrency;
        this.exchangeInCurrency = exchangeInCurrency;
        this.buy = buy;
        this.sale = sale;
    }

    public Exchangerate() {

    }

    public String getExchangeFromCurrency() {
        return exchangeFromCurrency;
    }
    @XmlAttribute(name ="ccy")
    public void setExchangeFromCurrency(String exchangeFromCurrency) {
        this.exchangeFromCurrency = exchangeFromCurrency;
    }

    public String getExchangeInCurrency() {
        return exchangeInCurrency;
    }
    @XmlAttribute(name ="base_ccy")
    public void setExchangeInCurrency(String exchangeInCurrency) {
        this.exchangeInCurrency = exchangeInCurrency;
    }

    public String getBuy() {
        return buy;
    }
    @XmlAttribute(name ="buy")
    public void setBuy(String buy) {
        this.buy = buy;
    }

    public String getSale() {
        return sale;
    }
    @XmlAttribute(name ="sale")
    public void setSale(String sale) {
        this.sale = sale;
    }

    @Override
    public String toString() {
        return "Exchangerate{" +
                "exchangeFromCurrency='" + exchangeFromCurrency + '\'' +
                ", exchangeInCurrency='" + exchangeInCurrency + '\'' +
                ", buy='" + buy + '\'' +
                ", sale='" + sale + '\'' +
                '}';
    }
}

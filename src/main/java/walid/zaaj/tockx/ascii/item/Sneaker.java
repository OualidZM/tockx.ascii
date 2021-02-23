package walid.zaaj.tockx.ascii.item;
import java.util.List;
public class Sneaker {

    private String style;
    private String name;
    private int sale;
    private int ask;
    private int bid;
    private List<Offer> offer = new ArrayList<Offer>();


    public Sneaker(String style, String name) {
        this.style = style;
        this.name = name;
    }

    public String getStyle() {
        return this.style;
    }

    public String getName() {
        return this.name;
    }


    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }


    public int getAsk() {
        return ask;
    }


    public void setAsk(int ask) {
        this.ask = ask;
    }


    public void add(Offer offer){
        this.offer.add(offer);
    }

    List<Offer> offers(){
        return offer;
    }



    @Override
    public String toString() {
        return 
            "style:" + getStyle() + "\n" +
            "name:" + getName() + "\n" +
            "sale:" + getSale() + "\n" +
            "ask:" + getAsk() + "\n" +
            "bid:" + getBid();
    }
}

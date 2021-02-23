package walid.zaaj.tockx.ascii.item;

public class Ask {
    private String size;
    private Integer ask;


    public Ask(String size, Integer ask) {
        this.size = size;
        this.ask = ask;
    }

    
    public String size(){
        return this.size;
    }

    public int value(){
        return this.ask;
    }

    public int compareTo(Offer offer){
        return this.ask.compareTo(offer.value());
    }

    @Override
    public String toString() {
        return "Size: " + size() + '\n' +
                "Ask: " + value();
    }
}

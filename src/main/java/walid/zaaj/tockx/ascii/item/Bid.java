package walid.zaaj.tockx.ascii.item;
public class Bid {
    
    private String size;
    private Integer bid;



    public Bid(String size, Integer bid) {
        this.size = size;
        this.bid = bid;
    }


    public String size(){
        return this.size;
    }

    public int value(){
        return this.bid;
    }

    public int compareTo(Offer offer){
        return this.bid.compareTo(offer.value());
    }


    @Override
    public String toString() {
        return
            "size: " + size() + "\n" +
            "bid: " + value();
    }
    

}

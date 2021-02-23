package walid.zaaj.tockx.ascii.item;

public class Sale {
    
    private String size;
    private Integer price;


    public Sale(String size, Integer price) {
        this.size = size;
        this.price = price;
    }

    public String size(){
        return this.size;
    }

    public int value(){
        return this.price;
    }

    public int compareTo(Offer offer){
        return this.price.compareTo(offer.value());
    }


    @Override
    public String toString() {
        return "size: " + size() + "\n" +
                "price: " + value();
    }


}

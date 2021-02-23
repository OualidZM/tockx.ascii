package walid.zaaj.tockx.ascii.item;

import java.util.List;

public interface Item{

	void add(Sale sale);

	void add(Bid bid);

	void setSale(int i);

	void setBid(int i);

	List<Offer> getBid();

	String getSale();

	String getAsk();

	void setAsk(int i);

	void add(Ask ask);
    
}

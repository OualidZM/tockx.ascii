package walid.zaaj.tockx.ascii.item;

import java.util.List;

public interface Item{

	int getBid();

	int getAsk();

	int getSale();

	void add(Offer offer);

	void setBid(int numbid);

	void setAsk(int ask);

	void setSale(int sale);


	
    
}

package walid.zaaj.tockx.ascii.criteria;
import java.util.List;
import walid.zaaj.tockx.ascii.item.Offer;
import walid.zaaj.tockx.ascii.item.Item;

public interface Criteria {
    List<Offer> checkCriteria(Item item);

}

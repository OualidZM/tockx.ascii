package walid.zaaj.tockx.ascii.criteria;
import java.util.List;

// import walid.zaaj.tockx.ascii.item.Item;
import walid.zaaj.tockx.ascii.item.Offer;

public interface Criteria {
    List<Offer> checkCriteria(Offer offer);

}

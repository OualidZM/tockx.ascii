package walid.zaaj.tockx.ascii.CriteriaTest;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import walid.zaaj.tockx.ascii.criteria.Bids;
public class BidsTest {
    Bids bids = new Bids();
    @Test
    public void bids(){
        assertEquals(Arrays.asList(bids), bids);
    }
}

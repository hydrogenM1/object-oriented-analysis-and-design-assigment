package B201210007;

import java.io.Serializable;
import java.util.List;

public interface ISicaklikAlgilayici {
    List<Serializable> sicaklikOku() throws InterruptedException;
}

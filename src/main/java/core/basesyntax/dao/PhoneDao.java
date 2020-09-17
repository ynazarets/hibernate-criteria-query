package core.basesyntax.dao;

import core.basesyntax.model.Phone;
import java.util.List;
import java.util.Map;

public interface PhoneDao {
    // Use CriteriaQuery for this method
    List<Phone> findAll(Map<String, String> params);

    // Use HQL for this method
    List<Phone> getMostExpensive();
}

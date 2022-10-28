package ax.ha.appmodule.application;

import ax.ha.appmodule.domain.model.ItemModell;
import ax.ha.lab2.entiry.Item;

import java.util.List;
import java.util.UUID;

public interface ApiService {
    ItemModell addItem(Item item);

    List<ItemModell> getAll();

    ItemModell getItem(UUID id);

    ItemModell updateItem(Item item);
}

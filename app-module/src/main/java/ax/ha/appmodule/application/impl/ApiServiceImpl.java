package ax.ha.appmodule.application.impl;

import ax.ha.appmodule.application.ApiService;
import ax.ha.appmodule.application.ItemFactory;
import ax.ha.appmodule.domain.ItemRepository;
import ax.ha.appmodule.domain.model.ItemModell;
import ax.ha.lab2.entiry.Item;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Slf4j
@RequiredArgsConstructor
@Service
public class ApiServiceImpl implements ApiService {
    private final ItemRepository repo;
    private final ItemFactory factory;

    @Override
    public ItemModell addItem(Item item) {
        ItemModell i = factory.createItem(item);
        repo.save(i);
        log.info("Added item with id {}: ", i.getId());
        return i;
    }

    @Override
    public List<ItemModell> getAll() {
        return repo.findAll();
    }

    @Override
    public ItemModell getItem(UUID id) {

        return repo.findItemModellById(id);
    }

    @Override
    public ItemModell updateItem(Item item) {
        if (repo.findById(item.getId()).isPresent()){
            log.info("Item with id {} updated", item.getId());
        return repo.save(factory.createItem(item));}
        else return null;

    }
}

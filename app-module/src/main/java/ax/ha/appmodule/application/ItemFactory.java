package ax.ha.appmodule.application;

import ax.ha.appmodule.domain.model.ItemModell;
import ax.ha.lab2.entiry.Item;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class ItemFactory {

    public ItemModell createItem(Item item) {
        return ItemModell.builder()
                .id(item.getId())
                .name(item.getName())
                .price(item.getPrice())
                .category(item.getCategory())
                .build();
    }
}

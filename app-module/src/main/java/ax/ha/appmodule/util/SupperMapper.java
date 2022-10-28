package ax.ha.appmodule.util;

import ax.ha.appmodule.domain.model.ItemModell;
import ax.ha.lab2.entiry.Item;
import ax.ha.lab2.entiry.ItemList;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SupperMapper {

    Item toItem(ItemModell itemModell);

    default ItemList toItemList(List<ItemModell> items){
        return new ItemList().items(items.stream().map(this::toItem).toList());
    }
}

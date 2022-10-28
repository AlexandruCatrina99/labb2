package ax.ha.appmodule.domain;

import ax.ha.appmodule.domain.model.ItemModell;
import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ItemRepository extends JpaRepository<ItemModell, UUID> {
    @NonNull List<ItemModell> findAll();

    ItemModell findItemModellById(UUID id);

}

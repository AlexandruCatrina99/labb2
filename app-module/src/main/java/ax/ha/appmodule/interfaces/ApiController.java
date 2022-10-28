package ax.ha.appmodule.interfaces;

import ax.ha.appmodule.application.ApiService;
import ax.ha.appmodule.util.SupperMapper;
import ax.ha.lab2.entiry.Item;
import ax.ha.lab2.entiry.ItemList;
import ax.ha.lab2.interfaces.ItemApi;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class ApiController implements ItemApi {
    private final ApiService apiService;
    private final SupperMapper mapper;

    @Override
    public ResponseEntity<Item> addItem(Item item) {
        return ResponseEntity.ok(mapper.toItem(apiService.addItem(item)));
    }

    @Override
    public ResponseEntity<ItemList> getAll() {
        return ResponseEntity.ok(mapper.toItemList(apiService.getAll()));
    }

    @Override
    public ResponseEntity<Item> getItem(UUID id) {
        Item response = mapper.toItem(apiService.getItem(id));
        if (response != null) {
            return ResponseEntity.ok(response);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);

    }

    @Override
    public ResponseEntity<Item> updateItem(Item item) {
        Item response = mapper.toItem(apiService.updateItem(item));
        if (response != null) {
            return ResponseEntity.ok(response);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }

}

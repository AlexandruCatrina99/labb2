package ax.ha.appmodule.domain.model;

import lombok.*;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Accessors(chain = true)
public class ItemModell {

    @Id
    @NonNull
    @Column(updatable = false)
    private UUID id;

    @NonNull
    private String name;

    @NonNull
    @Setter
    private Integer price;

    @NonNull
    private String category;

}

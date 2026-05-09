package cl.app.ms_products_db.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ProductDto {
    @JsonProperty("producto_id")
    private Long id;
    @JsonProperty("producto_nombre")
    private String name;
    @JsonProperty("producto_descripcion")
    private String description;
    @JsonProperty("producto_precio")
    private Long price;
}

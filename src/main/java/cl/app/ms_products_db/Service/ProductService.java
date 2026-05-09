package cl.app.ms_products_db.Service;

import cl.app.ms_products_db.model.Producto;
import cl.app.ms_products_db.model.dto.ProductDto;
import cl.app.ms_products_db.repository.ProductRepositury;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    @Autowired
    ProductRepositury productRepositury;

    public List<ProductDto> findAll() {
        List<ProductDto> dtoList = new ArrayList<>();
        for (Producto producto : productRepositury.findAll()) {
            dtoList.add(entityToDto(producto));
        }
        return dtoList;
    }

    public ProductDto entityToDto(Producto producto) {
        return new ProductDto(producto.getId(), producto.getName(), producto.getDescripcion(), producto.getPrice());
    }
}
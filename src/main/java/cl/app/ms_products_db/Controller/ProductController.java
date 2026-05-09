package cl.app.ms_products_db.Controller;

import cl.app.ms_products_db.Service.ProductService;
import cl.app.ms_products_db.model.Producto;
import cl.app.ms_products_db.model.dto.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {
    @Autowired
    ProductService productService;
    @GetMapping()
    public ResponseEntity<List<ProductDto>>findAll(){
        return ResponseEntity.ok(productService.findAll());
    }
}

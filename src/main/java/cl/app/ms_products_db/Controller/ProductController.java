package cl.app.ms_products_db.Controller;

import cl.app.ms_products_db.Service.ProductService;
import cl.app.ms_products_db.model.Producto;
import cl.app.ms_products_db.model.dto.ProductDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
@Slf4j // Registro de cada acciom que se hace para el programa
public class ProductController {
    @Autowired
    ProductService productService;
    @GetMapping()
    public ResponseEntity<List<ProductDto>>findAll(){
        log.info("Request findAll()");
        List<ProductDto>lista = productService.findAll();
        log.info("Response findAll():{}",lista);
        return ResponseEntity.ok(lista);

    }
    @PostMapping()

     public ResponseEntity<ProductDto>crearProducto(@RequestHeader(name= "x-country", required = true)String country,
                                                    @RequestHeader(name = "x-user",required = true)String user,
                                                    @RequestBody ProductDto productDto){
        log.info("Crear Producto Headers x-country:{}, x-user: {}", country,user); //los log son el Slf4j para identificar como el usuario y el pais
        log.info("Crear Producto Request:{}, {}",productDto.toString(),"OK");
        return ResponseEntity.ok(new ProductDto());
    }
}

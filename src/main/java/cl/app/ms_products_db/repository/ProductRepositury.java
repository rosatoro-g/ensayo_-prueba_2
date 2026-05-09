package cl.app.ms_products_db.repository;

import cl.app.ms_products_db.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepositury extends JpaRepository<Producto, Long> {
}

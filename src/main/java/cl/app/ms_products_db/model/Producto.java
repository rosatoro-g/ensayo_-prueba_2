package cl.app.ms_products_db.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "product")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString


public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="nombre")
    private String name;
    @Column(name= "descripcion")
    private String descripcion;
    @Column(name="precio")
    private long price;

}

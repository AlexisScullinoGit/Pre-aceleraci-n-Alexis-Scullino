package entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Genero")
@Getter
@Setter
public class GeneroEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String nombre;

    private String imagen;

    @OneToMany(mappedBy = "genero", fetch = FetchType.LAZY)
    private Set<PeliculaOSerieEntity> peliculaOSerie;







}

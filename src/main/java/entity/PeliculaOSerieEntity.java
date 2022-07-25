package entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Peliculas_o_Series")
@Getter
@Setter
public class PeliculaOSerieEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String imagen;
    private String titulo;

    @Column(name = "fecha_de_creacion")
    @DateTimeFormat (pattern = "yyyy/MM/dd")
    private LocalDate fechaDeCreacion;

    private int calificacion;

    @ManyToMany(
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            }
    )
    @JoinTable(
            name = "personaje_de_pelicula",
            joinColumns = @JoinColumn(name = "pelicula_o_serie_id"),
            inverseJoinColumns = @JoinColumn(name = "personaje_id"))
    private Set<PersonajeEntity> personajes = new HashSet<>();

    @ManyToOne()
    @JoinTable(name = "genero_id")
    private GeneroEntity genero;









}

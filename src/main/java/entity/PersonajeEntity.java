package entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "personajes")
@Getter
@Setter

public class PersonajeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String imagen;
    private String nombre;
    private int edad;
    private double peso;
    private String historia;

    @ManyToMany(mappedBy = "personajes")
    private Set<PeliculaOSerieEntity> peliculaOSerie = new HashSet<>();






}

package com.publicaciones.publicaciones;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicacionesController {
    private List<Publicacion> publicaciones = new ArrayList<>();
    

    public PublicacionesController() {
        publicaciones.add(new Publicacion(1, "publicacion primer semestre", new Asignatura(1, 6.0, "Matematica")));
        publicaciones.add(new Publicacion(1, "publicacion primer semestre", new Asignatura(2, 7.0, "lenguaje")));
        publicaciones.add(new Publicacion(1, "publicacion primer semestre", new Asignatura(3, 6.5, "historia")));
        publicaciones.add(new Publicacion(1, "publicacion primer semestre", new Asignatura(4, 6.6, "ciencias")));
        publicaciones.add(new Publicacion(1, "publicacion primer semestre", new Asignatura(5, 5.0, "fisica")));
        publicaciones.add(new Publicacion(2, "publicacion segundo semestre", new Asignatura(6, 4.0, "Matematica")));
        publicaciones.add(new Publicacion(2, "publicacion segundo semestre", new Asignatura(7, 3.0, "lenguaje")));
        publicaciones.add(new Publicacion(2, "publicacion segundo semestre", new Asignatura(8, 3.5, "historia")));
        publicaciones.add(new Publicacion(2, "publicacion segundo semestre", new Asignatura(9, 6.8, "ciencias")));
        publicaciones.add(new Publicacion(2, "publicacion segundo semestre", new Asignatura(10, 7.0, "fisica")));
    }


    @GetMapping("/publicaciones/publicacionesById/{id}")
    public List<Publicacion> getPublicacionById(@PathVariable int id) {       
         List<Publicacion> publicacionesById = new ArrayList<>();
        for (Publicacion publicacion : publicaciones) {
            if (publicacion.getId() == id) {
                publicacionesById.add(publicacion);
            }
        }
        return publicacionesById;
    }

    @GetMapping("/publicaciones/promedioById/{id}")
    public double getPromedioNotasById(@PathVariable int id) {
        double promedio = 0;
        int contador = 0;
        for (Publicacion publicacion : publicaciones) {
            if (publicacion.getId() == id) {
                Asignatura asignatura = publicacion.getAsignatura();
                promedio += asignatura.getNota();
                contador++;
            }
        }
        if (contador > 0) {
           promedio /= contador;
        }
        return promedio;
    }

    @GetMapping("/publicaciones/publicacionesByNombreAsignatura/{nombre}")
    public List<Publicacion> getPublicacionesMatematicas(String nombre) {
        List<Publicacion> publicacionesMatematicas = new ArrayList<>();
        for (Publicacion publicacion : publicaciones) {
            Asignatura asignatura = publicacion.getAsignatura();
            if (asignatura.getNombre().toUpperCase().equalsIgnoreCase(nombre.toUpperCase())) {
                publicacionesMatematicas.add(publicacion);
            }
        }
        return publicacionesMatematicas;
    }
}

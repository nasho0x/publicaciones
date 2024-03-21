package com.publicaciones.publicaciones;

/**
 * Clase Publicacion que representa una publicación con un ID, un comentario y una nota.
 */
public class Publicacion {
    private int id;
    private String comentario;
    private Asignatura asignatura;

    /**
     * Constructor de la clase Publicacion.
     * @param id el ID de la publicación
     * @param comentario el comentario de la publicación
     * @param nota la nota de la publicación
     */
    public Publicacion(int id, String comentario, Asignatura asignatura) {
        this.id = id;
        this.comentario = comentario;
        this.asignatura = asignatura;
    }

    /**
     * Getter para el ID de la publicación.
     * @return el ID de la publicación
     */
    public int getId() {
        return id;
    }

    /**
     * Setter para el ID de la publicación.
     * @param id el nuevo ID de la publicación
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter para el comentario de la publicación.
     * @return el comentario de la publicación
     */
    public String getComentario() {
        return comentario;
    }

    /**
     * Setter para el comentario de la publicación.
     * @param comentario el nuevo comentario de la publicación
     */
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    /**
     * Getter para la clase Asignatura.
     * @return asignatura de la publicación
     */
    public Asignatura getAsignatura() {
        return asignatura;
    }

    /**
     * Setter para la clase Asignatura.
     * @param asignatura la nueva asignatura de la publicación
     */
    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }
}

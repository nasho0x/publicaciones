package com.publicaciones.publicaciones;

/**
 * Clase que representa una asignatura.
 */
public class Asignatura {
    private int id;
    private Double nota;
    private String nombre;

    /**
     * Constructor de la clase Asignatura.
     * @param id el id de la asignatura
     * @param nota la nota de la asignatura
     * @param nombre el nombre de la asignatura
     */
    public Asignatura(int id, Double nota, String nombre) {
        this.id = id;
        this.nota = nota;
        this.nombre = nombre;
    }

    /**
     * Obtiene el id de la asignatura.
     * @return el id de la asignatura
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el id de la asignatura.
     * @param id el id de la asignatura
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene la nota de la asignatura.
     * @return la nota de la asignatura
     */
    public Double getNota() {
        return nota;
    }

    /**
     * Establece la nota de la asignatura.
     * @param nota la nota de la asignatura
     */
    public void setNota(Double nota) {
        this.nota = nota;
    }

    /**
     * Obtiene el nombre de la asignatura.
     * @return el nombre de la asignatura
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la asignatura.
     * @param nombre el nombre de la asignatura
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Objects;

/**
 *
 * @author gatopk
 */

public class Libro {
    
    private String clave;
    private String titulo;
    private String editorial;

    public Libro() {
    }

    public Libro(String clave) {
        this.clave = clave;
    }

    public Libro(String clave, String titulo, String editorial) {
        this.clave = clave;
        this.titulo = titulo;
        this.editorial = editorial;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.clave);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        return Objects.equals(this.clave, other.clave);
    }

    @Override
    public String toString() {
        return "Libro{" + "clave=" + clave + ", titulo=" + titulo + ", editorial=" + editorial + '}';
    }
            
}

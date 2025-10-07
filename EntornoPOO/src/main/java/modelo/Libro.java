package main.java.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Libro {
    private String titulo;
    private String autor;
    private int paginas;
    private BigDecimal precio;
    private LocalDate fechaPublicacion;
    private boolean prestado;

    public Libro() {
        this.titulo = "Crepusculo";
        this.autor = "Stephenie Meyer";
        this.paginas = 1;
        this.precio = BigDecimal.valueOf(100);
        this.fechaPublicacion = LocalDate.of(2010, 1, 1);
        this.prestado = false;
    }

    public Libro(String titulo, String autor, int paginas, BigDecimal precio, LocalDate fechaPublicacion, boolean prestado) {
        setTitulo(titulo);
        setAutor(autor);
        setPaginas(paginas);
        setPrecio(precio);
        setFechaPublicacion(fechaPublicacion);
        setPrestado(prestado);
    }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) {
        if (titulo == null || titulo.isBlank())
            throw new IllegalArgumentException("El título no puede estar vacío.");
        this.titulo = titulo;
    }

    public String getAutor() { return autor; }
    public void setAutor(String autor) {
        if (autor == null || autor.isBlank())
            throw new IllegalArgumentException("El autor no puede estar vacío.");
        this.autor = autor;
    }

    public int getPaginas() { return paginas; }
    public void setPaginas(int paginas) {
        if (paginas < 1)
            throw new IllegalArgumentException("El libro debe tener al menos 1 página.");
        this.paginas = paginas;
    }

    public BigDecimal getPrecio() { return precio; }
    public void setPrecio(BigDecimal precio) {
        if (precio == null || precio.compareTo(BigDecimal.ZERO) <= 0 || precio.compareTo(BigDecimal.valueOf(10000)) >= 0)
            throw new IllegalArgumentException("Precio debe estar entre 0 y 10,000.");
        this.precio = precio;
    }

    public LocalDate getFechaPublicacion() { return fechaPublicacion; }
    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        if (fechaPublicacion == null || fechaPublicacion.isAfter(LocalDate.now()) || fechaPublicacion.isBefore(LocalDate.of(2010, 1, 1)))
            throw new IllegalArgumentException("La fecha de publicación debe ser entre 2010 y hoy.");
        this.fechaPublicacion = fechaPublicacion;
    }

    public boolean isPrestado() { return prestado; }
    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", paginas=" + paginas +
                ", precio=" + precio +
                ", fechaPublicacion=" + fechaPublicacion +
                ", prestado=" + prestado +
                '}';
    }
}
package modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class BoletoCine {
    private String sala;
    private String pelicula;
    private String asiento;
    private BigDecimal precio;
    private LocalDate fechaFuncion;
    private boolean esVIP;

    public BoletoCine() {
        this.sala = "1";
        this.pelicula = "Rapidos y Furiosos";
        this.asiento = "F11";
        this.precio = BigDecimal.valueOf(100);
        this.fechaFuncion = LocalDate.now();
        this.esVIP = false;
    }

    public BoletoCine(String sala, String pelicula, String asiento, BigDecimal precio, LocalDate fechaFuncion, boolean esVIP) {
        setSala(sala);
        setPelicula(pelicula);
        setAsiento(asiento);
        setPrecio(precio);
        setFechaFuncion(fechaFuncion);
        setEsVIP(esVIP);
    }

    public String getSala() { return sala; }
    public void setSala(String sala) {
        if (sala == null || sala.isBlank())
            throw new IllegalArgumentException("Sala no puede estar vacío.");
        this.sala = sala;
    }

    public String getPelicula() { return pelicula; }
    public void setPelicula(String pelicula) {
        if (pelicula == null || pelicula.isBlank())
            throw new IllegalArgumentException("Pelicula no puede estar vacío.");
        this.pelicula = pelicula;
    }

    public String getAsiento() { return asiento; }
    public void setAsiento(String asiento) {
        if (asiento == null || asiento.isBlank())
            throw new IllegalArgumentException("Asiento no puede estar vacío.");
        this.asiento = asiento;
    }

    public BigDecimal getPrecio() { return precio; }
    public void setPrecio(BigDecimal precio) {
        if (precio == null || precio.compareTo(BigDecimal.ZERO) <= 0 || precio.compareTo(BigDecimal.valueOf(10000)) >= 0)
            throw new IllegalArgumentException("Precio debe estar entre 0 y 10,000.");
        this.precio = precio;
    }

    public LocalDate getFechaFuncion() { return fechaFuncion; }
    public void setFechaFuncion(LocalDate fechaFuncion) {
        if (fechaFuncion == null || fechaFuncion.isBefore(LocalDate.of(2010, 1, 1)) || fechaFuncion.isAfter(LocalDate.now().plusYears(1)))
            throw new IllegalArgumentException("La fecha de función debe ser realista.");
        this.fechaFuncion = fechaFuncion;
    }

    public boolean isEsVIP() { return esVIP; }
    public void setEsVIP(boolean esVIP) {
        this.esVIP = esVIP;
    }

    @Override
    public String toString() {
        return "BoletoCine{" +
                "sala='" + sala + '\'' +
                ", pelicula='" + pelicula + '\'' +
                ", asiento='" + asiento + '\'' +
                ", precio=" + precio +
                ", fechaFuncion=" + fechaFuncion +
                ", esVIP=" + esVIP +
                '}';
    }
}
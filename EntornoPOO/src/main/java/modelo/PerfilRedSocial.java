package modelo;

import java.time.LocalDate;

public class PerfilRedSocial {
    private String alias;
    private int seguidores;
    private int siguiendo;
    private String fotoPerfil;
    private String biografia;
    private LocalDate fechaRegistro;

    public PerfilRedSocial() {
        this.alias = "kilmyselff";
        this.seguidores = 100000;
        this.siguiendo = 110;
        this.fotoPerfil = "default.jpg";
        this.biografia = "????";
        this.fechaRegistro = LocalDate.now();
    }

    public PerfilRedSocial(String alias, int seguidores, int siguiendo, String fotoPerfil, String biografia, LocalDate fechaRegistro) {
        setAlias(alias);
        setSeguidores(seguidores);
        setSiguiendo(siguiendo);
        setFotoPerfil(fotoPerfil);
        setBiografia(biografia);
        setFechaRegistro(fechaRegistro);
    }

    public String getAlias() { return alias; }
    public void setAlias(String alias) {
        if (alias == null || alias.isBlank())
            throw new IllegalArgumentException("Alias no puede ser vacío.");
        this.alias = alias;
    }

    public int getSeguidores() { return seguidores; }
    public void setSeguidores(int seguidores) {
        if (seguidores < 0)
            throw new IllegalArgumentException("No puede tener seguidores negativos.");
        this.seguidores = seguidores;
    }

    public int getSiguiendo() { return siguiendo; }
    public void setSiguiendo(int siguiendo) {
        if (siguiendo < 0)
            throw new IllegalArgumentException("No puede seguir un número negativo.");
        this.siguiendo = siguiendo;
    }

    public String getFotoPerfil() { return fotoPerfil; }
    public void setFotoPerfil(String fotoPerfil) {
        if (fotoPerfil == null || fotoPerfil.isBlank())
            throw new IllegalArgumentException("Foto de perfil no puede ser vacía.");
        this.fotoPerfil = fotoPerfil;
    }

    public String getBiografia() { return biografia; }
    public void setBiografia(String biografia) {
        if (biografia == null)
            throw new IllegalArgumentException("La biografía no puede ser nula.");
        this.biografia = biografia;
    }

    public LocalDate getFechaRegistro() { return fechaRegistro; }
    public void setFechaRegistro(LocalDate fechaRegistro) {
        if (fechaRegistro == null || fechaRegistro.isAfter(LocalDate.now()))
            throw new IllegalArgumentException("La fecha de registro no puede ser futura.");
        this.fechaRegistro = fechaRegistro;
    }

    @Override
    public String toString() {
        return "PerfilRedSocial{" +
                "alias='" + alias + '\'' +
                ", seguidores=" + seguidores +
                ", siguiendo=" + siguiendo +
                ", fotoPerfil='" + fotoPerfil + '\'' +
                ", biografia='" + biografia + '\'' +
                ", fechaRegistro=" + fechaRegistro +
                '}';
    }
}
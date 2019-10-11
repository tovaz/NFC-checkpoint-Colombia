package sitetech.NFCcheckPoint.db;

import org.greenrobot.greendao.annotation.*;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END

/**
 * Entity mapped to table "HORARIO".
 */
@Entity
public class Horario {

    @Id(autoincrement = true)
    private Long id;
    private String nombre;
    private Long horaDesde;
    private Long horaHasta;
    private Integer maxMinutos;
    private Long horaFestivoDesde;
    private Long horaFestivoHasta;
    private Integer maxMinutosFestivo;
    private Long horaFinSemanaDesde;
    private Long horaFinSemanaHasta;
    private Integer maxMinutosFinSemana;
    private boolean eliminado;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    @Generated
    public Horario() {
    }

    public Horario(Long id) {
        this.id = id;
    }

    @Generated
    public Horario(Long id, String nombre, Long horaDesde, Long horaHasta, Integer maxMinutos, Long horaFestivoDesde, Long horaFestivoHasta, Integer maxMinutosFestivo, Long horaFinSemanaDesde, Long horaFinSemanaHasta, Integer maxMinutosFinSemana, boolean eliminado) {
        this.id = id;
        this.nombre = nombre;
        this.horaDesde = horaDesde;
        this.horaHasta = horaHasta;
        this.maxMinutos = maxMinutos;
        this.horaFestivoDesde = horaFestivoDesde;
        this.horaFestivoHasta = horaFestivoHasta;
        this.maxMinutosFestivo = maxMinutosFestivo;
        this.horaFinSemanaDesde = horaFinSemanaDesde;
        this.horaFinSemanaHasta = horaFinSemanaHasta;
        this.maxMinutosFinSemana = maxMinutosFinSemana;
        this.eliminado = eliminado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getHoraDesde() {
        return horaDesde;
    }

    public void setHoraDesde(Long horaDesde) {
        this.horaDesde = horaDesde;
    }

    public Long getHoraHasta() {
        return horaHasta;
    }

    public void setHoraHasta(Long horaHasta) {
        this.horaHasta = horaHasta;
    }

    public Integer getMaxMinutos() {
        return maxMinutos;
    }

    public void setMaxMinutos(Integer maxMinutos) {
        this.maxMinutos = maxMinutos;
    }

    public Long getHoraFestivoDesde() {
        return horaFestivoDesde;
    }

    public void setHoraFestivoDesde(Long horaFestivoDesde) {
        this.horaFestivoDesde = horaFestivoDesde;
    }

    public Long getHoraFestivoHasta() {
        return horaFestivoHasta;
    }

    public void setHoraFestivoHasta(Long horaFestivoHasta) {
        this.horaFestivoHasta = horaFestivoHasta;
    }

    public Integer getMaxMinutosFestivo() {
        return maxMinutosFestivo;
    }

    public void setMaxMinutosFestivo(Integer maxMinutosFestivo) {
        this.maxMinutosFestivo = maxMinutosFestivo;
    }

    public Long getHoraFinSemanaDesde() {
        return horaFinSemanaDesde;
    }

    public void setHoraFinSemanaDesde(Long horaFinSemanaDesde) {
        this.horaFinSemanaDesde = horaFinSemanaDesde;
    }

    public Long getHoraFinSemanaHasta() {
        return horaFinSemanaHasta;
    }

    public void setHoraFinSemanaHasta(Long horaFinSemanaHasta) {
        this.horaFinSemanaHasta = horaFinSemanaHasta;
    }

    public Integer getMaxMinutosFinSemana() {
        return maxMinutosFinSemana;
    }

    public void setMaxMinutosFinSemana(Integer maxMinutosFinSemana) {
        this.maxMinutosFinSemana = maxMinutosFinSemana;
    }

    public boolean getEliminado() {
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}

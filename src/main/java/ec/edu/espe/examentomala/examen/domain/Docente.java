package ec.edu.espe.examentomala.examen.domain;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Version;

@Getter
@Setter
@Entity
@Table(name = "DOCENTE")
public class Docente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_DOCENTE", nullable = false)
    private Integer codDocente;

    @Column(name = "CEDULA", nullable = false, length = 8)
    private String cedula;

    @Column(name = "NOMBRE", nullable = false, length = 100)
    private String nombre;

    @Column(name = "FECHA_INGRESO", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaIngreso;

    @Column(name = "TITULO", nullable = false, length = 100)
    private String titulo;

    @Version
    private Long version;

    public Docente() {
    }

    public Docente(Integer codDocente) {
        this.codDocente = codDocente;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codDocente == null) ? 0 : codDocente.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Docente other = (Docente) obj;
        if (codDocente == null) {
            if (other.codDocente != null)
                return false;
        } else if (!codDocente.equals(other.codDocente))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Docente [codDocente=" + codDocente + ", cedula=" + cedula + ", nombre=" + nombre + ", fechaIngreso="
                + fechaIngreso + ", titulo=" + titulo + ", version=" + version + "]";
    }

    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos.definiciones;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ngochez
 */
@Entity
@Table(name = "libro_diario", catalog = "contabilidad", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LibroDiario.findAll", query = "SELECT l FROM LibroDiario l")
    , @NamedQuery(name = "LibroDiario.findByIdLibroDiario", query = "SELECT l FROM LibroDiario l WHERE l.idLibroDiario = :idLibroDiario")
    , @NamedQuery(name = "LibroDiario.findByTotal", query = "SELECT l FROM LibroDiario l WHERE l.total = :total")
    , @NamedQuery(name = "LibroDiario.findByFecha", query = "SELECT l FROM LibroDiario l WHERE l.fecha = :fecha")
    , @NamedQuery(name = "LibroDiario.findByConcepto", query = "SELECT l FROM LibroDiario l WHERE l.concepto = :concepto")
    , @NamedQuery(name = "LibroDiario.findByTipoLibroDiario", query = "SELECT l FROM LibroDiario l WHERE l.tipoLibroDiario = :tipoLibroDiario")})
public class LibroDiario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_libro_diario", nullable = false)
    private Integer idLibroDiario;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "total", precision = 9, scale = 2)
    private Double total;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "concepto", length = 2147483647)
    private String concepto;
    @Column(name = "tipo_libro_diario")
    private Boolean tipoLibroDiario;
    @OneToMany(mappedBy = "idLibroDiario")
    private List<Transaccion> transaccionList;

    public LibroDiario() {
    }

    public LibroDiario(Integer idLibroDiario) {
        this.idLibroDiario = idLibroDiario;
    }

    public Integer getIdLibroDiario() {
        return idLibroDiario;
    }

    public void setIdLibroDiario(Integer idLibroDiario) {
        this.idLibroDiario = idLibroDiario;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Boolean getTipoLibroDiario() {
        return tipoLibroDiario;
    }

    public void setTipoLibroDiario(Boolean tipoLibroDiario) {
        this.tipoLibroDiario = tipoLibroDiario;
    }

    @XmlTransient
    public List<Transaccion> getTransaccionList() {
        return transaccionList;
    }

    public void setTransaccionList(List<Transaccion> transaccionList) {
        this.transaccionList = transaccionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLibroDiario != null ? idLibroDiario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LibroDiario)) {
            return false;
        }
        LibroDiario other = (LibroDiario) object;
        if ((this.idLibroDiario == null && other.idLibroDiario != null) || (this.idLibroDiario != null && !this.idLibroDiario.equals(other.idLibroDiario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "datos.definiciones.LibroDiario[ idLibroDiario=" + idLibroDiario + " ]";
    }
    
}

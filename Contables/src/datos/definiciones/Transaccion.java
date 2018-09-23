/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos.definiciones;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ngochez
 */
@Entity
@Table(name = "transaccion", catalog = "contabilidad", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Transaccion.findAll", query = "SELECT t FROM Transaccion t")
    , @NamedQuery(name = "Transaccion.findByIdTransaccion", query = "SELECT t FROM Transaccion t WHERE t.idTransaccion = :idTransaccion")
    , @NamedQuery(name = "Transaccion.findByCargo", query = "SELECT t FROM Transaccion t WHERE t.cargo = :cargo")
    , @NamedQuery(name = "Transaccion.findByTipoValor", query = "SELECT t FROM Transaccion t WHERE t.tipoValor = :tipoValor")
    , @NamedQuery(name = "Transaccion.findByAbono", query = "SELECT t FROM Transaccion t WHERE t.abono = :abono")})
public class Transaccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_transaccion", nullable = false)
    private Integer idTransaccion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "cargo", precision = 9, scale = 2)
    private Double cargo;
    @Basic(optional = false)
    @Column(name = "tipo_valor", nullable = false)
    private boolean tipoValor;
    @Column(name = "abono", precision = 9, scale = 2)
    private Double abono;
    @JoinColumn(name = "id_cuenta", referencedColumnName = "id_cuenta")
    @ManyToOne
    private Cuenta idCuenta;
    @JoinColumn(name = "id_libro_diario", referencedColumnName = "id_libro_diario")
    @ManyToOne
    private LibroDiario idLibroDiario;

    public Transaccion() {
    }

    public Transaccion(Integer idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public Transaccion(Integer idTransaccion, boolean tipoValor) {
        this.idTransaccion = idTransaccion;
        this.tipoValor = tipoValor;
    }

    public Integer getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(Integer idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public Double getCargo() {
        return cargo;
    }

    public void setCargo(Double cargo) {
        this.cargo = cargo;
    }

    public boolean getTipoValor() {
        return tipoValor;
    }

    public void setTipoValor(boolean tipoValor) {
        this.tipoValor = tipoValor;
    }

    public Double getAbono() {
        return abono;
    }

    public void setAbono(Double abono) {
        this.abono = abono;
    }

    public Cuenta getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(Cuenta idCuenta) {
        this.idCuenta = idCuenta;
    }

    public LibroDiario getIdLibroDiario() {
        return idLibroDiario;
    }

    public void setIdLibroDiario(LibroDiario idLibroDiario) {
        this.idLibroDiario = idLibroDiario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTransaccion != null ? idTransaccion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transaccion)) {
            return false;
        }
        Transaccion other = (Transaccion) object;
        if ((this.idTransaccion == null && other.idTransaccion != null) || (this.idTransaccion != null && !this.idTransaccion.equals(other.idTransaccion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "datos.definiciones.Transaccion[ idTransaccion=" + idTransaccion + " ]";
    }
    
}

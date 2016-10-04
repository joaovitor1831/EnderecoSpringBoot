
package br.com.trabalho.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author joao vitor
 */
@Entity
@Table
public class Logradouro implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String rua;
    private String avenidas;
    private String alamedas;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_bairro")
    private Bairro bairro;
    
    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_logradouro")
    private List<Endereco> endereco;
    
    
    public Logradouro(){
        this.endereco = new ArrayList<>();
    }

    public Logradouro(String rua, String avenidas, String alamedas) {
        this();
        this.rua = rua;
        this.avenidas = avenidas;
        this.alamedas = alamedas;
    }
    
    
    
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getAvenidas() {
        return avenidas;
    }

    public void setAvenidas(String avenidas) {
        this.avenidas = avenidas;
    }

    public String getAlamedas() {
        return alamedas;
    }

    public void setAlamedas(String alamedas) {
        this.alamedas = alamedas;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public List<Endereco> getEndereco() {
        return endereco;
    }

    public void setEndereco(List<Endereco> endereco) {
        this.endereco = endereco;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.id);
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
        final Logradouro other = (Logradouro) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
    
}

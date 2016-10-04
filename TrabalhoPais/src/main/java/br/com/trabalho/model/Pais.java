package br.com.trabalho.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author joao vitor
 */
@Entity
@Table(name = "pais")
public class Pais implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String local;
    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_pais")
    private List<Estado> estado;
    
    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_pais")
    private Set<Endereco> endereco;
    
    
    public Pais(){
        this.estado = new ArrayList<>();
        this.endereco = new HashSet<>();       
    }

    public Pais(String nome, String local) {
        this();
        this.nome = nome;
        this.local = local;
    }
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public List<Estado> getEstado() {
        return estado;
    }

    public void setEstado(List<Estado> estado) {
        this.estado = estado;
    }

    public Set<Endereco> getEndereco() {
        return endereco;
    }

    public void setEndereco(Set<Endereco> endereco) {
        this.endereco = endereco;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.id);
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
        final Pais other = (Pais) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
   
}

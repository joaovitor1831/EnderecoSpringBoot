package br.com.trabalho.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
public class Cidade implements Serializable {
    
    @Id
    private Long id;
    private String nome;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_estado")
    private Estado estado;
    
   @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.MERGE)
   @JoinColumn(name = "id_cidade")
   private List<Bairro> bairro;
    
    
   @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.MERGE)
   @JoinColumn(name = "id_cidade")
   private Set<Endereco> endereco;

   
   public Cidade(){
     
       this.endereco = new HashSet<>();    
   }

    public Cidade(String nome) {
        this();
        this.nome = nome;
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

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
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
        hash = 23 * hash + Objects.hashCode(this.id);
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
        final Cidade other = (Cidade) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    
   
   
   
   
   
   
   
   
   
    
    
}

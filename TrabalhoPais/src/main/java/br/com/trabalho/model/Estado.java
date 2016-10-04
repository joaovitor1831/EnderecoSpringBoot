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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 *
 * @author joao vitor
 */
@Entity
@Table(name = "estado")
public class Estado implements Serializable {

   @Id 
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String nome;
   
   @ManyToOne(fetch = FetchType.EAGER)
   @JoinColumn(name = "id_pais")
   private Pais pais;
   
   @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.MERGE)
   @JoinColumn(name = "id_estado")
   private List<Cidade> cidade;

    
   @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.MERGE)
   @JoinColumn(name = "id_estado")
   private Set<Endereco> endereco;

   public Estado(){
       this.cidade = new ArrayList<>();
       this.endereco = new HashSet<>();
       
   }

    public Estado(String nome) {
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

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public Set<Endereco> getEndereco() {
        return endereco;
    }

    public void setEndereco(Set<Endereco> endereco) {
        this.endereco = endereco;
    }

    public List<Cidade> getCidade() {
        return cidade;
    }

    public void setCidade(List<Cidade> cidade) {
        this.cidade = cidade;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.id);
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
        final Estado other = (Estado) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
   
   
   
    
   
   
   
   
   
    
    
}

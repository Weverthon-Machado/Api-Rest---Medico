package demoApplication.medico;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.PrePersist;
import java.util.UUID;

@Entity
@Table(name = "medicos")
public class Medico {

    @Id
    private UUID id;  // O UUID será gerado automaticamente

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String especialidade;

    @Column(nullable = false, unique = true)
    private String crm;  // Registro do CRM (Conselho Regional de Medicina)

    @Column(nullable = false, unique = true)
    private String email; // Email do médico

    // Método para gerar o UUID automaticamente antes de persistir
    @PrePersist
    public void prePersist() {
        if (id == null) {
            id = UUID.randomUUID();  // Gera o UUID automaticamente se não existir
        }
    }

    // Getters e Setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

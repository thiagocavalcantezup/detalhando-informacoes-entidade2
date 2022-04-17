package br.com.zup.handora.detalhandoinformacoesentidade2.models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.PastOrPresent;

import org.hibernate.validator.constraints.br.CPF;

@Entity
@Table(name = "pessoas")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    @PastOrPresent
    private LocalDate dataNascimento;

    @Column(nullable = false)
    private String apelido;

    @Column(nullable = false)
    @CPF
    private String cpf;

    /**
     * @deprecated Construtor de uso exclusivo do Hibernate
     */
    @Deprecated
    public Pessoa() {}

    public Pessoa(String nome, @PastOrPresent LocalDate dataNascimento, String apelido,
                  @CPF String cpf) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.apelido = apelido;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getApelido() {
        return apelido;
    }

    public String getCpf() {
        return cpf;
    }

}

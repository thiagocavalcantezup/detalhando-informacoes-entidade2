package br.com.zup.handora.detalhandoinformacoesentidade2.models;

import java.time.LocalDate;

public class PessoaResponseDTO {

    private String nome;
    private LocalDate dataNascimento;
    private String apelido;
    private String cpf;

    public PessoaResponseDTO() {}

    public PessoaResponseDTO(Pessoa pessoa) {
        this.nome = pessoa.getNome();
        this.dataNascimento = pessoa.getDataNascimento();
        this.apelido = pessoa.getApelido();
        this.cpf = pessoa.getCpf();
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

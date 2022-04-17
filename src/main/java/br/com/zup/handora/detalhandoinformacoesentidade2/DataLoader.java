package br.com.zup.handora.detalhandoinformacoesentidade2;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import br.com.zup.handora.detalhandoinformacoesentidade2.models.Pessoa;
import br.com.zup.handora.detalhandoinformacoesentidade2.repositories.PessoaRepository;

@Component
public class DataLoader implements CommandLineRunner {

    private final PessoaRepository pessoaRepository;

    public DataLoader(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Pessoa pessoa = new Pessoa("Thiago", LocalDate.of(1991, 1, 1), "Thi", "594.529.570-18");

        pessoaRepository.save(pessoa);
    }

}

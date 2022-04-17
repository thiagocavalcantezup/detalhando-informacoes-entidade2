package br.com.zup.handora.detalhandoinformacoesentidade2.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import br.com.zup.handora.detalhandoinformacoesentidade2.models.Pessoa;
import br.com.zup.handora.detalhandoinformacoesentidade2.models.PessoaResponseDTO;
import br.com.zup.handora.detalhandoinformacoesentidade2.repositories.PessoaRepository;

@RestController
@RequestMapping(PessoaController.BASE_URI)
public class PessoaController {

    public final static String BASE_URI = "/pessoas";

    private final PessoaRepository pessoaRepository;

    public PessoaController(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    @GetMapping("/{id}")
    public ResponseEntity<PessoaResponseDTO> show(@PathVariable Long id) {
        Pessoa pessoa = pessoaRepository.findById(id)
                                        .orElseThrow(
                                            () -> new ResponseStatusException(
                                                HttpStatus.NOT_FOUND,
                                                "Não existe uma pessoa com o id informado."
                                            )
                                        );

        return ResponseEntity.ok(new PessoaResponseDTO(pessoa));
    }

}

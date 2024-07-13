package br.com.filmes.screenMatchFrases.service;

import br.com.filmes.screenMatchFrases.dto.FraseDTO;
import br.com.filmes.screenMatchFrases.model.Frase;
import br.com.filmes.screenMatchFrases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {
    @Autowired
    private FraseRepository repositorio;
    public FraseDTO obterFraseAleatoria() {
        Frase frase = repositorio.buscaFraseAleatoria();
        return new FraseDTO(frase.getTitulo(),
                frase.getFrase(),
                frase.getPersonagem(),
                frase.getPoster());
    }
}

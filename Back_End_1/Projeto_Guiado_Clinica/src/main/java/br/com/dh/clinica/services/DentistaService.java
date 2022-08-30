package br.com.dh.clinica.services;

import br.com.dh.clinica.dtos.DentistaDto;
import br.com.dh.clinica.entities.Dentista;
import br.com.dh.clinica.repositories.DentistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
// Minha classe vai acesasr repositories e repositories vai acessar serv
public class DentistaService {

    @Autowired
    private DentistaRepository repository;

    public List<DentistaDto> buscarTodos() {
        List<Dentista> list = repository.findAll();
        return list.stream().map(x->new DentistaDto(x)).collect(Collectors.toList());
    }

}

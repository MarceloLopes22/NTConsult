package com.api.votos.ntconsult.servico.impl;

import com.api.votos.ntconsult.basicas.Associado;
import com.api.votos.ntconsult.repositorio.AssociadoRepositorio;
import com.api.votos.ntconsult.servico.AssociadoServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class AssociadoServicoImpl implements AssociadoServico {

    @Autowired
    private AssociadoRepositorio repositorio;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Associado salvar(Associado associado) {
        return repositorio.save(associado);
    }

    @Override
    public List<Associado> listar() {
        return repositorio.findAll();
    }

    @Override
    public Associado buscarPorId(Long id) {
        Associado associado = null;
        Optional<Associado> optionalAssociado = repositorio.findById(id);

        if (optionalAssociado.isPresent()) {
            associado = optionalAssociado.get();
        }

        return associado;
    }

    @Override
    public Associado pesquisarAssociadoPorCpf(String cpf) {
        return repositorio.findAssociadoByCpf(cpf);
    }
}

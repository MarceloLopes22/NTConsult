package com.api.votos.ntconsult.servico;

import com.api.votos.ntconsult.basicas.Associado;

import java.util.List;

public interface AssociadoServico {

    Associado salvar(Associado associado);

    List<Associado> listar();

    Associado buscarPorId(Long id);

    Associado pesquisarAssociadoPorCpf(String cpf);
}

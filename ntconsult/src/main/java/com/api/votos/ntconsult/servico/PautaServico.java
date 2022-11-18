package com.api.votos.ntconsult.servico;

import com.api.votos.ntconsult.basicas.Pauta;

import java.util.List;

public interface PautaServico {

    Pauta salvar(Pauta pauta);

    List<Pauta> listar();

    Pauta buscarPorId(Long id);

    List<Pauta> consultarPautasExpiradas();
}

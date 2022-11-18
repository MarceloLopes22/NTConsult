package com.api.votos.ntconsult.servico;

import com.api.votos.ntconsult.basicas.Sessao;

import java.util.List;

public interface SessaoServico {

    Sessao salvar(Sessao sessao);

    List<Sessao> listar();

    Sessao buscarPorId(Long id);
}

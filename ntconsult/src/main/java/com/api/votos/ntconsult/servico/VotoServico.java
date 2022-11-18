package com.api.votos.ntconsult.servico;

import com.api.votos.ntconsult.basicas.Voto;
import com.api.votos.ntconsult.dto.ResponseDTO;
import com.api.votos.ntconsult.dto.VotoRequestDTO;
import com.api.votos.ntconsult.enums.TipoVoto;

import java.util.List;

public interface VotoServico {

    ResponseDTO votar(VotoRequestDTO votoRequestDTO);

    List<Voto> listar();

    Voto buscarPorId(Long id);

    Integer contabilizarVotos(TipoVoto tipoVoto, Long pautaId);
}

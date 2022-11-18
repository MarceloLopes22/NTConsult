package com.api.votos.ntconsult.dto;

import com.api.votos.ntconsult.basicas.Pauta;
import lombok.Data;

@Data
public class ContabilizarVotosDTO {

    private Pauta pauta;
    private Integer qtdVotosSim;
    private Integer qtdVotosNao;
}

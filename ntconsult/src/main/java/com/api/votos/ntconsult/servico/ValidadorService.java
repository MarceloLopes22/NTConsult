package com.api.votos.ntconsult.servico;

import com.api.votos.ntconsult.enums.Status;

public interface ValidadorService {

    Status isCPFValido(String cpf);
}

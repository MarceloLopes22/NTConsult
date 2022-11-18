package com.api.votos.ntconsult.repositorio;

import com.api.votos.ntconsult.basicas.Associado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssociadoRepositorio extends JpaRepository<Associado, Long> {

    Associado findAssociadoByCpf(String cpf);
}

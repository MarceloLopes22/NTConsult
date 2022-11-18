package com.api.votos.ntconsult.repositorio;

import com.api.votos.ntconsult.basicas.Sessao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessaoRepositorio extends JpaRepository<Sessao, Long> {
}

package com.api.votos.ntconsult.dto;

import com.api.votos.ntconsult.basicas.Voto;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VotoRequestDTO {
    private Voto voto;
}

package med._con.api.domain.consuta;

import java.time.LocalDateTime;

public record DadosDetalhamentoConsulta(Long id, Long idMedico, Long idPacienet , LocalDateTime data) {
}

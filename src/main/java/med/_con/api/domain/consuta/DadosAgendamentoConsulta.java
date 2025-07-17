package med._con.api.domain.consuta;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import med._con.api.domain.medico.Especialidade;

import java.time.LocalDateTime;

public record DadosAgendamentoConsulta(


        Long idMedico,

        @NotNull
        Long idPaciente,

        @NotNull
        @Future
        LocalDateTime data,

        Especialidade especialidade
) {
}

package med._con.api.domain.paciente;

import jakarta.validation.constraints.NotNull;
import med._con.api.domain.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {

}

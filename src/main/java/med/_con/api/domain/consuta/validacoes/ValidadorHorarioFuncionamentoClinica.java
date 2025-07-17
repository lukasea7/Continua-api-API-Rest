package med._con.api.domain.consuta.validacoes;

import med._con.api.domain.ValidacaoException;
import med._con.api.domain.consuta.DadosAgendamentoConsulta;
import med._con.api.domain.consuta.DadosDetalhamentoConsulta;
import org.springframework.stereotype.Component;

import java.time.DayOfWeek;
@Component
public class ValidadorHorarioFuncionamentoClinica implements ValidadorAgendamentoDeConsulta {

    public void validar(DadosAgendamentoConsulta dados){
        var dataConsulta = dados.data();

        var domingo = dataConsulta.getDayOfWeek().equals(DayOfWeek.SUNDAY);
        var antesDaAberturaDaClinica = dataConsulta.getHour() < 7;
        var depoisEncerramentoDaClinica = dataConsulta.getHour() > 18;

        if (domingo || antesDaAberturaDaClinica || depoisEncerramentoDaClinica){
            throw new ValidacaoException("Consulta fora do horario de funcionamentto da clinica");
        }

    }
}

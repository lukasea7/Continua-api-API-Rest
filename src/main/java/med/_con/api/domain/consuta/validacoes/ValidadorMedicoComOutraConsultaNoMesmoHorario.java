package med._con.api.domain.consuta.validacoes;

import med._con.api.domain.ValidacaoException;
import med._con.api.domain.consuta.ConsultaRepository;
import med._con.api.domain.consuta.DadosAgendamentoConsulta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidadorMedicoComOutraConsultaNoMesmoHorario implements ValidadorAgendamentoDeConsulta {

    @Autowired
    private ConsultaRepository repository;

    public void validar(DadosAgendamentoConsulta dados){
        var medicoPossuiOutraConsultaNoMesmoHorario = repository.existsByMedicoIdAndData(dados.idMedico(),dados.data());
        if (medicoPossuiOutraConsultaNoMesmoHorario){
            throw new ValidacaoException("édico já possui outra consulta agendada nesse mesmo horário");
        }
    }
}

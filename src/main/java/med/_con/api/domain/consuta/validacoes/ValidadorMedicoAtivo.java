package med._con.api.domain.consuta.validacoes;

import med._con.api.domain.ValidacaoException;
import med._con.api.domain.consuta.DadosAgendamentoConsulta;
import med._con.api.domain.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidadorMedicoAtivo implements ValidadorAgendamentoDeConsulta {

    @Autowired
    private MedicoRepository repository;

    public void validar (DadosAgendamentoConsulta dados){

        if (dados.idMedico() == null){
            return;
        }

        var medicoEstaAtivo = repository.findAtivoById(dados.idMedico());
        if (!medicoEstaAtivo){
            throw new ValidacaoException("cnsulta não pode ser agendada com médico excluído");
        }

    }
}

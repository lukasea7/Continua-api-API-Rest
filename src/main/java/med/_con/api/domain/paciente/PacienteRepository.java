package med._con.api.domain.paciente;

import jakarta.validation.constraints.NotNull;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PacienteRepository extends JpaRepository <Paciente, Long> {

    Page<Paciente> findAllByAtivoTrue(Pageable paginacao);


    boolean findAtivoById(Long id);
}

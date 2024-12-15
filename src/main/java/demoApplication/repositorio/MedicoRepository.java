package demoApplication.repositorio;
import demoApplication.medico.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface MedicoRepository extends JpaRepository<Medico, UUID> {

}

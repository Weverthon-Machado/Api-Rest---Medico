package demoApplication.service;

import demoApplication.medico.Medico;
import demoApplication.repositorio.MedicoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class MedicoService {

    private final MedicoRepository medicoRepository;

    public MedicoService(MedicoRepository medicoRepository) {
        this.medicoRepository = medicoRepository;
    }

    public Medico salvar(Medico medico) {
        return medicoRepository.save(medico);  // Usando o repositório para salvar o médico no banco de dados
    }

    public List<Medico> listarTodos() {
        return medicoRepository.findAll();
    }

    public Optional<Medico> buscarPorId(UUID id) {
        return medicoRepository.findById(id);  // Método para buscar por ID
    }

    public void deletar(UUID id) {
        medicoRepository.deleteById(id);  // Método para deletar por ID
    }
}

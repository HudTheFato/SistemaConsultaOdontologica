package repository;

import model.Paciente;
import java.util.ArrayList;
import java.util.List;

public class PacienteRepository {
    private List<Paciente> pacientes = new ArrayList<>();

    public void adicionarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public List<Paciente> listarPacientes() {
        return pacientes;
    }
}
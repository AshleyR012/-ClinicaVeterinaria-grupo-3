package clinicaveterinaria.interfaces;

import java.util.List;

import clinicaveterinaria.model.Cita;

public interface ICitaService {
    void crearCita(Cita cita);
    Cita obtenerCita(int id);
    void actualizarCita(Cita cita);
    void eliminarCita(int id);
    List<Cita> listarCitas();
}

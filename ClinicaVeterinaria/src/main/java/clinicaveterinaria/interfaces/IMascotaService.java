package clinicaveterinaria.interfaces;

import java.util.List;

import clinicaveterinaria.model.Mascota;

public interface IMascotaService {
    void crearMascota(Mascota mascota);
    Mascota obtenerMascota(int id);
    void actualizarMascota(Mascota mascota);
    void eliminarMascota(int id);
    List<Mascota> listarMascotas();
}

package clinicaveterinaria.service;

import clinicaveterinaria.interfaces.IMascotaService;
import clinicaveterinaria.model.Mascota;
import clinicaveterinaria.repository.BaseDatos;

import java.util.List;

public class MascotaService implements IMascotaService {
    private final BaseDatos baseDatos;

    public MascotaService(BaseDatos baseDatos) {
        this.baseDatos = baseDatos;
    }

    @Override 
    public void crearMascota(Mascota mascota) {
        baseDatos.getMascotas().add(mascota);
        baseDatos.registrarOperacion("crearMascota");
    }

    @Override
    public Mascota obtenerMascota(int id) {
        for (Mascota mascota : baseDatos.getMascotas()) {
            if (mascota.getId() == id) {
                return mascota;
            }
        }
        return null;
    }
 
    @Override
    public void actualizarMascota(Mascota mascota) {
        eliminarMascota(mascota.getId());
        crearMascota(mascota);
    }

    @Override
    public void eliminarMascota(int id) {
        baseDatos.getMascotas().removeIf(mascota -> mascota.getId() == id);
        baseDatos.registrarOperacion("eliminarMascota");
    }

    @Override
    public List<Mascota> listarMascotas() {
        return baseDatos.getMascotas();
    }
}

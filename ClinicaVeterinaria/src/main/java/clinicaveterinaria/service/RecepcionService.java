package clinicaveterinaria.service;

import clinicaveterinaria.interfaces.ICitaService;
import clinicaveterinaria.interfaces.IMascotaService;
import clinicaveterinaria.model.Cita;
import clinicaveterinaria.model.Mascota;


public class RecepcionService {
    private final IMascotaService mascotaService;
    private final ICitaService citaService;

    public RecepcionService(IMascotaService mascotaService, ICitaService citaService) {
        this.mascotaService = mascotaService;
        this.citaService = citaService;
    }

    public void crearMascota(Mascota mascota) {
        mascotaService.crearMascota(mascota);
    }

    public Mascota obtenerMascota(int id) {
        return mascotaService.obtenerMascota(id);
    }

    public void actualizarMascota(Mascota mascota) {
        mascotaService.actualizarMascota(mascota);
    }

    public void eliminarMascota(int id) {
        mascotaService.eliminarMascota(id);
    }

    public void crearCita(Cita cita) {
        citaService.crearCita(cita);
    }

    public Cita obtenerCita(int id) {
        return citaService.obtenerCita(id);
    }

    public void cancelarCita(int id) {
        citaService.eliminarCita(id);
    }
}
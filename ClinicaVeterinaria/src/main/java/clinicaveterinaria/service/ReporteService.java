package clinicaveterinaria.service;

import clinicaveterinaria.interfaces.IReporteService;
import clinicaveterinaria.model.Cita;
import clinicaveterinaria.model.Factura;
import clinicaveterinaria.model.Mascota;
import clinicaveterinaria.repository.BaseDatos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ReporteService implements IReporteService {
    private final BaseDatos baseDatos;

    public ReporteService(BaseDatos baseDatos) {
        this.baseDatos = baseDatos;
    }

    @Override 
    public List<Cita> generarReporteCitasPorVeterinario(int veterinarioId) {
        List<Cita> resultado = new ArrayList<>();
        for (Cita cita : baseDatos.getCitas()) {
            if (cita.getVeterinario().getId() == veterinarioId) {
                resultado.add(cita);
            }
        }
        return resultado;
    }

    @Override
    public List<Mascota> generarReporteMascotasPorDueno(String duenoNombre) {
        List<Mascota> resultado = new ArrayList<>();
        for (Mascota mascota : baseDatos.getMascotas()) {
            if (mascota.getDueno().equalsIgnoreCase(duenoNombre)) {
                resultado.add(mascota);
            }
        }
        return resultado;
    }

    @Override
    public double calcularIngresosMensual() {
        double total = 0;
        int mesActual = LocalDate.now().getMonthValue();
        int anioActual = LocalDate.now().getYear();
        for (Factura factura : baseDatos.getFacturas()) {
            if (factura.isPagada()
                    && factura.getFecha().getMonthValue() == mesActual
                    && factura.getFecha().getYear() == anioActual) {
                total += factura.getMonto();
            }
        }
        return total;
    }

    @Override
    public String crearReporte(Veterinario veterinario, Cita cita) {
        return "Reporte: " + veterinario.getNombre() + " atendio a " +
                cita.getMascota().getNombre() + " con diagnostico " + cita.getDiagnostico();
    }
}

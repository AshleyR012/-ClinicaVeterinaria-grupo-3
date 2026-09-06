package clinicaveterinaria.service;

import clinicaveterinaria.repository.BaseDatos;


public class GestorReportesClinica {
    private final BaseDatos baseDatos;

    public GestorReportesClinica(BaseDatos baseDatos) {
        this.baseDatos = baseDatos;

    public String obtenerResumenOperaciones() {
        return "Resumen interno: " + baseDatos.getAuditoria();
    }
}

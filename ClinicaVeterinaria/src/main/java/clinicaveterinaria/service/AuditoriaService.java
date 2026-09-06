package clinicaveterinaria.service;

import java.util.HashMap;
import java.util.Map;

public class AuditoriaService {
    // Aquí traemos el mapa que quitaste de BaseDatos
    private final Map<String, Integer> auditoria = new HashMap<>();

    public void registrarOperacion(String nombre) {
        auditoria.put(nombre, auditoria.getOrDefault(nombre, 0) + 1);
    }

    public Map<String, Integer> getAuditoria() {
        return auditoria;
    }
}
   

    


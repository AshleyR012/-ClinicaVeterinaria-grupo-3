# -ClinicaVeterinaria-grupo-3
# Integrante 1:(SRP)

Durante esta fase, se refactorizó el código para asegurar que cada clase tenga una única razón para cambiar, eliminando la mezcla de responsabilidades.

* Veterinario.java: Se extrajo toda la lógica de negocio (métodos como reservarCita, diagnosticar, generarFactura y crearReporte). La clase ahora funciona exclusivamente como un modelo de datos puro (conteniendo solo atributos, constructor, getters, setters y métodos base).

* BaseDatos.java Se eliminó la lógica ajena al almacenamiento de datos. El cálculo de ingresos mensuales se trasladó a `ReporteService`.

* **Creación de `AuditoriaService.java`:** Se delegó el registro de operaciones (mapa de auditoría) a este nuevo servicio dedicado, quitándole esa carga a la clase de base de datos.

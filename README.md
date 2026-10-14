# -ClinicaVeterinaria-grupo-3

# Integrante 1:(SRP)

Durante esta fase, se refactorizó el código para asegurar que cada clase tenga una única razón para cambiar, eliminando la mezcla de responsabilidades.

* Veterinario.java: Se extrajo toda la lógica de negocio (métodos como reservarCita, diagnosticar, generarFactura y crearReporte). La clase ahora funciona exclusivamente como un modelo de datos puro (conteniendo solo atributos, constructor, getters, setters y métodos base).

* BaseDatos.java Se eliminó la lógica ajena al almacenamiento de datos. El cálculo de ingresos mensuales se trasladó a `ReporteService`.

* **Creación de `AuditoriaService.java`:** Se delegó el registro de operaciones (mapa de auditoría) a este nuevo servicio dedicado, quitándole esa carga a la clase de base de datos.

**Integrante 2: OSP** 
 + Añadi una clase para cada tratamiento existente
 + Cambie la funcionalidad de TratamientoService para que trabaje con la interfaz, ahora se podra añadir otro tratamiento unicamente creando otra clase.



**Integrante 4 - DIP/ISP**
+ La interfaz IClinicaService tenia muchos métodos que no usaba, la solución fue dividirla en varias interfaces pequeñas y ordenadas. Así, interfaz utilizaba los métodos que le corresponde.
+ Las clases Clinica Y GestorReportesClinica creaban sus propias dependencias internas directamente utilizando la orden new. Entonces se cambio eso para que reciban sus dependencias desde el exterior a través de sus propios constructores.




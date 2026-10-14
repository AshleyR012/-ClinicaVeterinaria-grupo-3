package clinicaveterinaria.interfaces;

import java.util.List;

import clinicaveterinaria.model.Factura;

public interface IFactureService {
    void crearFactura(Factura factura);
    Factura obtenerFactura(int id);
    void actualizarFactura(Factura factura);
    void eliminarFactura(int id);
    void pagarFactura(int id);
    List<Factura> listarFacturas();
}

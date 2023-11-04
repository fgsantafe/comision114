package edu.ap4t2.model.clase3.app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import edu.ap4t2.model.clase3.model.Cliente;
import edu.ap4t2.model.clase3.model.Factura;
import edu.ap4t2.model.clase3.model.TipoCompra;

public class StreamApp {

  private static List<Factura> initializeData() {
    List<Factura> lista = new ArrayList<>();
    Factura f1 = new Factura();
    f1.setId(1);
    f1.setConcepto("Detergente CIF Té Verde");
    f1.setMonto(1000.20d);
    f1.setTipoCompra(TipoCompra.ALMACEN);
    f1.setCliente(new Cliente());
    f1.getCliente().setApellido("Gauna");
    f1.getCliente().setNombre("Rodolfo");
    f1.getCliente().setCuit("20-45689652-4");
    f1.getCliente().setId(5);
    f1.getCliente().setFechaNac(LocalDate.of(1980, 10, 27));

    lista.add(f1);

    f1 = new Factura();
    f1.setId(2);
    f1.setConcepto("Omeprazol 50mg");
    f1.setMonto(1500.00d);
    f1.setTipoCompra(TipoCompra.FARMACIA);
    f1.setCliente(new Cliente());
    f1.getCliente().setApellido("Estevanez");
    f1.getCliente().setNombre("Lucía");
    f1.getCliente().setCuit("20-15879879-4");
    f1.getCliente().setId(7);
    f1.getCliente().setFechaNac(LocalDate.of(1975, 7, 28));

    lista.add(f1);

    f1 = new Factura();
    f1.setId(3);
    f1.setConcepto("Frutillas x kg");
    f1.setMonto(1250.99d);
    f1.setTipoCompra(TipoCompra.VERDULERIA);
    f1.setCliente(new Cliente());
    f1.getCliente().setApellido("Estevanez");
    f1.getCliente().setNombre("Lucía");
    f1.getCliente().setCuit("20-15879879-4");
    f1.getCliente().setId(7);
    f1.getCliente().setFechaNac(LocalDate.of(1975, 7, 28));

    lista.add(f1);

    f1 = new Factura();
    f1.setId(4);
    f1.setConcepto("Durazno Moño Azul x kg");
    f1.setMonto(1250.99d);
    f1.setTipoCompra(TipoCompra.VERDULERIA);
    f1.setCliente(new Cliente());
    f1.getCliente().setApellido("Córdoba");
    f1.getCliente().setNombre("Mauro");
    f1.getCliente().setCuit("21-04586239-7");
    f1.getCliente().setId(15);
    f1.getCliente().setFechaNac(LocalDate.of(1993, 8, 7));

    lista.add(f1);

    f1 = new Factura();
    f1.setId(5);
    f1.setConcepto("Papel Higiénico Higienol x 80 m");
    f1.setMonto(5300.00d);
    f1.setTipoCompra(TipoCompra.ALMACEN);
    f1.setCliente(new Cliente());
    f1.getCliente().setApellido("Martinez");
    f1.getCliente().setNombre("Guadalupe");
    f1.getCliente().setCuit("21-26745963-7");
    f1.getCliente().setId(17);
    f1.getCliente().setFechaNac(LocalDate.of(1995, 3, 27));

    lista.add(f1);

    f1 = new Factura();
    f1.setId(6);
    f1.setConcepto("Papel Higiénico Higienol x 80 m");
    f1.setMonto(5300.00d);
    f1.setTipoCompra(TipoCompra.ALMACEN);
    f1.setCliente(new Cliente());
    f1.getCliente().setApellido("Martinez");
    f1.getCliente().setNombre("Guadalupe");
    f1.getCliente().setCuit("21-26745963-7");
    f1.getCliente().setId(17);
    f1.getCliente().setFechaNac(LocalDate.of(1995, 3, 27));

    lista.add(f1);

    f1 = new Factura();
    f1.setId(7);
    f1.setConcepto("Ibuprofeno 600g");
    f1.setMonto(580.50d);
    f1.setTipoCompra(TipoCompra.FARMACIA);
    f1.setCliente(new Cliente());
    f1.getCliente().setApellido("Martinez");
    f1.getCliente().setNombre("Guadalupe");
    f1.getCliente().setCuit("21-26745963-7");
    f1.getCliente().setId(17);
    f1.getCliente().setFechaNac(LocalDate.of(1995, 3, 27));

    lista.add(f1);

    return lista;
  }

  public static void main(String[] args) {

    List<Factura> facturas = initializeData();

    List<Cliente> clientes = facturas.stream().map(x -> x.getCliente()).distinct().collect(Collectors.toList());

    clientes.stream().map(x -> x.getNombre() + ", " + x.getApellido() + "(edad:" + x.getEdad() + ")")
        .forEach(System.out::println);

    facturas.stream()
        .filter(x -> x.getCliente().getEdad() > 40)
        .forEach(System.out::println);
  }

}

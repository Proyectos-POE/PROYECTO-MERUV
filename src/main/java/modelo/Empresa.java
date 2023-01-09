package modelo;

import dao.*;

import java.io.File;
import java.util.ArrayList;

/*
 * @author Nicolas Herrera <herrera.nicolas@correounivalle.edu.co>
 * @author Samuel Galindo Cuevas <samuel.galindo@correounivalle.edu.co>
 * @author Julian Rendon <julian.david.rendon@correounivalle.edu.co>
 */

public class Empresa
{
    private final String nombre;
    private final ProductoDao productoDao;
    private final ClienteDao clienteDao;
    private final ProveedorDao proveedorDao;
    private final VentaDao ventaDao;
    private final CompraDao compraDao;
    private final Carrito carritoCompra;
    private final Carrito carritoVenta;
    private final Conexion conexion;
    
    public Empresa(String auxNombre)
    {
        this.nombre = auxNombre;
        this.productoDao = new ProductoDao();
        this.clienteDao = new ClienteDao();
        this.proveedorDao = new ProveedorDao();
        this.ventaDao = new VentaDao();
        this.compraDao = new CompraDao();
        this.carritoCompra = new Carrito();
        this.carritoVenta = new Carrito();
        this.conexion = new Conexion(new File("src/main/java/archivos/"));
    }
    
    //----------|Productos|----------//
    public boolean agregarProducto(Producto auxProducto)
    {
        return this.productoDao.anhadirProducto(auxProducto);
    }

    public boolean actualizarProducto(Producto auxProducto)
    {
        return this.productoDao.actualizarProducto(auxProducto);
    }

    public boolean eliminarProducto(Producto auxProducto)
    {
        return this.productoDao.eliminarProducto(auxProducto);
    }

    public ArrayList<Producto> getProductos()
    {
        return this.productoDao.getProductos();
    }

    public Producto getProducto(int auxId)
    {
        return this.productoDao.getProducto(auxId);
    }
    
    //----------|Clientes|----------//
    public boolean agregarCliente(Cliente auxCliente)
    {
        return this.clienteDao.agregarCliente(auxCliente);
    }

    public boolean actualizarCliente(Cliente auxCliente)
    {
        return this.clienteDao.editarCliente(auxCliente);
    }

    public boolean eliminarCliente(Cliente auxCliente)
    {
        return this.clienteDao.eliminarCliente(auxCliente);
    }

    public ArrayList<Cliente> getClientes()
    {
        return this.clienteDao.getClientes();
    }

    public Cliente getCliente(int auxId)
    {
        return this.clienteDao.getCliente(auxId);
    }
    
    //----------|Proveedores|----------//
    public boolean agregarProveedor(Proveedor auxProveedor)
    {
        return this.proveedorDao.anhadirProveedor(auxProveedor);
    }

    public boolean actualizarProveedor(Proveedor auxProveedor)
    {
        return this.proveedorDao.actualizarProveedor(auxProveedor);
    }

    public boolean eliminarProveedor(Proveedor auxProveedor)
    {
        return this.proveedorDao.eliminarProveedor(auxProveedor);
    }

    public ArrayList<Proveedor> getProveedores()
    {
        return this.proveedorDao.getProveedores();
    }

    public Proveedor getProveedor(int auxId)
    {
        return this.proveedorDao.getProveedor(auxId);
    }
    
    //----------|Ventas|----------//
    public boolean agregarVenta(Venta auxVenta)
    {
        return this.ventaDao.anhadirVenta(auxVenta);
    }

    public boolean actualizarVenta(Venta auxVenta)
    {
        return this.ventaDao.actualizarVenta(auxVenta);
    }

    public boolean eliminarVenta(Venta auxVenta)
    {
        return this.ventaDao.eliminarVenta(auxVenta);
    }

    public ArrayList<Venta> getVentas()
    {
        return this.ventaDao.getVentas();
    }

    public Venta getVenta(int auxId)
    {
        return this.ventaDao.getVenta(auxId);
    }
    
    //----------|Compras|----------//
    public boolean agregarCompra(Compra auxCompra)
    {
        return this.compraDao.anhadirCompra(auxCompra);
    }

    public boolean actualizarCompra(Compra auxCompra)
    {
        return this.compraDao.actualizarCompra(auxCompra);
    }

    public boolean eliminarCompra(Compra auxCompra)
    {
        return this.compraDao.eliminarCompra(auxCompra);
    }

    public ArrayList<Compra> getCompras()
    {
        return this.compraDao.getCompras();
    }

    public Compra getCompra(int auxId)
    {
        return this.compraDao.getCompra(auxId);
    }

    //----------|CarritoCompra|----------//
    public ArrayList<Producto> getCarritoCompra()
    {
        return carritoCompra.getCarrito();
    }

    public Producto getProductoCarritoCompra(int auxId)
    {
        return carritoCompra.getProductoCarrito(auxId);
    }

    public boolean agregarProductoCarritoCompra(Producto auxProducto)
    {
        return carritoCompra.agregarProductoCarrito(auxProducto);
    }

    public boolean eliminarProductoCarritoCompra(Producto auxProducto)
    {
        return carritoCompra.eliminarProductoCarrito(auxProducto);
    }

    public void calcularPrecioTotalCompra()
    {
        carritoCompra.calcularPrecioTotalCompra();
    }

    public void calcularProductosTotalesCompra()
    {
        carritoCompra.calcularProductosTotales();
    }

    public double getPrecioTotalCompra()
    {
        return carritoCompra.getPrecioTotal();
    }

    public int getProductosTotalesCompra()
    {
        return carritoCompra.getProductosTotales();
    }

    public void vaciarCarritoCompra()
    {
        carritoCompra.vaciarCarrito();
    }

    //----------|CarritoVenta|----------//
    public ArrayList<Producto> getCarritoVenta()
    {
        return carritoVenta.getCarrito();
    }

    public Producto getProductoCarritoVenta(int auxId)
    {
        return carritoVenta.getProductoCarrito(auxId);
    }

    public boolean agregarProductoCarritoVenta(Producto auxProducto)
    {
        return carritoVenta.agregarProductoCarrito(auxProducto);
    }

    public boolean eliminarProductoCarritoVenta(Producto auxProducto)
    {
        return carritoVenta.eliminarProductoCarrito(auxProducto);
    }

    public void calcularPrecioTotalVenta()
    {
        carritoVenta.calcularPrecioTotalVenta();
    }

    public void calcularProductosTotalesVenta()
    {
        carritoVenta.calcularProductosTotales();
    }

    public double getPrecioTotalVenta()
    {
        return carritoVenta.getPrecioTotal();
    }

    public int getProductosTotalesVenta()
    {
        return carritoVenta.getProductosTotales();
    }

    public void vaciarCarritoVenta()
    {
        carritoVenta.vaciarCarrito();
    }

    //----------|Conexion|----------|
    public void escribirProductos()
    {
        ArrayList auxProductos;
        auxProductos = getProductos();
        conexion.setArchivo("productos.bin");
        conexion.escribirDatosBinario(auxProductos);
    }

    public void escribirClientes()
    {
        ArrayList auxClientes;
        auxClientes = getClientes();
        conexion.setArchivo("clientes.bin");
        conexion.escribirDatosBinario(auxClientes);
    }

    public void escribirProveedores()
    {
        ArrayList auxProveedores;
        auxProveedores = getProveedores();
        conexion.setArchivo("proveedores.bin");
        conexion.escribirDatosBinario(auxProveedores);
    }

    public void escribirVentas()
    {
        ArrayList auxVentas;
        auxVentas = getVentas();
        conexion.setArchivo("ventas.bin");
        conexion.escribirDatosBinario(auxVentas);
    }

    public void escribirCompras()
    {
        ArrayList auxCompras;
        auxCompras = getCompras();
        conexion.setArchivo("compras.bin");
        conexion.escribirDatosBinario(auxCompras);
    }
}

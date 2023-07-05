package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Fabricante;
import tienda.entidades.Producto;

public class DaoProducto extends Dao {

    public void insertProducto(Producto product) throws Exception {
        try {

            if (product == null) {
                throw new Exception("DEBE DE INDICAR EL PRODUCTO A INSERTAR EN LA BASE DE DATOS");
            }

            String sql = "INSERT INTO Producto (nombre, precio, codigo_fabricante) "
                    + "VALUES ( '" + product.getNombre() + "' , "
                    + product.getPrecio() + " , "
                    + product.getFab().getCodigo() + ");";

            insertarModificarEliminar(sql);

        } catch (Exception e) {

            throw e;

        } finally {

            desconectarBase();

        }
    }

    public void updateProduct(Producto product, int opc) throws Exception {
        try {
            String sql;
            switch (opc) {
                case 1:
                    sql = "UPDATE Producto SET nombre = '" + product.getNombre() + "' WHERE codigo = " + product.getCodigo() + ";";
                    break;
                case 2:
                    sql = "UPDATE Producto SET precio = " + product.getPrecio() + " WHERE codigo = " + product.getCodigo() + ";";
                    break;
                case 3:
                    sql = "UPDATE Producto SET codigo_fabricante = " + product.getFab().getCodigo() + " WHERE codigo = " + product.getCodigo() + ";";
                    break;
                default:
                    throw new AssertionError();
            }

            insertarModificarEliminar(sql);

        } catch (Exception e) {
            throw e;
        }
    }
    //Para retornar todos los productos

    public Collection<Producto> selectProduct() throws Exception {

        DaoFabricante dFab = new DaoFabricante();
        try {

            String sql = "SELECT * FROM Producto";

            consultarBase(sql);

            Producto product = null;
            Collection<Producto> products = new ArrayList();

            while (resultado.next()) {

                product = new Producto();
                product.setCodigo(resultado.getInt(1));
                product.setNombre(resultado.getString(2));
                product.setPrecio(resultado.getDouble(3));
                Integer idFab = resultado.getInt(4);
                Fabricante fab = dFab.buscarFabID(idFab);
                product.setFab(fab);

                products.add(product);

            }

            desconectarBase();
            return products;

        } catch (Exception e) {

            throw e;

        }

    }

    public Collection<Producto> productoByPrice() throws Exception {
        DaoFabricante dFab = new DaoFabricante();
        try {
            String sql = "SELECT * FROM Producto WHERE precio BETWEEN 120 AND 202; ";

            consultarBase(sql);

            Producto product = null;
            Collection<Producto> products = new ArrayList();

            while (resultado.next()) {

                product = new Producto();
                product.setCodigo(resultado.getInt(1));
                product.setNombre(resultado.getString(2));
                product.setPrecio(resultado.getDouble(3));
                Integer idFab = resultado.getInt(4);
                Fabricante fab = dFab.buscarFabID(idFab);
                product.setFab(fab);

                products.add(product);

            }
            desconectarBase();
            return products;

        } catch (Exception e) {
            throw e;
        }
    }

    public Collection<Producto> productoByNotebook() throws Exception {
        DaoFabricante dFab = new DaoFabricante();
        try {
            String sql = "SELECT * FROM Producto WHERE nombre like 'Port%'; ";

            consultarBase(sql);

            Producto product = null;
            Collection<Producto> products = new ArrayList();

            while (resultado.next()) {

                product = new Producto();
                product.setCodigo(resultado.getInt(1));
                product.setNombre(resultado.getString(2));
                product.setPrecio(resultado.getDouble(3));
                Integer idFab = resultado.getInt(4);
                Fabricante fab = dFab.buscarFabID(idFab);
                product.setFab(fab);

                products.add(product);

            }
            desconectarBase();
            return products;

        } catch (Exception e) {
            throw e;
        }
    }

    public Producto productBarato() throws Exception {
        DaoFabricante dFab = new DaoFabricante();
        try {
            String sql = "SELECT * FROM Producto ORDER BY precio ASC LIMIT 1";

            consultarBase(sql);

            Producto product = null;

            while (resultado.next()) {

                product = new Producto();
                product.setCodigo(resultado.getInt(1));
                product.setNombre(resultado.getString(2));
                product.setPrecio(resultado.getDouble(3));
                Integer idFab = resultado.getInt(4);
                Fabricante fab = dFab.buscarFabID(idFab);
                product.setFab(fab);

            }
            desconectarBase();
            return product;
        } catch (Exception e) {
            throw e;
        }
    }
    public Producto selectProductId(int id) throws Exception {
        DaoFabricante dFab = new DaoFabricante();
        try {
            String sql = "SELECT * FROM Producto where codigo = " + id;

            consultarBase(sql);

            Producto product = null;

            while (resultado.next()) {

                product = new Producto();
                product.setCodigo(resultado.getInt(1));
                product.setNombre(resultado.getString(2));
                product.setPrecio(resultado.getDouble(3));
                Integer idFab = resultado.getInt(4);
                Fabricante fab = dFab.buscarFabID(idFab);
                product.setFab(fab);

            }
            desconectarBase();
            return product;
        } catch (Exception e) {
            throw e;
        }
    }
}

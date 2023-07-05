package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Fabricante;

public class DaoFabricante extends Dao {

    public void insertFab(Fabricante fab) throws Exception {

        try {

            if (fab == null) {
                throw new Exception("DEBE INDICAR UN FABRICANTE");
            }

            //INSERT INTO fabricante VALUES(1, 'Asus');
            /*
                El codigo no se lo especifica en el insert porque es auto increment
             */
            String sql = "INSERT INTO Fabricante (nombre) VALUES ( '" + fab.getNombre() + "');";

            insertarModificarEliminar(sql);

        } catch (Exception e) {

            throw e;

        }

    }

    public Collection<Fabricante> listarFab() throws Exception {

        try {

            String sql = "SELECT * FROM Fabricante";

            consultarBase(sql);

            Fabricante fab = null;
            Collection<Fabricante> listFab = new ArrayList();

            while (resultado.next()) {
                fab = new Fabricante();
                fab.setCodigo(resultado.getInt("codigo"));
                fab.setNombre(resultado.getString("nombre"));

                listFab.add(fab);

            }
            desconectarBase();
            return listFab;

        } catch (Exception e) {
            desconectarBase();
            throw new Exception("ERROR DE SISTEMA");
        }

    }

    public Fabricante buscarFabID(int id) throws Exception {
        try {
            String sql = "SELECT * FROM Fabricante WHERE codigo = " + id + ";";
            consultarBase(sql);

            Fabricante fab = null;

            while (resultado.next()) {
                fab = new Fabricante();
                fab.setCodigo(resultado.getInt("codigo"));
                fab.setNombre(resultado.getString("nombre"));
            }

            desconectarBase();
            return fab;

        } catch (Exception e) {
            desconectarBase();
            throw e;

        }
    }

}

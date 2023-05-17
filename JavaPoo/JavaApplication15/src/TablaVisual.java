import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

public class TablaVisual {

    public static void main(String[] args) {
        // Crear un array de datos
        Object[][] data = {
            {"Juan", "Pérez", 25},
            {"María", "Gómez", 30},
            {"Carlos", "López", 28}
        };
        
        // Crear un array de encabezados de columna
        Object[] columnNames = {"Nombre", "Apellido", "Edad"};

        // Crear un modelo de tabla con los datos y encabezados de columna
        DefaultTableModel model = new DefaultTableModel(data, columnNames);

        // Crear la tabla con el modelo de datos
        JTable table = new JTable(model);

        // Crear un panel de desplazamiento para la tabla
        JScrollPane scrollPane = new JScrollPane(table);

        // Crear un panel contenedor y agregar el panel de desplazamiento
        JPanel panel = new JPanel();
        panel.add(scrollPane);

        // Crear la ventana y configurarla
        JFrame frame = new JFrame("Tabla Visual");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setContentPane(panel);
        frame.setVisible(true);
    }
}

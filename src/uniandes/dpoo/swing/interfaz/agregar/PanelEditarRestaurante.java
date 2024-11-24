package uniandes.dpoo.swing.interfaz.agregar;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.LinkedList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class PanelEditarRestaurante extends JPanel
{
    /**
     * El campo para que el usuario ingrese el nombre del restaurante
     */
    private JTextField txtNombre;

    /**
     * Un selector (JComboBox) para que el usuario seleccione la calificación (1 a 5) del restaurante
     */
    private JComboBox<String> cbbCalificacion;

    /**
     * Un selector (JComboBox) para que el usuario indique si ya visitó el restaurante o no
     */
    private JComboBox<String> cbbVisitado;

    public PanelEditarRestaurante( )
    {
        setLayout( new BoxLayout(this, BoxLayout.Y_AXIS ) );

        // Crea el campo para el nombre con una etiqueta al frente
        // TODO completar
    	
    	txtNombre = new JTextField( 15 );
    	txtNombre.setEditable( true );
    	
    	JLabel nombreLabel= new JLabel("Nombre");

    	JPanel panelNombre= new JPanel();
    	panelNombre.setLayout(new FlowLayout(FlowLayout.LEFT));
    	panelNombre.add(nombreLabel);
    	panelNombre.add(txtNombre);
    	

        // Crea el selector para la calificación con una etiqueta al frente
        // TODO completar
    	
    	String[] calificaciones = new String[] {"1","2","3","4","5"};
    	cbbCalificacion=new JComboBox<String>(calificaciones);
    	cbbCalificacion.setEnabled(true);
    	
    	JLabel calificacionLabel= new JLabel("Calificacion");

       	JPanel panelCalificacion= new JPanel();
       	panelCalificacion.setLayout(new FlowLayout(FlowLayout.LEFT));
       	panelCalificacion.add(calificacionLabel);
       	panelCalificacion.add(cbbCalificacion);

       	
        // Crea el selector para indicar si ya ha sido visitado, con una etiqueta al frente
        // TODO completar
    	String[] visitado = new String[]{"Si", "No"};
    	cbbVisitado=new JComboBox<String>(visitado);
    	cbbVisitado.setEnabled(true);
    	
    	JLabel visitadoLabel= new JLabel("Visitado");

       	JPanel panelVisitado= new JPanel();
       	panelVisitado.setLayout(new FlowLayout(FlowLayout.LEFT));
       	panelVisitado.add(visitadoLabel);
       	panelVisitado.add(cbbVisitado);
       

        // Agregar todos los elementos al panel
        // TODO completar :)
    	add(panelNombre);
    	add(panelCalificacion);
    	add(panelVisitado);

    }

    /**
     * Indica si en el selector se seleccionó la opción que dice que el restaurante fue visitado
     * @return
     */
    public boolean getVisitado( )
    {
        // TODO completar :)
    	if (cbbVisitado.getSelectedItem( ).equals("Si"))
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    
    }

    /**
     * Indica la calificación marcada en el selector
     * @return
     */
    public int getCalificacion( )
    {
        String calif = ( String )cbbCalificacion.getSelectedItem( );
        return Integer.parseInt( calif );
    }

    /**
     * Indica el nombre digitado para el restaurante
     * @return
     */
    public String getNombre( )
    {
        // TODO completar :)
        return txtNombre.getText();
    }
}

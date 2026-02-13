package UI;

import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.BorderFactory;

/**
 *
 * @author axelm
 */
public class RegistroAutoridad {

    public JPanel frmRegistroAutoridad() {
        // Panel principal
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Nombre
        JLabel labelNombre = new JLabel("Nombre completo");
        JTextField txtNombre = new JTextField(20);
        JPanel panelNombre = new JPanel();
        panelNombre.setLayout(new BoxLayout(panelNombre, BoxLayout.Y_AXIS));
        panelNombre.setAlignmentX(Component.LEFT_ALIGNMENT);
        panelNombre.add(labelNombre);
        panelNombre.add(txtNombre);
        panelNombre.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 0));

        // Correo
        JLabel labelCorreo = new JLabel("Correo electrónico");
        JTextField txtCorreo = new JTextField(20);
        JPanel panelCorreo = new JPanel();
        panelCorreo.setLayout(new BoxLayout(panelCorreo, BoxLayout.Y_AXIS));
        panelCorreo.setAlignmentX(Component.LEFT_ALIGNMENT);
        panelCorreo.add(labelCorreo);
        panelCorreo.add(txtCorreo);
        panelCorreo.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 0));

        // Teléfono
        JLabel labelTelefono = new JLabel("Teléfono");
        JTextField txtTelefono = new JTextField(15);
        JPanel panelTelefono = new JPanel();
        panelTelefono.setLayout(new BoxLayout(panelTelefono, BoxLayout.Y_AXIS));
        panelTelefono.setAlignmentX(Component.LEFT_ALIGNMENT);
        panelTelefono.add(labelTelefono);
        panelTelefono.add(txtTelefono);
        panelTelefono.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 0));

        // Dependencia
        JLabel labelDependencia = new JLabel("Dependencia");
        JTextField txtDependencia = new JTextField(20);
        JPanel panelDependencia = new JPanel();
        panelDependencia.setLayout(new BoxLayout(panelDependencia, BoxLayout.Y_AXIS));
        panelDependencia.setAlignmentX(Component.LEFT_ALIGNMENT);
        panelDependencia.add(labelDependencia);
        panelDependencia.add(txtDependencia);
        panelDependencia.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 0));

        // Botones
        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 0));
        panelBotones.setAlignmentX(Component.LEFT_ALIGNMENT);
        JButton aceptar = new JButton("Aceptar");
        JButton cancelar = new JButton("Cancelar");
        panelBotones.add(aceptar);
        panelBotones.add(cancelar);
        panelBotones.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));

        // Agregar todo al panel principal
        panel.add(panelNombre);
        panel.add(panelCorreo);
        panel.add(panelTelefono);
        panel.add(panelDependencia);
        panel.add(panelBotones);

        return panel;
    }
}

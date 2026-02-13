package UI;

import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.BorderFactory;

public class RegistroUsuario {

    public JPanel frmRegistroUsuario() {
        // Panel principal
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        // Nombre
        JLabel labelNombre = new JLabel("Nombre completo:");
        JTextField txtNombre = new JTextField(25);
        JPanel panelNombre = new JPanel();
        panelNombre.setLayout(new BoxLayout(panelNombre, BoxLayout.Y_AXIS));
        panelNombre.setAlignmentX(Component.LEFT_ALIGNMENT);
        panelNombre.add(labelNombre);
        panelNombre.add(txtNombre);
        panelNombre.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 0));
        // Correo
        JLabel labelCorreo = new JLabel("Correo electrónico:");
        JTextField txtCorreo = new JTextField(25);
        JPanel panelCorreo = new JPanel();
        panelCorreo.setLayout(new BoxLayout(panelCorreo, BoxLayout.Y_AXIS));
        panelCorreo.setAlignmentX(Component.LEFT_ALIGNMENT);
        panelCorreo.add(labelCorreo);
        panelCorreo.add(txtCorreo);
        panelCorreo.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 0));
        // Teléfono
        JLabel labelTelefono = new JLabel("Teléfono:");
        JTextField txtTelefono = new JTextField(15);
        JPanel panelTelefono = new JPanel();
        panelTelefono.setLayout(new BoxLayout(panelTelefono, BoxLayout.Y_AXIS));
        panelTelefono.setAlignmentX(Component.LEFT_ALIGNMENT);
        panelTelefono.add(labelTelefono);
        panelTelefono.add(txtTelefono);
        panelTelefono.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 0));
        // Aviso de privacidad
        JCheckBox avisoPrivacidad = new JCheckBox("Acepto el aviso de privacidad");
        avisoPrivacidad.setAlignmentX(Component.LEFT_ALIGNMENT);
        avisoPrivacidad.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 0));
        // Botones
        JButton aceptar = new JButton("Aceptar");
        JButton cancelar = new JButton("Cancelar");
        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 0));
        panelBotones.setAlignmentX(Component.LEFT_ALIGNMENT);
        panelBotones.add(aceptar);
        panelBotones.add(cancelar);
        panelBotones.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));
        // Agregar todos los paneles al principal
        panel.add(panelNombre);
        panel.add(panelCorreo);
        panel.add(panelTelefono);
        panel.add(avisoPrivacidad);
        panel.add(panelBotones);
        return panel;
    }
}
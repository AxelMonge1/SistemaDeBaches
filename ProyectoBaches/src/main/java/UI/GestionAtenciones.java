package UI;

import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.BorderFactory;

public class GestionAtenciones {

    public JPanel frmGestionAtenciones() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        // Id del bache
        JLabel labelBache = new JLabel("Id del bache:");
        JTextField txtBache = new JTextField(20);
        JPanel panelBache = new JPanel();
        panelBache.setLayout(new BoxLayout(panelBache, BoxLayout.Y_AXIS));
        panelBache.setAlignmentX(Component.LEFT_ALIGNMENT);
        panelBache.add(labelBache);
        panelBache.add(txtBache);
        panelBache.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 0));
        // Id de la autoridad
        JLabel labelAutoridad = new JLabel("Id de la autoridad:");
        JTextField txtAutoridad = new JTextField(20);
        JPanel panelAutoridad = new JPanel();
        panelAutoridad.setLayout(new BoxLayout(panelAutoridad, BoxLayout.Y_AXIS));
        panelAutoridad.setAlignmentX(Component.LEFT_ALIGNMENT);
        panelAutoridad.add(labelAutoridad);
        panelAutoridad.add(txtAutoridad);
        panelAutoridad.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 0));
        // Fecha de inicio
        JLabel labelFechaInicio = new JLabel("Fecha de inicio:");
        JTextField txtFechaInicio = new JTextField(20);
        JPanel panelFechaInicio = new JPanel();
        panelFechaInicio.setLayout(new BoxLayout(panelFechaInicio, BoxLayout.Y_AXIS));
        panelFechaInicio.setAlignmentX(Component.LEFT_ALIGNMENT);
        panelFechaInicio.add(labelFechaInicio);
        panelFechaInicio.add(txtFechaInicio);
        panelFechaInicio.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 0));
        // Fecha de solución
        JLabel labelFechaSolucion = new JLabel("Fecha de solución:");
        JTextField txtFechaSolucion = new JTextField(20);
        JPanel panelFechaSolucion = new JPanel();
        panelFechaSolucion.setLayout(new BoxLayout(panelFechaSolucion, BoxLayout.Y_AXIS));
        panelFechaSolucion.setAlignmentX(Component.LEFT_ALIGNMENT);
        panelFechaSolucion.add(labelFechaSolucion);
        panelFechaSolucion.add(txtFechaSolucion);
        panelFechaSolucion.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 0));
        // Estatus final
        JLabel labelEstatus = new JLabel("Estatus final:");
        JTextField txtEstatus = new JTextField(20);
        JPanel panelEstatus = new JPanel();
        panelEstatus.setLayout(new BoxLayout(panelEstatus, BoxLayout.Y_AXIS));
        panelEstatus.setAlignmentX(Component.LEFT_ALIGNMENT);
        panelEstatus.add(labelEstatus);
        panelEstatus.add(txtEstatus);
        panelEstatus.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 0));
        // Botones
        JButton enviar = new JButton("Enviar reporte");
        JButton cancelar = new JButton("Cancelar");
        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 0));
        panelBotones.setAlignmentX(Component.LEFT_ALIGNMENT);
        panelBotones.add(enviar);
        panelBotones.add(cancelar);
        panelBotones.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));
        // Agregar todos los paneles al principal
        panel.add(panelBache);
        panel.add(panelAutoridad);
        panel.add(panelFechaInicio);
        panel.add(panelFechaSolucion);
        panel.add(panelEstatus);
        panel.add(panelBotones);
        return panel;
    }
}
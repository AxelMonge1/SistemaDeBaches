/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI;

import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author axelm
 */
public class RegistroBache {
    public JPanel frmRegistroBache() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        // Ubicación
        JLabel labelUbicacion = new JLabel("Ubicacion:");
        JTextField txtUbicacion = new JTextField(25);
        JPanel panelUbicacion = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelUbicacion.add(labelUbicacion);
        panelUbicacion.add(txtUbicacion);
        panelUbicacion.setAlignmentX(Component.LEFT_ALIGNMENT);
        panelUbicacion.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 0));
        // Tamaños
        JLabel labelTamanio = new JLabel("Tamaño aproximado:");
        JRadioButton rbPequeno = new JRadioButton("Pequeño");
        JRadioButton rbMediano = new JRadioButton("Mediano");
        JRadioButton rbGrande = new JRadioButton("Grande");
        ButtonGroup grupoTamanio = new ButtonGroup();
        grupoTamanio.add(rbPequeno);
        grupoTamanio.add(rbMediano);
        grupoTamanio.add(rbGrande);
        JPanel panelTamanios = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelTamanios.add(labelTamanio);
        panelTamanios.add(rbPequeno);
        panelTamanios.add(rbMediano);
        panelTamanios.add(rbGrande);
        panelTamanios.setAlignmentX(Component.LEFT_ALIGNMENT);
        panelTamanios.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 0));
        // Nivel de severidad
        JLabel labelNivelSeveridad = new JLabel("Nivel de severidad:");
        JRadioButton rbSevBajo = new JRadioButton("Bajo");
        JRadioButton rbSevMedio = new JRadioButton("Medio");
        JRadioButton rbSevAlto = new JRadioButton("Alto");
        ButtonGroup groupNivelSeveridad = new ButtonGroup();
        groupNivelSeveridad.add(rbSevBajo);
        groupNivelSeveridad.add(rbSevMedio);
        groupNivelSeveridad.add(rbSevAlto);
        JPanel panelNivelSeveridad = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelNivelSeveridad.add(labelNivelSeveridad);
        panelNivelSeveridad.add(rbSevBajo);
        panelNivelSeveridad.add(rbSevMedio);
        panelNivelSeveridad.add(rbSevAlto);
        panelNivelSeveridad.setAlignmentX(Component.LEFT_ALIGNMENT);
        panelNivelSeveridad.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 0));
        // Fecha del reporte
        JLabel labelFechaReporte = new JLabel("Fecha del reporte:");
        JTextField txtFechaReporte = new JTextField(15);
        JPanel panelFechaReporte = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelFechaReporte.add(labelFechaReporte);
        panelFechaReporte.add(txtFechaReporte);
        panelFechaReporte.setAlignmentX(Component.LEFT_ALIGNMENT);
        panelFechaReporte.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 0));
        // Estado del bache
        JLabel labelEstado = new JLabel("Estado del bache:");
        JTextField txtEstado = new JTextField(20);
        JPanel panelEstado = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelEstado.add(labelEstado);
        panelEstado.add(txtEstado);
        panelEstado.setAlignmentX(Component.LEFT_ALIGNMENT);
        panelEstado.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 0));
        // Botones
        JButton aceptar = new JButton("Aceptar");
        JButton cancelar = new JButton("Cancelar");
        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 0));
        panelBotones.add(aceptar);
        panelBotones.add(cancelar);
        panelBotones.setAlignmentX(Component.LEFT_ALIGNMENT);
        panelBotones.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));
        // Agregar todos los paneles al principal
        panel.add(panelUbicacion);
        panel.add(panelTamanios);
        panel.add(panelNivelSeveridad);
        panel.add(panelFechaReporte);
        panel.add(panelEstado);
        panel.add(panelBotones);
        return panel;
    }
}

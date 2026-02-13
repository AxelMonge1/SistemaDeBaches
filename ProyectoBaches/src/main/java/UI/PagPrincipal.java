package UI;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author axelm
 */
public class PagPrincipal{
    public PagPrincipal(){
        JFrame frame = new JFrame("Sistema de baches");
        frame.setSize(800, 500);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        JMenuBar menuBar = new JMenuBar();
        JMenu menuUsuarios = new JMenu("Usuarios");
        JMenuItem registrarUsuario = new JMenuItem("Registrar usuario");
        registrarUsuario.addActionListener(e -> {
            JDialog dialogRU = new JDialog(frame, "Registrar Usuario", true);
            RegistroUsuario ru = new RegistroUsuario();
            dialogRU.add(ru.frmRegistroUsuario());
            dialogRU.pack();
            dialogRU.setLocationRelativeTo(frame);
            dialogRU.setVisible(true);
        });
        menuUsuarios.add(registrarUsuario);
        JMenu menuAutoridades = new JMenu("Autoridades");
        JMenuItem registrarAutoridad = new JMenuItem("Registrar autoridad");
        registrarAutoridad.addActionListener(e -> {
            JDialog dialogRA = new JDialog(frame, "Registrar Autoridad", true);
            RegistroAutoridad ra = new RegistroAutoridad();
            dialogRA.add(ra.frmRegistroAutoridad());
            dialogRA.pack();
            dialogRA.setLocationRelativeTo(frame);
            dialogRA.setVisible(true);
        });
        menuAutoridades.add(registrarAutoridad);
        JMenu menuBaches = new JMenu("Baches");
        JMenuItem registrarBache = new JMenuItem("Registrar bache");
        registrarBache.addActionListener(e -> {
            JDialog dialogRB = new JDialog(frame, "Registrar Bache", true);
            RegistroBache rb = new RegistroBache();
            dialogRB.add(rb.frmRegistroBache());
            dialogRB.pack();
            dialogRB.setLocationRelativeTo(frame);
            dialogRB.setVisible(true);
        });
        menuBaches.add(registrarBache);
        JMenu menuAtenciones = new JMenu("Atenciones");
        JMenuItem gestionarAtenciones = new JMenuItem("Gestionar atenciones");
        menuAtenciones.add(gestionarAtenciones);
        gestionarAtenciones.addActionListener(e -> {
            JDialog dialogGA = new JDialog(frame, "Gestionar Atenciones", true);
            GestionAtenciones ga = new GestionAtenciones();
            dialogGA.add(ga.frmGestionAtenciones());
            dialogGA.pack();
            dialogGA.setLocationRelativeTo(frame);
            dialogGA.setVisible(true);
        });
        menuBar.add(menuUsuarios);
        menuBar.add(menuAutoridades);
        menuBar.add(menuBaches);
        menuBar.add(menuAtenciones);
        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
    }
}

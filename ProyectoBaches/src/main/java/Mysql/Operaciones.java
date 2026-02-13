package Mysql;

import Entidades.Atencion;
import Entidades.Autoridad;
import Entidades.Bache;
import Entidades.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author axelm
 */
public class Operaciones {
    // ---------------- INSERTS ----------------
    public void insertBache(Bache bache){
        String query = "INSERT INTO Bache(ubicacion, tamanIo_aproximado, nivel_severidad, estado_actual, fecha_reporte, idCiudadano) VALUES(?, ?, ?, ?, ?. ?)";
        try(Connection con = ConexionDB.getConnection()){
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, bache.getUbicacion());
            ps.setString(2, bache.getTamanoAprox());
            ps.setString(3, bache.getNivelSeveridad());
            ps.setString(4, bache.getEstado());
            ps.setDate(5, bache.getFechaReporte());
            ps.setInt(6, bache.getIdUsuario());
            ps.executeUpdate();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    public void insertUsuario(Usuario usuario){
        String query = "INSERT INTO Usuario(nombre, correo, telefono) VALUES(?, ?, ?)";
        try(Connection con = ConexionDB.getConnection()){
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getCorreoElectronico());
            ps.setString(3, usuario.getTelefono());
            ps.executeUpdate();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    public void insertAutoridad(Autoridad autoridad){
        String query = "INSERT INTO Autoridad(nombre, correo, telefono, dependencia) VALUES(?, ?, ?, ?)";
        try(Connection con = ConexionDB.getConnection()){
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, autoridad.getNombre());
            ps.setString(2, autoridad.getCorreoElectronico());
            ps.setString(3, autoridad.getTelefono());
            ps.setString(4, autoridad.getDependencia());
            ps.executeUpdate();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    public void insertAtencion(Atencion atencion){
        String query = "INSERT INTO Atencion(fecha_inicio_reparacion, fecha_solucion, estatus_final, idBache, idAutoridad) VALUES(?, ?, ?, ?, ?)";
        try(Connection con = ConexionDB.getConnection()){
            PreparedStatement ps = con.prepareStatement(query);
            ps.setDate(1, atencion.getFecha_inicio_reparacion());
            ps.setDate(2, atencion.getFecha_solucion());
            ps.setString(3, atencion.getEstatus_final());
            ps.setInt(4, atencion.getIdBache());
            ps.setInt(5, atencion.getIdAutoridad());
            ps.executeUpdate();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    //---------- CONSULTAS ---------
    public Bache obtenerBachePorId(int id) throws SQLException{
        String query = "SELECT * FROM Bache WHERE idBache = ?";
        try(Connection con = ConexionDB.getConnection();
        PreparedStatement ps = con.prepareStatement(query)){
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                Bache bache = new Bache();
                bache.setIdBache(rs.getInt("idBache"));
                bache.setUbicacion(rs.getString("ubicacion"));
                bache.setTamanoAprox(rs.getString("tamanio_aproximado"));
                bache.setEstado(rs.getString("estado_actual"));
                bache.setNivelSeveridad(rs.getString("nivel_severidad"));
                bache.setIdUsuario(rs.getInt("idUsuario"));
                bache.setFechaReporte(rs.getDate("fecha_reporte"));
                return bache;
            }
            throw new SQLException("No se pudo obtener el bache");
        }catch(SQLException ex){
            ex.printStackTrace();
            throw new SQLException("No se encontro ningun bache con el id: " + id);
        }
    }
    
    public Usuario obtenerUsuarioPorId(int id) throws SQLException{
        String query = "SELECT * FROM Usuario WHERE idUsuario = ?";
        try(Connection con = ConexionDB.getConnection();
        PreparedStatement ps = con.prepareStatement(query)){
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                Usuario usuario = new Usuario(rs.getInt("idUsuario"), 
                        rs.getString("correoElectronico"), 
                        rs.getString("nombre"), 
                        rs.getString("telefono"));
                return usuario;
            }
            throw new SQLException("No se pudo obtener el usuario");
        }catch(SQLException ex){
            ex.printStackTrace();
            throw new SQLException("No se encontro ningun usuario con el id: " + id);
        }
    }
    
    public Autoridad obtenerAutoridadPorId(int id) throws SQLException{
        String query = "SELECT * FROM Autoridad WHERE idAutoridad = ?";
        try(Connection con = ConexionDB.getConnection();
        PreparedStatement ps = con.prepareStatement(query)){
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                Autoridad autoridad = new Autoridad();
                autoridad.setIdAutoridad(rs.getInt("idAutoridad"));
                autoridad.setNombre(rs.getString("nombre"));
                autoridad.setTelefono(rs.getString("telefonoe"));
                autoridad.setCorreoElectronico(rs.getString("correoElectronico"));
                autoridad.setDependencia(rs.getString("dependencia"));
                return autoridad;
            }
            throw new SQLException("No se pudo obtener la autoridad");
        }catch(SQLException ex){
            ex.printStackTrace();
            throw new SQLException("No se encontro ninguna autoridad con el id: " + id);
        }
    }
    
    public Atencion obtenerAtencionPorId(int id) throws SQLException{
        String query = "SELECT * FROM Atencion WHERE idAtencion = ?";
        try(Connection con = ConexionDB.getConnection();
        PreparedStatement ps = con.prepareStatement(query)){
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                Atencion atencion = new Atencion();
                atencion.setIdAtencion(rs.getInt("idAtencion"));
                atencion.setFecha_inicio_reparacion(rs.getDate("fecha_inicio_reparacion"));
                atencion.setFecha_solucion(rs.getDate("fecha_solucion"));
                atencion.setEstatus_final(rs.getString("estatus_final"));
                atencion.setIdBache(rs.getInt("idBache"));
                atencion.setIdAutoridad(rs.getInt("idAutoridad"));
                return atencion;
            }
            throw new SQLException("No se pudo obtener la atencion");
        }catch(SQLException ex){
            ex.printStackTrace();
            throw new SQLException("No se encontro ninguna atencion con el id: " + id);
        }
    }
    
}

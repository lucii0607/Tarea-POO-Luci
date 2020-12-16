import com.sun.istack.internal.logging.Logger;
import java.sql.*;
import java.util.logging.Level;
import javax.swing.*;

/**
 *
 * @author gabri
 */
public class Sql {
    
    private Connection connect;
    private Statement sentencia;
    private PreparedStatement pps;

    public Connection getConexion(){
        return connect;
    }
    
    public void setConexion(Connection connect){
        this.connect = connect;
    }
     public Statement getStatement(){
        return sentencia;
    }
    
    public void setStatement(Statement sentencia){
        this.sentencia = sentencia;
    }
    
    public PreparedStatement getPStatement(){
        return pps;
    }
    
    public void setPStatement(PreparedStatement pps){
        this.pps = pps;
    }
    //Conectar a BD proyecto
    public void conectar(){
        String url="jdbc:mysql://localhost:3306/tareapoo";
        String usuario="root";
        String pass="";
        try{
            setConexion(DriverManager.getConnection(url,usuario,pass));
            System.out.println("Sql class: Conexion exitosa");
        }catch(Exception ex){
            System.out.println("Sql class: No ha sido posible conectarse a la Base de Datos.");
        }
    }
    //Conectar a BD Distinta
    public void conectar(String url,String usuario,String pass){
        try{
            setConexion(DriverManager.getConnection(url,usuario,pass));
            System.out.println("Sql class: Conexion exitosa");
        }catch(Exception ex){
            System.out.println("Sql class: No ha sido posible conectarse a la Base de Datos.");
        }
    }
    //DEsconectar de BD
    public void desconectar(){
       setConexion(null);
       setStatement(null);
       setPStatement(null);
       System.out.println("Sql class: Desconexion de BD...");
       
        
    }
    //Insertar datos a BD, toda la sentencia debe estar en un String!!
   
    
    
    
    //Seleccion especifica a la BD, recibe como 1er parametro lo que se requiere
    // y como 2do parametro la tabla donde esta el dato
    public ResultSet select(String select, String tabla){
        ResultSet valor;
        try{

            setStatement(getConexion().createStatement());
            valor = getStatement().executeQuery("Select "+select+" from "+tabla);
            System.out.println("Sql class: Datos seleccionados correctamente.");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Sql class: Error al seleccionar datos "+ex,"Base de Datos",3);
            return null;
        }
        return valor;
    }
    public ResultSet select(String sentencia){
        ResultSet valor;
        try{

            setStatement(getConexion().createStatement());
            valor = getStatement().executeQuery(sentencia);
            System.out.println("Sql class: sentencia realizada correctamente.");
        }catch(SQLException ex){
           JOptionPane.showMessageDialog(null,"Sql class: Error al realizar sentencia \n"+ex,"Base de Datos",3);
           return null;
        }
        return valor;
        
        
    }
    public void sentence(String sentencia){
        try{
            setPStatement(getConexion().prepareStatement(sentencia));
            getPStatement().executeUpdate();
            JOptionPane.showMessageDialog(null, "Sql class: Sentencia realizada");
        }catch(SQLException ex){
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
    public void delete(String tabla, String where, String valor){
        try{
            setPStatement(getConexion().prepareStatement("DELETE FROM "+ tabla +" WHERE "+ where +" = '"+valor+"'"));
            getPStatement().executeUpdate();
            JOptionPane.showMessageDialog(null, "Dato eliminado");
        }catch(SQLException ex){
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
     public void delete(String tabla, String where, int valor){
        try{
            setPStatement(getConexion().prepareStatement("DELETE FROM "+ tabla +" WHERE "+ where +" = "+valor+""));
            getPStatement().executeUpdate();
            JOptionPane.showMessageDialog(null, "Dato eliminado");
        }catch(SQLException ex){
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
    
    
    
    public ResultSet where(String tabla, String where,String value){
        ResultSet valor;
        try{
            setStatement(getConexion().createStatement());
            valor = getStatement().executeQuery("Select * from "+tabla+" where "+where+" = '"+value+"'");
            
            System.out.println("Sql class: Datos seleccionados correctamente. where functional");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Sql class: Error al seleccionar datos "+ex,"Base de Datos",3);
            return null;
        }
        return valor;
    }
    
    
    public ResultSet where(String tabla, String where,int value){
        ResultSet valor;
        try{
            setStatement(getConexion().createStatement());
            valor = getStatement().executeQuery("Select * from "+tabla+" where "+where+" = "+value+"");
            
            System.out.println("Sql class: Datos seleccionados correctamente. where functional");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Sql class: Error al seleccionar datos "+ex,"Base de Datos",3);
            return null;
        }
        return valor;
    }
    
    
    
    
    
    
    
}

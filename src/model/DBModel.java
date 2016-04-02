/*
 * Code is prose.
 * 
 * Lefty G Balogh
 */

package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lefty G Balogh
 */
public class DBModel implements IModel{
    
    private Connection connection;
    
    private PreparedStatement prepGetSzemelyek;
    private PreparedStatement prepUpdateSzemely;

    public DBModel(Connection connection) throws SQLException {
        this.connection = connection;
        prepGetSzemelyek = connection.prepareStatement("SELECT * FROM szemely");
        prepUpdateSzemely = connection.prepareStatement("Update szemely set nev=?, email=? where id=?");
    }
    
    @Override
    public List<Szemely> getSzemelyek() throws SQLException {
        List<Szemely> szemelyek = new ArrayList<>();
        ResultSet rs = prepGetSzemelyek.executeQuery();
        
        while(rs.next()){
            Szemely ember = new Szemely();
            
            int id = rs.getInt("id");
            ember.setId(id);
            
            String nev = rs.getString("nev");
            ember.setNev(nev);
            
            String email = rs.getString("email");
            ember.setEmail(email);
            
            szemelyek.add(ember);
            }
        return szemelyek;
    }

    @Override
    public int updateSzemely(Szemely szemely) throws SQLException {
        prepUpdateSzemely.setString(1, szemely.getNev());
        prepUpdateSzemely.setString(2, szemely.getEmail());
        prepUpdateSzemely.setInt(3, szemely.getId());
        
        return prepUpdateSzemely.executeUpdate();
    }

    @Override
    public int removeSzemely(Szemely szemely) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int addSzemely(Szemely szemely) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Rendeles> getRendelesek() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int updateRendeles(Rendeles rendeles) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int removeRendeles(Rendeles rendeles) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int addRendeles(Rendeles rendeles) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Entity.Rubro;
import Entity.Track;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Ian Cardenas
 */
public class TrackModel {
    public boolean RegistrarTrackVerOferta(Track track) throws ClassNotFoundException, SQLException
    {
        String spRegistrarTrack = "{call SP_REGISTRAR_TRACK_OFERTA(?,?,?,?)}";
        Connection con = BD.Conexion.getConnection();
        CallableStatement stmt = con.prepareCall(spRegistrarTrack);
        stmt.setInt(1, (int) track.getConsumidor().getIdConsumidor());
        stmt.setInt(2, (int) track.getOferta().getIdOferta());
        stmt.setInt(3, (int) track.getRubro().getIdRubro());
        stmt.setString(4,"OFERTA");
        return stmt.execute();
    }
    public boolean RegistrarTrackVerRubro(Track track) throws ClassNotFoundException, SQLException
    {
        String spRegistrarTrack = "{call SP_REGISTRAR_TRACK_RUBRO(?,?,?)}";
        Connection con = BD.Conexion.getConnection();
        CallableStatement stmt = con.prepareCall(spRegistrarTrack);
        stmt.setInt(1, (int) track.getConsumidor().getIdConsumidor());
        stmt.setInt(2, (int) track.getRubro().getIdRubro());
        stmt.setString(3, "RUBRO");
        return stmt.execute();
    }
    
}

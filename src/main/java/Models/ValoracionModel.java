/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Entity.Valoracion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Ian Cardenas
 */
public class ValoracionModel {
    public Boolean RegistrarValoracionOferta(Valoracion valoracion) throws ClassNotFoundException, SQLException{
        //Metodo que tiene como objetivo listar los rubros y las cantidades de ofertas que posee cada uno
        
        Connection con = BD.Conexion.getConnection();
        String spRegistroValoracion = "{call SP_REGISTRO_VALORACION(?,?,?,?)}";
        CallableStatement stmt = con.prepareCall(spRegistroValoracion);
        stmt.setInt(1, (int) valoracion.getConsumidor().getIdConsumidor());
        stmt.setInt(2, (int) valoracion.getOferta().getIdOferta());
        stmt.setInt(3, (int) valoracion.getEscala().getIdEscala());
        stmt.setString(4, valoracion.getFotoValoracion());
        return stmt.execute();
    }
}

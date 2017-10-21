/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Entity.*;
import Models.TrackModel;
import java.sql.SQLException;

/**
 *
 * @author Ian Cardenas
 */
public class TrackController {
    public void RegistrarTrackVerOferta(int idOferta,int idRubro, int idConsumidor) throws ClassNotFoundException, SQLException
    {
        Oferta oferta = new Oferta();
        oferta.setIdOferta(idOferta);
        Rubro rubro = new Rubro();
        rubro.setIdRubro(idRubro);
        Consumidor consumidor = new Consumidor();
        consumidor.setIdConsumidor(idConsumidor);
        Track track = new Track();
        track.setOferta(oferta);
        track.setConsumidor(consumidor);
        track.setRubro(rubro);
        TrackModel trackModel= new TrackModel();
        trackModel.RegistrarTrackVerOferta(track);
    }
    public void RegistrarTrackVerRubro(int idRubro, int idConsumidor) throws ClassNotFoundException, SQLException
    {
        Rubro rubro = new Rubro();
        rubro.setIdRubro(idRubro);
        Consumidor consumidor = new Consumidor();
        consumidor.setIdConsumidor(idConsumidor);
        Track track = new Track();
        track.setConsumidor(consumidor);
        track.setRubro(rubro);
        TrackModel trackModel= new TrackModel();
        trackModel.RegistrarTrackVerRubro(track);
    }
}

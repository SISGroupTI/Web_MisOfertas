/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Entity.Consumidor;
import Entity.Valoracion;
import Entity.Oferta;
import Entity.Escala;
import Models.ValoracionModel;
import java.sql.SQLException;


/**
 *
 * @author Ian Cardenas
 */
public class ValoracionController {
    public void RegistrarValoracionOferta(int idConsumidor,int idOferta, int idPuntuacion,String path) throws ClassNotFoundException, SQLException
    {
        Valoracion valoracion = new Valoracion();
        Consumidor consumidor = new Consumidor();
        consumidor.setIdConsumidor(idConsumidor);
        Oferta oferta = new Oferta();
        oferta.setIdOferta(idOferta);
        Escala escala = new Escala();
        escala.setIdEscala(idPuntuacion);
        valoracion.setConsumidor(consumidor);
        valoracion.setEscala(escala);
        valoracion.setOferta(oferta);
        valoracion.setFotoValoracion(path);
        ValoracionModel vm = new ValoracionModel();
        vm.RegistrarValoracionOferta(valoracion);
    }
}

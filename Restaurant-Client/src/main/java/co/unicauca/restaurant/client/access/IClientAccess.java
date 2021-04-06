/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.restaurant.client.access;

import co.unicauca.restaurant.commons.domain.Component;
import co.unicauca.restaurant.commons.domain.Customer;
import co.unicauca.restaurant.commons.domain.DiaEnum;
import java.util.List;
import co.unicauca.restaurant.commons.domain.PlatoEjecutivo;
import co.unicauca.restaurant.commons.domain.Restaurant;

/**
 *
 * @author braia
 */
public interface IClientAccess {

    //no confundirlos con guardar en la base de datos, estas son solicitudes al servidor
    //el servidor es quien trabaja la base de datos
    public String savePlatoEjecutivo(PlatoEjecutivo instance) throws Exception;

    public String saveRestaurant(Restaurant res) throws Exception;
    
    

    
    //actualizar
    //eliminar
    public String deletePlatoEjecutivo(int idPlaE) throws Exception;

    /**
     * Lista los menus por tipo y recibe por parametro el id del restaurante
     *
     * @param resNit
     * @return
     * @throws Exception
     */
    public List<PlatoEjecutivo> listarMenuDia(int resNit) throws Exception;
    
    public String saveCustomer(Customer customer) throws Exception;
    
    public String saveComponent(Component component) throws Exception;
    
    public Component findComponent(String id_component) throws Exception;

    public List<Component> listarComponents() throws Exception;
    
    public List<Restaurant> listarRestaurants() throws Exception;
    
    public List<Customer> findCustomer() throws Exception;
    
    /**
     * el cliente solicita la modificacion de un parametro en la base de datos
     * para plato del dia
     *
     * @param clave identificador del plato
     * @param atributo columna a ser modificada
     * @param valor nuevo valor a almacenar
     * @return true si la operacion es exitosa, false si erra
     * @throws Exception
     */
    public boolean updateAlmuerzoEjecutivoDia(String IDplatoEJ, String ResNIT, String diaSemana, String entrada, String principio, String proteina, String bebida, String precio)  throws Exception;

    public List<PlatoEjecutivo> listarAlmuerzoEjeDia() throws Exception;
    
}

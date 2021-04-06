
package co.unicauca.restaurant.server.access;

import co.unicauca.restaurant.commons.domain.Component;
import co.unicauca.restaurant.commons.domain.Customer;
import co.unicauca.restaurant.commons.domain.DiaEnum;
import co.unicauca.restaurant.commons.domain.PlatoEjecutivo;
import co.unicauca.restaurant.commons.domain.Restaurant;

/**
 *
 * @author braia
 */
public interface IRestaurantRepository {

    /**
     * registrar una tupla en la base de datos
     *
     * @param instance objeto plato dia que se desea almacenar
     * @return
     */
    public String savePlatoEjecutivo(PlatoEjecutivo instance);

    public String saveRestaurant(Restaurant res);

    /*
     * elimina una tupla en la base de datos
     * @param idPlaE id plato  que se desea borrar
     * @return 
     */
    public String deletePlatoEjecutivo(int idPlaE);
    
    /**
     * lista todas las tuplas de los menus
     *
     * @param resNit id del restaurante del que se va a mostrar el menu
     * @return
     */
    public String listarMenuDia(int resNit);
    
    public String saveCustomer(Customer customer);

    public String findCustomer();
    
    public String saveComponent(Component component);
    
    public Component finComponent(String id_component );
    
    public String listarComponentes();
    
    public String listarRestaurantes();
    
     /**
     * hace un update sobre la tabla platoEjecutivo
     *
     * @param clave valor con el que se encuentra la tupla
     * @param atributo columna a modificar
     * @param valor nuevo valor
     * @return
     */
    public String updatePlatoEjecutivo(String  IDplatoEJ, String  ResNIT,  String  diaSemana,  String  AlmEjeDia_comp1,  String  AlmEjeDia_comp2,  String  AlmEjeDia_comp3,String  AlmEjeDia_comp4,  String  precio);
   
   public String listarAlmuerzoEjeDia();
}

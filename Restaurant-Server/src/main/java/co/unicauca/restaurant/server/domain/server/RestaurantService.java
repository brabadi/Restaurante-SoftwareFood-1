
package co.unicauca.restaurant.server.domain.server;

import co.unicauca.restaurant.commons.domain.Component;
import co.unicauca.restaurant.commons.domain.Customer;
import co.unicauca.restaurant.commons.domain.DiaEnum;
import co.unicauca.restaurant.commons.domain.PlatoEjecutivo;
import co.unicauca.restaurant.commons.domain.Restaurant;
import co.unicauca.restaurant.commons.infra.JsonError;
import co.unicauca.restaurant.server.access.IRestaurantRepository;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author braia
 */
public class RestaurantService {

    /**
     * repositorio de restaurante, via de comunicacion a bajo nivel
     */
    IRestaurantRepository repositorio;

    /**
     * constructor parametrizado que hace inyeccion de dependencias
     *
     * @param repositorio repositorio a la base de datos, tipo IPlatoRepositorio
     */
    public RestaurantService(IRestaurantRepository repositorio) {
        this.repositorio = repositorio;
    }
    
    /**
     * envia la solicitud a la capa de bajo nivel para guardar un plato del dia
     * en la base de datos
     *
     * @param plato instancia a guardar
     * @return
     */
    public String savePlatoEjecutivo(PlatoEjecutivo plato) {
        //hacer validaciones aqui OJO aqui no se han hecho pero deben hacerse
        //comprobar que los datos enviados sean correctos y en caso de ids que no esten repetidos
        return repositorio.savePlatoEjecutivo(plato);
    }
    /**
     * Guarda un restaurante nuevo.
     * @return el nombre del restaurante o un mensaje de error segun corrresponda
    */
    public String saveRestaurant(Restaurant res) {
        return repositorio.saveRestaurant(res);
    }

    

    /**
     * envia la solicitud a la capa de bajo nivel para eliminar un plato dia
     *
     * @param idPlaE instancia de plato especial a guardar
     * @return
     */
    public String deletePlatoEjecutivo(int idPlaE) {
        return repositorio.deletePlatoEjecutivo(idPlaE);
    }

    public String listarMenuDia(int resNit) {
        return repositorio.listarMenuDia(resNit);
    }
    /**
     * Buscar un cliente
     *
     * @param id cedula
     * @return objeto tipo Customer
     */



    /**
     * Crea un nuevo customer. Aplica validaciones de negocio
     *
     * @param customer cliente
     * @return devuelve la cedula del customer creado
     */
    public String saveCustomer(Customer customer) {
        List<JsonError> errors = new ArrayList<>();
  
        // Validaciones y reglas de negocio
        if ((customer.getCus_id() == -1) || customer.getCus_nombre().isEmpty()
                || customer.getCus_direccion().isEmpty() || customer.getCus_password().isEmpty()
                || customer.getCus_tipo().isEmpty()) {
           errors.add(new JsonError("400", "BAD_REQUEST","id, nombres, apellidos, direcion, contrasenia y el tipo son obligatorio "));
        }
        
                
        if(!(customer.getCus_tipo().equalsIgnoreCase("ADMINISTRADOR") || customer.getCus_tipo().equalsIgnoreCase("COMPRADOR"))){
            errors.add(new JsonError("400", "BAD_REQUEST","EL ROL DEL CLIENTE DEBE SER ADMINISTRADOR O COMPRADOR "));
        }      
        
//        if(!Utilities.isNumeric(customer.getMobile())){
//            errors.add(new JsonError("400", "BAD_REQUEST","Teléfono móvil debe contener sólo dígitos "));
//
//        }
        // Que no esté repetido
        
        //Customer customerSearched = this.findCustomer(String.valueOf(customer.getCus_id()));
        //if (customerSearched != null){
        //    errors.add(new JsonError("400", "BAD_REQUEST","La cédula ya existe. "));
        //}
        
       if (!errors.isEmpty()) {
            Gson gson = new Gson();
            String errorsJson = gson.toJson(errors);
            return errorsJson;
        }             
        return repositorio.saveCustomer(customer);
    }
    
    /**
     * Crea un nuevo componente, Aplica validaciones
     * @param component componente
     * @return develve el identificador del componente creado.
     */
    public String saveComponent(Component component){
         List<JsonError> errors = new ArrayList<>();
  
        // Validaciones y reglas de negocio
        if (component.getCompID().isEmpty() || component.getCompNombre().isEmpty()
                || String.valueOf(component.getCompTipo()).isEmpty()) {
           errors.add(new JsonError("400", "BAD_REQUEST","id, nombres componente y el tipo de componeente son obligatorio "));
        }
         
        // Que no esté repetido
         Component resultComponent = this.findComponent(component.getCompID());
        if (resultComponent != null){
            errors.add(new JsonError("400", "BAD_REQUEST"," El componente ya esta registrado. "));
        }
        
       if (!errors.isEmpty()) {
            Gson gson = new Gson();
            String errorsJson = gson.toJson(errors);
            return errorsJson;
        }             
       return repositorio.saveComponent(component);
    }
    
    /**
     * Encuentra un componente
     * @param id_component identifiacdor del componente
     * @return devuelve el componente si lo encuentra o nulo en caso contrario
     */
    public Component findComponent(String id_component){
        return repositorio.finComponent(id_component);
    }
    
    /**
     * lista los componentes guardados
     * @param compId identificador de un componente
     * @return string de confirmacion de listado exitoso
     */
    public String listarComponents(){
        return repositorio.listarComponentes();
    }
    
    public String listarRestaurantes(){
        return repositorio.listarRestaurantes();
    }
    
    public String findCustomer() {
        return repositorio.findCustomer();
    }
    
    /**
     * modifica un plato del dia en la base de datos
     *
     * @param clave identificador del plato
     * @param atributo columna de la base de datos a modificar
     * @param valor nuevo valor para la celda
     * @return retorno "FALLO" en caso de error
     */
    public String updatePlatoEjecutivo( String  IDplatoEJ, String  ResNIT,  String  diaSemana,  String  AlmEjeDia_comp1,  String  AlmEjeDia_comp2,  String  AlmEjeDia_comp3,String  AlmEjeDia_comp4,  String  precio) {
        //hacer validaciones, conversion del valor
        return repositorio.updatePlatoEjecutivo(IDplatoEJ,ResNIT,diaSemana, AlmEjeDia_comp1,AlmEjeDia_comp2, AlmEjeDia_comp3,AlmEjeDia_comp4,precio);
    }
    
    public String listarAlmuerzoEjeDia(){
        return repositorio.listarAlmuerzoEjeDia();
    }
}

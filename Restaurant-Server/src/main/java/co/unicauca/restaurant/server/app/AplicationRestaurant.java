

package co.unicauca.restaurant.server.app;



import co.unicauca.restaurant.server.infra.RestaurantServerSocket;


/**
 *
 * @author braia
 */
public class AplicationRestaurant {

    /**
     * En la funcion main se crea el socket.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    
        RestaurantServerSocket server = new RestaurantServerSocket();

        server.start();

      
            
      
    }

}

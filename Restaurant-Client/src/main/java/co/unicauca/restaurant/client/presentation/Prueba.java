/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.restaurant.client.presentation;

import co.unicauca.restaurant.client.access.ClientAccessSocket;
import co.unicauca.restaurant.client.access.Factory;
import co.unicauca.restaurant.client.access.IClientAccess;
import co.unicauca.restaurant.client.domain.ClientService;
import co.unicauca.restaurant.commons.domain.Component;
import co.unicauca.restaurant.commons.domain.ComponentType;
import co.unicauca.restaurant.commons.domain.Customer;
import co.unicauca.restaurant.commons.domain.PlatoEjecutivo;
import co.unicauca.restaurant.commons.domain.Restaurant;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Rivera
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        IClientAccess service = Factory.getInstance().getClienteService();
//        ClientService cliente = new ClientService(service);
//            
//            Component component = new Component("5","lentejas", ComponentType.PRINCIPIO);
//                       
//        try {
//            String resultComponent = service.saveComponent(component);
//            System.out.println(resultComponent);
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "El plato ya esta registrado" + e.getMessage());
//        }

//        List<Component> componentes = new ArrayList<>();
//     
//        try{
//            componentes = service.listarComponents();
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "no se pudo listar componentes" + e.getMessage());
//        }
//        
//        for (Iterator<Component> iterator = componentes.iterator(); iterator.hasNext();) {
//            Component next = iterator.next();
//            System.out.println(next.getCompID()+ " - " + next.getCompNombre() + " - " + String.valueOf(next.getCompTipo()));
//           
//            
//        }
        ClientService servicioRestaurante = new ClientService(service);
//        try { 
//            List<Component> lsDia = servicioRestaurante.listarComponents();
//            if (lsDia.size() > 0) {
////                for (Component ls : lsDia) {
////                    System.out.println("ID: " + ls.getCompID()
////                            + " NOMBRE: " + ls.getCompNombre()
////                            + "Type: " + ls.getCompTipo().name());
////                }
//                for (Iterator<Component> iterator = lsDia.iterator(); iterator.hasNext();) {
//                    Component next = iterator.next();
//                    System.out.println(next.getCompID() + " - " + next.getCompNombre() + " - " + String.valueOf(next.getCompTipo()));
//
//                }
//            }
//        }catch(Exception e){
//            System.out.println("Error al hacer laconsulta" + e);
//        }

//  listar restaurantes
//             try { 
//            List<Restaurant> lsDia = servicioRestaurante.listarRestaurants();
//            if (lsDia.size() > 0) {
//                for (Iterator<Restaurant> iterator = lsDia.iterator(); iterator.hasNext();) {
//                    Restaurant next = iterator.next();
//                    System.out.println("NIT: " + next.getNit() + " - "
//                                     + " Nombre: " + next.getNombre() 
//                                     + " Id Cliente: " + next.getCli_Id().getCus_id()
//                                     + " Direccion: " + next.getRes_Direccion());
//
//                }
//            }
//        }catch(Exception e){
//            System.out.println("Error al hacer laconsulta" + e);
//        }
//        Component comp =null;
//        try{
//            comp =  servicioRestaurante.findComponent("1");
//        }catch (Exception e){
//            System.out.println("No se pudo ejecutar la accion");
//        }
//        if(comp != null){
//            System.out.println(comp.getCompID() + " - " + comp.getCompNombre() + " - " + String.valueOf(comp.getCompTipo()));
//        }}
        //ENCONTRAR UN CLIENTE

//        String id = "1235";
//        Customer ejemplo = null;
//        List<Customer> lsDia = null;
//        try {
//            lsDia = servicioRestaurante.findCustomer();
//            if (lsDia.size() > 0) {
//                for (Iterator<Customer> iterator = lsDia.iterator(); iterator.hasNext();) {
//                    Customer next = iterator.next();
//                    // System.out.println(next.getCus_id() + " - " + next.getCus_nombre());
//
//                    if (String.valueOf(next.getCus_id()).equals(id)) {
//                        ejemplo = new Customer(next.getCus_id(), next.getCus_nombre(), next.getCus_direccion(), next.getCus_password(), next.getCus_Telefono(), next.getCus_tipo());
//                    }
//                }
//            }
//        } catch (Exception e) {
//            System.out.println("Error al hacer la consulta " + e);
//        }
//
//        if (ejemplo != null) {
//            System.out.println(ejemplo.getCus_id() + "-" + ejemplo.getCus_nombre());
//        } else {
//            System.out.println("NO SE ENCUENTRA REGISTRADO el ID: " + id);
//        }
//        
        
        
        //UPDATE PLATO
        
//        try {
//            boolean resultado = servicioRestaurante.updateAlmuerzoEjecutivoDia("1012434", "126777", "DOMINGO", "1","2","3","4","9000");
//            if(resultado){
//                System.out.println("Almuerzo Ejecutivo Dia: 101 actualizado");
//            }else{
//                System.out.println("No se pudo actualizar, el plato EJecutivo no Existe");
//            }
//        } catch (Exception e) {
//            System.out.println("ERROR al ejecutar la accion");
//        }
        
//Listar almuerzo ejecutivo dia
//    try { 
//            List<PlatoEjecutivo> lsDia = servicioRestaurante.listarAlmuerzoEjeDia();
//            if (lsDia.size() > 0) {
//                for (Iterator<PlatoEjecutivo> iterator = lsDia.iterator(); iterator.hasNext();) {
//                    PlatoEjecutivo next = iterator.next();
//                    System.out.println("ID PLA: " + next.getIDplatoEJ() + " - "
//                                     + " Nombre: " + next.getResNIT()
//                                     + " Id Cmponent_Entrada: " + next.getEntrada().getCompID());
//                                   
//
//                }
//            }
//        }catch(Exception e){
//            System.out.println("Error al hacer laconsulta" + e);
//        }    
    }
}

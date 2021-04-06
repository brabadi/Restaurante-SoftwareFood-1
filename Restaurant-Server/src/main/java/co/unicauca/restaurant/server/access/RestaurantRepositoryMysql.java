package co.unicauca.restaurant.server.access;

import co.unicauca.restaurant.commons.domain.Component;
import co.unicauca.restaurant.commons.domain.ComponentType;
import co.unicauca.restaurant.commons.domain.Customer;
import co.unicauca.restaurant.commons.domain.DiaEnum;
import co.unicauca.restaurant.commons.domain.PlatoEjecutivo;
import co.unicauca.restaurant.commons.domain.Restaurant;
import co.unicauca.restaurant.commons.infra.Utilities;
import com.google.gson.Gson;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author braia
 */
public class RestaurantRepositoryMysql implements IRestaurantRepository {

    /**
     * Conección con Mysql
     */
    private Connection conn;

    public RestaurantRepositoryMysql() {

    }

    /**
     * Permite hacer la conexion con la base de datos
     *
     * @return
     */
    public int connect() {
        try {
            Class.forName(Utilities.loadProperty("server.db.driver"));
            //crea una instancia de la controlador de la base de datos
            //estos datos estan quemados en el archivo propertis, si la base de datos cambia propertis debe modificarse
            String url = Utilities.loadProperty("server.db.url");
            String username = Utilities.loadProperty("server.db.username"); //usuario de la base de datos
            String pwd = Utilities.loadProperty("server.db.password");//contraseña de usuario
            //se establece la coneccion con los datos previos
            conn = DriverManager.getConnection(url, username, pwd);
            if (conn == null) {
                System.out.println("coneccion fallida a la base de datos");
            } else {
                System.out.println("conecion exitosa a la base de datos");
            }
            return 1;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(RestaurantRepositoryMysql.class.getName()).log(Level.SEVERE, "Error al consultar Customer de la base de datos", ex);
        }
        return -1;
    }

    /**
     * Cierra la conexion con la base de datos
     *
     */
    public void disconnect() {
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(RestaurantRepositoryMysql.class.getName()).log(Level.FINER, "Error al cerrar Connection", ex);
        }
    }



    /**
     * actualiza un item de plato del dia en la base de datos.
     *
     * @param clave identificador del plato
     * @param atributo columna a modificar en la base de datos.
     * @param valor nuevo valor para la columna.
     * @return retorna "FALLO" si erra el metodo, identificador de lo contrario.
     */
    

    /**
     * cumunicacion con la base de datos para eliminar un plato del dia
     *
     * @param idPlaE id del plato a eliminar
     * @return
     */
    @Override
    public String deletePlatoEjecutivo(int idPlaE) {
//        if (findPlatoEjecutivo(idPlaE)) {
//            System.out.println("EXISTE EL ELEMENTO");
//        } else {
//            System.out.println("NO EXISTE EL ELEMENTO");
//            return "FALLO";
//        }
//        try {
//            //primero se establece la conexion
//            this.connect(); //validar cuando la conexion no sea exitosa
//            //se estructura la sentencia sql en un string
//            String sql = "DELETE FROM platoejecutivo WHERE peje_id = (?)";
//            //pstmt mantendra la solicitud sobre la base de datos, se asignam sus columnas
//            PreparedStatement pstmt = conn.prepareStatement(sql);
//            //se compara el id, OJO Ddebe cumplir estrictamente el orden y el tipo de dato(de las tablas)
//            pstmt.setInt(1, idPlaE);
//            //se ejecuta la sentencia sql
//            pstmt.executeUpdate();
//            //se cierra
//            pstmt.close();
//            //se termina la coneccion
//            this.disconnect();
//        } catch (SQLException ex) {
//            Logger.getLogger(RestaurantRepositoryMysql.class.getName()).log(Level.SEVERE, "Error al eliminar el plato", ex);
//        }
        return "" + idPlaE;
    }

    /**
     * Lista el menu desde la consulta hecha a la base de datos añade las tuplas
     * encontradas en una lista de Plato y convierte la lista en json para
     * enviarla por el sockect devuelta al cliente
     *
     * @param resNit
     * @return
     */
    @Override
    public String listarMenuDia(int resNit) {
//        List<Plato> list = new ArrayList<>();
        String response = null;
//        System.out.println("ingreso al listar Menu Dia");
//        try {
//            this.connect();
//            String sql = "select peje_id,peje_nombre,peje_descripcion,peje_dia, peje_entrada,peje_principio,peje_proteina,peje_bebida,peje_precio, m.mdia_id from (restaurante r inner join menudia m on r.res_nit=m.res_nit) inner join platoejecutivo p on m.mdia_id=p.mdia_id where r.res_nit =" + resNit;
//            PreparedStatement pstmt = conn.prepareStatement(sql);
//            ResultSet rs = pstmt.executeQuery();
//
//            while (rs.next()) {
//                Plato pla = new PlatoEjecutivo(Integer.parseInt(rs.getString(1)), rs.getString(2), Integer.parseInt(rs.getString(9)), rs.getString(3), DiaEnum.valueOf(rs.getString(4)), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), Integer.parseInt(rs.getString(10)));
//                list.add(pla);
//            }
//            response = listToJson(list);
//            //se cierra
//            pstmt.close();
//            //se termina la coneccion
//            this.disconnect();
//        } catch (SQLException ex) {
//            Logger.getLogger(RestaurantRepositoryMysql.class.getName()).log(Level.SEVERE, "Error al listar el menu del dia", ex);
//        }
        return response;
    }

    /**
     * Convierte una lista de tipo plato en un json
     *
     * @param list
     * @return
     */
//    public String listToJson(List<Plato> list) {
//        Gson gson = new Gson();
//        String response = gson.toJson(list);
//        return response;
//    }
    @Override
    public String savePlatoEjecutivo(PlatoEjecutivo instance) {
//        try {
//            if (findPlatoEjecutivo(instance.getId())) {
//                return "FALLO";
//            }
//
//            System.out.println("entro");
//
//            //primero se establece la conexion
//            this.connect();
//            //se estructura la sentencia sql en un string
//            String sql = "INSERT INTO platoejecutivo(PEJE_ID,MDIA_ID,PEJE_NOMBRE,PEJE_DESCRIPCION,PEJE_DIA,PEJE_ENTRADA,PEJE_PRINCIPIO,PEJE_BEBIDA,PEJE_PROTEINA,PEJE_PRECIO) VALUES (?,?,?,?,?,?,?,?,?,?)";
//            //pstmt mantendra la solicitud sobre la base de datos, se asignam sus columnas
//            PreparedStatement pstmt = conn.prepareStatement(sql);
//            //se registra cada elemento, OJO Ddebe cumplir estrictamente el orden y el tipo de dato
//            pstmt.setInt(1, instance.getId());
//            pstmt.setInt(2, instance.getMenuId());
//            pstmt.setString(3, instance.getNombre());
//            pstmt.setString(4, instance.getDescripcion());
//            pstmt.setString(5, String.valueOf(instance.getDiaSemana()));
//            pstmt.setString(6, instance.getEntrada());
//            pstmt.setString(7, instance.getPrincipio());
//            pstmt.setString(8, instance.getBebida());
//            pstmt.setString(9, instance.getProteina());
//            pstmt.setInt(10, (int) instance.getPrecio());
//            //se ejecuta la sentencia sql
//            pstmt.executeUpdate();
//            //se cierra
//            pstmt.close();
//            //se termina la coneccion
//            this.disconnect();
//            return instance.getNombre();
//        } catch (SQLException ex) {
//            Logger.getLogger(RestaurantRepositoryMysql.class.getName()).log(Level.SEVERE, "Error al insertar el registro", ex);
        return "FALLO";
//        }
        //lo ideal es retornor un id

    }

    /**
     * guarda un restaurante en la base de datos
     *
     * @param res instancia a guardar
     * @return
     */
    @Override
    public String saveRestaurant(Restaurant res) {

//        System.out.println("ingreso a guardar");
//        try {
//            this.connect();
//            String sql = "INSERT INTO restaurante(RES_NIT,RES_NOMBRE) VALUES (?,?)";
//            PreparedStatement pstmt = conn.prepareStatement(sql);
//            pstmt.setInt(1, res.getNit());
//            pstmt.setString(2, res.getNombre());
//            pstmt.executeUpdate();
//            se cierra
//            pstmt.close();
//            se termina la coneccion
//            this.disconnect();
//        } catch (SQLException ex) {
//            Logger.getLogger(RestaurantRepositoryMysql.class.getName()).log(Level.SEVERE, "Error al insertar el registro", ex);
//        }
        return res.getNombre();
    }

    @Override
    public String saveCustomer(Customer customer) {
//        try {
//
//            this.connect();
//            String sql = "INSERT INTO cliente(id, first_name, last_name, address, mobile, email, gender) VALUES (?,?,?,?,?,?,?)";
//            PreparedStatement pstmt = conn.prepareStatement(sql);
//            pstmt.setInt(1, customer.getCus_id());
//            pstmt.setString(2, customer.getCus_nombre());
//            pstmt.setString(3, customer.getCus_direccion());
//            pstmt.setString(4, customer.getCus_password());
//            pstmt.setString(5, customer.getCus_tipo());
//            
//
//            pstmt.executeUpdate();
//            pstmt.close();
//            this.disconnect();
//        } catch (SQLException ex) {
//            Logger.getLogger(RestaurantRepositoryMysql.class.getName()).log(Level.SEVERE, "Error al insertar el registro", ex);
//        }
//        
        return String.valueOf(customer.getCus_id());
    }

//    @Override
//    public Customer findCustomer(String id) {
//        Customer customer = null;
//        System.out.println("ENTRO A FINDCUSTOMER");
//        this.connect();
//        try {
//            String sql = "SELECT * from cliente where CLI_ID=? ";
//            PreparedStatement pstmt = conn.prepareStatement(sql);
//            pstmt.setString(1, id);
//            ResultSet res = pstmt.executeQuery();
//            if (res.next()) {
//                System.out.println("ENTRO AL IF");
//                customer = new Customer();
//                customer.setCus_id(res.getInt("CLI_ID"));
//                customer.setCus_nombre(res.getString("CLI_NOMBRE"));
//                customer.setCus_direccion(res.getString("CLI_DIRECCION"));
//                customer.setCus_password(res.getString("CLI_CONTRASENIA"));
//                customer.setCus_tipo(res.getString("CLI_TIPO"));
//            }
//            pstmt.close();
//            this.disconnect();
//        } catch (SQLException ex) {
//            Logger.getLogger(RestaurantRepositoryMysql.class.getName()).log(Level.SEVERE, "Error al consultar Customer de la base de datos", ex);
//        }
//        System.out.println("SALIO DE FINDCUSTOMER");
//        System.out.println("IMPRIMO CUSTUMER: "+ customer.getCus_nombre()+" "+customer.getCus_id());
//        return customer;
//    }

    @Override
    public String saveComponent(Component component) {
        System.out.println("ingreso a guardar componente");
        try {
            this.connect();
            String sql = "INSERT INTO componentes(COMP_ID,COMP_NOMBRE,COMP_TIPO) VALUES (?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, Integer.valueOf(component.getCompID()));
            pstmt.setString(2, component.getCompNombre());
            pstmt.setString(3, String.valueOf(component.getCompTipo()));

            pstmt.executeUpdate();
//            se cierra
            pstmt.close();
//            se termina la coneccion
            this.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(RestaurantRepositoryMysql.class.getName()).log(Level.SEVERE, "Error al insertar el registro", ex);
        }
        return component.getCompNombre();

    }

    @Override
    public Component finComponent(String id_component) {
        Component component = null;

        this.connect();
        try {
            String sql = "SELECT * from componentes where COMP_ID=? ";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, Integer.valueOf(id_component));
            ResultSet res = pstmt.executeQuery();
            if (res.next()) {
                component = new Component();
                component.setCompID(res.getString("COMP_ID"));
                component.setCompNombre(res.getString("COMP_NOMBRE"));
                component.setCompTipo(ComponentType.valueOf(res.getString("COMP_TIPO")));

            }
            pstmt.close();
            this.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(RestaurantRepositoryMysql.class.getName()).log(Level.SEVERE, "Error al consultar Customer de la base de datos", ex);
        }
        return component;
    }

    @Override
    public String listarComponentes() {
        List<Component> list = new ArrayList<>();
        String response = null;
        try {
            this.connect();
            String sql = "select * from componentes ";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Component comp = new Component(rs.getString(1), rs.getString(2), ComponentType.valueOf(rs.getString(3)));
                list.add(comp);
            }
            response = listToCompoJson(list);
            //se cierra
            pstmt.close();
            //se termina la coneccion
            this.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(RestaurantRepositoryMysql.class.getName()).log(Level.SEVERE, "Error al listar Componentes", ex);
        }
        return response;
    }

    private String listToCompoJson(List<Component> list) {
        Gson gson = new Gson();
        String response = gson.toJson(list);
        return response;
    }

    @Override
    public String listarRestaurantes() {
        List<Restaurant> list = new ArrayList<>();
        String response = null;
        try {
            this.connect();
            String sql = "select * from restaurante";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Customer customer= new Customer();
                customer.setCus_id(Integer.valueOf(rs.getString(2)));
                Restaurant restaurant = new Restaurant(Integer.valueOf(rs.getString(1)), customer, rs.getString(3), rs.getString(4));
                list.add(restaurant);
            }
            response = listToRestaurantJson(list);
            //se cierra
            pstmt.close();
            //se termina la coneccion
            this.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(RestaurantRepositoryMysql.class.getName()).log(Level.SEVERE, "Error al listar Restaurante", ex);
        }
        return response;
    }

    private String listToRestaurantJson(List<Restaurant> list) {
        Gson gson = new Gson();
        String response = gson.toJson(list);
        return response;
    }
    
    @Override
    public String findCustomer() {
               
        List<Customer> list = new ArrayList<>();
        String response = null;
        try {
            this.connect();
            String sql = "select * from cliente";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Customer customer = new Customer(Integer.valueOf(rs.getString(1)), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
                list.add(customer);
            }
            response = listToCustomerJson(list);
            //se cierra
            pstmt.close();
            //se termina la coneccion
            this.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(RestaurantRepositoryMysql.class.getName()).log(Level.SEVERE, "Error al buscar Cliente", ex);
        }
        return response;
    }
    private String listToCustomerJson(List<Customer> list) {
        Gson gson = new Gson();
        String response = gson.toJson(list);
        return response;
    }
    
    @Override
    public String updatePlatoEjecutivo(String IDplatoEJ, String ResNIT, String diaSemana, String AlmEjeDia_comp1, String AlmEjeDia_comp2, String AlmEjeDia_comp3, String AlmEjeDia_comp4, String precio) {
        if (!this.findPlatoEjecutivo(IDplatoEJ)) {
            return "FALLO";
        }
        
        System.out.println("ATRIBUTOS: " + IDplatoEJ+ "- " + ResNIT+ "- " + diaSemana+ "- " + AlmEjeDia_comp1+ "- " + AlmEjeDia_comp2+ "- " + AlmEjeDia_comp3+ "- " + AlmEjeDia_comp4+ "- " + precio);

    
            boolean componente_1 = actualizarAtributo("AlmEjeDia_comp1", ResNIT, AlmEjeDia_comp1);
            System.out.println("componente "+ componente_1);
            boolean componente_2 = actualizarAtributo("AlmEjeDia_comp2", ResNIT, AlmEjeDia_comp2);
            System.out.println("componente "+ componente_2);
            boolean componente_3 = actualizarAtributo("AlmEjeDia_comp3", ResNIT, AlmEjeDia_comp3);
            System.out.println("componente "+ componente_3);
            boolean componente_4 = actualizarAtributo("AlmEjeDia_comp4", ResNIT, AlmEjeDia_comp4);
            System.out.println("componente "+ componente_4);
            boolean diaEnum = actualizarAtributo("AlmEjeDia_DIASEM", ResNIT, diaSemana);
            System.out.println("componente "+ diaEnum);
            boolean result_precio = actualizarAtributo("AlmEjeDia_precio", ResNIT, precio);
            System.out.println("componente "+ result_precio);
            if(componente_1 && componente_2 && componente_3 && componente_4 && diaEnum && result_precio){
                 return IDplatoEJ; 
            }
       
        return "FALLO LA ACTUALIZACION";
    }
    
    
    
    /**
     * busca un plato del dia en la base de datos
     *
     * @param id identificador del plato
     * @return true si lo encuentra, false de lo contrario.
     */
    private boolean findPlatoEjecutivo(String plaEjeDia) {
        boolean resultado;
        try {
            this.connect();
            
            String sql = "select AlmEjeDia_ID from almuerzoejedia where AlmEjeDia_ID = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, Integer.valueOf(plaEjeDia));
            ResultSet rs = ps.executeQuery();
            resultado = rs.next();
            ps.close();
            this.disconnect();
            return resultado;
        } catch (SQLException ex) {
            System.out.println("revento excepcion encontrar plato_:" + ex.getMessage());
            return false;
        }
    }
    private boolean actualizarAtributo(String columna, String res_nit, String valor){
        boolean bandera;
         try {
        this.connect();
            //String sql = "UPDATE platoejecutivo set "+atributo+" = "+valor+" WHERE PEJE_NOMBRE = "+clave;
//                         "UPDATE almuerzoejedia SET AlmEjeDia_DIASEM = ? WHERE RES_NIT = ?";
            String sql = "UPDATE almuerzoejedia SET " + columna + " = ? WHERE RES_NIT = ?";
//            UPDATE almuerzoejedia SET AlmEjeDia_comp1 = 1 where RES_NIT = 126777 ;
            System.out.println("SENTENCIA SQL UPDATE PLATO EJECUTIVO: " + sql);
            PreparedStatement pstmt = conn.prepareStatement(sql);
            
            if(columna.equals("AlmEjeDia_DIASEM") ){
                pstmt.setString(1, valor);
            }else{
                pstmt.setInt(1, Integer.valueOf(valor));  
            }
            pstmt.setInt(2, Integer.parseInt(res_nit));
            pstmt.executeUpdate();
            pstmt.close();
            this.disconnect();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(RestaurantRepositoryMysql.class.getName()).log(Level.SEVERE, "Error al insertar el registro", ex);
            return false;
        }
         
    }

    @Override
    public String listarAlmuerzoEjeDia() {
      
     List<PlatoEjecutivo> list = new ArrayList<>();
        String response = null;
        try {
            this.connect();
            String sql = "select * from almuerzoejedia";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Component component_1 = new Component();
                component_1.setCompID(rs.getString(4));
                Component component_2 = new Component();
                component_2.setCompID(rs.getString(5));
                Component component_3 = new Component();
                component_3.setCompID(rs.getString(6));
                Component component_4 = new Component();                              
                component_4.setCompID(rs.getString(7));
                PlatoEjecutivo platoEje = new PlatoEjecutivo(rs.getInt(1),rs.getInt(2),DiaEnum.valueOf(rs.getString(3)),component_1,component_2,component_3,component_4,rs.getInt(8));
                list.add(platoEje);
            }
            response = listToPlatoEjeJson(list);
            //se cierra
            pstmt.close();
            //se termina la coneccion
            this.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(RestaurantRepositoryMysql.class.getName()).log(Level.SEVERE, "Error al listar los almuerzos ejcutivos del dia", ex);
        }
        return response;
    }

    private String listToPlatoEjeJson(List<PlatoEjecutivo> list) {
        Gson gson = new Gson();
        String response = gson.toJson(list);
        return response;
    }
    
}

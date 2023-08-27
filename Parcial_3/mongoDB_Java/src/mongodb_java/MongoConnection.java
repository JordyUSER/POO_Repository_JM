package mongodb_java;

import com.mongodb.MongoException;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import javax.swing.JOptionPane;

/**
 *
 * @author appka
 */
public class MongoConnection {
    public MongoDatabase conectar(){
        MongoDatabase database = null;
        MongoClient mongo = null;
        String servidor = "localhost";
        int puerto = 27017;
            try{
                mongo = new MongoClient(servidor,puerto);
                database = mongo.getDatabase("poo_tasktod");
                System.out.println("Mongo - Connection Success");
                return database;
            }catch(MongoException ME){
                JOptionPane.showMessageDialog(null, "Error al conectar con Mongo - " + ME.toString());
            }
        return database;
    }
}

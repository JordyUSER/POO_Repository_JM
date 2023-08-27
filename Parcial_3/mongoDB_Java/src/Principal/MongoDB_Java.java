package Principal;

import mongodb_java.MongoConnection;
import view.*;

/**
 *
 * @author appka
 */
public class MongoDB_Java {
    public static void main(String[] args) {
        viewLogin log = new viewLogin();
        log.setVisible(true);
        
        //MongoConnection MongoCon = new MongoConnection();
        //MongoCon.conectar();
    }
    
}

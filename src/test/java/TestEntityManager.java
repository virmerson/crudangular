import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Virmerson Bento dos Santos on 17/09/15.
 */
public class TestEntityManager {


    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("crudangular");

        EntityManager em = emf.createEntityManager();


        emf.close();
    }

}

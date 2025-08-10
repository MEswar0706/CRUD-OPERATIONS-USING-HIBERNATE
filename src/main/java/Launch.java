import com.hibernate.Entity.Role;
import com.hibernate.Entity.User;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class Launch {
    private static SessionFactory factory;

    public static void main(String[] args) {
    	
        // Initialize Hibernate
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        config.addAnnotatedClass(User.class);
        SessionFactory factory = config.buildSessionFactory();

        try (Session session = factory.openSession()) {
            Transaction transaction = session.beginTransaction();

            // --- CHOOSE OPERATIONS TO RUN ---
            // insertUser(session);
            // getUserById(session, 1);
            // getAllUsers(session);
            // updateUser(session, 1);
            // updateMultipleUsers(session);
            // deleteUser(session, 6);
            // deleteMultipleUsers(session);

            transaction.commit();
        } finally {
            factory.close();
        }
    }

    // 1. Insert a sample user
    private static void insertUser(Session session) {
        User user = new User("Ajay","ajay12","Ajay@123","ajay@gmail.com","9658741230","Majestic",Role.Restaurant_Admin);
        session.persist(user);
    }

    // 2. Select user by ID
    private static void getUserById(Session session, int id) {
        User user = session.get(User.class, id);
        System.out.println(user);
    }

    // 3. Select all users
    private static void getAllUsers(Session session) {
        Query<User> query = session.createQuery("FROM User", User.class);
        List<User> list = query.list();
        for(User user:list) {
        	System.out.println(user);
        }
    }

    // 4. Update a single user row
    private static void updateUser(Session session, int id) {
        User user = session.get(User.class, id);
        if(user != null) {
            user.setName("Eswar M");
            user.setPassword("Eswar@123");
        }
    }

    // 5. Update multiple rows
    private static void updateMultipleUsers(Session session) {
        Query query = session.createQuery("update User set address=concat(address, ' ', 'Bengaluru') where user_id in (1,2,6)");
        query.executeUpdate();
        
    }

    // 6. Delete a single user
    private static void deleteUser(Session session, int id) {
        User user = session.get(User.class, id);
        if (user != null) 
        session.remove(user);
    }

    // 7. Delete multiple users
    private static void deleteMultipleUsers(Session session) {
        Query query = session.createQuery("delete from User where user_id in (1,2,4)");
        query.executeUpdate();
    }
}

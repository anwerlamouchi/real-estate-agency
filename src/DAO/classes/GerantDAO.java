package DAO.classes;





import entities.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import technique.DataSource;


/**
 *
 * @author anwer
 */
public class GerantDAO {
    private Connection connection;
     private static GerantDAO instance;

    public static GerantDAO getInstance() {
        if (instance == null) {
            instance = new GerantDAO();
        }
        return instance;
    }
    
    private  GerantDAO (){
    
    connection = DataSource.getInstance();
    
    }
     public ArrayList<User> SelectGerant() {
        try {
        
            String requete = "select * from user where role='gerant'";
            PreparedStatement ps;
            ps =  connection.prepareStatement(requete);
            ResultSet result = ps.executeQuery();
            ArrayList<User> gerants = new ArrayList<User>();
            while (result.next()) {
              User gerant= new User();
               gerant.setId(result.getInt(1));
                gerant.setPrenom(result.getString(2));
                gerant.setNom(result.getString(3));
                gerant.setEmail(result.getString(4));
             
                gerant.setTelephone(result.getString(5));
                gerant.setAdresse(result.getString(6));
                 gerant.setLogin(result.getString(7));
               gerant.setPass(result.getString(8));
              
                gerants.add(gerant);
                
                  System.out.println("Gerant "+gerant.getLogin());
            }
            return gerants;
        } catch (Exception ee) {
            System.out.println("erreur dan select gerants " + ee.getMessage());
        }
        return null;
    }

    public ArrayList<String> SelectLogin(String pattern) {
        try {
            String requete = "select login from user where login like'" + pattern + "%'";
            PreparedStatement ps;
            ps =  connection.prepareStatement(requete);
            ResultSet result = ps.executeQuery();
             User gerant = new   User();
            ArrayList<String> tgerant = new ArrayList<>();
            while (result.next()) {
                tgerant.add(result.getString(1));
            }
            return tgerant;
        } catch (Exception ee) {
            System.out.println("erreur dan select gerant " + ee.getMessage());
        }
        return null;
    }

    public void ajoutGerant(  User  gerant) {
        try {
            String requete = "INSERT INTO `user`(`Id`, `prenom`, `nom`, `email`, `telephone`, `adresse`, `login`, `pass`,`role`) VALUES (null,?,?,?,?,null,?,?,'gerant')";
             PreparedStatement ps =  connection.prepareStatement(requete);
            ps.setString(1, gerant.getPrenom());
            ps.setString(2, gerant.getNom());
             ps.setString(3, gerant.getEmail());
         
            ps.setString(4,gerant.getTelephone() );
 
            ps.setString(5, gerant.getLogin());
            ps.setString(6, gerant.getPass());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("erreur dans la methode ajout gerant " + e.getMessage() + " " + e.getLocalizedMessage());
        }
    }

    public void deleteGerant(String login) {
        String requete = "delete from user where login=?";
        try {
            PreparedStatement ps =  connection.prepareStatement(requete);
            ps.setString(1, login);
            ps.executeUpdate();
            System.out.println("gerantsupprimée");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la suppression gerant" + ex.getMessage());
        }
    }

    public void updateGerant(String login, String password) {
        String requete = "UPDATE user SET pass=? WHERE login=?";
        try {
            PreparedStatement ps =  connection.prepareStatement(requete);
            ps.setString(1, password);
            ps.setString(2, login);
           
            ps.executeUpdate();
            System.out.println("gerant update");
        } catch (SQLException ex) {
            System.out.println("erreur lors de modification  gerants" + ex.getMessage());
        }
    }
    
    
    public User findGerantByLogin (String login){
    User gerant =null;
        String requete = "select login,pass from gerant where login='"+login+"'";
        try {
           Statement statement =   connection.createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while(resultat.next()){
              gerant = new  User();
               gerant.setLogin(resultat.getString(1));
               gerant.setPass(resultat.getString(2));
            }
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des geran "+ex.getMessage());
        }
        return gerant;
    }
      
      
      
   
}

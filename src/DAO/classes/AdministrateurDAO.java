package DAO.classes;





import entities.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import technique.DataSource;


/**
 *
 * @author anwer
 */
public class AdministrateurDAO {
    private Connection connection;
    
      private static AdministrateurDAO instance;

    public static  AdministrateurDAO getInstance() {
        if (instance == null) {
            instance = new  AdministrateurDAO();
        }
        return instance;
    }
   private AdministrateurDAO(){
    connection = DataSource.getInstance();
    }
      
      
    public ArrayList<User> SelectAdmin() {
        try {
        
            String requete = "select * from user where role='administrateur' ";
            PreparedStatement ps;
            ps = connection.prepareStatement(requete);
            ResultSet result = ps.executeQuery();
            ArrayList<User> tadmin = new ArrayList<User>();
            while (result.next()) {
               User admin = new User();
                admin.setId(result.getInt(1));
                admin.setPrenom(result.getString(2));
                admin.setNom(result.getString(3));
                admin.setEmail(result.getString(4));
          
                admin.setTelephone(result.getString(5));
                admin.setAdresse("");
                 admin.setLogin(result.getString(7));
                admin.setPass(result.getString(8));
              
                tadmin.add(admin);
                
                  System.out.println("admin "+admin.getLogin());
            }
            return tadmin;
        } catch (Exception ee) {
            System.out.println("erreur dan select administrateur " + ee.getMessage());
        }
        return null;
    }

    public ArrayList<String> SelectLogin(String pattern) {//authentification
        try {
            String requete = "select login from user where login like'" + pattern + "%'";
            PreparedStatement ps;
            ps = connection.prepareStatement(requete);
            ResultSet result = ps.executeQuery();
            User admin = new   User();
            ArrayList<String> tadmin = new ArrayList<>();
            while (result.next()) {
                tadmin.add(result.getString(1));
            }
            return tadmin;
        } catch (Exception ee) {
            System.out.println("erreur dan select administrateur " + ee.getMessage());
        }
        return null;
    }

    public void ajoutAdministrateur(   User  admin) {
        try {
            String requete = "INSERT INTO `user`(`Id`, `prenom`, `nom`, `email`, `telephone`, `adresse`, `login`, `pass`) VALUES (null,?,?,?,?,?,?,?,'administrateur')";
            
            PreparedStatement ps = connection.prepareStatement(requete);
            ps.setString(1, admin.getPrenom());
            ps.setString(2, admin.getNom());
                 ps.setString(3, admin.getEmail());
         
            ps.setString(4, admin.getTelephone());
            ps.setString(5, null);
            ps.setString(6, admin.getLogin());
            ps.setString(7, admin.getPass());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("erreur dans la methode ajout administrateur " + e.getMessage() + " " + e.getLocalizedMessage());
        }
    }

    public void deleteAdmin(String login) {//delete selon login
        String requete = "delete from user  where login=?";
        try {
            PreparedStatement ps =connection.prepareStatement(requete);
            ps.setString(1, login);
            ps.execute();
            System.out.println("administrateur supprimée");
        } catch (SQLException ex) {
            System.out.println("erreur lors de la suppression administrateur" + ex.getMessage());
        }
    }

    public void updateAdmin(String login, String password) {//apdate selon login et pass
        String requete = "UPDATE user SET pass=? WHERE login=?";
        try {
            PreparedStatement ps =  connection.prepareStatement(requete);
            ps.setString(1, password);
            ps.setString(2, login);
           
            ps.executeUpdate();
            System.out.println("admin update");
        } catch (SQLException ex) {
            System.out.println("erreur lors de modification  Admin" + ex.getMessage());
        }
    }
    
    
    public User finduserByLogin (String login){// return admin par id
      User admin =null;
        String requete = "SELECT * FROM `user` where login='"+login+"'";
        try {
           Statement statement = connection.createStatement();
            ResultSet resultat = statement.executeQuery(requete);
            while(resultat.next()){
               admin = new User();
               admin.setId(resultat.getInt(1));
                admin.setPrenom(resultat.getString(2));
                admin.setNom(resultat.getString(3));
                admin.setEmail(resultat.getString(4));
          
                admin.setTelephone(resultat.getString(5));
                admin.setAdresse(resultat.getString(6));
                 admin.setLogin(resultat.getString(7));
                admin.setPass(resultat.getString(8));
                admin.setRole(resultat.getString(9));
                
            }
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors du chargement des administrateurs "+ex.getMessage());
        }
        return admin;
//         public void refrech(){
//         
//         }
        
        
    }
      
    
//    public user findById(int id) {
//       String SQL_FIND =  "SELECT * FROM administrateur WHERE id=?";
//       user found = null;
//        
//        PreparedStatement pstmt = null;
//        ResultSet rs = null;       
//        
//        try{
//            
//            pstmt = connection.prepareStatement(SQL_FIND);
//            pstmt.setInt(1, id);
//            rs = pstmt.executeQuery();
//            if(rs.next()){
//                int userId = rs.getInt("id");
//                String userprenom = rs.getString("prenom");
//                String usernom = rs.getString("nom");
//                String useremail = rs.getString("email");
//                String usertelephone = rs.getString("telephone");
//                String useradresse = rs.getString("adresse");
//                String userlogin = rs.getString("login");
//                 String userpass = rs.getString("pass");
//                
//                 found = new user(userId,userprenom,usernom,useremail,usertelephone,useradresse,userlogin, userpass);      
//            }
//
//                
//        }catch(SQLException  ex){
//           Logger.getLogger(AdministrateurDAO.class.getName()).log(Level.SEVERE, "find failed", ex);
//        }
//        return found;
//    }


//  public void update(user user) {
//        if(findById(user.getId())!= null){
//            PreparedStatement pstmt = null;
//            String SQL_UPDATE =  "UPDATE user SET prenom=?, nom=?, email=?,  telephone=?,adresse=?,login=?,pass=? WHERE id=?";
//            try {
//                pstmt = connection.prepareStatement(SQL_UPDATE);
//                   pstmt.setString(1, user.getPrenom());
//                pstmt.setString(2, user.getNom());
//                pstmt.setString(3, user.getEmail());
//                  pstmt.setString(5, user.getTelephone());
//                pstmt.setString(4, user.getAdresse());
//                pstmt.setString(6, user.getLogin());
//                pstmt.setString(7, user.getPass());
//                pstmt.setInt(8, user.getId());
//                pstmt.executeUpdate();
//            } catch (SQLException ex) {
//                Logger.getLogger(user.class.getName()).log(Level.SEVERE, "update failed", ex);
//            }
//        }
//    }
//    
          
    }


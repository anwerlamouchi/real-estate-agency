/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.interfaces;

import entities.User;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jemacom
 */
public interface IAdminDAO {
    List<User> SelectAdmin();
    ArrayList<String> SelectLogin(String pattern);
    void insertAdmin(User admin);
    void updateAdmin(String login, String password);
    void deleteAdmin(String login);
   User findAdministrateurByLogin (String login);
   User findById(int id);
    void update(User user) ;
}

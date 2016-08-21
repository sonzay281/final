/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.eventmanager.dao.impl;

import com.leapfrog.eventmanager.constant.SQLConstant;
import com.leapfrog.eventmanager.dao.UserDAO;
import com.leapfrog.eventmanager.dbutil.DBConnection;
import com.leapfrog.eventmanager.entity.User;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Anonymous
 */
public class UserDAOImpl implements UserDAO {

    private DBConnection db = new DBConnection();

    @Override
    public int insertUser(User u) throws ClassNotFoundException, SQLException {
        db.open();
        PreparedStatement stmt = db.initStatement(SQLConstant.INSERT_USER);
        stmt.setString(1, u.getUsername());
        stmt.setString(2, u.getEmail());
        stmt.setString(3, u.getPassword());
        int result = db.executeUpdate();
        return result;
    }

    @Override
    public int updateUser(User u) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int deleteUser(User u) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User getByUsername() throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        /*  User u=null;
         String sql=SQLConstant.GETBYUSERNAME;
         db.open();
         PreparedStatement stmt=db.initStatement(sql);
         stmt.setString(1, username);
         ResultSet rs=stmt.executeQuery();
         while(rs.next()){
         u=new User();
         u.setUsername(rs.getString("username"));
         // u.set
         }*/
    }

    @Override
    public int insertEvent(User u) throws ClassNotFoundException, SQLException {
        db.open();
        PreparedStatement stmt = db.initStatement(SQLConstant.INSERT_EVENT);
        stmt.setString(1, u.getTitle());
        stmt.setDate(5, new java.sql.Date(u.getDate().getTime()));
        stmt.setString(3, u.getVenue());
        stmt.setString(4, u.getPassword());
        stmt.setString(5, u.getOrg_name());
        stmt.setString(6, u.getDescription());
        int result = db.executeUpdate();
        return result;
    }

    @Override
    public int updateEvent(User u) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int deleteEvent(User u) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insertContact(User u) throws ClassNotFoundException, SQLException {
        db.open();
        PreparedStatement stmt = db.initStatement(SQLConstant.INSERT_CONTACT);
        stmt.setString(1, u.getName());
        stmt.setString(2, u.getPhone());
        stmt.setString(3, u.getEmail());
        stmt.setString(4, u.getAddress());
        stmt.setString(5, u.getRelation());
        int result = db.executeUpdate();
        return result;
    }

    @Override
    public int updateContact(User u) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int deleteContact(User u) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User getByName(String name) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> getAll() throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

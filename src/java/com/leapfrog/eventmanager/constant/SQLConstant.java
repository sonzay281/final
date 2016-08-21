/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.eventmanager.constant;

/**
 *
 * @author Anonymous
 */
public class SQLConstant {

    public static final String INSERT_USER = "INSERT INTO " + TableConstant.USER_TABLE + "(email,username,password) VALUES(?,?,?)";
    public static final String UPDATE_USER = "UPDATE  " + TableConstant.USER_TABLE + " SET password=? WHERE username=?";
    public static final String INSERT_EVENT = "INSERT INTO " + TableConstant.EVENT_TABLE + "(title,venue,date,description,org_name) VALUES(?,?,?,?)";
    public static final String UPDATE_EVENT = "UPDATE  " + TableConstant.EVENT_TABLE + " SET title=?,venue=?,date=?,description=?,org_name=? WHERE title=?";
    public static final String DELETE_EVENT = "";
    public static final String GETBTUSERNAME="SELECT * FROM " +TableConstant.EVENT_TABLE + "WHERE USERNAME=?"; 
    public static final String INSERT_CONTACT = "INSERT INTO " + TableConstant.CONTACT_TABLE + "(name,relation,email,phone,address) VALUES(?,?,?,?,?)";
    public static final String UPDATE_CONTACT = "UPDATE  " + TableConstant.CONTACT_TABLE + " SET name=?,relation=?,email=?,phone=?,address=? WHERE name=?";
    public static final String DELETE_CONTACT = "";
}

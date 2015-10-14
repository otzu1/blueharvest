/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blueharvest.geocaching.util;

/**
 *
 * @author jmb
 * @since 2015-10-14
 */
public class security {
    
    private final String lAlpha = "abcdefghijklmnopqrstuvwxyz";
    private final String lSub = "derematoglyphicsbfjknquvwxz";
    private final String uAplha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final String uSub = "DERMATOGLYPHICSBFJKNQUWXZ";
    
    /**
     * <h3>constructor</h3>
     * discourage instantiation
     * @since 2015-10-14
     */
    private security() {
    }
    
    public String encrypt(String s) {
        if (s == null) return null;
        // todo
        // http://stackoverflow.com/questions/26910570/ms-access-encrypt-users-passwords-stored-in-user-table-sql
        return "";
    }
    
    public String decrypt(String s) {
        //todo: see encrypt
        return null;
    }
    
}

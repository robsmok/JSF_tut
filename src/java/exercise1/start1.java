/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author r.smoter
 */
@ManagedBean
@RequestScoped
public class start1 {
    /**
     * Creates a new instance of start1
     */
    public String getMessage(){
        return "Hello WWOORRLLDD";
    }
    
    public String getMessage2(){
        return "222222222222222";
    }
    
    
}

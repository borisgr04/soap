/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientsoap;

import co.edu.unicesar.WebService1;
import co.edu.unicesar.WebService1Soap;

/**
 *
 * @author borisgr04
 */
public class ClientSoap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WebService1  soap= new WebService1();
        int n1=1;
        int n2=2;
        int resultado;
        resultado=soap.getWebService1Soap().suma(n1, n2);
        System.out.println(resultado);
        resultado=soap.getWebService1Soap().resta(n1, n2);
        System.out.println(resultado);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorasoap;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author pjeferson
 */
@WebService(serviceName = "Calculadora")
@Stateless()
public class Calculadora {

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "somar")
    public int somar(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
        int resultado = num1+num2;
        return resultado;
    }
    
    @WebMethod(operationName = "subtrair")
    public int subtrair(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
        int resultado = num1-num2;
        return resultado;
    }
    
    @WebMethod(operationName = "multiplicar")
    public int multiplicar(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
        int resultado = num1*num2;
        return resultado;
    }
    
    @WebMethod(operationName = "dividir")
    public int dividir(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
        int resultado = num1/num2;
        return resultado;
    }
}

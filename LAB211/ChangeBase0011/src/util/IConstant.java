/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author ad
 */
public interface IConstant {
   String BINARY_VALID = "^[01]+$";
   String DECIMAL_VALID = "^[0-9]+$";
   String HEXADECIMAL_VALID = "^[0-9a-fA-F]+$";
   
   char[] HEXACHAR = {
        '0', '1', '2', '3', '4', '5', '6', '7',
        '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
    };
}

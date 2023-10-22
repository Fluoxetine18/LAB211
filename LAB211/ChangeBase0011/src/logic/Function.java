package logic;

import util.IConstant;

public class Function {

    /**
     * Function use to convert from input value base to output value base
     * @param baseInput     base number input
     * @param baseOutput    base number output        
     * @param inputValue    value choice want to convert
     * @return output value
     */
    public String convert(int baseInput, int baseOutput, String inputValue) {
        int decimal = convertInputValueToDecimal(baseInput, inputValue);
        String outputValue = convertDecimalToOutputValue(baseOutput, decimal);
        return outputValue;
    }

    /**
     * Convert temp value to output value base
     * @param outputBase    base number output
     * @param decimal       temp value while convert input value to output value
     * @return output value be converted from input value
     */
    private String convertDecimalToOutputValue(int outputBase, int decimal) {
        String output = "";
        switch (outputBase) {
            case 1:
                output = convertDecimalToBinary(decimal);
                break;
            case 2:
                output = Integer.toString(decimal);
                break;
            case 3:
                output = convertDecimalToHexa(decimal);
                break;
        }
        return output;
    }

    /**
     * Convert input value base to temp value
     * @param inputBase 
     * @param inputValue
     * @return temp value is formated decimal base
     */
    private int convertInputValueToDecimal(int inputBase, String inputValue) {
        int decimal = 0;
        switch (inputBase) {
            case 1:
                decimal = convertBinaryToDecimal(inputValue);
                break;
            case 2:
                decimal = Integer.parseInt(inputValue);
                break;
            case 3:
                decimal = convertHexaToDecimal(inputValue);
                break;
            default:
                break;
        }
        return decimal;
    }

    /**
     * Convert binary base to decimal base
     * @param binary    binary value need to convert
     * @return decimal base
     */
    private int convertBinaryToDecimal(String binary) {
        int decimal = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, (binary.length() - 1 - i));
            }
        }
        return decimal;
    }

    /**
     * 
     * @param hexa  hexadecimal .....
     * @return 
     */
    private int convertHexaToDecimal(String hexa) {
        int decimal = 0;
        for (int i = 0; i < hexa.length(); i++) {
            char c = hexa.charAt(i);
            int d = 0;
            for (int j = 0; j < IConstant.HEXACHAR.length; j++) {
                if (c == IConstant.HEXACHAR[j]) {
                    d = j;
                }
            }
            decimal = decimal * 16 + d;
        }
        return decimal;
    }

    /**
     * 
     * @param decimal
     * @return 
     */
    private String convertDecimalToBinary(int decimal) {
        String binary = "";
        while (decimal > 0) {
            binary = Integer.toString(decimal % 2) + binary;
            decimal /= 2;
        }
        return binary;
    }

    /**
     * 
     * @param decimal
     * @return 
     */
    private String convertDecimalToHexa(int decimal) {
        String hexa = "";
        while (decimal > 0) {
            hexa = IConstant.HEXACHAR[decimal % 16] + hexa;
            decimal /= 16;
        }
        return hexa;
    }
}
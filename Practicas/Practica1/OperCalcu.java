package Practicas.Practica1;

public class OperCalcu {

    public String opResultado(String operador, int pNum, int sNum) {
        // Operaciones que se realizan
        switch (operador) {
        case "+":
            int suma = pNum + sNum;
            return suma + "";

        case "-":
            int resta = pNum - sNum;
            return resta + "";

        case "*":
            int multiplicacion = pNum * sNum;
            return multiplicacion + "";

        case "/":
            if (pNum > 0 && sNum > 0) {
                int divicion = pNum / sNum;
                return divicion + "";
            } else {
                return "No se Puede dividir entre cero";
            }

        case "^":
            if (sNum != 0) {
                double elevar = Math.pow(pNum, sNum);
                return elevar + "";
            }
            break;
        default:
            return "";
        }

        return null;
    }

}
package herramientas;

import estructurasdlineales.PilaInfoEstatica;

// esta clase manipula métodos de control de aspectos de matemáticas
public class Matematicas {

    public static Double evaluarInfija(String infija) {
        // primero, se debe cambiar de infija a postfija o prefija
        // por ejemplo
        // String posfija = infijaAPosfija(infija);
        // Double resultado = evaluarPostfija
        return null;
    }

    public static Double evaluarPostfija(String postfija) {
        // por ejemplo, se recibe esto:
        // a b c * d e - f ^ / +
        // 0 1 2 3 4 5 6 7 8 9 10 cada token
        PilaInfoEstatica pila = new PilaInfoEstatica(postfija.length());

        for (int cadaToken = 0; cadaToken < postfija.length(); cadaToken++) {
            // paso 1: tokeniar la EPOS de izq a der
            char token = postfija.charAt(cadaToken);

            // paso 2: si el token es operando, se mete en la pila
            if (esOperando(token + "") == true) {
                boolean retorno = pila.poner(token + "");
                if (retorno == false) {
                    return null;
                }
            } else {
                // paso 3: si el token es operador, se sacan dos operandos
                // de la pila (el primero es op2), se calcula es resultado
                // y se ingresa en la pila
                String operando2 = (String)pila.quitar();
                String operando1 = (String)pila.quitar();
                double op1 = Double.parseDouble(operando1);
                double op2 = Double.parseDouble(operando2);
                Double resultadoParcial = operacion(op1, op2, token);
                boolean retorno = pila.poner(resultadoParcial + "");
                if (retorno == false) {
                    return null;
                }
            }
        }
        // el resultado de la operación se encuentra en la pila
        Double resultado = Double.parseDouble((String)pila.quitar());
        return resultado;
    }

    public static Double operacion(Double op1, Double op2, double oper) {
        if (oper == '+') {
            return op1 + op2;
        } else if (oper == '-') {
            return op1 - op2;
        } else if (oper == '/') {
            if (op2 != 0) {
                return op1 / op2;
            } else {
                return null;
            }
        } else if (oper == '*') {
            return op1 * op2;
        } else if (oper == '^') {
            return Math.pow(op1, op2);
        } else if (oper == '%') {
            return op1 % op2;
        } else {
            return null;
        }
    }

    public static boolean esOperando(String token) {
        if (token.equalsIgnoreCase("+") == false &&
            token.equalsIgnoreCase("-") == false &&
            token.equalsIgnoreCase("*") == false &&
            token.equalsIgnoreCase("/") == false &&
            token.equalsIgnoreCase("^") == false &&
            token.equalsIgnoreCase("%") == false &&
            token.equalsIgnoreCase("(") == false &&
            token.equalsIgnoreCase(")") == false) {

            return true;
        } else {
            return false;
        }
    }

    public static Double evaluarPrefija(String prefija) {
        return null;
    }

    public static Double infijaAPostfija(String infija) {
        return null;
    }

    public static Double infijaAPrefija(String infija) {
        return null;
    }

}

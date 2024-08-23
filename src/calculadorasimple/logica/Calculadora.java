package calculadorasimple.logica;

import calculadorasimple.operaciones.Operacion;
import calculadorasimple.operaciones.*;

public class Calculadora {

    public Integer calcular(Integer numero1, Integer numero2, String simbolo) {
        Operacion operacion = simbolo.equals("+") ? new Suma() :
                        simbolo.equals("-") ? new Resta() :
                        simbolo.equals("*") ? new Multiplicacion() :
                        new Division();

        return operacion.calcular(numero1, numero2);
    }
}

package calculadorasimple.operaciones;

public class Division extends Operacion {

    @Override
    public Integer calcular(Integer numero1, Integer numero2) {
        validarEntradas(numero1, numero2);
        if (numero2 == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return numero1 / numero2;
    }
}

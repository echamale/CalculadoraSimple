package calculadorasimple.operaciones;

public class Multiplicacion extends Operacion {

    @Override
    public Integer calcular(Integer numero1, Integer numero2) {
        validarEntradas(numero1, numero2);
        return numero1 * numero2;
    }
}

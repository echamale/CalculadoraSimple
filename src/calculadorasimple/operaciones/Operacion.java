package calculadorasimple.operaciones;

import calculadorasimple.interfaces.IOperacion;

public abstract class Operacion implements IOperacion {

    protected void validarEntradas(Integer numero1, Integer numero2) throws NullPointerException {
        if (numero1 == null || numero2 == null) {
            throw new NullPointerException("Los números a operar no pueden ser nulos");
        }
    }

    public abstract Integer calcular(Integer numero1, Integer numero2);
}

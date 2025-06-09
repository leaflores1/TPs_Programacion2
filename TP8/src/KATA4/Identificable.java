package KATA4;

import java.util.Objects;

public interface Identificable<K> {

    /** Devuelve la clave única del objeto. */
    K getID();

    /** Compara la clave del objeto con otra que llega por parámetro. */
    default boolean tieneMismoID(K id) {
        return Objects.equals(getID(), id);
    }
}
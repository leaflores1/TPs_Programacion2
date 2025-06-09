package KATA4;
import java.util.Collection;

class Buscador<T extends Identificable<K>, K> {
    public T buscar(Collection<? extends T> elementos, K id) {
        for (T elem : elementos) {
            if (elem.tieneMismoID(id)) {
                return elem;
            }
        }
        return null;
    }
}


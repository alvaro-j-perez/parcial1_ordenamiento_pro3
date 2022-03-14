package gt.edu.umg.progra3.parcial1;

import java.nio.charset.CoderMalfunctionError;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DinamicStructuresManager<T> {

    List<T> values;

    public DinamicStructuresManager(List<T> values) {
        this.values = values;
    }

    public List<T> ordenar(){
        //se llama a la libreria
        //el sort lo que hace es que me ordena
        // se le meten los dos parametros para llamar a la lista
        Collections.sort(values,null);

        //inserte codigo aqui
        //es el valor que se esta ordenando
        return values;
    }
        // FUNCION QUE ORDENA DE MANERA INVERSA
    public List<T> ordenarInversa(){
        Collections.sort(values,null);//SE VUELVE A LLAMAR LA COLECCION Y EL VALOR QUE ESTA ORDENANDO
        Collections.reverse(values);//REGRESA BUSCANDO LOS DATOS DE MANERA INVERSA
        //inserte codigo aqui
        return values;
    }

}

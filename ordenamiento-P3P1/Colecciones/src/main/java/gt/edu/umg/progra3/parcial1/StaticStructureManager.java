package gt.edu.umg.progra3.parcial1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StaticStructureManager<T> {

    T[] values ;

    public StaticStructureManager(T[] values) {
        this.values = values;
    }

    public T[] ordenar(){
        Arrays.sort(values);// LLAMO A UN ARRAY Y ESTE VALUA LA COLLECION
        //inserte codigo aqui
        return values;
    }

    public T[] ordenarInversa(){
        Arrays.sort(values);//SE VALUA EL VALOR ORDENADO
        Collections.reverse(Arrays.asList(values));//SE HACE LA CONVERSION PARA QUE LO LEA COMO LISTA
        //inserte codigo aqui

        return values;//SE RETORNA EL VALOR
    }

}

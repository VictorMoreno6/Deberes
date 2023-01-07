package org.example;

public class Utilidades {
    public static boolean hayTriangulo(double lado, double lado2, double lado3){
        boolean respuesta = false;
        if (((lado+lado2)>lado3)&&((lado2+lado3)>lado)&&((lado3+lado)>lado2))
            respuesta = true;
        return respuesta;
    }
}
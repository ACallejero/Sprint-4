// Este programa corresponde a la parte dos del Sprin 3.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

// Declaramos las variables que vamos a necesitar.
        int numeroAlumno;
        int hermanoCentro;
        int mismcaPoblacion;
        int padresPoblacion;
        int dicapacidad33;
        int familiaNumerosa;

// Creamos el bucle para el número del alumno.
        while (true) {
            System.out.println("Ingrese el número del alumno: ");
            numeroAlumno = sc.nextInt();
            if (numeroAlumno >= 1 && numeroAlumno <= 499) {
                break;
            } else {
                System.out.println("El número del alumno debe estar entre 0 y 499.\n Compruebe tambien que el número ingresado es un número entero.");
            }
        }

// Preguntamos y guardamos las respuestas para calcular la puntuacion.
        System.out.println("Tiene algun hermano en el centro? \n 0: No / 1: Si");
        hermanoCentro = sc.nextInt();
        System.out.println("Vive en la poblacion del centro? \n 0: No / 1: Si");
        mismcaPoblacion = sc.nextInt();
        System.out.println("Algun padre trabaja en esa poblacion? \n 0: No / 1: Si");
        padresPoblacion = sc.nextInt();
        System.out.println("Tiene alguna discapacidad superior al 33% o enfermedad cronica? \n 0: No / 1: Si");
        dicapacidad33 = sc.nextInt();
        System.out.println("Es familia numerosa o monoparental? \n 0: No / 1: Si");
        familiaNumerosa = sc.nextInt();

// Calculamos la puntuacion.
        int puntuacion = 0;

        if (hermanoCentro == 1) {
            puntuacion += 40;
        } else {
            puntuacion += 0;
        }

// Comprobamos si vive en la poblacion y sus padres trabajan en la poblacion,
// en ese caso solo sumaremos la puntuacion mas alta.
        if (mismcaPoblacion == 1 && padresPoblacion == 1) {
            puntuacion += 30;
        } else {
            if (mismcaPoblacion == 1) {
                puntuacion += 30;
            } else {
                puntuacion += 0;
            }
            if (padresPoblacion == 1) {
                puntuacion += 20;
            } else {
                puntuacion += 0;
            }
        }

        if (dicapacidad33 == 1) {
            puntuacion += 10;
        } else {
            puntuacion += 0;
        }
        if (familiaNumerosa == 1) {
            puntuacion += 15;
        } else {
            puntuacion += 0;
        }
        System.out.println("Número de alumno: " + numeroAlumno + "\n");
        System.out.println("La puntuacion total es de "
                + puntuacion);

    }
}

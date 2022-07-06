import java.util.Scanner;

class Calificacion {
  static double calcular(int[] califs) {
    double promedio = 0;
    for (int i = 0; i < califs.length; i++) {
      promedio += califs[i];
    }
    promedio = promedio / califs.length;
    return promedio;
  }

  static char Final(double promedio) {
    if (promedio >= 91) {
      return 'A';
    } else if (promedio >= 81) {
      return 'B';
    } else if (promedio >= 71) {
      return 'C';
    } else if (promedio >= 61) {
      return 'D';
    } else if (promedio >= 51) {
      return 'E';
    } else {
      return 'F';
    }
  }

  static void Resultados(String nombre, int[] califs, double promedio, char calificacion) {
    System.out.println("Nombre del alumno: " + nombre);
    for (int i = 0; i < califs.length; i++) {
      System.out.println("Calificacion " + (i + 1) + ": " + califs[i]);
    }
    System.out.println("Promedio: " + promedio);
    System.out.println("Calificacion: " + calificacion);
  }

  public static void main(String args[]) {

    Scanner textinput = new Scanner(System.in);
    System.out.print("Nombre del estudiante: ");
    String nombre = textinput.nextLine();

    int[] califs = new int[5];

    for (int i = 0; i < califs.length; i++) {
      System.out.print("Calificacion " + (i + 1) + ": ");
      califs[i] = textinput.nextInt();
    }
    double promedio = calcular(califs);
    char calificacion = Final(promedio);

    Resultados(nombre, califs, promedio, calificacion);

    textinput.close();
  }
}

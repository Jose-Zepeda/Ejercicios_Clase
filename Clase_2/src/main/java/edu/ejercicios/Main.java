package edu.ejercicios;

import edu.ejemplo.clsEjemplo;

import java.io.BufferedReader;
import java.io.IOException;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ingrese A :");
        String a = br.readLine();
        System.out.print("Ingrese B:");
        String b = br.readLine();

        int varA = Integer.parseInt(a);
        int varB = Integer.parseInt(b);

        clsEjemplo ej = new clsEjemplo();
        ej.calculo(varA, varB);

    }
}
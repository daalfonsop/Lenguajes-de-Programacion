/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Mascota;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author walter
 */
public class LogicaMascotas {

    static ArrayList<Mascota> mascotas = new ArrayList<>();
    static ArrayList<Icon> pokemons = new ArrayList<>();
    static Mascota pet;

    public static Mascota getPet() {
        return pet;
    }
    public static ArrayList<Icon> getPokemons() {
        return pokemons;
    }

    public static void setPokemons(ArrayList<Icon> pokemons) {
        LogicaMascotas.pokemons = pokemons;
    }
    
    
    public static void crear(Mascota pet,String nombreM, String raza, String edad, String nombreD, String celular, Icon icon) {
        pet = new Mascota(nombreM, raza, edad, nombreD, celular, icon);
        mascotas.add(pet);
        System.out.println("Mascota ingresada");
    }
    public static ArrayList<Mascota> ver(){
        
        return mascotas;
    }
    public static void borrar(String pet){
        ArrayList<Mascota> copy = new ArrayList<>(mascotas);
        for(Mascota mascota:copy){
            if(mascota.getNombreMascota().equals(pet)){
                mascotas.remove(mascota);
                //System.out.println("Mascota retirada");
            }
        }
    }
    public static void borrar(){
        ArrayList<Mascota> copy = new ArrayList<>(mascotas);
        for(Mascota mascota:copy){
            mascotas.remove(mascota);

        }
    }
    public static void modificar(Mascota pet, String nombreM, String raza, String edad, String nombreD, String celular){
        pet.setNombreDueño(nombreD);
        pet.setNombreMascota(nombreM);
        pet.setEdad(edad);
        pet.setRaza(raza);
        pet.setCelular(celular);
    }
    
}

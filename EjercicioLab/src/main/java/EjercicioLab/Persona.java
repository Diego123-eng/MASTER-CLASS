/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioLab;

/**
 *
 * @author Usuario
 */
public class Persona { 
    
    String Nombre;
    int Edad;
    String Sexo;
    Float Peso;
    Float Altura; 

    public Persona() {
    }

    public Persona(String Nombre, int Edad, String Sexo) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Sexo = Sexo;
    }

    public Persona(String Nombre, int Edad, String Sexo, Float Peso, Float Altura) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Sexo = Sexo;
        this.Peso = Peso;
        this.Altura = Altura;
    }
    
//    Metodo get y set

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public Float getPeso() {
        return Peso;
    }

    public void setPeso(Float Peso) {
        this.Peso = Peso;
    }

    public Float getAltura() {
        return Altura;
    }

    public void setAltura(Float Altura) {
        this.Altura = Altura;
    }
    
    String EsMayorDeEdad () {
        int edad = this.Edad;
        if (Edad < 18) { 
            return "Es menor de edad";
        }else{
            return "Es mayor de edad";
        }
    
    }

  
    public String Persona1() {
        return "Persona{" + "Nombre=" + Nombre + ", Edad=" + Edad + ", Sexo=" + Sexo + ", Peso=" + Peso + ", Altura=" + Altura + '}';
    }

  
    public String Persona2() {
        return "Persona{" + "Nombre=" + Nombre + ", Edad=" + Edad + ", Sexo=" + Sexo + '}';
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2Miguel;

/**
 *
 * @author Miguel Febres y David Blanco 
 */
public class Documento {
    private String titulo;
    private int tamano;
    private String tipo;
    private int segundos;
    private boolean imprimiendo;
    
    public Documento(String titulo, int tamano, String tipo, int segundos){
        this.titulo = titulo;
        this.tamano = tamano;
        this.tipo = tipo;
        this.segundos = segundos;
        this.imprimiendo = false;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the tamano
     */
    public int getTamano() {
        return tamano;
    }

    /**
     * @param tamano the tamano to set
     */
    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the segundos
     */
    public int getSegundos() {
        return segundos;
    }

    /**
     * @param segundos the segundos to set
     */
    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    /**
     * @return the imprimiendo
     */
    public boolean isImprimiendo() {
        return imprimiendo;
    }

    /**
     * @param imprimiendo the imprimiendo to set
     */
    public void setImprimiendo(boolean imprimiendo) {
        this.imprimiendo = imprimiendo;
    }
    
    
}

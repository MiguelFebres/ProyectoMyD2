/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2Miguel;

import java.util.Arrays;

/**
 *
 * @author Miguel Febres y David Blanco
 * 
 */
public class Usuario {
    private String nombre_usuario;
    private String prioridad;
    private Documento[] documentosCreados;
    
    public Usuario(String nombre, String prioridad){
        this.nombre_usuario = nombre;
        this.prioridad = prioridad;
        this.documentosCreados = new Documento[1];
        this.documentosCreados[0] = null;
        
    }
    /**
     * @return the nombre_usuario
     */
    public String getNombre_usuario() {
        return nombre_usuario;
    }

    /**
     * @param nombre_usuario the nombre_usuario to set
     */
    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    /**
     * @return the prioridad
     */
    public String getPrioridad() {
        return prioridad;
    }

    /**
     * @param prioridad the prioridad to set
     */
    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    /**
     * @return the documentosCreados
     */
    public Documento[] getDocumentosCreados() {
        return documentosCreados;
    }

    /**
     * @param documentosCreados the documentosCreados to set
     */
    public void setDocumentosCreados(Documento[] documentosCreados) {
        this.documentosCreados = documentosCreados;
    }
       
    public void crearDocumento(String titulo, int tamaño, String tipo, int segundos){
        boolean found = false;
        for (int i = 0; i < this.getDocumentosCreados().length; i++) {
            if(this.getDocumentosCreados()[i] == null || this.getDocumentosCreados()[i].getTitulo().equals("")){
                this.getDocumentosCreados()[i] =  new Documento(titulo,tamaño,tipo,segundos);
                found = true;
                break;
            }
                
        }
        if(!found){
            Documento[] more_documents = new Documento[this.getDocumentosCreados().length+1];
            Arrays.fill(more_documents, new Documento("", 0, "",0));
            for (int i = 0; i < this.getDocumentosCreados().length; i++) {
                more_documents[i] = this.getDocumentosCreados()[i];
            }
            more_documents[this.getDocumentosCreados().length] = new Documento(titulo,tamaño,tipo,segundos);
            this.setDocumentosCreados(more_documents);
        }
    }
    
    public void imprimir_documento(Documento doc, Monticulo_Bin printer){
        printer.insertar_doc(doc.getTitulo(), doc.getTamano(), doc.getTipo(), doc.getSegundos());
        System.out.println("AÑADIDO EXITOSAMENTE A LA COLA DE IMPRESIÓN");
    }
    
    public String mostrarDocsTextArea(){
        String docs = "";
        for (int i = 0; i < getDocumentosCreados().length; i++) {
            if (getDocumentosCreados()[i] != null && !documentosCreados[i].getTitulo().equals("")) {
                String send = "";
                if(getDocumentosCreados()[i].isImprimiendo()){
                    send = "En cola";
                }
                docs += "       " + getDocumentosCreados()[i].getTitulo() + " "+getDocumentosCreados()[i].getTipo() + ": " + send + "\n";
            }
        }
        return docs;
    }



}

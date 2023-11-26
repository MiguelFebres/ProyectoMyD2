/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2Miguel;

import static java.awt.image.ImageObserver.HEIGHT;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel Febres y David Blanco
 */
public class TablaDeDispersion {
    private Usuario[] tabla_usuarios;
    private int tamaño_tabla;
    private int usuarios_en_tabla;
    
    public TablaDeDispersion(){
        this.tabla_usuarios = new Usuario[333];
        this.tamaño_tabla = 333;
        usuarios_en_tabla = 0;
        //INICIALIZAMOS CADA POSICION DEL ARREGLO CON UN USUARIO VACIO
        Arrays.fill(this.tabla_usuarios, new Usuario("", ""));
    }
    public void registrar_usuario(String nombre, String prioridad){
        Usuario user = new Usuario(nombre, prioridad);
        int index = convertirUsuarioInt(nombre);
        if(this.getTabla_usuarios()[index].getNombre_usuario().equals("")){
            this.getTabla_usuarios()[index] = user;
            setUsuarios_en_tabla(getUsuarios_en_tabla() + 1);
        }else{
            if (getUsuarios_en_tabla() == getTamaño_tabla()){
                System.out.println("Numero máximo de usuarios alcanzado");
            }else{
            while(index < getTamaño_tabla() && !this.tabla_usuarios[index].getNombre_usuario().equals("")){
                index++;
                if (index == getTamaño_tabla()){
                    index = 0;
                }
            }
            this.getTabla_usuarios()[index] = user;
                setUsuarios_en_tabla(getUsuarios_en_tabla() + 1);
            }
        }
    }   
    public int convertirUsuarioInt(String username){
        int n = 33;
        int index = 0;
        for (int i = 0; i < username.length(); i++) {      
            index = n*index + username.charAt(i); 
            if (index< 0){
                index*=-1;
            }
        }
        return index%332;
    }
      
    public void eliminar_usuario(String nombre){
        int hash = convertirUsuarioInt(nombre);
        if(this.getTabla_usuarios()[hash] != null && this.getTabla_usuarios()[hash].getNombre_usuario().equals(nombre)){
            this.getTabla_usuarios()[hash] = new Usuario("", "");
        }else if(this.getTabla_usuarios()[hash] == null || this.getTabla_usuarios()[hash].getNombre_usuario().equals("")){
            JOptionPane.showMessageDialog(null, "El usuario no existe");
            return;
        }
            else{
            while(hash < getTamaño_tabla() && !this.tabla_usuarios[hash].getNombre_usuario().equals(nombre)){
            hash++;
            if (hash == getTamaño_tabla()){
                    hash = 0;
                }
            }
            this.getTabla_usuarios()[hash] = new Usuario("", "");
        }
        

    }  
  
    
    public Usuario buscar_usuario(String nombre){
        int hash = convertirUsuarioInt(nombre);
        if(this.getTabla_usuarios()[hash].getNombre_usuario().equals(nombre)){
            return this.getTabla_usuarios()[hash];
        }else{
            int cont = 0;
            while(cont < getUsuarios_en_tabla() && hash < getTamaño_tabla() && !this.tabla_usuarios[hash].getNombre_usuario().equals(nombre)){
                hash++;
                if (hash == getTamaño_tabla()){
                        hash = 0;
                    }
                cont ++;
                }
            if(this.getTabla_usuarios()[hash].getNombre_usuario().equals(nombre)){
            return this.getTabla_usuarios()[hash];}
            else{
                System.out.println("No encontrado");
                return null;
        }}
    }
    public Documento buscar_documento(String nombre, String titulo){
        Usuario user = buscar_usuario(nombre);
        if (user!= null){
            for (int i = 0; i < user.getDocumentosCreados().length; i++) {
                if (user.getDocumentosCreados()[i] != null && user.getDocumentosCreados()[i].getTitulo().equals(titulo)) {
                    return user.getDocumentosCreados()[i];
            }
        }}
        return null;
    }
    
    public boolean borrar_documento(String nombre, String titulo){
        Usuario user = buscar_usuario(nombre);
        for (int i = 0; i < user.getDocumentosCreados().length; i++) {
            if (user.getDocumentosCreados()[i] != null && user.getDocumentosCreados()[i].getTitulo().equals(titulo)) {
                user.getDocumentosCreados()[i] = new Documento("", 0, "",0);
                return true;
            }
        }
        return false;
    }
    

    
    public String usuarios_textArea(String print){
        for (int i = 0; i < getTamaño_tabla(); i++) {
            if(!tabla_usuarios[i].getNombre_usuario().equals("")){
                print+= getTabla_usuarios()[i].getNombre_usuario() + " " + getTabla_usuarios()[i].getPrioridad() + "\n";
                print += getTabla_usuarios()[i].mostrarDocsTextArea();
            }
        }
        return print;
    }

    /**
     * @return the tabla_usuarios
     */
    public Usuario[] getTabla_usuarios() {
        return tabla_usuarios;
    }

    /**
     * @param tabla_usuarios the tabla_usuarios to set
     */
    public void setTabla_usuarios(Usuario[] tabla_usuarios) {
        this.tabla_usuarios = tabla_usuarios;
    }

    /**
     * @return the tamaño_tabla
     */
    public int getTamaño_tabla() {
        return tamaño_tabla;
    }

    /**
     * @param tamaño_tabla the tamaño_tabla to set
     */
    public void setTamaño_tabla(int tamaño_tabla) {
        this.tamaño_tabla = tamaño_tabla;
    }

    /**
     * @return the usuarios_en_tabla
     */
    public int getUsuarios_en_tabla() {
        return usuarios_en_tabla;
    }

    /**
     * @param usuarios_en_tabla the usuarios_en_tabla to set
     */
    public void setUsuarios_en_tabla(int usuarios_en_tabla) {
        this.usuarios_en_tabla = usuarios_en_tabla;
    }
}


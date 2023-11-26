/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2Miguel;

/**
 *
 * @author Miguel Febres y David Blanco
 */
public class Monticulo_Bin {
    private Documento[] monticulo_documentos;
    private int tamaño_docs;
    private int cantidad_docs;

    public Monticulo_Bin() {
        this.cantidad_docs = 128;
        this.tamaño_docs = 0;
        this.monticulo_documentos = new Documento[cantidad_docs];
    }

    /**
     * @return the monticulo_documentos
     */
    public Documento[] getMonticulo_documentos() {
        return monticulo_documentos;
    }

    /**
     * @param monticulo_documentos the monticulo_documentos to set
     */
    public void setMonticulo_documentos(Documento[] monticulo_documentos) {
        this.monticulo_documentos = monticulo_documentos;
    }

    /**
     * @return the tamaño_docs
     */
    public int getTamaño_docs() {
        return tamaño_docs;
    }

    /**
     * @param tamaño_docs the tamaño_docs to set
     */
    public void setTamaño_docs(int tamaño_docs) {
        this.tamaño_docs = tamaño_docs;
    }

    /**
     * @return the cantidad_docs
     */
    public int getCantidad_docs() {
        return cantidad_docs;
    }

    /**
     * @param cantidad_docs the cantidad_docs to set
     */
    public void setCantidad_docs(int cantidad_docs) {
        this.cantidad_docs = cantidad_docs;
    }



public void insertar_doc(String titulo, int tamano, String tipo, int segundos) {
    Documento doc = new Documento(titulo,tamano,tipo, segundos);
    if (getTamaño_docs() != getCantidad_docs()) {
            setTamaño_docs(getTamaño_docs() + 1);
        int currentIndex = getTamaño_docs() - 1;
            getMonticulo_documentos()[currentIndex] = doc;

        while (currentIndex != 0 && getMonticulo_documentos()[indiceDelPadre(currentIndex)].getSegundos() > getMonticulo_documentos()[currentIndex].getSegundos()) {
            intercambiar_documentos(currentIndex, indiceDelPadre(currentIndex));
            currentIndex = indiceDelPadre(currentIndex);}
    }
}

private void heapify(int index) {
    int smallest = index;
    int leftChild = indiceDelHijoIzq(index);
    int rightChild = indiceDelHijoDer(index);

    if (leftChild < getTamaño_docs() && getMonticulo_documentos()[leftChild].getSegundos() < getMonticulo_documentos()[smallest].getSegundos()) {
        smallest = leftChild;
    }

    if (rightChild < getTamaño_docs() && getMonticulo_documentos()[rightChild].getSegundos() < getMonticulo_documentos()[smallest].getSegundos()) {
        smallest = rightChild;
    }

    if (smallest != index) {
        intercambiar_documentos(index, smallest);
        heapify(smallest);
    }
}

public String print(String binaryPrint){
    Documento aux = this.eliminar_min();
    if(aux!= null){
        binaryPrint += aux.getTitulo() + "\n";
        binaryPrint = print(binaryPrint);
        this.insertar_doc(aux.getTitulo(), aux.getTamano(), aux.getTipo(), aux.getSegundos());}
    return binaryPrint;
}


public Documento eliminar_min() {
    if (getTamaño_docs() == 0) {
        return null;
    }

    if (getTamaño_docs() == 1) {
            setTamaño_docs(getTamaño_docs() - 1);
        return getMonticulo_documentos()[0];
    }

    Documento root = getMonticulo_documentos()[0];
        getMonticulo_documentos()[0] = getMonticulo_documentos()[getTamaño_docs() - 1];
        setTamaño_docs(getTamaño_docs() - 1);
    heapify(0);

    return root;
}


public void eliminar_documento(Documento doc){
    if( this.getMonticulo_documentos()[0].getSegundos() == doc.getSegundos() && this.getMonticulo_documentos()[0].getTitulo().equals(doc.getTitulo())){
        this.eliminar_min();
    }else{
        if( this.getMonticulo_documentos()[0]!= null){
        Documento aux = this.eliminar_min();
        if(doc!= null){
            this.eliminar_documento(doc);
            this.insertar_doc(aux.getTitulo(), aux.getTamano(), aux.getTipo(), aux.getSegundos());}
        }
    }
}
private int indiceDelPadre(int index) {
    return (index - 1) / 2;
}

public int indiceDelHijoIzq(int index) {
    return (2 * index) + 1;
}

public int indiceDelHijoDer(int index) {
    return (2 * index) + 2;
}

private void intercambiar_documentos(int index1, int index2) {
    Documento temp = getMonticulo_documentos()[index1];
        getMonticulo_documentos()[index1] = getMonticulo_documentos()[index2];
        getMonticulo_documentos()[index2] = temp;
}


}



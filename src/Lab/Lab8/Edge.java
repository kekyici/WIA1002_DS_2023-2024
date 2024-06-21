/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8;

/**
 *
 * @author YiCi Kek
 */
class Edge<T extends Comparable<T>,N extends Comparable<N>> {
    
    Vertex <T,N> toVertex;
    N weight;
    Edge <T,N> nextEdge;
   
    public Edge(){
        toVertex=null;
        weight=null;
        nextEdge=null;
    }
    
    public Edge(Vertex<T,N> destination, N weight, Edge<T,N> next){
        this.toVertex=destination;
        this.weight=weight;
        this.nextEdge=next;
    }
}

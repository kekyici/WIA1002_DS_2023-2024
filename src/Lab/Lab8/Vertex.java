/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8;
class Vertex<T extends Comparable<T>, N extends Comparable<N>> {
    
     T vertexInfo;
   int inDegree;
    int outDegree;
    Vertex<T, N> nextVertex;
    Edge<T, N> firstEdge;

    /**
     * Default constructor initializes the vertex with null values and zero degrees.
     */
    public Vertex() {
        this.vertexInfo = null;
        this.inDegree = 0;
        this.outDegree = 0;
        this.nextVertex = null;
        this.firstEdge = null;
    }

    public Vertex(T vertexInfo, Vertex<T, N> nextVertex) {
        this.vertexInfo = vertexInfo;
        this.inDegree = 0;
        this.outDegree = 0;
        this.nextVertex = nextVertex;
        this.firstEdge = null;
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab8;
import java.util.ArrayList;

/**
 *
 * @author YiCi Kek
 */
public class WeightedGraph<T extends Comparable <T>, N extends Comparable<N>> {
    int size;
    Vertex <T,N> head;
    
    public WeightedGraph(){
        size=0;
        head=null;
        
    }
    
    public void clear(){
        head=null;
    }
    public int getSize(){
        return size;
    }
    
    public boolean hasVertex(T v){
        if (head==null)
            return false;
        Vertex<T,N> temp = head;
        while(temp!=null){
            if((temp.vertexInfo).compareTo(v)==0)
                return true;
            temp=temp.nextVertex;
        }return false;
    }
    
    public int getIndeg(T v){
       if(hasVertex(v)==true){
           Vertex<T,N> temp=head;
           while(temp!=null){
               if(temp.vertexInfo.compareTo(v)==0)
                   return temp.inDegree;
               temp=temp.nextVertex;
           }
       }
       return -1;
    }
    public int getOutdeg(T v){
        if(hasVertex(v)==true){
            Vertex <T,N> temp=head;
            while(temp!=null){
                if(temp.vertexInfo.compareTo(v)==0)
                    return temp.outDegree;
                temp=temp.nextVertex;
            }
        }
        return -1;
    }
    
    public boolean addVertex(T v){
        if(hasVertex(v)==false){
            Vertex <T,N> temp = head;
            Vertex <T,N> newVertex = new Vertex<>(v,null);
            if (head==null)
                head=newVertex;
            else{
                Vertex <T,N> previous = head;
                while(temp!=null){
                    previous=temp;
                    temp=temp.nextVertex;
                }
                previous.nextVertex= newVertex;
            }
            size++;
            return true;
        }
        return false;
    }
    
    public int getIndex(T v){
        Vertex<T,N> temp= head;
        int pos = 0;
        while(temp!=null){
            if(temp.vertexInfo.compareTo(v)==0){
                return pos;
            }
            temp=temp.nextVertex;
            pos=+1;
        }
        return -1;
        
       
        }
     public ArrayList<T> getAllVertexObject(){
            Vertex<T,N> temp=head;
            ArrayList <T> ar = new ArrayList<>();
            while(temp!=null){
                ar.add(temp.vertexInfo);
                temp=temp.nextVertex;
            }
            
            return ar;
    }
    public ArrayList<Vertex<T,N>> getAllVertices(){
        Vertex<T,N> temp=head;
        ArrayList<Vertex<T,N>> ar = new ArrayList<>();
        while(temp!=null){
            ar.add(temp);
            temp=temp.nextVertex;
        }
        return ar;
    }
    
    public T getVertex(int pos){
        if(pos>size-1||pos<0)
            return null;
        Vertex<T,N> temp=head;
        for(int i=0;i<pos;i++)
            temp=temp.nextVertex;
        return temp.vertexInfo;
    
    }
    
    
}

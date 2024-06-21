/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Tutorial4;

/**
 *
 * @author YiCi Kek
 */
public interface MyList<E> {
    
    public void addFirst(E e);
    
    public void addLast(E e);
    
    public void add(int index, E e);
    
    public E removeFirst();
    
    public E removeLast();
    
    public E remove(int index);
}

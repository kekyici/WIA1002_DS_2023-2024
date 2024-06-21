package Lab6;

import java.util.ArrayList;

public class GenericStack <E> {
    private ArrayList<E> list = new ArrayList<>();

    public void push(E o){
        list.add(o);
    }

    public E pop(){
        E o = list.get(getSize()-1);
        list.remove(getSize()-1);
        return o;
    }
    public E peek(){
        return list.get(getSize()-1);
    }

    public int getSize(){
        return list.size();
    }

    public boolean isEmpty(){
        return list.isEmpty();

    }

    @Override
    public String toString(){
        return "Stack: "+list.toString();
    }

    public boolean search(E o){
        boolean found = false;
        int index=0;
        while(!found && (index<getSize())){
            if(o.equals(list.get(index))){
                found = true;
            }
            index++;
        }
        return found;
    }

}

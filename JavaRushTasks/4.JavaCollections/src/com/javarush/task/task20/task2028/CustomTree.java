package com.javarush.task.task20.task2028;

import java.io.Serializable;
import java.util.*;

/* 
Построй дерево(1)
*/
public class CustomTree extends AbstractList<String> implements Cloneable, Serializable{
    Entry<String> root;
    LinkedList<Entry<String>> baseList = new LinkedList<>();

    public CustomTree(){
        root = new Entry<String>("0");
        baseList.add(root);
    }


    public static void main(String[] args) {
        List<String> list = new CustomTree();
        for (int i = 1; i < 16; i++) {
            list.add(String.valueOf(i));
        }
        System.out.println("Expected 3, actual is " + ((CustomTree) list).getParent("8"));
        list.remove("5");
        System.out.println("Expected null, actual is " + ((CustomTree) list).getParent("11"));
    }

    @Override
    public int size() {
        return baseList.size() - 1;
    }

    public String get(int index){
        throw new UnsupportedOperationException();
    }
    public String set(int index, String element){
        throw new UnsupportedOperationException();
    }
    public void add(int index, String element){
        throw new UnsupportedOperationException();
    }
    public String remove(int index){
        throw new UnsupportedOperationException();
    }
    public List<String> subList(int fromIndex, int toIndex){
        throw new UnsupportedOperationException();
    }
    protected void removeRange(int fromIndex, int toIndex){
        throw new UnsupportedOperationException();
    }
    public boolean addAll(int index, Collection<? extends String> c){
        throw new UnsupportedOperationException();
    }



    public boolean add(String s){
        Entry<String> insertElement = new Entry<String>(s);
        Iterator<Entry<String>> iterator = baseList.iterator();
        while(iterator.hasNext()){
            Entry<String> element = iterator.next();
            if (element.isAvailableToAddChildren()){
                if (element.leftChild == null) {
                    element.leftChild = insertElement;
                    element.checkChildren();
                    baseList.add(insertElement);
                    return true;
                }
                else {
                    element.rightChild = insertElement;
                    element.checkChildren();
                    baseList.add(insertElement);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean remove(Object o){
        Iterator<Entry<String>> iterator = baseList.iterator();
        LinkedList listForRemove = new LinkedList();
        while (iterator.hasNext()){
            Entry<String> element = iterator.next();
            if(o.equals(element.leftChild.elementName)) {
                listForRemove.add(element.leftChild);
                delete(element.leftChild, listForRemove);
                element.leftChild = null;
                element.checkChildren();

                break;
            } else if(o.equals(element.rightChild.elementName)) {
                listForRemove.add(element.rightChild);
                delete(element.rightChild, listForRemove);
                element.rightChild = null;
                element.checkChildren();

                break;
            }
        }
        if (!listForRemove.isEmpty()){
            //System.out.println("before delete - " + baseList.size());
            //System.out.println(listForRemove.size());
            baseList.removeAll(listForRemove);
            //System.out.println("after delete - " + baseList.size());
            return true;
        }
        return false;
    }

    private void delete (Entry<String> objectForDelete, LinkedList listForRemove){
        if (objectForDelete.leftChild != null) {
            listForRemove.add(objectForDelete.leftChild);
            delete(objectForDelete.leftChild, listForRemove);
        }

        if (objectForDelete.rightChild != null) {
            listForRemove.add(objectForDelete.rightChild);
            delete(objectForDelete.rightChild, listForRemove);
        }
    }

    public String getParent(String s){
        Iterator<Entry<String>> iterator = baseList.iterator();
        while (iterator.hasNext()){
            Entry<String> element = iterator.next();
            //System.out.println("getParent - " + element);
            if (( element.leftChild != null
                    && s.equals(element.leftChild.elementName)
                    && !element.availableToAddLeftChildren) ||
                (element.rightChild != null
                    && s.equals(element.rightChild.elementName)
                    && !element.availableToAddRightChildren))
                return element.elementName;
        }
        return null;
    }


    static class Entry<T> implements Serializable{
        String elementName;
        int lineNumber;
        boolean availableToAddLeftChildren, availableToAddRightChildren;
        Entry<T> parent, leftChild, rightChild;

        public Entry(String elementName) {
            this.elementName = elementName;
            availableToAddLeftChildren = true;
            availableToAddRightChildren = true;
        }

        void checkChildren(){
            if (leftChild != null) availableToAddLeftChildren = false;
            if (rightChild != null) availableToAddRightChildren = false;
        }

        boolean isAvailableToAddChildren(){
            return (availableToAddLeftChildren | availableToAddRightChildren);
        }

        public String toString(){
            return elementName;
        }

    }
}

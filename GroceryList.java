package com.brian;

import java.util.ArrayList;

/**
 * Created by Brian on 6/13/2017.
 */
public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printList(){
        System.out.println("You have "+groceryList.size()+" items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println(i+". - "+groceryList.get(i));
        }
    }

    public void modifyList(String item, String newItem){
        int index = groceryList.indexOf(item);
        groceryList.set(index, newItem);
        System.out.println(item +" is now "+newItem);
    }

    public void removeItem(String item){
//        String item = groceryList.get(index);
//        groceryList.remove(index);
        int index = groceryList.indexOf(item);
        if(index < 0){
            System.out.println("That item does not exist!");
        } else {
            groceryList.remove(index);
            System.out.println("You removed "+item);
        }
    }

    public String findItem(String item){
//        boolean exists = groceryList.contains(item);
        int index = groceryList.indexOf(item);
        if(index >= 0){
            return groceryList.get(index);
        }
        return null;
    }

    public int getSize(){
        return groceryList.size();
    }
}

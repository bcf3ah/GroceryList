package com.brian;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("0 - print instructions");
        System.out.println("1 - print list");
        System.out.println("2 - add item");
        System.out.println("3 - modify item");
        System.out.println("4 - remove item");
        System.out.println("5 - search for an item");
        System.out.println("6 - quit");
    }

    public static void addItem(){
        System.out.println("Please enter item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.println("Please enter the element you want to modify: ");
        String item = scanner.nextLine();
        System.out.println("Please enter the new item to replace it: ");
        String newItem = scanner.nextLine();
        groceryList.modifyList(item, newItem);
    }

    public static void removeItem(){
        System.out.println("Please enter the item you want to remove: ");
        groceryList.removeItem(scanner.nextLine());
    }

    public static void searchItem(){
        System.out.println("Please enter the element you want to search for: ");
        String item = scanner.nextLine();
        if(groceryList.findItem(item) == null){
            System.out.println("Item does not exist");
        } else {
            System.out.println("Found it!");
        }
    }
}

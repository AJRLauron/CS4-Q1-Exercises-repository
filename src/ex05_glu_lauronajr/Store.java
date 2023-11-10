package ex05_glu_lauronajr;

import java.util.ArrayList;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList = new ArrayList<>();
  private static ArrayList<Store> storeList = new ArrayList<>();

  public Store(String name){
    // Initialize name to parameter and earnings to zero
    // Initialize itemList as a new ArrayList
    // add 'this' store to storeList
    this.name = name;
    this.earnings = earnings;
    storeList.add(this);
    itemList = new ArrayList();
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
    // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
    // get Item at index from itemList and add its cost to earnings
    // print statement indicating the sale
    if(index <= itemList.size()){
        earnings = earnings + itemList.get(index).getCost();
        System.out.println(earnings);
        }
    else {System.out.println("There are only " + itemList.size() + " items in the store");}
  }
  public void sellItem(String name){
    // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
    // get Item from itemList and add its cost to earnings
    // print statement indicating the sale
   for(Item item : itemList){
       if(item.getName().equals(name)){
           this.earnings = this.earnings + item.getCost();
           System.out.println(item.getName());
           return;
       }
} System.out.println("This store does not sell" + name);
  }   
  public void sellItem(Item i){
    // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
    // get Item i from itemList and add its cost to earnings
    // print statement indicating the sale
    for(Item item : itemList){
       if(item.getName().equals(i.getName())){
           this.earnings = this.earnings + item.getCost();
           System.out.println(item.getName());
           return;
       }
  } System.out.println("This store does not sell" + i.getName());
  }
  public void addItem(Item i){
    this.itemList.add(i);
  }
  public void filterType(String type){
    for(Item i: itemList){
    if(i.getType() == type){
        System.out.println(i.getName());
    }
    }
  }
  public void filterCheap(double maxCost){
for(Item i: itemList){
    if(i.getCost() <= maxCost){
        System.out.println(i.getName());
    }
    }
  }
  public void filterExpensive(double minCost){
for(Item i: itemList){
    if(i.getCost() >= minCost){
        System.out.println(i.getName());
    }
    }
  }
  public static void printStats(){
        for(Store s : storeList){
            System.out.printf("Name: %s%nearnings: %f%n%n", s.getName(), s.getEarnings());
        }
        System.out.println();
    }

  }

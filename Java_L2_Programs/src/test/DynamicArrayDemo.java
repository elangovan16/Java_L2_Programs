package test;

import java.util.Scanner;
import java.util.Arrays;
class DynamicArray{
    private final static int INITIALCAPACITY=16;
    private int[] ary;
    private int size;
    private int capacity;
    DynamicArray(){
        size=0;
        ary =new int[INITIALCAPACITY];
        capacity=INITIALCAPACITY;
    }
    private void expandCap(){
        capacity *=2;
        ary=Arrays.copyOf(ary,capacity);
    }

    public void add(int val){
        if(size==capacity){
            expandCap();
        }
        ary[size++]=val;
    }
    public void display(){
        //System.out.println();
        for(int i=0;i<size;i++){
            System.out.print(ary[i]+" ");
        }
    }
    public void insertAtPos(int pos,int val){
        if(size==capacity){
            expandCap();
        }
        for(int i=size;i>=pos;i--){
            ary[i+i]=ary[i];
        }
        ary[pos]=val;
        size++;
    }

    public void deleteAtPos(int pos) {
        for(int i=pos+1;i<size;i++){
            ary[i-1]=ary[i];
        }
        size--;
    }
}
public class DynamicArrayDemo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        DynamicArray list =new DynamicArray();
        int val,pos;
        boolean flag=true;
        while(flag){
            System.out.println("\n----------List Menu----------\n");
            System.out.println("1.Insert at End");
            System.out.println("2.Display the list");
            System.out.println("3.Insert at specified position");
            System.out.println("4.Delete from specified position");
            System.out.println("5.Exit");
            System.out.println("-----------------------------\n");
            System.out.print("Enter your choice : ");
            int choice =sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter the Data: ");
                    val = sc.nextInt();
                    System.out.println();
                    list.add(val);
                }
                case 2 -> list.display();
                case 3 -> {
                    System.out.print("Enter position(Start at 0) : ");
                    pos = sc.nextInt();
                    if (pos < 0) {
                        System.out.println("Invalid position");
                        break;
                    }
                    System.out.print("Enter the data : ");
                    val = sc.nextInt();
                    list.insertAtPos(pos, val);
                }
                case 4 -> {
                    System.out.print("Enter position(Start at 0) : ");
                    pos = sc.nextInt();
                    if(pos<0){
                        System.out.println("Invalid position");
                        break;
                    }
                    list.deleteAtPos(pos);
                }
                
                case 5 -> flag = false;
                default -> System.out.println("Olunga kududaa");
                
            }
            
        }
        sc.close();
    }

}

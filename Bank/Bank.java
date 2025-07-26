import java.util.*;
class Node{
    String name;
    Node next;
    Node(String name){
        this.name=name;
        next=null;
    }
}
public class Bank {
    Scanner sc=new Scanner(System.in);
    Node front;
    Node rear;
    static int count;
    static int size=5;
    public void enqueue(String value){
        Node newNode=new Node(value);
        if(front==null || rear==null){
            front=rear=newNode;
            System.out.println(value+" entered into Bank...");
            count++;

        }
        else if(count<=size){
            rear.next=newNode;
            rear=newNode;
            System.out.println(value+" entered into Bank...");
            count++;
        
        }
    }
    
    public boolean isEmpty(){
        return front==null || rear==null;
    }
    public boolean isFull(){
        return count>=size;
    }
    public void print(){
        if(isEmpty()){
            System.out.println("Bank is Empty");
            return;
        }
        else{
            Node temp=front;
            while(temp!=null){
                System.out.println(temp.name);
                temp=temp.next;
            }
        }
    }
    public void peek(){
        if(isEmpty()){
            System.out.println("No Members in Bank...");
            return;
        }

        System.out.println(front.name+" work is going on...");
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("No Members in bank...");
            return;
        }
        else{
            System.out.println("Is Your Work Done?(yes/no)");
            String op=sc.next();
            if(op.equals("yes")){
                System.out.println("You'r Work done "+front.name);
                front=front.next;
                count--;
            }

        }
    }
    public int len(){
        if(isEmpty()){
            System.out.println("No People in the Bank.So size is 0");
            
        }
        int count=0;
        Node temp=front;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
       return count;

 }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Bank b=new Bank();
        System.out.println("Welcome to My Bank");
        
        while(true){
            System.out.print("1.Add\n2.Remove\n3.People in the Bank\n4.isEmpty\n5.Current Person\n6.How many\n7.isFull\n");
            int op=sc.nextInt();
            switch (op) {
                case 1:
                System.out.println("You can add maximum "+(size-count)+" persons");
                if(count<size){
                    System.out.println("Enter Name: ");
                    String s=sc.next();
                    b.enqueue(s);
                    break;
                }
                else{
                    System.out.println("Bank is full.Cannot Add Persons");
                    break;
                }
                case 2:
                    b.dequeue();
                    break;
                case 3:
                    b.print();
                    break;
                case 4:
                    if(b.isEmpty()){
                        System.out.println("Bank is Empty Bro");
                    }
                    else{
                        System.out.println("Bank has some persons");
                    }
                    break;
                case 5:
                    b.peek();
                    break;
                case 6:
                    System.out.println("The No.of people in the bank is: "+b.len());
                    break;
                case 7:
                    if(b.isFull()){
                        System.out.println("Bank is Full Come Tomorrow...");
                    }
                    else{
                        System.out.println("Bank is not full! You can Enter ");
                    }
                    break;
                default:
                    System.exit(1);
                    break;
            }
        }
    }
    
}
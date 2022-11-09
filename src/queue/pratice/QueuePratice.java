/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package queue.pratice;

/**
 *
 * @author Carvajal-Triviño
 */

class Nodo{
    boolean prioridad;
    int id;
    Nodo next;
    
    Nodo(int id, boolean priority){
        this.id = id;
        this.prioridad = priority;
    }
}
public class QueuePratice {
    Nodo front;
    int size;

    QueuePratice(){
        this.front = null;
    }

    public void enqueue(int dato1, boolean dato2){
        Nodo newnodo = new Nodo(dato1, dato2);
        if(front == null){
            this.front = newnodo;
            
        }else{
            Nodo aux = front;
            while(aux.next != null){
                aux = aux.next;
            }
            aux.next = newnodo;
        }
        this.size ++;
    }
    public void show(){
        Nodo aux = front;
        while(aux != null){
            System.out.println(aux.id);
            aux = aux.next;
        }
    }
    public void showPriority(){
        Nodo aux = front;
        while(aux != null){
            System.out.println(aux.id + " " + aux.prioridad);
            aux = aux.next;
        }
    }    
    public void peek(){
        System.out.println(front.id );
    }
    public void dequeue(){
        Nodo temp = front;
        System.out.println(temp.id);
        front = front.next;
        temp = null;
        this.size --;
    }
    public void dequeuePriority(){
        Nodo prev = null;
        Nodo aux = front;
        while(!aux.prioridad){
            prev = aux;
            aux = aux.next;
        }
        System.out.println(aux.id);
        prev.next = aux.next;
    }    
    public void length(){
        System.out.println(this.size);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        QueuePratice queue = new QueuePratice();
        queue.enqueue(1, false);
        queue.enqueue(2, false);
        queue.enqueue(3, true);
        queue.enqueue(4, false);
        queue.enqueue(5, false);
        queue.enqueue(6, false);
        queue.showPriority();
        queue.dequeue();
        queue.showPriority();
        System.out.print("amount: " );
        queue.length();
        System.out.print("dequeue with prority: ");
        queue.dequeuePriority();
        

    }
    
}

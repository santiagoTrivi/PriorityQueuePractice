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
    

    public Nodo(int id, boolean priority){
        this.id = id;
        this.prioridad = priority;
    }

}
public class QueuePratice {
    Nodo front;
    Nodo rear;

    QueuePratice(){
        this.front = null;
    }

    public void enqueue(int dato1, boolean dato2){
        Nodo newnodo = new Nodo(dato1, dato2);
        if(front == null){
            this.front = newnodo;
            this.rear = front;
            
        }else{
            this.rear.next = newnodo;
            this.rear = rear.next;
        }
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
    int peek(){
        return front.id;
    }
    Boolean isEmpty(){
        return this.front == null;
    }
    
    int dequeue(){
        if(this.isEmpty()){
            return 0;
        }else{
            Nodo temp = front;
            front = front.next;
            temp.next = null;
            return temp.id;
        }
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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        QueuePratice queue = new QueuePratice();
        queue.enqueue(53, false);
        queue.enqueue(54,false);
        queue.enqueue(55,true);
        queue.enqueue(56,false);
        queue.show();
        System.out.println("what the queue contains");
        int number = queue.peek();
        System.out.println("peek value "+ number);
        queue.dequeuePriority();
        System.out.println("after the dequeue with priority");
        queue.show();
        
        

    }
    
}

package Corrupt;

/**
 * Created by Kepinn on 4/4/2017.
 */
public class Queue {
    int ar[] = new int [10];
    int top = -1;
    int down = 0;

    public static void main(String [] KelasAntrian){
        Queue ka = new Queue();

        ka.enqueue(8);
        ka.view();
        ka.enqueue(19);
        ka.enqueue(22);
        ka.view();
        ka.dequeue();
        ka.view();
        ka.dequeue();
        ka.view();
    }

    public void enqueue(int angka){
        if(!isFull()){
            top++; // TOP DI NAIKAN
            ar[top] = angka; // ANGKA DI ISIKAN
            System.out.println("Angka " + angka + " Berhasil di Input");
        }else{
            System.out.println("Antrian Penuh");
        }
    }

    public void dequeue(){
        if(!isEmpty()){
            int indexDown = down;
            down++; // DOWN DI NAIKAN
            System.out.println("Antrian indek " + indexDown  + " Berhasil di Hapus");
        }else{
            System.out.println("Antrian Kosong");
        }
    }


    public void view(){
        if(!isEmpty()) {
            System.out.print("Isi Antrian sekarang : ");
            for (int i = down; i <= top; i++) {
                System.out.print(ar[i] + " ");
            }
            System.out.println("\n");
        }else
            System.out.println("Antrian kosong");

    }boolean isFull(){
        if(top == ar.length){
            return true;
        }
        return false;
    }

boolean isEmpty(){
        if(top == -1){
            return true;
        }
        return false;
    }
}

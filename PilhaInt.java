public class PilhaInt {
    public final int N = 6;

    int dados[] = new int[N];
    int topo;

    public void init() {
        topo = 0;
    }

    public void push(int elem){
        if(!isFull()){
            dados[topo]=elem;
            topo++;
        }
        else
            System.out.println("stack overflow");
    }

    public int pop(){
        topo--;
        return dados[topo];
    }

    public boolean isEmpty(){
        if (topo == 0)
            return true;
        else
            return false;
    }

    public boolean isFull(){
        if (topo == N)
            return true;
        else
            return false;
    }
}




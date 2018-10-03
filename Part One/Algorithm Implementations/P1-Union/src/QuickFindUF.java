//Eager Implementations
public class QuickFindUF {
    private int[] id;

    public static void main(String[] args){
        System.out.println("Hello World");

//        int N = StdIn.readInt();
//        UF uf = new UF(N);
//        while (!StdIn.isEmpty())
//        {
//            int p = StdIn.readInt();
//            int q = StdIn.readInt();
//            if (!uf.connected(p, q)){
//                uf.union(p,q);
//                StdOut.println(p + " " + 1);
//            }
//        }
    }

    public QuickFindUF(int N)
    {
        id = new int[N];
        //Set the id of each object to itself
        for (int i = 0; i < N; i++)
            id[i] = i;
    }

    public boolean connected(int p, int q){
        //check whether p and q are in the same component
        return id[p] == id[q];
    }

    public void union(int p, int q){
        int pid = id[p];
        int qid = id[q];
        //change all entried with id[p] to id[q]
        for(int i = 0; i < id.length; i++){
            if (id[i] == pid) id[i] = qid;
        }
    }
}

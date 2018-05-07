package ctciproblems.dataStructure.Graphs; 
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
//Due to ineffficiency space complexity of Adjucency Matrix, Adjucency list is used:
/*Graph traverse (implementation):
https://www.youtube.com/watch?v=eEQ00TKw1Ww&list=PLkdiT8EDa3rHGJHM0eDEwO8ALW6XudzCe -> Graphs - Types and Representation (adjucenty matrix)
https://www.youtube.com/watch?v=zVrPdF7f4-I&index=4&list=PLkdiT8EDa3rHGJHM0eDEwO8ALW6XudzCe  →  Adjecency list

You can use BFS and DFS to traverse a Graph to find paths and far connections. But for immediate connection between to c, you could just look up the Adjacency List and Adjacency matrix:
*/

//Below you find the implementation of adjacency list
class Neighbor {  //this is the edge
    public int vertexNum;
    public Neighbor next;
    public Neighbor(int vnum, Neighbor nbr) {
            this.vertexNum = vnum;
            next = nbr;
    }
}
 
class Vertex {  //this is the vertex 
    String name;
    Neighbor adjList;
    Vertex(String name, Neighbor neighbors) {
            this.name = name;
            this.adjList = neighbors;
    }
}
 
/**
 * @author Pejman Saberin
 */
public class AdjucencyList {
 
    Vertex[] adjLists;
     
    public AdjucencyList(String file) throws FileNotFoundException {
         
        Scanner sc = new Scanner(new File(file));
         
        String graphType = sc.next();
        boolean undirected=true;
        if (graphType.equals("directed")) {
            undirected=false;
        }
         
        adjLists = new Vertex[sc.nextInt()];
 
        // read vertices
        for (int v=0; v < adjLists.length; v++) {
            adjLists[v] = new Vertex(sc.next(), null);
        }
 
        // read edges
        while (sc.hasNext()) {
             
            // read vertex names and translate to vertex numbers
            int v1 = indexForName(sc.next());
            int v2 = indexForName(sc.next());
             
            // add v2 to front of v1's adjacency list and
            // add v1 to front of v2's adjacency list
            adjLists[v1].adjList = new Neighbor(v2, adjLists[v1].adjList);
            if (undirected) {
                adjLists[v2].adjList = new Neighbor(v1, adjLists[v2].adjList);
            }
        }
    }
     
    int indexForName(String name) {
        for (int v=0; v < adjLists.length; v++) {
            if (adjLists[v].name.equals(name)) {
                return v;
            }
        }
        return -1;
    }   
     
    public void print() {
        System.out.println();
        for (int v=0; v < adjLists.length; v++) {
            System.out.print(adjLists[v].name);
            for (Neighbor nbr=adjLists[v].adjList; nbr != null;nbr=nbr.next) {
                System.out.print(" --> " + adjLists[nbr.vertexNum].name);
            }
            System.out.println("\n");
        }
    }
     
    /**
     * @param args
     */
    public static void main(String[] args) 
    throws IOException {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
         
        System.out.print("Enter graph input file name: ");
        String file = sc.nextLine();
        AdjucencyList graph = new AdjucencyList(file);       
        graph.print();
 
    }
    
   
 
}


package lab11;
import java.util.Scanner;



public class GraphTasks {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of vertices:");
        int vertices = sc.nextInt();
        
        System.out.println("Enter number of edges:");
        int edges = sc.nextInt();
        
        int [][] AdjacencyMatrix = new int [vertices][vertices];
        
        System.out.println("Enter the edges (u v)");
        for(int i = 0; i<edges; i++){
         int u = sc.nextInt();
         int v = sc.nextInt();
         
           AdjacencyMatrix[u - 1][v - 1] = 1;
           
        
        }
        sc.close();
        
        
    }
   
}

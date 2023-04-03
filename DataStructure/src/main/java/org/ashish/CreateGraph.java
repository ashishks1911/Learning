package org.ashish;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Code to Create Graph using adjacency list .
 */
public class CreateGraph {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total Number of Vertices : ");
        int vertex=scanner.nextInt();
        ArrayList<Edge>[] graph = new ArrayList[vertex];
        for (int i=0;i<graph.length;i++){
            graph[i] =new ArrayList<>();
        }

        for (int i=0;i<graph.length;i++)
        {
            System.out.print("Enter the total number of Neighbours of "+i+" :");
            int k =scanner.nextInt();
            for (int j=0;j<k;j++) {
                System.out.print("Enter the Neighbours of :" + i + "(One by one)");
                int n = scanner.nextInt();
                while (n>(vertex-1) || n<=0)
                {
                    System.out.println("Invalid Node");
                    System.out.println("Please Enter a valid Neighbour:");
                    n=scanner.nextInt();
                }
                graph[i].add(new Edge(i,n));
                System.out.println(j+1+"Neighbour Added");
            }
        }
        System.out.println("Graph Created Successfully.");

    }
}

import java.io.*;
import java.util.*;

class Graph {

	static class Node {
		int Vertices;
		LinkedList<Integer> adjListArray[];

		Node(int n) {
			this.Vertices = n;

			adjListArray = new LinkedList[n];
			for (int i = 0; i < n; i++) {
				adjListArray[i] = new LinkedList<>();
			}
		}
	}

	public static void addEdge(Node node, int source, int destination) {
		//bidirectional
		node.adjListArray[source].add(destination);
		node.adjListArray[destination].add(source);
	}

	public static void traverse(Node node) {
		for (int i = 0; i < node.Vertices; i++) {
			System.out.println("Adjacency list of vertices : " + i );
			for (Integer item : node.adjListArray[i]) {
				System.out.println("item connected : " + item);
			}
			System.out.println();
		}
	}
	public static void main(String args[]) throws IOException {
		System.out.println("============== Starting Java ===============");
		Node myGraph = new Node(5);
		addEdge(myGraph, 0, 2);
		addEdge(myGraph, 1, 2);
		addEdge(myGraph, 1, 4);
		addEdge(myGraph, 2, 3);
		addEdge(myGraph, 1, 3);
		
		traverse(myGraph);
	}
}

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nodeNum = Integer.parseInt(scan.nextLine());
        Graph graph = new Graph();
        for (int i = 0; i < nodeNum; i++) {
            graph.addVertex();
        }

        String line = scan.nextLine();
        String[] pair = line.split(",");
        while (!line.equals("-1")) {
            graph.addEdge(graph.getVertex(Integer.parseInt(pair[0])), graph.getVertex(Integer.parseInt(pair[1])));
            line = scan.nextLine();
            pair = line.split(",");
        }

        int maxDegree;
        while ((maxDegree = graph.getBiggestVertex()) != -1) {
            Vertex vertex = graph.getVertex(maxDegree);
            vertex.setColor(nodeNum); // Pass the number of nodes to setColor
        }

        for (Vertex vert : graph.vertices) {
            System.out.println(vert.vertexNumber + ":" + vert.getColour());
        }
    }
}

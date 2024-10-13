import java.util.*;
public class Graph{   
    private Map<Node, List<Node>> graph;
    public Graph(){
        graph = new LinkedHashMap<Node, List<Node>>();
    }

    public Map<Node, List<Node>> getGraph(){
        return graph;
    }

    public void addNode(Node n){
        graph.put(n, new LinkedList<Node>());
    }

    public void addEdge(Node a, Node b){
        graph.get(a).add(b);
        graph.get(b).add(a);
    }
    //Code remove node
    public void removeNode(Node n){
        for(Node i: graph.get(n)){
            graph.get(i).remove(n);
        }
        graph.remove(n);
    }
    // code remove edge
    public void removeEdge(Node a, Node b){
        graph.get(a).remove(b);
        graph.get(b).remove(a);
    }
    //code print graph
    public void printGraph(){
        for(Node a: graph.keySet()){
            System.out.println(a.getData() + ": " + graph.get(a) + " ");
        }
    }

    public void breathSearch(Node start){
        Set<Node> seen = new LinkedHashSet<Node>();
        Queue<Node> q = new LinkedList<Node>();
    }

    public void depthSearch(Node start){
        Set<Node> seen = new LinkedHashSet<Node>();
        Stack<Node> s = new Stack<Node>();

    }

    public LinkedHashSet depthFirstSearch(Node start) {
        Stack<Node> s = new Stack<Node>();
        LinkedHashSet<Node> set = new LinkedHashSet<Node>();
        s.push(start);
        while(s.size() != 0){
            
            Node c = s.pop();
            set.add(c);
            for(Node n : graph.get(c)){
                if(!set.contains(n)){
                    s.push(n);
                }
            }
        }
        return set;
    }

    public LinkedHashSet breadthFirstSearch(Node start) {
        Queue<Node> q = new LinkedList<Node>();
        LinkedHashSet<Node> set = new LinkedHashSet<Node>();
        q.add(start);
        while(q.size() != 0){
            Node c = q.remove();
            set.add(c);
            for(Node n : graph.get(c)){
                if(!set.contains(n)){
                    q.add(n);
                }
            }
        }
        return set;
    }
}

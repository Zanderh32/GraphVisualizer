public class SocialCircle{
    public static void main(String[] args){
        Graph sC = new Graph();
        Node zander = new Node("Zander Harrison");
        Node tito = new Node("Tito");
        Node akshita = new Node("Akshita");
        Node chris = new Node("Chris");
        Node ryan = new Node("Ryan");
        
        Node jack = new Node("Jack");
        Node jake = new Node("Jake");
        Node christian = new Node("Christian");
        Node devin = new Node("Devin");
        Node anshu = new Node("Anshu");
        
        Node hannah = new Node("Hannah");
        Node sydney = new Node("Sydney");
        Node tyler = new Node("Tyler");
        Node jorge = new Node("Jorge");
        Node jaidyn = new Node("Jaidyn");
        // All the friends
        sC.addNode(zander);
        sC.addNode(ryan);
        sC.addNode(akshita);
        sC.addNode(chris);
        sC.addNode(tito);
        
        sC.addNode(jack);
        sC.addNode(jake);
        sC.addNode(christian);
        sC.addNode(devin);
        sC.addNode(anshu);
        
        sC.addNode(hannah);
        sC.addNode(sydney);
        sC.addNode(tyler);
        sC.addNode(jorge);
        sC.addNode(jaidyn);
        // All Shmanders Friends
        sC.addEdge(zander, ryan);
        sC.addEdge(zander, akshita);
        sC.addEdge(zander, chris);
        sC.addEdge(zander, tito);
        sC.addEdge(zander, jack);
        sC.addEdge(zander, jake);
        sC.addEdge(zander, christian);
        sC.addEdge(zander, devin);
        sC.addEdge(zander, anshu);
        sC.addEdge(zander, hannah);
        sC.addEdge(zander, sydney);
        sC.addEdge(zander, tyler);
        sC.addEdge(zander, jorge);
        sC.addEdge(zander, jaidyn);
        
        // Ryan
        sC.addEdge(ryan, akshita);
        sC.addEdge(ryan, chris);
        sC.addEdge(ryan, tito);
        sC.addEdge(ryan, jack);
        sC.addEdge(ryan, jake);
        sC.addEdge(ryan, christian);
        sC.addEdge(ryan, devin);
        sC.addEdge(ryan, anshu);
        sC.addEdge(ryan, hannah);
        sC.addEdge(ryan, sydney);
        sC.addEdge(ryan, tyler);
        sC.addEdge(ryan, jorge);
        sC.addEdge(ryan, jaidyn);
        // Akshita
        sC.addEdge(akshita, chris);
        sC.addEdge(akshita, tito);
        sC.addEdge(akshita, jack);
        sC.addEdge(akshita, jake);
        sC.addEdge(akshita, christian);
        sC.addEdge(akshita, devin);
        sC.addEdge(akshita, anshu);
        sC.addEdge(akshita, hannah);
        sC.addEdge(akshita, sydney);
        sC.addEdge(akshita, tyler);
        sC.addEdge(akshita, jorge);
        sC.addEdge(akshita, jaidyn);
        
        
        // Chris
        sC.addEdge(chris, tito);
        
        sC.addEdge(chris, christian);
        sC.addEdge(chris, devin);
        sC.addEdge(chris, anshu);
        
        sC.addEdge(chris, sydney);
        sC.addEdge(chris, tyler);
        sC.addEdge(chris, jorge);
        
        
        // tito
        
        sC.addEdge(tito, jake);
        sC.addEdge(tito, jack);
        sC.addEdge(tito, christian);
        sC.addEdge(tito, devin);
        sC.addEdge(tito, anshu);
        sC.addEdge(tito, hannah);
        sC.addEdge(tito, sydney);
        sC.addEdge(tito, tyler);
        sC.addEdge(tito, jorge);
        sC.addEdge(tito, jaidyn);
        // jack
        
        sC.addEdge(jack, jake);
        
        
        // jake
        
        sC.addEdge(jake, jack);
        sC.addEdge(jake, christian);
        sC.addEdge(jake, devin);
        sC.addEdge(jake, anshu);
        sC.addEdge(jake, hannah);
        sC.addEdge(jake, sydney);
        sC.addEdge(jake, tyler);
        
        // christian
        sC.addEdge(christian, jake);
        sC.addEdge(christian, christian);
        sC.addEdge(christian, devin);
        sC.addEdge(christian, anshu);
        sC.addEdge(christian, hannah);
        sC.addEdge(christian, sydney);
        sC.addEdge(christian, tyler);
        
        // devin
        sC.addEdge(devin, jake);
        
        sC.addEdge(devin, christian);
        sC.addEdge(devin, devin);
        sC.addEdge(devin, anshu);
        sC.addEdge(devin, hannah);
        sC.addEdge(devin, sydney);
        sC.addEdge(devin, tyler);
        sC.addEdge(devin, jorge);
        sC.addEdge(devin, jaidyn);
        // anshu
        sC.addEdge(anshu, jake);
        
        sC.addEdge(anshu, christian);
        sC.addEdge(anshu, devin);
        sC.addEdge(anshu, anshu);
        sC.addEdge(anshu, hannah);
        sC.addEdge(anshu, sydney);
        sC.addEdge(anshu, tyler);
        sC.addEdge(anshu, jorge);
        sC.addEdge(anshu, jaidyn);
        // hannah
        sC.addEdge(hannah, jake);
        
        sC.addEdge(hannah, christian);
        sC.addEdge(hannah, devin);
        sC.addEdge(hannah, anshu);
        sC.addEdge(hannah, hannah);
        sC.addEdge(hannah, sydney);
        sC.addEdge(hannah, tyler);
        
        // sydney
        sC.addEdge(sydney, jake);
        
        sC.addEdge(sydney, christian);
        sC.addEdge(sydney, devin);
        sC.addEdge(sydney, anshu);
        sC.addEdge(sydney, hannah);
        
       
        
        // tyler
        sC.addEdge(tyler, jake);
        
        sC.addEdge(tyler, devin);
       
        
        sC.addEdge(tyler, sydney);
        sC.addEdge(tyler, tyler);
        sC.addEdge(tyler, jorge);
        sC.addEdge(tyler, jaidyn);
        // jorge
        
        sC.addEdge(jorge, jaidyn);
        
        sC.printGraph();
        GraphVisualizer gc = new GraphVisualizer(sC);
        System.out.println(sC.depthFirstSearch(akshita));
        System.out.println(sC.breadthFirstSearch(akshita));
        
    }
}
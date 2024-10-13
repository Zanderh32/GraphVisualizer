import java.awt.*;
import javax.swing.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.Map;
public class GraphVisualizer<E> {
    private Graph graph;
    private int frameSize, inset, numNodes, nodeSize;
    
    public GraphVisualizer(Graph graph) {
        this.graph = graph;
        this.frameSize = 1200;
        this.inset = 100;
        this.numNodes = graph.getGraph().size();
        this.nodeSize = Math.min(150, (int)(360.0 / numNodes) * frameSize / 200);

        JFrame frame = new JFrame("Graph Visualizer");
        MyPanel panel = new MyPanel();
        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
    }

    public class MyPanel extends JPanel {
        public MyPanel() {
            setBackground(new Color(200,200,200));
            setPreferredSize(new Dimension(frameSize, frameSize));
        }

        @Override
        @SuppressWarnings("unchecked")
        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            // MAIN CIRCLE
            int centerX = frameSize / 2;
            int centerY = frameSize / 2;
            int diameter = frameSize-(inset*2);
            int radius = diameter/2;
            
            // DRAW MAIN CIRCLE
            g.setColor(new Color(200,200,200));
            fillOvalCentered(g, frameSize/2, frameSize/2, diameter, diameter);

            // DRAW EDGES
            Set<Node> set = graph.getGraph().keySet();
            List<Node> list = new ArrayList<Node>(set);
            for(Map.Entry entry : graph.getGraph().entrySet()) {
                Node<E> thisNode = (Node<E>)entry.getKey();
                List<Node<E>> adj = (List<Node<E>>)entry.getValue();
                int thisPosition = list.indexOf(thisNode);
                double angle = -90;
                angle += (360.0 / numNodes) * thisPosition;    
                double radian = Math.toRadians(angle);
                int thisCenterX = centerX + (int)(Math.cos(radian)*radius);
                int thisCenterY = centerY + (int)(Math.sin(radian)*radius);
                for(Node<E> node : adj) {
                    int otherPosition = list.indexOf(node);
                    angle = -90;
                    angle += (360.0 / numNodes) * otherPosition;
                    radian = Math.toRadians(angle);
                    int otherCenterX = centerX + (int)(Math.cos(radian)*radius);
                    int otherCenterY = centerY + (int)(Math.sin(radian)*radius);
                    Graphics2D g2 = (Graphics2D) g;
                    g2.setColor(new Color(0,0,0));
                    g2.setStroke(new BasicStroke(5));
                    g2.drawLine(thisCenterX, thisCenterY, otherCenterX, otherCenterY);
                }
            }
            
            // DRAW NODES
            double angle = -90;
            for(Node<E> node : graph.getGraph().keySet()) {
                double radian = Math.toRadians(angle);
                int nodeCenterX = centerX + (int)(Math.cos(radian)*radius);
                int nodeCenterY = centerY + (int)(Math.sin(radian)*radius);
                g.setColor(new Color(255,255,255));
                fillOvalCentered(g, nodeCenterX, nodeCenterY, nodeSize, nodeSize);
                angle += 360.0 / numNodes;
                g.setColor(new Color(0,0,0));
                Font font = new Font("Arial", Font.BOLD, 25);
                g.setFont(font);
                String str = node.getData().toString();
                drawCenteredString(g, str, nodeCenterX, nodeCenterY, font);
            }
        }

        public void fillOvalCentered(Graphics g, int x, int y, int w, int h) {
            g.fillOval(x-w/2, y-h/2, w, h);
        }

        public void drawCenteredString(Graphics g, String text, int x, int y, Font font) {
            FontMetrics metrics = g.getFontMetrics(font);
            int centerX = x - metrics.stringWidth(text)/2;
            int centerY = y - metrics.getHeight()/2 + metrics.getAscent();
            g.setFont(font);
            g.drawString(text, centerX, centerY);
        }
    }
}
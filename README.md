# Graph and Social Circle Visualizer

This project implements a **Graph** data structure and a **Social Circle Visualizer**, providing a graphical interface for representing and visualizing connections between nodes. The application allows users to create, manipulate, and visualize graphs, such as modeling social relationships.

## Features

- **Graph Data Structure**:
  - A fully implemented graph structure that supports nodes (vertices) and edges (connections).
  - Add, remove, and connect nodes dynamically.
  - Suitable for representing relationships, such as social networks.

- **Node Class**:
  - Each node represents an entity (e.g., a person in a social network).
  - Nodes store data and references to other nodes they are connected to.

- **Graph Visualizer**:
  - A graphical interface to visualize the graph and interact with nodes and edges.
  - Supports adding, removing, and connecting nodes and edges visually.

- **Social Circle Representation**:
  - A specialized class for visualizing social networks.
  - Visualizes connections between individuals and their social relationships in a network.

## Project Structure

- **Graph.java**: 
  - Implements the graph data structure. Handles the addition and removal of nodes and edges, and other graph operations.

- **Node.java**: 
  - Defines the individual nodes of the graph, storing data and maintaining links to other nodes.

- **GraphVisualizer.java**: 
  - Provides the graphical interface for visualizing and interacting with the graph, enabling users to add or remove nodes and edges dynamically.

- **SocialCircle.java**: 
  - A class specifically designed to model and visualize social circles, built on top of the graph structure.

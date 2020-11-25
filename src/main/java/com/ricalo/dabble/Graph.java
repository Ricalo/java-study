package com.ricalo.dabble;

import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public final class Graph<T> {
  public Node root;

  public Graph(T value) {
    this.root = new Node(value);
  }

  public ArrayList<T> breadthFirstSearch(){
    ArrayList<T> sortedArray = new ArrayList<>();
    Queue<Node> queue = new LinkedList<>();
    this.root.visited = true;
    queue.add(this.root);

    while(queue.peek() != null) {
      Node node = queue.remove();
      sortedArray.add(node.value);
      for(Node adjacentNode : node.adjacents) {
        if(!adjacentNode.visited) {
          adjacentNode.visited = true;
          queue.add(adjacentNode);
        }
      }
    }

    return sortedArray;
  }

  public ArrayList<T> depthFirstSearch() {
    ArrayList<T> sortedArray = new ArrayList<>();
    depthFirstSearchInternal(root, sortedArray);
    return sortedArray;
  }

  private void depthFirstSearchInternal(Node node, ArrayList<T> sortedArray) {
    if(node == null){
      return;
    }

    sortedArray.add(node.value);
    node.visited = true;
    for(Node adjacentNode : node.adjacents) {
      if (!adjacentNode.visited) {
        depthFirstSearchInternal(adjacentNode, sortedArray);
      }
    }
  }

  class Node {
    T value;
    boolean visited;
    ArrayList<Node> adjacents;

    public Node(T value) {
      this.visited = false;
      this.value = value;
      adjacents = new ArrayList<Node>();
    }
  }
}

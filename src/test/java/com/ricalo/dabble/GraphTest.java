package com.ricalo.dabble;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

public class GraphTest {
  @Test
  public void testDepthFirstSearchEmpty() {
    Graph<Integer> graph = new Graph<>(98);
    ArrayList sortedGraph = graph.depthFirstSearch();
    Assert.assertEquals(1, sortedGraph.size(), 0);
  }

  @Test
  public void testDepthFirstSearchSixNodeGraph() {
    Graph<Integer> graph = new Graph<>(0);
    Graph<Integer>.Node node1 = graph.new Node(1);
    Graph<Integer>.Node node2 = graph.new Node(2);
    Graph<Integer>.Node node3 = graph.new Node(3);
    Graph<Integer>.Node node4 = graph.new Node(4);
    Graph<Integer>.Node node5 = graph.new Node(5);
    graph.root.adjacents.add(node1);
    graph.root.adjacents.add(node4);
    graph.root.adjacents.add(node5);
    node1.adjacents.add(node3);
    node1.adjacents.add(node4);
    node2.adjacents.add(node1);
    node3.adjacents.add(node2);
    node3.adjacents.add(node4);

    ArrayList<Integer> sortedGraph = graph.depthFirstSearch();
    Assert.assertEquals(6, sortedGraph.size(), 0);
    Assert.assertEquals(0, sortedGraph.get(0), 0);
    Assert.assertEquals(1, sortedGraph.get(1), 0);
    Assert.assertEquals(3, sortedGraph.get(2), 0);
    Assert.assertEquals(2, sortedGraph.get(3), 0);
    Assert.assertEquals(4, sortedGraph.get(4), 0);
    Assert.assertEquals(5, sortedGraph.get(5), 0);
  }

  @Test
  public void testBreadthFirstSearchEmpty() {
    Graph<Integer> graph = new Graph<>(98);
    ArrayList sortedGraph = graph.breadthFirstSearch();
    Assert.assertEquals(1, sortedGraph.size(), 0);
  }

  @Test
  public void testBreadthFirstSearchSixNodeGraph() {
    Graph<Integer> graph = new Graph<>(0);
    Graph<Integer>.Node node1 = graph.new Node(1);
    Graph<Integer>.Node node2 = graph.new Node(2);
    Graph<Integer>.Node node3 = graph.new Node(3);
    Graph<Integer>.Node node4 = graph.new Node(4);
    Graph<Integer>.Node node5 = graph.new Node(5);
    graph.root.adjacents.add(node1);
    graph.root.adjacents.add(node4);
    graph.root.adjacents.add(node5);
    node1.adjacents.add(node3);
    node1.adjacents.add(node4);
    node2.adjacents.add(node1);
    node3.adjacents.add(node2);
    node3.adjacents.add(node4);

    ArrayList<Integer> sortedGraph = graph.breadthFirstSearch();
    Assert.assertEquals(6, sortedGraph.size(), 0);
    Assert.assertEquals(0, sortedGraph.get(0), 0);
    Assert.assertEquals(1, sortedGraph.get(1), 0);
    Assert.assertEquals(4, sortedGraph.get(2), 0);
    Assert.assertEquals(5, sortedGraph.get(3), 0);
    Assert.assertEquals(3, sortedGraph.get(4), 0);
    Assert.assertEquals(2, sortedGraph.get(5), 0);
  }
}

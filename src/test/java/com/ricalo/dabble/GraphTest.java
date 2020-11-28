package com.ricalo.dabble;

import static com.google.common.truth.Truth.assertThat;
import org.junit.Test;
import java.util.ArrayList;

public class GraphTest {
  @Test
  public void testDepthFirstSearchEmpty() {
    Graph<Integer> graph = new Graph<>(98);
    ArrayList<Integer> sortedGraph = graph.depthFirstSearch();
    assertThat(sortedGraph.size()).isEqualTo(1);
  }

  @Test
  public void testDepthFirstSearchNull() {
    Graph<Integer> graph = new Graph<>(0);
    graph.root = null;
    ArrayList<Integer> sortedGraph = graph.depthFirstSearch();
    assertThat(sortedGraph.size()).isEqualTo(0);
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
    assertThat(sortedGraph.size()).isEqualTo(6);
    assertThat(sortedGraph.get(0)).isEqualTo(0);
    assertThat(sortedGraph.get(1)).isEqualTo(1);
    assertThat(sortedGraph.get(2)).isEqualTo(3);
    assertThat(sortedGraph.get(3)).isEqualTo(2);
    assertThat(sortedGraph.get(4)).isEqualTo(4);
    assertThat(sortedGraph.get(5)).isEqualTo(5);
  }

  @Test
  public void testBreadthFirstSearchEmpty() {
    Graph<Integer> graph = new Graph<>(98);
    ArrayList sortedGraph = graph.breadthFirstSearch();
    assertThat(sortedGraph.size()).isEqualTo(1);
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
    assertThat(sortedGraph.size()).isEqualTo(6);
    assertThat(sortedGraph.get(0)).isEqualTo(0);
    assertThat(sortedGraph.get(1)).isEqualTo(1);
    assertThat(sortedGraph.get(2)).isEqualTo(4);
    assertThat(sortedGraph.get(3)).isEqualTo(5);
    assertThat(sortedGraph.get(4)).isEqualTo(3);
    assertThat(sortedGraph.get(5)).isEqualTo(2);
  }
}

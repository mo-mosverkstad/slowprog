#!/usr/bin/env python

from graph import Graph

graph_data = {'skynet01': ([0,1,2,3],[(0,1),(0,2),(1,3),(2,3)])}

def test_graph(graph_item):
    vertices, edges = graph_item
    graph = Graph()
    for v in vertices: graph.add_vertex(v)
    for e in edges: graph.add_edge(e[0], e[1])
    print graph
    print graph._lookfor_shortest(0)


test_graph(graph_data['skynet01'])

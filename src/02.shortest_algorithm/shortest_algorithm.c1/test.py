#!/usr/bin/env python

from graph import Graph

graph_data = {'skynet01': ([0,1,2,3],[(0,1),(0,2),(1,3),(2,3)],[(0,3,2)]), \
              'skynet02': ([1,2,3,4,5,6], [(1,2,7),(1,3,9),(1,6,14),(2,3,10),(2,4,15),(3,4,11),(3,6,2),(4,5,6),(6,5,9)],[(1,5,20)])}

def test_graph(graph_item):
    vertices, edges, path = graph_data[graph_item]
    graph = Graph()
    for v in vertices: graph.add_vertex(v)
    for e in edges: graph.add_edge(*e)
    print graph.paint_graph()

def test_graphs(graph_data):
    for g in graph_data.keys(): test_graph(g)

test_graphs(graph_data)

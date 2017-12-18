#!/usr/bin/env python

from graph import Graph

skynet01_str = 'Vertex: 0, [0, 1, 2]\n== Edge: 0 -> 0\n== Edge: 0 -> 1\n== Edge: 0 -> 2\n' + \
               'Vertex: 1, [0, 1, 3]\n== Edge: 0 -> 1\n== Edge: 1 -> 1\n== Edge: 1 -> 3\n' + \
               'Vertex: 2, [0, 2, 3]\n== Edge: 0 -> 2\n== Edge: 2 -> 2\n== Edge: 2 -> 3\n' + \
               'Vertex: 3, [1, 2, 3]\n== Edge: 1 -> 3\n== Edge: 2 -> 3\n== Edge: 3 -> 3'
skynet02_str = 'Vertex: 1, [1, 2, 3, 6]\n== Edge: 1 -> 1\n== Edge: 1 -> 2 (7)\n== Edge: 1 -> 3 (9)\n== Edge: 1 -> 6 (14)\n' + \
               'Vertex: 2, [1, 2, 3, 4]\n== Edge: 1 -> 2 (7)\n== Edge: 2 -> 2\n== Edge: 2 -> 3 (10)\n== Edge: 2 -> 4 (15)\n' + \
               'Vertex: 3, [1, 2, 3, 4, 6]\n== Edge: 1 -> 3 (9)\n== Edge: 2 -> 3 (10)\n== Edge: 3 -> 3\n== Edge: 3 -> 4 (11)\n== Edge: 3 -> 6 (2)\n' + \
               'Vertex: 4, [2, 3, 4, 5]\n== Edge: 2 -> 4 (15)\n== Edge: 3 -> 4 (11)\n== Edge: 4 -> 4\n== Edge: 4 -> 5 (6)\n' + \
               'Vertex: 5, [4, 5, 6]\n== Edge: 4 -> 5 (6)\n== Edge: 5 -> 5\n== Edge: 6 -> 5 (9)\n' + \
               'Vertex: 6, [1, 3, 5, 6]\n== Edge: 1 -> 6 (14)\n== Edge: 3 -> 6 (2)\n== Edge: 6 -> 5 (9)\n== Edge: 6 -> 6'

graph_data = {'skynet01': ([0,1,2,3],[(0,1),(0,2),(1,3),(2,3)],skynet01_str), \
              'skynet02': ([1,2,3,4,5,6], [(1,2,7),(1,3,9),(1,6,14),(2,3,10),(2,4,15),(3,4,11),(3,6,2),(4,5,6),(6,5,9)],skynet02_str)}

def test_graph(graph_item):
    vertices, edges, exp = graph_data[graph_item]
    graph = Graph(vertex_list=vertices, edge_list=edges)
    return str(graph) == exp

def test_graphs(graph_data):
    pass_number = 0
    total_number = len(graph_data)
    for g in graph_data.keys():
        if not test_graph(g): print 'Error found in %s'%(g)
        else: pass_number += 1
    print '== Pass rate: %3.2f%% (%d out of %d)'%(float(pass_number)/float(total_number)*100, \
                                                  pass_number, total_number)

test_graphs(graph_data)

#!/usr/bin/env python

from eulerian import GraphEulerian

graph_data = {'skynet01': ([0,1,2,3],[(0,1,False),(0,2,False),(1,3,False),(2,3,False)]), \
              'skynet02': ([0,1,2,3],[(0,1,False),(0,2,False),(1,3,False),(2,3,False),(1,2,False)]), \
              'skynet03': ([1,2,3,4,5,6], [(1,2,False),(1,3,False),(1,6,False),(2,3,False),(2,4,False),(3,4,False),(3,6,False),(4,5,False),(6,5,False)]), \
              'skynet04': ([1,2,3,4,5,6,7,8,9,10,11], \
                           [(1,7,False), (1,12,False), (2,7,False), (2,8,False), (3,8,False), (3,9,False), \
                            (4,9,False), (4,10,False), (5,10,False), (5,11,False), (6,11,False), (6,12,False), \
                            (7,12,False), (7,8,False), (8,9,False), (9,10,False), (10,11,False), (11,12,False)])}

def test_eulerian(case_name, case_data):
    vertices, edges = case_data
    eg = GraphEulerian(vertex_list=vertices, edge_list=edges)
    print eg.is_eulerian()
    

def test_eulerians(graph_data):
    for case_name, case_data in graph_data.iteritems():
        test_eulerian(case_name, case_data)

test_eulerians(graph_data)

#!/usr/bin/env python

from graph import Graph

class GraphEulerian(Graph):
    def __init__(self, vertex_list=[], edge_list=[], digraph=False, self_edge_property=None):
        self.edge_list = []
        Graph.__init__(self, vertex_list, edge_list, digraph, self_edge_property)

    def add_edge(self, from_vertex_key, to_vertex_key, edge_property=None):
        edge = Graph.add_edge(self, from_vertex_key, to_vertex_key, edge_property)
        self.edge_list.append(edge)

        
    def __is_odd(self, v): return v%2==1

    def __lookfor_avail_edge(self, vertex):
        edges = [neighbor for neighbor in vertex.get_neighbors() \
                 if vertex.get_edge(neighbor)!=None and not vertex.get_edge(neighbor).property]
        neighbor_key = edges[0] if len(edges)>0 else None
        if neighbor_key != None:
            vertex.get_edge(neighbor_key).property = True
            if not self.digraph: self.vertex_dict[neighbor_key].get_edge(vertex.key).property = True
        return neighbor_key
    
    def __next_vertex(self, go_through_path):
        vertex_key = go_through_path[-1]
        next_vertex_key = self.__lookfor_avail_edge(self.vertex_dict[vertex_key])
        if next_vertex_key != None:
            go_through_path.append(next_vertex_key)
            self.__next_vertex(go_through_path)
        
    def __go_through(self, start_vertex_key):
        for e in self.edge_list: e.property = False
        go_through_path = [start_vertex_key]
        self.__next_vertex(go_through_path)
        return go_through_path
        
    def is_eulerian(self):
        odd_vertex_list = [k for k, v in self.vertex_dict.iteritems() if self.__is_odd(len(v.get_edges()))]
        is_eulerian = True if len(odd_vertex_list) in [0,2] else False
        if is_eulerian and not odd_vertex_list: odd_vertex_list = self.vertex_dict.keys()
        return (is_eulerian, self.__go_through(odd_vertex_list[0])) if is_eulerian else \
               (is_eulerian, [])
        



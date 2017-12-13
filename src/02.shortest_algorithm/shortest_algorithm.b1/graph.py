#!/usr/bin/env python

class Vertex:
    NO_CONNECTION = 999
    def __init__(self, node):
        self.node = node
        self.adjacent = {}

    def add_neighbor(self, neighbor, weight=1, dual=True):
        self.adjacent[neighbor] = weight
        if dual: neighbor.add_neighbor(self, weight, False)

    def get_neighbors(self):
        return self.adjacent.keys()

    def get_weight(self, neighbor):
        return self.adjacent.get(neighbor, Vertex.NO_CONNECTION)

    def __str__(self):
        return '%s: adjacents: %s'%(self.node, str([v.node for v in self.adjacent.keys()]))

class Graph:
    def __init__(self):
        self.vertex_dict = {}
        self.vertex_number = 0

    def __iter__(self):
        return iter(self.vertex_dict.values())

    def add_vertex(self, node):
        self.vertex_number += 1
        self.vertex_dict[node] = Vertex(node)
        return self.get_vertex(node)

    def get_vertex(self, node):
        return self.vertex_dict.get(node, None)

    def get_vertex_number(self):
        return self.vertex_number

    def get_vertices(self):
        return self.vertex_dict.values()

    def add_edge(self, from_node, to_node, weight=1, dual=True):
        from_vertex = self.get_vertex(from_node) if self.get_vertex(from_node) != None else self.add_vertex(from_node)
        to_vertex = self.get_vertex(to_node) if self.get_vertex(to_node) != None else self.add_vertex(to_node)
        from_vertex.add_neighbor(to_vertex, weight, dual)

    def get_edge_weight(self, from_node, to_node):
        from_vertex = self.get_vertex(from_node)
        to_vertex = self.get_vertex(to_node)
        if from_vertex is None or to_vertex is None: return Vertex.NO_CONNECTION
        else: return from_vertex.get_weight(to_vertex)
        
    def __str__(self):
        return '\n'.join([str(v) for v in self.vertex_dict.values()])


#!/usr/bin/env python

class Vertex:
    def __init__(self, key, vertex_property=None, self_edge_property=None):
        self.key = key
        self.neighbors = {}
        self.neighbors[key] = Edge(key, key, self_edge_property)
        self.property = vertex_property

    def add_neighbor(self, neighbor_key, edge):
        self.neighbors[neighbor_key] = edge

    def get_neighbors(self):
        return self.neighbors.keys()

    def get_edges(self):
        return self.neighbors.values()

    def get_edge(self, neighbor):
        return self.neighbors.get(neighbor, None)

    def __str__(self):
        neighbors_str = str(self.get_neighbors()) + '\n' + \
                        '\n'.join(['== %s'%(str(e)) for e in self.neighbors.values()])
        return 'Vertex: %s, %s'%(self.key, neighbors_str) if self.property==None \
               else 'Vertex: %s (%s), %s'%(self.key, str(self.property), neighbors_str)

class Edge:
    def __init__(self, from_vertex_key, to_vertex_key, edge_property=None):
        self.from_vertex_key = from_vertex_key
        self.to_vertex_key = to_vertex_key
        self.property = edge_property

    def __str__(self):
        return 'Edge: %s -> %s'%(str(self.from_vertex_key), str(self.to_vertex_key)) if self.property==None \
               else 'Edge: %s -> %s (%s)'%(str(self.from_vertex_key), str(self.to_vertex_key), str(self.property))


class Graph:
    def __init__(self, vertex_list=[], edge_list=[], digraph=False, self_edge_property=None):
        self.digraph = digraph
        self.self_edge_property = self_edge_property
        self.vertex_dict = {}
        self.add_vertices(vertex_list)
        self.add_edges(edge_list)

    def __check_iter(self, value):
        try:
            some_object_iterator = iter(value)
            return True
        except TypeError, te:
            return False

        
    def add_vertex(self, vertex_key, vertex_property=None, self_edge_property=None):
        self.vertex_dict[vertex_key] = Vertex(vertex_key, vertex_property, self_edge_property)

    def add_vertices(self, vertex_list):
        for v in vertex_list:
            if self.__check_iter(v): self.add_vertex(*v)
            else: self.add_vertex(v)

    def get_vertex(self, vertex_key):
        return self.vertex_dict.get(vertex_key, None)

    def get_vertex_number(self):
        return len(self.vertex_dict)

    def add_edge(self, from_vertex_key, to_vertex_key, edge_property=None):
        if not self.get_vertex(from_vertex_key): self.add_vertex(from_vertex_key)
        if not self.get_vertex(to_vertex_key): self.add_vertex(to_vertex_key)
        edge = Edge(from_vertex_key, to_vertex_key, edge_property)
        self.vertex_dict[from_vertex_key].add_neighbor(to_vertex_key, edge)
        if not self.digraph: self.vertex_dict[to_vertex_key].add_neighbor(from_vertex_key, edge)

    def add_edges(self, edge_list):
        for e in edge_list: self.add_edge(*e)

    def get_neighbors(self, vertex_key):
        vertex = self.get_vertex(vertex_key)
        if vertex: return vertex.get_neighbors()
        else: return []

    def get_edge(self, from_vertex_key, to_vertex_key):
        from_vertex = self.get_vertex(from_vertex_key)
        if from_vertex: return from_vertex.get_edge(to_vertex_key)
        else: return None
    
    def __str__(self):
        return '\n'.join([str(v) for v in self.vertex_dict.values()])


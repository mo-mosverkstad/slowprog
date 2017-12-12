#!/usr/bin/env python

from constants import MAX_VALUE

def lookfor_shortest(si, ei, skynet_map):
    weight = [(skynet_map[0][i], 0) for i in range(len(skynet_map))]
    visiting_nodes = {si}
    visited_nodes = set()
    while visiting_nodes:
        next_nodes = set()
        for sn in visiting_nodes:
            for dn in range(len(skynet_map)):
                #print 'si=%d, sn=%d, dn=%d'%(si, sn, dn)
                #print '-- si->sn:%d, sn->dn:%d, si->dn:%d'%(weight[sn][0], skynet_map[sn][dn], weight[dn][0])
                if (weight[sn][0] + skynet_map[sn][dn] <= weight[dn][0]) \
                   and ([sn][0] + skynet_map[sn][dn] < MAX_VALUE) \
                   and sn != dn:
                    weight[dn] = (weight[sn][0] + skynet_map[sn][dn], sn)
                    next_nodes.add(dn)
        #print '== weight ', weight
        #print '== next   ', next_nodes
        visited_nodes.update(visiting_nodes)
        visiting_nodes = next_nodes - visited_nodes
        #print '== visited', visited_nodes
        #print '== visitin', visiting_nodes
    #print '== result: ', weight
    return weight[ei]

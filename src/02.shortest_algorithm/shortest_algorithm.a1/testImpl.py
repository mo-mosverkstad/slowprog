#!/usr/bin/env python

from constants import *
from shortest import lookfor_shortest

def test_build_skynet(n, l, e, node_links):
    skynet_map = [[MAX_VALUE for j in range(n)] for i in range(n)]
    for i in range(n): skynet_map[i][i] = 0
    for nl in node_links:
        n1, n2 = nl
        skynet_map[n1][n2] = 1
        skynet_map[n2][n1] = 1
    return skynet_map

def print_map(skynet_map):
    for row in skynet_map:
        for item in row:
            print item,
        print


def run_test(test_contents):
    n, l, e, node_links, si, ei, ex = test_contents
    skynet_map = test_build_skynet(n, l, e, node_links)
    #(skynet_map)
    return lookfor_shortest(si, ei, skynet_map) == ex

def run_tests(test_data_dict):
    pass_number = 0
    total_number = len(test_data_dict.keys())
    for t, c in test_data_dict.iteritems():
        if run_test(c): pass_number += 1
        else: print 'Fail test: %s'%(t)
    print 'The pass rate: %d/%d = %3.2f%%'%(pass_number, total_number, \
                                            float(pass_number)/float(total_number)*100)



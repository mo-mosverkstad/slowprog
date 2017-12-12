#!/usr/bin/env python

from testImpl import run_tests

test_data_dict = {'test01': (4,4,1,[(0,1),(0,2),(1,3),(2,3)],0,3,(2,2)), \
                  'test02': (3,2,1,[(0,1),(1,2)],0,2,(2,1)), \
                  'test03': (6,8,1,[(0,1),(0,2),(1,3),(1,4),(2,4),(2,5),(3,4),(3,5)],0,4,(2,2))}

run_tests(test_data_dict)

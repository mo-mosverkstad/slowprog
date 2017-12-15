#!/usr/bin/env python

class Color:
    RED    = 'RED'    #(255, 0, 0)
    GREEN  = 'GREEN'  #(0, 255, 0)
    BLUE   = 'BLUE'   #(0, 0, 255)
    YELLOW = 'YELLOW' #(0, 255, 255)
    WHITE  = 'WHITE'  #(255, 255, 255)
    BLACK  = 'BLACK'  #(0, 0, 0)

class ColorPool:
    def __init__(self):
        self.color_full_set = {Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW, Color.WHITE, Color.BLACK}
        self.color_used_set = set()
        self.color_unused_set = self.color_full_set - self.color_used_set

    def pickup(self, taken_set):
        candidator_set = self.color_full_set - taken_set
        take = next(iter(candidator_set)) if len(candidator_set) else None
        self.color_unused_set.discard(take)
        if take != None:
            self.color_used_set.add(take)
        return take

    def __str__(self):
        return 'used set: %s\nthe remaining set: %s'%(str(self.color_used_set), str(self.color_unused_set))


        

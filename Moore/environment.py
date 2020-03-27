#!/usr/bin/env python3
# -*- coding: utf-8 -*-

import Player from player
from random import randint


class Square(object):
    def __init__(self, size, n_treasures):
        self.place = [range(size) for i in range(size)]
        self.n_treasures = n_treasures
        self.treasure_position = {}

    def hide_treasure(self, total, limit_x, limit_y):
        for i in range(0, total):
            pos_x = randint(0, limit_x)
            pos_y = randint(0, limit_y)
            self.treasure_position[i+1] = [pos_x, pos_y]
            self.place[pos_x, pos_y] = 1

    def print_pos(self):
        print("jaajjaja")
        
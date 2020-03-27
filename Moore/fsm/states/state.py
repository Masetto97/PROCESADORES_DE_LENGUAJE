#!/usr/bin/env python3
# -*- coding: utf-8 -*-


class State(object):
    """State es una clase de la que deberán heredar el resto de estados.
    """
    def __init__(self, state_id, *args, **kwargs):
        self.state_id = state_id

        # actions es una lista, pero se comporta como un conjunto cuando se añaden o redefinen las acciones.
        self.actions = list(set(kwargs['actions'])) if 'actions' in kwargs.keys() else None

    def get_state_id(self):
        return self.state_id

    def set_state_id(self, state_id):
        self.state_id = state_id

    def get_actions(self):
        return self.actions

    def set_actions(self, action):
        self.actions = list(set(self.actions).union((set(action))))

    def remove_actions(self, actions):
        self.actions = list(set(self.actions).difference(set(actions)))

    def print_input_raw(self, *args, **kwargs):

        if args:
            print('Argumentos: \n\t {}'.format(args))

        if kwargs:
            print('KArgumentos:')
            for key, value in kwargs.items():
                print(('\tk: {},\t v: {}').format(key, value))

    def run(self, input_behavior, *args, **kwargs):

        try:
            behavior = getattr(self, input_behavior)
        except AttributeError:
            behavior = None
        if callable(behavior):
            return behavior(*args, **kwargs)
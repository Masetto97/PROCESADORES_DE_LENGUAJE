#!/usr/bin/env python3
# -*- coding: utf-8 -*-

from .states.states_factory import StatesFactory
from .states.state import State


class Moore(object):
    def __init__(self):
        # Basic elements
        self.alphabet = set()
        self.states = {}
        self.initial = None
        self.transitions = {}

        # Helper variables
        self.curState = None

    def get_state(self, state_id):
        if type(state_id) is str:
            return self.states.get(state_id)
        else:
            raise ('Se esperaba String')

    def add_state(self, state):
        self.states[state.get_state_id()] = state

    def delete_state(self, state):
        del self.states[state.get_state_id()]

    def add_states(self, states):
        factory = StatesFactory()
        for key, value in states.items():
            self.add_state(factory.get_state(str(key), value))

    def delete_states(self, states):
        for key, value in states.items():
            self.delete_state(self.states[key])

    def get_initial(self):
        return self.initial

    def set_initial(self, state):
        init_state = None

        if type(state) is str:
            init_state = self.get_state(state)
        else:
            init_state = state


        self.curState = init_state
        self.initial = init_state

    def get_transitions(self):
        return self.transitions

    def set_transition(self, transition_trigger, state1, state2):
        if type(state1) is str:
            state_id_1 = state1

        elif isinstance(state1, State):
            state_id_1 = state1.get_state_id()
        else:
            raise('state1 no es on obj. State o un string')

        if type(state2) is str:
            state_id_2 = state2

        elif isinstance(state2, State):
            state_id_2 = state2.get_state_id()
        else:
            raise('state2 no es un obj. State o un string')

        state_id_list = list(self.states.keys())

        if state_id_1 in state_id_list and state_id_2 in state_id_list:
            list_transitions_states = list(self.transitions.keys())

            if state_id_1 in list_transitions_states:
                self.transitions[state_id_1] += [(transition_trigger, state_id_2)]
            else:
                self.transitions[state_id_1] = [(transition_trigger, state_id_2)]


        else:
            raise('Alguno de los estados no pertenece a la máquina')

    def reset(self):
        self.curState(self.initial)

    def run(self, event, environment, *args, **kwargs):

        if not self.initial or not self.curState:
            raise ('[!] Estado inicial no definido ( obj.set_initial(State(obj)) ) [!]')

        else:

            list_transitions = list(self.transitions[self.curState.get_state_id()])
            for transition in list_transitions:
                if transition[0] == event:
                    # Primero se transita al nuevo estado.
                    self.curState = self.get_state(transition[1])
                    # Cuando se ha transitado se ejecuta lo que corresponda a la entrada.
                    self.curState.run(event, environment, *args, **kwargs)

                    break

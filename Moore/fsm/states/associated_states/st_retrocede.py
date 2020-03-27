#!/usr/bin/env python3
# -*- coding: utf-8 -*-

from Moore.fsm.states.state import State


# El nombre de la clase está definido por el lenguaje pero ha de heredar de state
class St_retrocede(State):

    def __init__(self, id_state, *args, **kwargs):
        super().__init__(id_state, *args, **kwargs)

    # Métodos que se quieran definir para St_retrocede.
    def retroceder(self, *args, **kwargs):
        print("Jugador gira 180º y avanza")
        # pj.retrocede(1)
        self.print_input_raw(*args, **kwargs)

#!/usr/bin/env python3
# -*- coding: utf-8 -*-

from Moore.fsm.states.state import State


# El nombre de la clase está definido por el lenguaje pero ha de heredar de State.
class St_giraI(State):

    def __init__(self, id_state, *args, **kwargs):
        super().__init__(id_state, *args, **kwargs)

    # Métodos que se quieran definir para St_giraI.
    def girarI(self, *args, **kwargs):
        print("Jugador gira 45º a su izquierda")
        # pj.grira(45)
        self.print_input_raw(*args, **kwargs)

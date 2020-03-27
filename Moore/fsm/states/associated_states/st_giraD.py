#!/usr/bin/env python3
# -*- coding: utf-8 -*-

from Moore.fsm.states.state import State


# El nombre de la clase está definido por el lenguaje pero ha de heredar de State
class St_giraD(State):

    def __init__(self, id_state, *args, **kwargs):
        super().__init__(id_state, *args, **kwargs)

    # Métodos que se quieran definir para St_girarD.
    def girarD(self, *args, **kwargs):
        print("Jugador gira 45º a su derecha")
        # pj.grira(-45)
        self.print_input_raw(*args, **kwargs)

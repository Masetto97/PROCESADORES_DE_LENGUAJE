#!/usr/bin/env python3
# -*- coding: utf-8 -*-

from Moore.fsm.states.state import State


# El nombre de la clase está definido por el lenguaje pero ha de heredar de State.
class St_inicio(State):

    def __init__(self, id_state, *args, **kwargs):
        super().__init__(id_state, *args, **kwargs)

    # Métodos que se quieran definir para St_inicial.
    def crear_jugador(self, *args, **kwargs):
        print("Se crea el jugador 'Player_1'")
        # env.insert(pj("Player1"))
        self.print_input_raw(*args, **kwargs)

#!/usr/bin/env python3
# -*- coding: utf-8 -*-

#
#Importaciones generadas.

from Moore.fsm.states.associated_states.st_inicio import St_inicio
from Moore.fsm.states.associated_states.st_adelante import St_adelante
from Moore.fsm.states.associated_states.st_retrocede import St_retrocede
from Moore.fsm.states.associated_states.st_giraI import St_giraI
from Moore.fsm.states.associated_states.st_giraD import St_giraD


class StatesFactory(object):
    #Método generado.
    def get_state(self, id_state, actions):
        if id_state == 'st_inicio':
            return St_inicio(id_state, actions)

        elif id_state == 'st_adelante':
            return St_adelante(id_state, actions)

        elif id_state == 'st_retrocede':
            return St_retrocede(id_state, actions)

        elif id_state == 'st_giraI':
            return St_giraI(id_state, actions)

        elif id_state == 'st_giraD':
            return St_giraD(id_state, actions)

        else:
            print('[!] No se reconoce el estado %s [!]' % id_state)

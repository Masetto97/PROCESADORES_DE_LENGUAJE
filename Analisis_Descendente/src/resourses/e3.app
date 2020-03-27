import laberinto as env;
import jugador.explorador as pj;
environment env;
outputs {   crear_jugador:  [code]
                                env.insert(pj("Player1"))
                            [/code];

            avanzar:    [code]
                            print("Jugador avanza")
                            pj.avanza(1)
                        [/code];

            retroceder:     [code]
                                print("Jugador gira 180º y avanza")
                                pj.retrocede(1)
                            [/code];

            girarI:     [code]
                            print("Jugador gira 45º a su izquierda")
                            pj.grira(45)
                        [/code];

            girarD:     [code]
                            print("Jugador gira 45º a su derecha")
                            pj.grira(-45)
                        [/code];
        }

automaton movimientos_pj {
    states  {   st_inicio, crear_jugador;
                st_adelante, avanzar;
                st_retrocede, retroceder;
                st_giraI, girarI;
                st_giraD, girarD;
            }

    initial st_inicio;

    inputs   reset, w, s, a, d;

    transitions {
                    (st_inicio, reset) --> st_inicio;
                    (st_inicio, w) --> st_adelante;
                    (st_inicio, s) --> st_retrocede;
                    (st_inicio, a) --> st_giraI;
                    (st_inicio, d) --> st_giraD;
                    (st_adelante, reset) --> st_inicio;
                    (st_adelante, w) --> st_adelante;
                    (st_adelante, a) --> st_retrocede;
                    (st_adelante, s) --> st_giraI;
                    (st_adelante, d) --> st_giraD;
                    (st_retrocede, reset) --> st_inicio;
                    (st_retrocede, w) --> st_adelante;
                    (st_retrocede, a) --> st_retrocede;
                    (st_retrocede, s) --> st_giraI;
                    (st_retrocede, d) --> st_giraD;
                    (st_giraI, reset) --> st_inicio;
                    (st_giraI, w) --> st_adelante;
                    (st_giraI, a) --> st_retrocede;
                    (st_giraI, s) --> st_giraI;
                    (st_giraI, d) --> st_giraD;
                    (st_giraD, reset) --> st_inicio;
                    (st_giraD, w) --> st_adelante;
                    (st_giraD, a) --> st_retrocede;
                    (st_giraD, s) --> st_giraI;
                    (st_giraD, d) --> st_giraD;
                };
}
#!/usr/bin/env rexx
/* Rexx */

-- Main:
Do
  Queue ' -------------------------------------------------------------------'
  Queue ''
  Queue '     "\|||/"'
  Queue '       (@@)'
  Queue '   _ooO_(_)_Ooo___________________________________'
  Queue '  |______|_____|_____|_____|_____|_____|_____|_____|'
  Queue '  |___Wot, no FORTRAN?_|_____|_____|_____|_____|____|'
  Queue '  |______|_____|_____|_____|_____|_____|_____|_____|'
  Queue '  |___|____|_____|_____|_____|_____|_____|_____|_'
  Queue '  |______|_____|_____|_____|_____|__'
  Queue '  |__ !    !     !     !'
  Queue ''
  Queue ''
  Queue ' -------------------------------------------------------------------'
  Queue ''
  Queue '                 (  @ @  )'
  Queue ' +------------oOOo-(_)-oOOo----------------------------------------+'
  Queue '/|\                                                               /|\'
  Queue '\|/   Wot, no COBOL?                                              \|/'
  Queue '/|\                                                               /|\'
  Queue '\|/                                                               \|/'
  Queue ' +---------------------Oooo----------------------------------------+'
  Queue '                oooO   (   )'
  Queue '               (   )    ) /'
  Queue '                \ (    (_/'
  Queue '                 \_)'
  Queue ''
  Queue ' -------------------------------------------------------------------'

  Do _Q = 1 while queued() > 0
    Parse pull line
    Say right(_Q, 2, 0) '    ' || Line
  End _Q

  Return 0
End
Exit

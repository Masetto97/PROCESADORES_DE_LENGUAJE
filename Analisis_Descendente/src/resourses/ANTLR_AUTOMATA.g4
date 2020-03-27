grammar ANTLR_AUTOMATA;

/*
 * Symbols
 */

Arrow
  : '-->'
  ;
  
Dot
  : '.'
  ;

Doble_Dot
  : ':'
  ;
  
Separator
  : '|'
  ;

Phar_right
  : ')'
  ;
  
Phar_left
  : '('
  ;
  
Key_right
  : '{'
  ;

Key_left
  : '}'
  ;

Dot_and_comma
  :	';'
  ;
  
Low_bar
  :	'_'
  ;
  
Assignment
  :	':='
  ;

Comma
  : ','
  ;

Asterisk
  : '*'
  ;

/*
 * Keywords
 */
AS
	: 'as'
	;
	
Automaton
  : 'automaton'
  ;

Code
	: '[code]' .*? '[/code]'
	;

Environment
	: 'environment'
	;

Import
	: 'import' 
	;

Initial
  : 'initial'
  ;

Inputs
  : 'inputs'
  ;
  
From
	: 'from'
	;

Outputs
  : 'outputs' 
  ;
  
States
  : 'states'
  ;
  
Transitions
  : 'transitions'
  ;
	 
/*
 * Fragments
 */  

fragment Letter
  : [a-zA-Z]
  ;
  
fragment LetterOrDigit
  : [a-zA-Z0-9_$]
  ;
  
/*
 * Parser rules
 */
 
program 
	: import_stmt* environment_statement* outputs_stmt automaton_stmt EOF
	;

import_stmt 
	: import_name | import_from 
	;
	
import_name 
	: Import dotted_as_names Dot_and_comma;
 
import_from 
	: From  Dot dotted_name | From Dot Dot dotted_name | From dotted_name | From Dot  | From Dot Dot 
	  Import Asterisk  Dot_and_comma |  Import Phar_left import_as_names Phar_right Dot_and_comma | Import import_as_names Dot_and_comma
	;

dotted_as_names 
	: dotted_as_name |dotted_as_name Comma import_as_name  
	;

dotted_as_name 
	: dotted_name | dotted_name AS Identifier 
	;

dotted_name 
	: Identifier | Identifier Dot Identifier 
	;

import_as_name
	: Identifier | Identifier AS Identifier 
 	;

import_as_names 
	: import_as_name |import_as_name Comma import_as_name 
	;

environment_statement
	: Environment Code Dot_and_comma | Environment Identifier Dot_and_comma
	;

outputs_stmt 
	: Outputs Key_right output_stmt+ Key_left
	;
	
output_stmt 
	: Identifier Doble_Dot  outputs_code Dot_and_comma
	;

outputs_code 
	: Code
	;
	
automaton_stmt
  : Automaton Identifier Key_right states_outputs_stmt initial_state alphabet_input_stmt? transitions_stmt Key_left
  ;

states_outputs_stmt
  : States Key_right state_output_stmt+ Key_left
  ;

state_output_stmt
  : Identifier Comma Identifier Dot_and_comma
  ;

initial_state
  : Initial Identifier Dot_and_comma
  ;

alphabet_input_stmt
  : Inputs input_identifier+ Dot_and_comma
  ;
  
input_identifier
  : Identifier | Comma Identifier
  ;

transitions_stmt
  : Transitions Key_right transition_stmt+ Key_left Dot_and_comma
  ;

transition_stmt
  : Phar_left Identifier Comma Identifier Phar_right Arrow Identifier Dot_and_comma
  ;
 
Identifier
  : Letter LetterOrDigit*
  ;

 /*
 * Whitespace and comments
 */

WHITESPACE  :  [ \t\r\n]+ -> skip
    ;

COMMENT
    :   '/*' .*? '*/' -> skip
    ;

LINE_COMMENT
    :   '//' ~[\t\r\n]+ -> skip
	;
 
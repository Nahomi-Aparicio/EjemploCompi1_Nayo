

// ------------  Paquetes e importaciones ------------
package Analizador; 

import java_cup.runtime.*;

%%	
//-------> Directivas (No tocar)

%public 
%class Lexer
%cup
%char
%line
%column
%unicode
%ignorecase 


%init{ 
    yyline = 1;
    yycolumn =1;
%init} 

// ------> Expresiones Regulares 
entero = [0-9]+
CARACTER_ENTRADA = [^\!]| ("!"[^\>])
COMENT_M= "<!" {CARACTER_ENTRADA} + "!>"
COMENT_S= "#".*
CARACTERES=  [!-/:-@\[-`{-~&&[^0-9A-Za-z,]]

ID = [a-zA-Z_][a-zA-Z0-9_]*
%%




// ------------  Reglas Lexicas -------------------

"("        { return new Symbol(sym.PARENTESIS_A, yycolumn, yyline, yytext()); }
")"        { return new Symbol(sym.PARENTESIS_C, yycolumn, yyline, yytext()); }

"{"        { return new Symbol(sym.LLAV_A, yycolumn, yyline, yytext()); }
"}"        { return new Symbol(sym.LLAV_C, yycolumn, yyline, yytext()); }

":"        { return new Symbol(sym.DOSP, yycolumn, yyline, yytext()); }

"->"        { return new Symbol(sym.FLECH, yycolumn, yyline, yytext()); }

";"        { return new Symbol(sym.PCOMA, yycolumn, yyline, yytext()); }

","        { return new Symbol(sym.COMA, yycolumn, yyline, yytext()); }

"&"        { return new Symbol(sym.INTER, yycolumn, yyline, yytext()); }

"-"        { return new Symbol(sym.DIFEREN, yycolumn, yyline, yytext()); }

"^"        { return new Symbol(sym.COMPLE, yycolumn, yyline, yytext()); }


//------------´palabras reservadas
"conj"    { return new Symbol(sym.CONJ, yycolumn, yyline, yytext()); } 
"opera"    { return new Symbol(sym.OPERA, yycolumn, yyline, yytext()); } 
"evaluar"    { return new Symbol(sym.EVALUAR, yycolumn, yyline, yytext()); } 




{ID}  { return new Symbol(sym.ID, yycolumn, yyline, yytext()); }
{entero}  { return new Symbol(sym.ENTERO, yycolumn, yyline, yytext()); }
{CARACTERES}  { return new Symbol(sym.CARACTERES, yycolumn, yyline, yytext()); }


{COMENT_M} {  } // ya que son comentarios no importan nada 
{COMENT_S} {  }

//------> Ingorados 
[ \t\r\n\f]     {/* Espacios en blanco se ignoran */}

//------> Errores Léxicos 
.           	{ System.out.println("Error Lexico: " + yytext()); }


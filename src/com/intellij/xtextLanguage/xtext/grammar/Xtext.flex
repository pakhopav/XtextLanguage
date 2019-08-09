package com.intellij.xtextLanguage.xtext;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.xtextLanguage.xtext.psi.XtextTypes;

import static com.intellij.psi.TokenType.BAD_CHARACTER; // Pre-defined bad character token.
import static com.intellij.psi.TokenType.WHITE_SPACE; // Pre-defined whitespace character token.
import static com.intellij.xtextLanguage.xtext.psi.XtextTypes.*; // Note that is the class which is specified as `elementTypeHolderClass`
// in bnf grammar file. This will contain all other tokens which we will use.

%%

%public
%class XtextLexer // Name of the lexer class which will be generated.
%implements FlexLexer
%function advance
%type IElementType
%unicode

ID=\^?[a-zA-Z$_][a-zA-Z0-9$_]*
STRING = (\"([^\"\\]|\\.)*\"|'([^'\\]|\\.)*')
INT=[0-9]+
WS=[ \t\n\x0B\f\r]+
SL_COMMENT = \/\/.*
ML_COMMENT = \/\*(([ \t\n\x0B\f\r])|(.))*\*\/


%%
<YYINITIAL> {

{ID} {return ID; }
{STRING} {return STRING;}
{INT} {return INT;}
{WS} {return WHITE_SPACE;}
{SL_COMMENT} {return SL_COMMENT;}
{ML_COMMENT} {return ML_COMMENT;}
}


[^] { return BAD_CHARACTER; }
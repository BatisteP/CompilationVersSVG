     
%%
   
%package batiste
%class Lexer
%public
%line
%column
%cup

%%

[ \t\n\r]		{ }
^#.*			{ }
frame		{ return getSymbolFactory().newSymbol ("FRAME", Sym.FRAME); }
rectangle	{ return getSymbolFactory().newSymbol ("MAKERECT", Sym.MAKERECT); }
circle 		{ return getSymbolFactory().newSymbol ("MAKECIRCLE", Sym.MAKECIRCLE); }
container   { return getSymbolFactory().newSymbol ("MAKECONT", Sym.MAKECONT); }
polygon 	 { return getSymbolFactory().newSymbol ("MAKEPOLYGON", Sym.MAKEPOLYGON); }
line   {  return getSymbolFactory().newSymbol ("MAKELINE", Sym.MAKELINE); }
text   { return getSymbolFactory().newSymbol ("MAKETEXT", Sym.MAKETEXT); }
animate  { return getSymbolFactory().newSymbol ("MAKEANIMATION", Sym.MAKEANIMATION); }
animeTransform { return getSymbolFactory().newSymbol ("MAKEANIMATETRANSFORM", Sym.MAKEANIMATETRANSFORM);}
","  		{ return getSymbolFactory().newSymbol ("SEP", Sym.SEP); }
"="			{ return getSymbolFactory().newSymbol ("EQUAL", Sym.EQUAL); }
"+"			{ return getSymbolFactory().newSymbol ("PLUS", Sym.PLUS); }
"-"			{ return getSymbolFactory().newSymbol ("MINUS", Sym.MINUS); }
"*"			{ return getSymbolFactory().newSymbol ("MULT", Sym.MULT); }
"/"			{ return getSymbolFactory().newSymbol ("DIV", Sym.DIV); }
";"				{ return getSymbolFactory().newSymbol ("SEP", Sym.TERM); }
"["				{ return getSymbolFactory().newSymbol ("CONTAINERSTART", Sym.CONTAINERSTART); }
"]"				{ return getSymbolFactory().newSymbol ("CONTAINERSTOP", Sym.CONTAINERSTOP); }
"\""				{ return getSymbolFactory().newSymbol ("QUOTE", Sym.QUOTE); }
[0-9]+			{ return getSymbolFactory().newSymbol ("INTEGER", Sym.INTEGER, Integer.parseInt(yytext())); }
[0-9]+","[0-9]+   { return getSymbolFactory().newSymbol ("POINT", Sym.POINT, yytext()); }
[a-zA-Z][a-zA-Z0-9_]*		 { return getSymbolFactory().newSymbol ("ID", Sym.ID,yytext()); }
[a-zA-Z0-9,()_.!#]+                { return getSymbolFactory().newSymbol ("WORD", Sym.WORD,yytext()); }
[^]                    { throw new Error("Illegal character <"+yytext()+">"); }

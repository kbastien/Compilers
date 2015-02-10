package
parse
;
import
java
.
util
.
List
;
import
errorMsg
.
*
;
import
syntaxtree
.
*
;
public class MJGrammarParseTable implements wrangLR.runtime.ParseTable {
public int getEofSym() { return 156; }
public int getNttSym() { return 157; }
private String[] symNameTable = {
"$$start",
"<start>",
"ws*",
"<program>",
"<class decl>+",
"<extendsID>",
"`extends",
"ID",
"<class decl>",
"`class",
"<extendsID>?",
"$$0",
"<decl in class>",
"<method decl>",
"<instVarDecl>",
"<type>",
"`;",
"`public",
"`void",
"`(",
"`)",
"`{",
"<stmt>*",
"`}",
"<formal list>",
"`return",
"<exp>",
"`int",
"`boolean",
"<empty bracket pair>",
"<listElm>",
"`,",
"<listElm>*",
"`[",
"`]",
"<stmt>",
"<assign>",
"<call exp>",
"<local var decl>",
"`while",
"`if",
"`else",
"`=",
"`break",
"`||",
"<exp2>",
"`&&",
"<exp3>",
"`!=",
"<exp4>",
"`==",
"`<",
"<exp5>",
"`>",
"`instanceof",
"`<=",
"`>=",
"`+",
"<exp6>",
"`-",
"`*",
"<exp7>",
"`/",
"`%",
"<cast exp>",
"<unary exp>",
"<exp8>",
"`!",
"INTLIT",
"STRINGLIT",
"CHARLIT",
"`false",
"`this",
"`true",
"`null",
"`.",
"`new",
"<exp list>",
"<recurse>",
"<recurse>*",
"`super",
"<exp list>?",
"letter",
"\"a\"",
"\"p\"",
"\"s\"",
"\"v\"",
"\"c\"",
"\"f\"",
"{\"A\"..\"Z\" \"d\" \"g\" \"j\"..\"k\" \"m\" \"q\" \"y\"..\"z\"}",
"\"i\"",
"\"l\"",
"\"o\"",
"\"r\"",
"\"u\"",
"\"x\"",
"\"b\"",
"\"e\"",
"\"h\"",
"\"n\"",
"\"t\"",
"\"w\"",
"letter128",
"{199..218 231..250}",
"{193..198 225..230}",
"digit",
"{\"1\"..\"9\"}",
"\"0\"",
"digit128",
"{176..185}",
"any",
"\"[\"",
"\"-\"",
"\"<\"",
"\"|\"",
"\" \"",
"\"#\"",
"\"&\"",
"\")\"",
"\",\"",
"\"]\"",
"\"/\"",
"\";\"",
"\">\"",
"\"{\"",
"{0..9 11..31 \"$\" \":\" \"?\" \"\\\" \"^\" \"`\" \"~\"..127}",
"\"%\"",
"\"(\"",
"\"+\"",
"\".\"",
"\"_\"",
"\"=\"",
"\"@\"",
"10",
"\"}\"",
"\"!\"",
"\"\'\"",
"\'\"\'",
"\"*\"",
"any128",
"{223}",
"{128..175 186..192 219..222 224 251..255}",
"ws",
"idChar*",
"$$1",
"digit*",
"$$2",
"hexDigit*",
"$$3",
"any*",
"$$4",
"idChar",
"idChar128",
"hexDigit",
"hexDigit128",
"<decl in class>*",
"$",
"$NT",
};
public String symName(int n) {
 return n >= 0 && n < symNameTable.length ? symNameTable[n] : "??";
}
private MJGrammar actionObject;
public int[][] getParseTable() { return parseTable; }
public int numSymbols() { return 158;}
private static final int MIN_REDUCTION = 743;
public int minReduction() { return MIN_REDUCTION;}
private static final int MAX_ACCEPT_REDUCTION = MIN_REDUCTION+0;
public int maxAcceptReduction() { return MAX_ACCEPT_REDUCTION; }
private final int[][] parseTable;
public void error(int pos, String msg){
 if (((Object)actionObject) instanceof wrangLR.runtime.MessageObject)
 ((wrangLR.runtime.MessageObject)(Object)actionObject).error(pos,msg);
 else System.err.println("file position "+pos+": "+msg);}
public void warning(int pos, String msg){
 if (((Object)actionObject) instanceof wrangLR.runtime.MessageObject)
 ((wrangLR.runtime.MessageObject)(Object)actionObject).warning(pos,msg);
 else System.err.println("file position "+pos+"(warning): "+msg);}
public String filePosString(int pos){
 if (((Object)actionObject) instanceof wrangLR.runtime.FilePosObject)
 return ((wrangLR.runtime.FilePosObject)(Object)actionObject).filePosString(pos);
 else return ""+pos;}
public boolean parse(java.io.InputStream is) {
	return new wrangLR.runtime.BaseParser(this).parse(is);
}
public boolean parse(java.io.InputStream is, int verboseLevel, boolean verboseReductions) {
	return new wrangLR.runtime.BaseParser(this,verboseLevel,verboseReductions).parse(is);
}
private class Initter1{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 0
1,600, // <start>
2,727, // ws*
3,331, // <program>
4,688, // <class decl>+
8,740, // <class decl>
9,352, // `class
115,199, // " "
116,370, // "#"
133,559, // {10}
142,355, // ws
  }
,
{ // state 1
  }
,
{ // state 2
0x80000000|271, // match move
0x80000000|153, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 3
23,223, // `}
134,662, // "}"
  }
,
{ // state 4
0x80000000|448, // match move
0x80000000|638, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 5
157,MIN_REDUCTION+179, // $NT
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 6
115,199, // " "
133,559, // {10}
142,458, // ws
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 7
91,728, // "l"
  }
,
{ // state 8
2,6, // ws*
115,199, // " "
133,559, // {10}
142,355, // ws
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 9
7,230, // ID
15,209, // <type>
16,650, // `;
19,365, // `(
21,341, // `{
26,571, // <exp>
27,484, // `int
28,669, // `boolean
35,183, // <stmt>
36,652, // <assign>
37,125, // <call exp>
38,128, // <local var decl>
39,122, // `while
40,442, // `if
43,70, // `break
45,272, // <exp2>
47,350, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
57,41, // `+
58,130, // <exp6>
59,296, // `-
61,243, // <exp7>
65,425, // <unary exp>
66,361, // <exp8>
67,181, // `!
68,189, // INTLIT
69,317, // STRINGLIT
70,409, // CHARLIT
71,529, // `false
72,270, // `this
73,284, // `true
74,476, // `null
76,735, // `new
80,36, // `super
82,539, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,67, // letter128
103,307, // {199..218 231..250}
104,307, // {193..198 225..230}
106,314, // {"1".."9"}
107,586, // "0"
108,640, // digit128
109,2, // {176..185}
112,390, // "-"
116,692, // "#"
122,697, // ";"
124,654, // "{"
127,343, // "("
128,691, // "+"
132,292, // "@"
135,708, // "!"
136,43, // "'"
137,225, // '"'
  }
,
{ // state 10
0x80000000|567, // match move
0x80000000|127, // no-match move
0x80000000|166, // NT-test-match state for <cast exp>
  }
,
{ // state 11
114,362, // "|"
  }
,
{ // state 12
33,MIN_REDUCTION+74, // `[
111,MIN_REDUCTION+74, // "["
157,MIN_REDUCTION+74, // $NT
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 13
115,MIN_REDUCTION+210, // " "
133,MIN_REDUCTION+210, // {10}
142,MIN_REDUCTION+210, // ws
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 14
0x80000000|110, // match move
0x80000000|114, // no-match move
0x80000000|166, // NT-test-match state for <cast exp>
  }
,
{ // state 15
7,230, // ID
15,209, // <type>
16,725, // `;
19,365, // `(
21,527, // `{
22,628, // <stmt>*
23,655, // `}
26,571, // <exp>
27,484, // `int
28,669, // `boolean
35,469, // <stmt>
36,54, // <assign>
37,489, // <call exp>
38,49, // <local var decl>
39,717, // `while
40,147, // `if
43,311, // `break
45,272, // <exp2>
47,350, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
57,41, // `+
58,130, // <exp6>
59,296, // `-
61,243, // <exp7>
65,425, // <unary exp>
66,361, // <exp8>
67,181, // `!
68,189, // INTLIT
69,317, // STRINGLIT
70,409, // CHARLIT
71,529, // `false
72,270, // `this
73,284, // `true
74,476, // `null
76,735, // `new
80,36, // `super
82,539, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,67, // letter128
103,307, // {199..218 231..250}
104,307, // {193..198 225..230}
106,314, // {"1".."9"}
107,586, // "0"
108,640, // digit128
109,2, // {176..185}
112,390, // "-"
116,692, // "#"
122,357, // ";"
124,654, // "{"
127,343, // "("
128,691, // "+"
132,292, // "@"
134,662, // "}"
135,708, // "!"
136,43, // "'"
137,225, // '"'
  }
,
{ // state 16
115,199, // " "
133,559, // {10}
142,458, // ws
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 17
0x80000000|328, // match move
0x80000000|326, // no-match move
0x80000000|166, // NT-test-match state for <cast exp>
  }
,
{ // state 18
0x80000000|258, // match move
0x80000000|513, // no-match move
0x80000000|679, // NT-test-match state for `else
  }
,
{ // state 19
0x80000000|626, // match move
0x80000000|385, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 20
2,412, // ws*
157,MIN_REDUCTION+180, // $NT
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 21
19,345, // `(
26,475, // <exp>
37,653, // <call exp>
45,272, // <exp2>
47,350, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
58,130, // <exp6>
61,243, // <exp7>
64,79, // <cast exp>
65,425, // <unary exp>
66,361, // <exp8>
127,343, // "("
  }
,
{ // state 22
2,504, // ws*
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 23
157,MIN_REDUCTION+185, // $NT
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 24
115,199, // " "
133,559, // {10}
142,458, // ws
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 25
60,695, // `*
62,701, // `/
63,632, // `%
121,27, // "/"
126,8, // "%"
138,210, // "*"
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 26
157,MIN_REDUCTION+209, // $NT
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 27
2,496, // ws*
115,199, // " "
133,559, // {10}
142,355, // ws
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 28
7,694, // ID
12,706, // <decl in class>
13,220, // <method decl>
14,398, // <instVarDecl>
15,349, // <type>
17,548, // `public
23,34, // `}
27,484, // `int
28,669, // `boolean
82,275, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,415, // letter128
103,366, // {199..218 231..250}
104,366, // {193..198 225..230}
116,438, // "#"
134,662, // "}"
  }
,
{ // state 29
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 30
21,521, // `{
124,654, // "{"
  }
,
{ // state 31
0x80000000|519, // match move
0x80000000|643, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 32
157,MIN_REDUCTION+25, // $NT
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 33
115,MIN_REDUCTION+93, // " "
133,MIN_REDUCTION+93, // {10}
142,MIN_REDUCTION+93, // ws
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 34
MIN_REDUCTION+225, // (default reduction)
  }
,
{ // state 35
MIN_REDUCTION+213, // (default reduction)
  }
,
{ // state 36
75,129, // `.
129,61, // "."
  }
,
{ // state 37
0x80000000|1, // match move
0x80000000|713, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 38
33,MIN_REDUCTION+182, // `[
111,MIN_REDUCTION+182, // "["
157,MIN_REDUCTION+182, // $NT
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 39
2,514, // ws*
  }
,
{ // state 40
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 41
0x80000000|596, // match move
0x80000000|449, // no-match move
0x80000000|166, // NT-test-match state for <cast exp>
  }
,
{ // state 42
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 43
83,597, // "a"
84,597, // "p"
85,597, // "s"
86,597, // "v"
87,597, // "c"
88,597, // "f"
89,597, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,597, // "i"
91,597, // "l"
92,597, // "o"
93,597, // "r"
94,597, // "u"
95,597, // "x"
96,597, // "b"
97,597, // "e"
98,597, // "h"
99,597, // "n"
100,597, // "t"
101,597, // "w"
106,597, // {"1".."9"}
107,597, // "0"
110,645, // any
111,597, // "["
112,597, // "-"
113,597, // "<"
114,597, // "|"
115,597, // " "
116,597, // "#"
117,597, // "&"
118,597, // ")"
119,597, // ","
120,597, // "]"
121,597, // "/"
122,597, // ";"
123,597, // ">"
124,597, // "{"
125,597, // {0..9 11..31 "$" ":" "?" "\" "^" "`" "~"..127}
126,597, // "%"
127,597, // "("
128,597, // "+"
129,597, // "."
130,597, // "_"
131,597, // "="
132,597, // "@"
133,597, // {10}
134,597, // "}"
135,597, // "!"
136,597, // "'"
137,597, // '"'
138,597, // "*"
  }
,
{ // state 44
115,50, // " "
133,495, // {10}
142,18, // ws
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 45
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 46
7,174, // ID
82,275, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,415, // letter128
103,366, // {199..218 231..250}
104,366, // {193..198 225..230}
  }
,
{ // state 47
115,199, // " "
133,559, // {10}
142,458, // ws
157,MIN_REDUCTION+109, // $NT
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 48
115,199, // " "
133,559, // {10}
142,458, // ws
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 49
16,732, // `;
122,357, // ";"
  }
,
{ // state 50
0x80000000|318, // match move
0x80000000|33, // no-match move
0x80000000|679, // NT-test-match state for `else
  }
,
{ // state 51
94,80, // "u"
  }
,
{ // state 52
37,653, // <call exp>
65,101, // <unary exp>
66,361, // <exp8>
  }
,
{ // state 53
2,249, // ws*
115,199, // " "
133,559, // {10}
142,355, // ws
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 54
16,606, // `;
122,357, // ";"
  }
,
{ // state 55
0x80000000|1, // match move
0x80000000|185, // no-match move
0x80000000|679, // NT-test-match state for `else
  }
,
{ // state 56
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 57
7,384, // ID
19,365, // `(
26,277, // <exp>
37,653, // <call exp>
45,272, // <exp2>
47,350, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
57,41, // `+
58,130, // <exp6>
59,296, // `-
61,243, // <exp7>
65,425, // <unary exp>
66,361, // <exp8>
67,181, // `!
68,189, // INTLIT
69,317, // STRINGLIT
70,409, // CHARLIT
71,529, // `false
72,270, // `this
73,284, // `true
74,476, // `null
76,735, // `new
80,36, // `super
82,539, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,67, // letter128
103,307, // {199..218 231..250}
104,307, // {193..198 225..230}
106,314, // {"1".."9"}
107,586, // "0"
108,640, // digit128
109,2, // {176..185}
112,390, // "-"
116,192, // "#"
127,343, // "("
128,691, // "+"
132,292, // "@"
135,708, // "!"
136,43, // "'"
137,225, // '"'
  }
,
{ // state 58
0x80000000|177, // match move
0x80000000|671, // no-match move
0x80000000|166, // NT-test-match state for <cast exp>
  }
,
{ // state 59
157,MIN_REDUCTION+94, // $NT
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 60
93,447, // "r"
98,607, // "h"
  }
,
{ // state 61
2,300, // ws*
115,199, // " "
133,559, // {10}
142,355, // ws
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 62
157,MIN_REDUCTION+79, // $NT
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 63
33,MIN_REDUCTION+202, // `[
111,MIN_REDUCTION+202, // "["
157,MIN_REDUCTION+202, // $NT
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 64
2,566, // ws*
33,MIN_REDUCTION+114, // `[
111,MIN_REDUCTION+114, // "["
115,598, // " "
133,321, // {10}
142,4, // ws
157,MIN_REDUCTION+114, // $NT
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 65
MIN_REDUCTION+201, // (default reduction)
  }
,
{ // state 66
19,345, // `(
26,457, // <exp>
37,653, // <call exp>
45,272, // <exp2>
47,350, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
58,130, // <exp6>
61,243, // <exp7>
64,79, // <cast exp>
65,425, // <unary exp>
66,361, // <exp8>
127,343, // "("
  }
,
{ // state 67
0x80000000|20, // match move
0x80000000|625, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 68
2,212, // ws*
115,199, // " "
133,559, // {10}
142,355, // ws
MIN_REDUCTION+228, // (default reduction)
  }
,
{ // state 69
7,178, // ID
82,539, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,67, // letter128
103,307, // {199..218 231..250}
104,307, // {193..198 225..230}
  }
,
{ // state 70
16,123, // `;
122,697, // ";"
  }
,
{ // state 71
20,680, // `)
44,556, // `||
118,729, // ")"
132,11, // "@"
  }
,
{ // state 72
33,MIN_REDUCTION+191, // `[
111,MIN_REDUCTION+191, // "["
157,MIN_REDUCTION+191, // $NT
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 73
7,384, // ID
19,365, // `(
37,653, // <call exp>
52,426, // <exp5>
57,41, // `+
58,130, // <exp6>
59,296, // `-
61,243, // <exp7>
65,425, // <unary exp>
66,361, // <exp8>
67,181, // `!
68,189, // INTLIT
69,317, // STRINGLIT
70,409, // CHARLIT
71,529, // `false
72,270, // `this
73,284, // `true
74,476, // `null
76,735, // `new
80,36, // `super
82,539, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,67, // letter128
103,307, // {199..218 231..250}
104,307, // {193..198 225..230}
106,314, // {"1".."9"}
107,586, // "0"
108,640, // digit128
109,2, // {176..185}
112,390, // "-"
116,192, // "#"
127,343, // "("
128,691, // "+"
132,292, // "@"
135,708, // "!"
136,43, // "'"
137,225, // '"'
  }
,
{ // state 74
0x80000000|382, // match move
0x80000000|119, // no-match move
0x80000000|166, // NT-test-match state for <cast exp>
  }
,
{ // state 75
33,MIN_REDUCTION+179, // `[
111,MIN_REDUCTION+179, // "["
115,598, // " "
133,321, // {10}
142,726, // ws
157,MIN_REDUCTION+179, // $NT
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 76
157,MIN_REDUCTION+115, // $NT
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 77
33,MIN_REDUCTION+88, // `[
111,MIN_REDUCTION+88, // "["
157,MIN_REDUCTION+88, // $NT
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 78
90,595, // "i"
  }
,
{ // state 79
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 80
2,274, // ws*
115,199, // " "
133,559, // {10}
142,355, // ws
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 81
19,345, // `(
26,277, // <exp>
37,653, // <call exp>
45,272, // <exp2>
47,350, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
58,130, // <exp6>
61,243, // <exp7>
64,79, // <cast exp>
65,425, // <unary exp>
66,361, // <exp8>
127,343, // "("
  }
,
{ // state 82
0x80000000|22, // match move
0x80000000|90, // no-match move
0x80000000|679, // NT-test-match state for `else
  }
,
{ // state 83
16,404, // `;
33,MIN_REDUCTION+78, // `[
111,MIN_REDUCTION+78, // "["
122,697, // ";"
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 84
7,230, // ID
15,209, // <type>
16,725, // `;
19,365, // `(
21,527, // `{
23,685, // `}
26,571, // <exp>
27,484, // `int
28,669, // `boolean
35,522, // <stmt>
36,54, // <assign>
37,489, // <call exp>
38,49, // <local var decl>
39,717, // `while
40,147, // `if
43,311, // `break
45,272, // <exp2>
47,350, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
57,41, // `+
58,130, // <exp6>
59,296, // `-
61,243, // <exp7>
65,425, // <unary exp>
66,361, // <exp8>
67,181, // `!
68,189, // INTLIT
69,317, // STRINGLIT
70,409, // CHARLIT
71,529, // `false
72,270, // `this
73,284, // `true
74,476, // `null
76,735, // `new
80,36, // `super
82,539, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,67, // letter128
103,307, // {199..218 231..250}
104,307, // {193..198 225..230}
106,314, // {"1".."9"}
107,586, // "0"
108,640, // digit128
109,2, // {176..185}
112,390, // "-"
116,692, // "#"
122,357, // ";"
124,654, // "{"
127,343, // "("
128,691, // "+"
132,292, // "@"
134,662, // "}"
135,708, // "!"
136,43, // "'"
137,225, // '"'
  }
,
{ // state 85
19,345, // `(
22,164, // <stmt>*
26,571, // <exp>
35,469, // <stmt>
36,54, // <assign>
37,489, // <call exp>
45,272, // <exp2>
47,350, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
58,130, // <exp6>
61,243, // <exp7>
64,79, // <cast exp>
65,425, // <unary exp>
66,361, // <exp8>
127,343, // "("
  }
,
{ // state 86
115,199, // " "
133,559, // {10}
142,458, // ws
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 87
115,199, // " "
133,559, // {10}
142,458, // ws
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 88
33,MIN_REDUCTION+117, // `[
111,MIN_REDUCTION+117, // "["
115,598, // " "
133,321, // {10}
142,726, // ws
157,MIN_REDUCTION+117, // $NT
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 89
33,MIN_REDUCTION+209, // `[
111,MIN_REDUCTION+209, // "["
157,MIN_REDUCTION+209, // $NT
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 90
2,504, // ws*
115,50, // " "
133,495, // {10}
142,730, // ws
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 91
37,653, // <call exp>
66,175, // <exp8>
77,115, // <exp list>
81,681, // <exp list>?
  }
,
{ // state 92
157,MIN_REDUCTION+73, // $NT
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 93
2,668, // ws*
33,MIN_REDUCTION+118, // `[
111,MIN_REDUCTION+118, // "["
115,598, // " "
133,321, // {10}
142,4, // ws
157,MIN_REDUCTION+118, // $NT
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 94
0x80000000|197, // match move
0x80000000|517, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 95
157,MIN_REDUCTION+227, // $NT
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 96
115,MIN_REDUCTION+94, // " "
133,MIN_REDUCTION+94, // {10}
142,MIN_REDUCTION+94, // ws
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 97
98,563, // "h"
  }
,
{ // state 98
7,384, // ID
19,365, // `(
37,653, // <call exp>
66,37, // <exp8>
68,189, // INTLIT
69,317, // STRINGLIT
70,409, // CHARLIT
71,529, // `false
72,270, // `this
73,284, // `true
74,476, // `null
76,735, // `new
80,36, // `super
82,539, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,67, // letter128
103,307, // {199..218 231..250}
104,307, // {193..198 225..230}
106,314, // {"1".."9"}
107,586, // "0"
108,640, // digit128
109,2, // {176..185}
116,192, // "#"
127,343, // "("
132,292, // "@"
136,43, // "'"
137,225, // '"'
  }
,
{ // state 99
33,MIN_REDUCTION+200, // `[
111,MIN_REDUCTION+200, // "["
157,MIN_REDUCTION+200, // $NT
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 100
57,58, // `+
59,235, // `-
112,390, // "-"
128,691, // "+"
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 101
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 102
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 103
2,400, // ws*
33,MIN_REDUCTION+230, // `[
111,MIN_REDUCTION+230, // "["
115,598, // " "
133,321, // {10}
142,4, // ws
157,MIN_REDUCTION+230, // $NT
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 104
19,345, // `(
26,690, // <exp>
37,653, // <call exp>
45,272, // <exp2>
47,350, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
58,130, // <exp6>
61,243, // <exp7>
64,79, // <cast exp>
65,425, // <unary exp>
66,361, // <exp8>
127,343, // "("
  }
,
{ // state 105
19,345, // `(
26,571, // <exp>
35,340, // <stmt>
36,652, // <assign>
37,125, // <call exp>
45,272, // <exp2>
47,350, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
58,130, // <exp6>
61,243, // <exp7>
64,79, // <cast exp>
65,425, // <unary exp>
66,361, // <exp8>
127,343, // "("
  }
,
{ // state 106
19,345, // `(
26,564, // <exp>
37,653, // <call exp>
45,272, // <exp2>
47,350, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
58,130, // <exp6>
61,243, // <exp7>
64,79, // <cast exp>
65,425, // <unary exp>
66,361, // <exp8>
127,343, // "("
  }
,
{ // state 107
0x80000000|567, // match move
0x80000000|260, // no-match move
0x80000000|166, // NT-test-match state for <cast exp>
  }
,
{ // state 108
7,230, // ID
15,209, // <type>
16,725, // `;
19,365, // `(
21,527, // `{
23,604, // `}
26,571, // <exp>
27,484, // `int
28,669, // `boolean
35,522, // <stmt>
36,54, // <assign>
37,489, // <call exp>
38,49, // <local var decl>
39,717, // `while
40,147, // `if
43,311, // `break
45,272, // <exp2>
47,350, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
57,41, // `+
58,130, // <exp6>
59,296, // `-
61,243, // <exp7>
65,425, // <unary exp>
66,361, // <exp8>
67,181, // `!
68,189, // INTLIT
69,317, // STRINGLIT
70,409, // CHARLIT
71,529, // `false
72,270, // `this
73,284, // `true
74,476, // `null
76,735, // `new
80,36, // `super
82,539, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,67, // letter128
103,307, // {199..218 231..250}
104,307, // {193..198 225..230}
106,314, // {"1".."9"}
107,586, // "0"
108,640, // digit128
109,2, // {176..185}
112,390, // "-"
116,692, // "#"
122,357, // ";"
124,654, // "{"
127,343, // "("
128,691, // "+"
132,292, // "@"
134,82, // "}"
135,708, // "!"
136,43, // "'"
137,225, // '"'
  }
,
{ // state 109
20,551, // `)
118,729, // ")"
  }
,
{ // state 110
19,345, // `(
26,571, // <exp>
35,637, // <stmt>
36,54, // <assign>
37,489, // <call exp>
45,272, // <exp2>
47,350, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
58,130, // <exp6>
61,243, // <exp7>
64,79, // <cast exp>
65,425, // <unary exp>
66,361, // <exp8>
127,343, // "("
  }
,
{ // state 111
41,14, // `else
116,718, // "#"
  }
,
{ // state 112
0x80000000|664, // match move
0x80000000|63, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 113
0x80000000|81, // match move
0x80000000|57, // no-match move
0x80000000|166, // NT-test-match state for <cast exp>
  }
,
{ // state 114
7,230, // ID
15,209, // <type>
16,725, // `;
19,365, // `(
21,527, // `{
26,571, // <exp>
27,484, // `int
28,669, // `boolean
35,637, // <stmt>
36,54, // <assign>
37,489, // <call exp>
38,49, // <local var decl>
39,717, // `while
40,147, // `if
43,311, // `break
45,272, // <exp2>
47,350, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
57,41, // `+
58,130, // <exp6>
59,296, // `-
61,243, // <exp7>
65,425, // <unary exp>
66,361, // <exp8>
67,181, // `!
68,189, // INTLIT
69,317, // STRINGLIT
70,409, // CHARLIT
71,529, // `false
72,270, // `this
73,284, // `true
74,476, // `null
76,735, // `new
80,36, // `super
82,539, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,67, // letter128
103,307, // {199..218 231..250}
104,307, // {193..198 225..230}
106,314, // {"1".."9"}
107,586, // "0"
108,640, // digit128
109,2, // {176..185}
112,390, // "-"
116,692, // "#"
122,357, // ";"
124,654, // "{"
127,343, // "("
128,691, // "+"
132,292, // "@"
135,708, // "!"
136,43, // "'"
137,225, // '"'
  }
,
{ // state 115
MIN_REDUCTION+214, // (default reduction)
  }
,
{ // state 116
16,188, // `;
33,MIN_REDUCTION+78, // `[
111,MIN_REDUCTION+78, // "["
122,357, // ";"
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 117
21,278, // `{
124,654, // "{"
  }
,
{ // state 118
115,199, // " "
133,559, // {10}
142,458, // ws
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 119
7,384, // ID
19,365, // `(
26,71, // <exp>
37,653, // <call exp>
45,272, // <exp2>
47,350, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
57,41, // `+
58,130, // <exp6>
59,296, // `-
61,243, // <exp7>
65,425, // <unary exp>
66,361, // <exp8>
67,181, // `!
68,189, // INTLIT
69,317, // STRINGLIT
70,409, // CHARLIT
71,529, // `false
72,270, // `this
73,284, // `true
74,476, // `null
76,735, // `new
80,36, // `super
82,539, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,67, // letter128
103,307, // {199..218 231..250}
104,307, // {193..198 225..230}
106,314, // {"1".."9"}
107,586, // "0"
108,640, // digit128
109,2, // {176..185}
112,390, // "-"
116,192, // "#"
127,343, // "("
128,691, // "+"
132,292, // "@"
135,708, // "!"
136,43, // "'"
137,225, // '"'
  }
,
{ // state 120
19,345, // `(
26,286, // <exp>
37,653, // <call exp>
45,272, // <exp2>
47,350, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
58,130, // <exp6>
61,243, // <exp7>
64,79, // <cast exp>
65,425, // <unary exp>
66,361, // <exp8>
127,343, // "("
  }
,
{ // state 121
157,MIN_REDUCTION+198, // $NT
MIN_REDUCTION+198, // (default reduction)
  }
,
{ // state 122
19,74, // `(
127,343, // "("
  }
,
{ // state 123
0x80000000|533, // match move
0x80000000|351, // no-match move
0x80000000|679, // NT-test-match state for `else
  }
,
{ // state 124
19,345, // `(
22,10, // <stmt>*
26,571, // <exp>
35,469, // <stmt>
36,54, // <assign>
37,489, // <call exp>
45,272, // <exp2>
47,350, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
58,130, // <exp6>
61,243, // <exp7>
64,79, // <cast exp>
65,425, // <unary exp>
66,361, // <exp8>
127,343, // "("
  }
,
{ // state 125
0x80000000|1, // match move
0x80000000|83, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 126
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 127
7,230, // ID
15,209, // <type>
16,725, // `;
19,365, // `(
21,527, // `{
25,407, // `return
26,571, // <exp>
27,484, // `int
28,669, // `boolean
35,522, // <stmt>
36,54, // <assign>
37,489, // <call exp>
38,49, // <local var decl>
39,717, // `while
40,147, // `if
43,311, // `break
45,272, // <exp2>
47,350, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
57,41, // `+
58,130, // <exp6>
59,296, // `-
61,243, // <exp7>
65,425, // <unary exp>
66,361, // <exp8>
67,181, // `!
68,189, // INTLIT
69,317, // STRINGLIT
70,409, // CHARLIT
71,529, // `false
72,270, // `this
73,284, // `true
74,476, // `null
76,735, // `new
80,36, // `super
82,539, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,67, // letter128
103,307, // {199..218 231..250}
104,307, // {193..198 225..230}
106,314, // {"1".."9"}
107,586, // "0"
108,640, // digit128
109,2, // {176..185}
112,390, // "-"
116,515, // "#"
122,357, // ";"
124,654, // "{"
127,343, // "("
128,691, // "+"
132,292, // "@"
135,708, // "!"
136,43, // "'"
137,225, // '"'
  }
,
{ // state 128
16,358, // `;
122,697, // ";"
  }
,
{ // state 129
7,677, // ID
82,275, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,415, // letter128
103,366, // {199..218 231..250}
104,366, // {193..198 225..230}
  }
,
{ // state 130
60,695, // `*
62,701, // `/
63,632, // `%
121,27, // "/"
126,8, // "%"
138,210, // "*"
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 131
7,384, // ID
19,365, // `(
26,457, // <exp>
37,653, // <call exp>
45,272, // <exp2>
47,350, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
57,41, // `+
58,130, // <exp6>
59,296, // `-
61,243, // <exp7>
65,425, // <unary exp>
66,361, // <exp8>
67,181, // `!
68,189, // INTLIT
69,317, // STRINGLIT
70,409, // CHARLIT
71,529, // `false
72,270, // `this
73,284, // `true
74,476, // `null
76,735, // `new
80,36, // `super
82,539, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,67, // letter128
103,307, // {199..218 231..250}
104,307, // {193..198 225..230}
106,314, // {"1".."9"}
107,586, // "0"
108,640, // digit128
109,2, // {176..185}
112,390, // "-"
116,192, // "#"
127,343, // "("
128,691, // "+"
132,292, // "@"
135,708, // "!"
136,43, // "'"
137,225, // '"'
  }
,
{ // state 132
7,384, // ID
19,365, // `(
26,564, // <exp>
37,653, // <call exp>
45,272, // <exp2>
47,350, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
57,41, // `+
58,130, // <exp6>
59,296, // `-
61,243, // <exp7>
65,425, // <unary exp>
66,361, // <exp8>
67,181, // `!
68,189, // INTLIT
69,317, // STRINGLIT
70,409, // CHARLIT
71,529, // `false
72,270, // `this
73,284, // `true
74,476, // `null
76,735, // `new
80,36, // `super
82,539, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,67, // letter128
103,307, // {199..218 231..250}
104,307, // {193..198 225..230}
106,314, // {"1".."9"}
107,586, // "0"
108,640, // digit128
109,2, // {176..185}
112,390, // "-"
116,192, // "#"
127,343, // "("
128,691, // "+"
132,292, // "@"
135,708, // "!"
136,43, // "'"
137,225, // '"'
  }
,
{ // state 133
157,MIN_REDUCTION+189, // $NT
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 134
157,MIN_REDUCTION+78, // $NT
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 135
0x80000000|676, // match move
0x80000000|403, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 136
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 137
19,345, // `(
26,579, // <exp>
37,653, // <call exp>
45,272, // <exp2>
47,350, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
58,130, // <exp6>
61,243, // <exp7>
64,79, // <cast exp>
65,425, // <unary exp>
66,361, // <exp8>
127,343, // "("
  }
,
{ // state 138
MIN_REDUCTION+206, // (default reduction)
  }
,
{ // state 139
2,514, // ws*
157,MIN_REDUCTION+194, // $NT
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 140
MIN_REDUCTION+218, // (default reduction)
  }
,
{ // state 141
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 142
0x80000000|567, // match move
0x80000000|683, // no-match move
0x80000000|166, // NT-test-match state for <cast exp>
  }
,
{ // state 143
2,118, // ws*
115,199, // " "
133,559, // {10}
142,355, // ws
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 144
2,279, // ws*
  }
,
{ // state 145
0x80000000|76, // match move
0x80000000|393, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 146
16,538, // `;
122,357, // ";"
  }
,
{ // state 147
19,165, // `(
127,343, // "("
  }
,
{ // state 148
157,MIN_REDUCTION+71, // $NT
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 149
113,417, // "<"
114,362, // "|"
117,741, // "&"
123,421, // ">"
131,481, // "="
135,494, // "!"
  }
,
{ // state 150
16,168, // `;
44,556, // `||
122,357, // ";"
132,11, // "@"
  }
,
{ // state 151
2,279, // ws*
157,MIN_REDUCTION+234, // $NT
MIN_REDUCTION+234, // (default reduction)
  }
,
{ // state 152
95,394, // "x"
  }
,
{ // state 153
33,MIN_REDUCTION+90, // `[
111,MIN_REDUCTION+90, // "["
157,MIN_REDUCTION+90, // $NT
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 154
33,MIN_REDUCTION+84, // `[
111,MIN_REDUCTION+84, // "["
157,MIN_REDUCTION+84, // $NT
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 155
19,686, // `(
127,343, // "("
  }
,
{ // state 156
20,259, // `)
30,169, // <listElm>
31,246, // `,
118,729, // ")"
119,253, // ","
  }
,
{ // state 157
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 158
114,362, // "|"
117,741, // "&"
  }
,
{ // state 159
19,345, // `(
37,653, // <call exp>
52,644, // <exp5>
58,130, // <exp6>
61,243, // <exp7>
64,79, // <cast exp>
65,425, // <unary exp>
66,361, // <exp8>
127,343, // "("
  }
,
{ // state 160
0x80000000|568, // match move
0x80000000|38, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 161
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 162
33,MIN_REDUCTION+94, // `[
111,MIN_REDUCTION+94, // "["
157,MIN_REDUCTION+94, // $NT
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 163
2,240, // ws*
115,199, // " "
133,559, // {10}
142,355, // ws
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 164
0x80000000|567, // match move
0x80000000|294, // no-match move
0x80000000|166, // NT-test-match state for <cast exp>
  }
,
{ // state 165
0x80000000|104, // match move
0x80000000|327, // no-match move
0x80000000|166, // NT-test-match state for <cast exp>
  }
,
{ // state 166
19,345, // `(
127,343, // "("
  }
,
{ // state 167
0x80000000|497, // match move
0x80000000|543, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 168
23,247, // `}
134,662, // "}"
  }
,
{ // state 169
MIN_REDUCTION+215, // (default reduction)
  }
,
{ // state 170
0x80000000|372, // match move
0x80000000|624, // no-match move
0x80000000|166, // NT-test-match state for <cast exp>
  }
,
{ // state 171
7,155, // ID
29,575, // <empty bracket pair>
33,273, // `[
82,275, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,415, // letter128
103,366, // {199..218 231..250}
104,366, // {193..198 225..230}
111,172, // "["
  }
,
{ // state 172
2,267, // ws*
115,199, // " "
133,559, // {10}
142,355, // ws
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 173
0x80000000|450, // match move
0x80000000|333, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 174
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 175
0x80000000|248, // match move
0x80000000|528, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 176
0x80000000|229, // match move
0x80000000|702, // no-match move
0x80000000|166, // NT-test-match state for <cast exp>
  }
,
{ // state 177
19,345, // `(
37,653, // <call exp>
58,25, // <exp6>
61,243, // <exp7>
64,79, // <cast exp>
65,425, // <unary exp>
66,361, // <exp8>
127,343, // "("
  }
,
{ // state 178
0x80000000|589, // match move
0x80000000|441, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 179
115,199, // " "
133,559, // {10}
142,458, // ws
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 180
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 181
0x80000000|463, // match move
0x80000000|375, // no-match move
0x80000000|166, // NT-test-match state for <cast exp>
  }
,
{ // state 182
37,653, // <call exp>
66,175, // <exp8>
77,486, // <exp list>
  }
,
{ // state 183
0x80000000|639, // match move
0x80000000|427, // no-match move
0x80000000|679, // NT-test-match state for `else
  }
,
{ // state 184
2,400, // ws*
157,MIN_REDUCTION+230, // $NT
MIN_REDUCTION+230, // (default reduction)
  }
,
{ // state 185
19,345, // `(
26,571, // <exp>
35,592, // <stmt>
36,652, // <assign>
37,125, // <call exp>
45,272, // <exp2>
47,350, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
58,130, // <exp6>
61,243, // <exp7>
64,79, // <cast exp>
65,425, // <unary exp>
66,361, // <exp8>
127,343, // "("
  }
,
{ // state 186
97,152, // "e"
  }
,
{ // state 187
0x80000000|479, // match move
0x80000000|485, // no-match move
0x80000000|166, // NT-test-match state for <cast exp>
  }
,
{ // state 188
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 189
0x80000000|734, // match move
0x80000000|202, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 190
7,384, // ID
19,365, // `(
37,653, // <call exp>
66,549, // <exp8>
68,189, // INTLIT
69,317, // STRINGLIT
70,409, // CHARLIT
71,529, // `false
72,270, // `this
73,284, // `true
74,476, // `null
76,735, // `new
80,36, // `super
82,539, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,67, // letter128
103,307, // {199..218 231..250}
104,307, // {193..198 225..230}
106,314, // {"1".."9"}
107,586, // "0"
108,640, // digit128
109,2, // {176..185}
116,192, // "#"
127,343, // "("
132,292, // "@"
136,43, // "'"
137,225, // '"'
  }
,
{ // state 191
2,237, // ws*
115,199, // " "
133,559, // {10}
142,355, // ws
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 192
85,51, // "s"
88,208, // "f"
99,338, // "n"
100,60, // "t"
  }
,
{ // state 193
0x80000000|354, // match move
0x80000000|422, // no-match move
0x80000000|679, // NT-test-match state for `else
  }
,
{ // state 194
60,695, // `*
62,701, // `/
63,632, // `%
121,27, // "/"
126,8, // "%"
138,210, // "*"
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 195
0x80000000|21, // match move
0x80000000|580, // no-match move
0x80000000|166, // NT-test-match state for <cast exp>
  }
,
{ // state 196
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 197
2,261, // ws*
157,MIN_REDUCTION+232, // $NT
MIN_REDUCTION+232, // (default reduction)
  }
,
{ // state 198
157,MIN_REDUCTION+191, // $NT
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 199
157,MIN_REDUCTION+93, // $NT
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 200
2,668, // ws*
157,MIN_REDUCTION+118, // $NT
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 201
33,MIN_REDUCTION+229, // `[
111,MIN_REDUCTION+229, // "["
115,598, // " "
133,321, // {10}
142,726, // ws
157,MIN_REDUCTION+229, // $NT
MIN_REDUCTION+229, // (default reduction)
  }
,
{ // state 202
33,MIN_REDUCTION+68, // `[
111,MIN_REDUCTION+68, // "["
157,MIN_REDUCTION+68, // $NT
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 203
157,MIN_REDUCTION+233, // $NT
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 204
7,332, // ID
82,275, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,415, // letter128
103,366, // {199..218 231..250}
104,366, // {193..198 225..230}
  }
,
{ // state 205
51,187, // `<
53,452, // `>
54,204, // `instanceof
55,641, // `<=
56,405, // `>=
113,656, // "<"
116,78, // "#"
123,613, // ">"
132,149, // "@"
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 206
2,739, // ws*
  }
,
{ // state 207
33,MIN_REDUCTION+185, // `[
111,MIN_REDUCTION+185, // "["
115,598, // " "
133,321, // {10}
142,726, // ws
157,MIN_REDUCTION+185, // $NT
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 208
83,500, // "a"
  }
,
{ // state 209
7,561, // ID
29,575, // <empty bracket pair>
33,273, // `[
82,275, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,415, // letter128
103,366, // {199..218 231..250}
104,366, // {193..198 225..230}
111,172, // "["
  }
,
{ // state 210
2,215, // ws*
115,199, // " "
133,559, // {10}
142,355, // ws
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 211
0x80000000|430, // match move
0x80000000|388, // no-match move
0x80000000|166, // NT-test-match state for <cast exp>
  }
,
{ // state 212
115,199, // " "
133,559, // {10}
142,458, // ws
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 213
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 214
MIN_REDUCTION+195, // (default reduction)
  }
,
{ // state 215
115,199, // " "
133,559, // {10}
142,458, // ws
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 216
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 217
2,558, // ws*
115,199, // " "
133,559, // {10}
142,355, // ws
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 218
157,MIN_REDUCTION+143, // $NT
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 219
0x80000000|455, // match move
0x80000000|99, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 220
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 221
2,444, // ws*
157,MIN_REDUCTION+160, // $NT
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 222
0x80000000|523, // match move
0x80000000|190, // no-match move
0x80000000|166, // NT-test-match state for <cast exp>
  }
,
{ // state 223
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 224
0x80000000|232, // match move
0x80000000|373, // no-match move
0x80000000|166, // NT-test-match state for <cast exp>
  }
,
{ // state 225
83,392, // "a"
84,392, // "p"
85,392, // "s"
86,392, // "v"
87,392, // "c"
88,392, // "f"
89,392, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,392, // "i"
91,392, // "l"
92,392, // "o"
93,392, // "r"
94,392, // "u"
95,392, // "x"
96,392, // "b"
97,392, // "e"
98,392, // "h"
99,392, // "n"
100,392, // "t"
101,392, // "w"
103,532, // {199..218 231..250}
104,532, // {193..198 225..230}
106,392, // {"1".."9"}
107,392, // "0"
109,532, // {176..185}
110,313, // any
111,392, // "["
112,392, // "-"
113,392, // "<"
114,392, // "|"
115,392, // " "
116,392, // "#"
117,392, // "&"
118,392, // ")"
119,392, // ","
120,392, // "]"
121,392, // "/"
122,392, // ";"
123,392, // ">"
124,392, // "{"
125,392, // {0..9 11..31 "$" ":" "?" "\" "^" "`" "~"..127}
126,392, // "%"
127,392, // "("
128,392, // "+"
129,392, // "."
130,392, // "_"
131,392, // "="
132,392, // "@"
133,392, // {10}
134,392, // "}"
135,392, // "!"
136,392, // "'"
137,392, // '"'
138,392, // "*"
139,510, // any128
140,532, // {223}
141,532, // {128..175 186..192 219..222 224 251..255}
149,336, // any*
150,584, // $$4
  }
,
{ // state 226
19,554, // `(
20,290, // `)
24,109, // <formal list>
118,729, // ")"
127,343, // "("
  }
,
{ // state 227
157,MIN_REDUCTION+183, // $NT
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 228
157,MIN_REDUCTION+88, // $NT
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 229
19,345, // `(
37,653, // <call exp>
49,205, // <exp4>
52,306, // <exp5>
58,130, // <exp6>
61,243, // <exp7>
64,79, // <cast exp>
65,425, // <unary exp>
66,361, // <exp8>
127,343, // "("
  }
,
{ // state 230
0x80000000|699, // match move
0x80000000|631, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 231
0x80000000|221, // match move
0x80000000|379, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 232
37,653, // <call exp>
66,175, // <exp8>
77,115, // <exp list>
81,466, // <exp list>?
  }
,
{ // state 233
MIN_REDUCTION+212, // (default reduction)
  }
,
{ // state 234
0x80000000|460, // match move
0x80000000|342, // no-match move
0x80000000|166, // NT-test-match state for <cast exp>
  }
,
{ // state 235
0x80000000|499, // match move
0x80000000|508, // no-match move
0x80000000|166, // NT-test-match state for <cast exp>
  }
,
{ // state 236
19,345, // `(
22,142, // <stmt>*
26,571, // <exp>
35,469, // <stmt>
36,54, // <assign>
37,489, // <call exp>
45,272, // <exp2>
47,350, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
58,130, // <exp6>
61,243, // <exp7>
64,79, // <cast exp>
65,425, // <unary exp>
66,361, // <exp8>
127,343, // "("
  }
,
{ // state 237
115,199, // " "
133,559, // {10}
142,458, // ws
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 238
7,293, // ID
29,575, // <empty bracket pair>
33,273, // `[
82,275, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,415, // letter128
103,366, // {199..218 231..250}
104,366, // {193..198 225..230}
111,172, // "["
  }
,
{ // state 239
0x80000000|526, // match move
0x80000000|396, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 240
115,199, // " "
133,559, // {10}
142,458, // ws
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 241
2,658, // ws*
  }
,
{ // state 242
2,261, // ws*
  }
,
{ // state 243
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 244
33,MIN_REDUCTION+159, // `[
111,MIN_REDUCTION+159, // "["
115,598, // " "
133,321, // {10}
142,726, // ws
157,MIN_REDUCTION+159, // $NT
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 245
19,345, // `(
26,571, // <exp>
35,45, // <stmt>
36,54, // <assign>
37,489, // <call exp>
45,272, // <exp2>
47,350, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
58,130, // <exp6>
61,243, // <exp7>
64,79, // <cast exp>
65,425, // <unary exp>
66,361, // <exp8>
127,343, // "("
  }
,
{ // state 246
7,694, // ID
15,467, // <type>
27,484, // `int
28,669, // `boolean
82,275, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,415, // letter128
103,366, // {199..218 231..250}
104,366, // {193..198 225..230}
116,488, // "#"
  }
,
{ // state 247
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 248
79,339, // <recurse>*
  }
,
{ // state 249
115,199, // " "
133,559, // {10}
142,458, // ws
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 250
33,MIN_REDUCTION+189, // `[
111,MIN_REDUCTION+189, // "["
115,598, // " "
133,321, // {10}
142,726, // ws
157,MIN_REDUCTION+189, // $NT
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 251
0x80000000|227, // match move
0x80000000|715, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 252
46,234, // `&&
132,158, // "@"
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 253
2,721, // ws*
115,199, // " "
133,559, // {10}
142,355, // ws
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 254
2,173, // ws*
33,MIN_REDUCTION+122, // `[
111,MIN_REDUCTION+122, // "["
115,598, // " "
133,321, // {10}
142,4, // ws
157,MIN_REDUCTION+122, // $NT
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 255
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 256
20,222, // `)
29,575, // <empty bracket pair>
33,273, // `[
111,172, // "["
118,729, // ")"
  }
,
{ // state 257
0x80000000|264, // match move
0x80000000|619, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 258
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 259
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 260
7,230, // ID
15,209, // <type>
16,725, // `;
19,365, // `(
21,527, // `{
25,170, // `return
26,571, // <exp>
27,484, // `int
28,669, // `boolean
35,522, // <stmt>
36,54, // <assign>
37,489, // <call exp>
38,49, // <local var decl>
39,717, // `while
40,147, // `if
43,311, // `break
45,272, // <exp2>
47,350, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
57,41, // `+
58,130, // <exp6>
59,296, // `-
61,243, // <exp7>
65,425, // <unary exp>
66,361, // <exp8>
67,181, // `!
68,189, // INTLIT
69,317, // STRINGLIT
70,409, // CHARLIT
71,529, // `false
72,270, // `this
73,284, // `true
74,476, // `null
76,735, // `new
80,36, // `super
82,539, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,67, // letter128
103,307, // {199..218 231..250}
104,307, // {193..198 225..230}
106,314, // {"1".."9"}
107,586, // "0"
108,640, // digit128
109,2, // {176..185}
112,390, // "-"
116,515, // "#"
122,357, // ";"
124,654, // "{"
127,343, // "("
128,691, // "+"
132,292, // "@"
135,708, // "!"
136,43, // "'"
137,225, // '"'
  }
,
{ // state 261
0x80000000|477, // match move
0x80000000|443, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 262
157,MIN_REDUCTION+70, // $NT
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 263
33,MIN_REDUCTION+199, // `[
111,MIN_REDUCTION+199, // "["
157,MIN_REDUCTION+199, // $NT
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 264
157,MIN_REDUCTION+181, // $NT
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 265
0x80000000|285, // match move
0x80000000|724, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 266
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 267
115,199, // " "
133,559, // {10}
142,458, // ws
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 268
0x80000000|440, // match move
0x80000000|673, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 269
33,MIN_REDUCTION+73, // `[
111,MIN_REDUCTION+73, // "["
157,MIN_REDUCTION+73, // $NT
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 270
0x80000000|389, // match move
0x80000000|423, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 271
157,MIN_REDUCTION+90, // $NT
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 272
46,234, // `&&
132,158, // "@"
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 273
34,32, // `]
120,646, // "]"
  }
,
{ // state 274
115,199, // " "
133,559, // {10}
142,458, // ws
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 275
82,214, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,629, // letter128
103,366, // {199..218 231..250}
104,366, // {193..198 225..230}
105,29, // digit
106,424, // {"1".."9"}
107,424, // "0"
108,102, // digit128
109,42, // {176..185}
130,633, // "_"
140,363, // {223}
143,565, // idChar*
144,689, // $$1
151,474, // idChar
152,68, // idChar128
  }
,
{ // state 276
157,MIN_REDUCTION+188, // $NT
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 277
44,556, // `||
132,11, // "@"
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 278
0x80000000|367, // match move
0x80000000|603, // no-match move
0x80000000|166, // NT-test-match state for <cast exp>
  }
,
{ // state 279
0x80000000|203, // match move
0x80000000|578, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 280
2,590, // ws*
115,50, // " "
133,495, // {10}
142,730, // ws
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 281
7,230, // ID
15,209, // <type>
16,650, // `;
19,365, // `(
21,341, // `{
26,571, // <exp>
27,484, // `int
28,669, // `boolean
35,592, // <stmt>
36,652, // <assign>
37,125, // <call exp>
38,128, // <local var decl>
39,122, // `while
40,442, // `if
43,70, // `break
45,272, // <exp2>
47,350, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
57,41, // `+
58,130, // <exp6>
59,296, // `-
61,243, // <exp7>
65,425, // <unary exp>
66,361, // <exp8>
67,181, // `!
68,189, // INTLIT
69,317, // STRINGLIT
70,409, // CHARLIT
71,529, // `false
72,270, // `this
73,284, // `true
74,476, // `null
76,735, // `new
80,36, // `super
82,539, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,67, // letter128
103,307, // {199..218 231..250}
104,307, // {193..198 225..230}
106,314, // {"1".."9"}
107,586, // "0"
108,640, // digit128
109,2, // {176..185}
112,390, // "-"
116,692, // "#"
122,697, // ";"
124,654, // "{"
127,343, // "("
128,691, // "+"
132,292, // "@"
135,708, // "!"
136,43, // "'"
137,225, // '"'
  }
,
{ // state 282
7,384, // ID
19,365, // `(
37,653, // <call exp>
57,41, // `+
59,296, // `-
61,437, // <exp7>
65,425, // <unary exp>
66,361, // <exp8>
67,181, // `!
68,189, // INTLIT
69,317, // STRINGLIT
70,409, // CHARLIT
71,529, // `false
72,270, // `this
73,284, // `true
74,476, // `null
76,735, // `new
80,36, // `super
82,539, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,67, // letter128
103,307, // {199..218 231..250}
104,307, // {193..198 225..230}
106,314, // {"1".."9"}
107,586, // "0"
108,640, // digit128
109,2, // {176..185}
112,390, // "-"
116,192, // "#"
127,343, // "("
128,691, // "+"
132,292, // "@"
135,708, // "!"
136,43, // "'"
137,225, // '"'
  }
,
{ // state 283
44,556, // `||
132,11, // "@"
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 284
0x80000000|92, // match move
0x80000000|269, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 285
157,MIN_REDUCTION+184, // $NT
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 286
20,268, // `)
44,556, // `||
118,135, // ")"
132,11, // "@"
  }
,
{ // state 287
0x80000000|23, // match move
0x80000000|207, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 288
2,400, // ws*
  }
,
{ // state 289
7,482, // ID
82,275, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,415, // letter128
103,366, // {199..218 231..250}
104,366, // {193..198 225..230}
  }
,
{ // state 290
21,667, // `{
124,654, // "{"
  }
,
{ // state 291
2,585, // ws*
115,199, // " "
133,559, // {10}
142,355, // ws
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 292
137,714, // '"'
  }
,
{ // state 293
20,356, // `)
30,581, // <listElm>
31,246, // `,
32,156, // <listElm>*
118,729, // ")"
119,253, // ","
  }
,
{ // state 294
7,230, // ID
15,209, // <type>
16,725, // `;
19,365, // `(
21,527, // `{
23,687, // `}
26,571, // <exp>
27,484, // `int
28,669, // `boolean
35,522, // <stmt>
36,54, // <assign>
37,489, // <call exp>
38,49, // <local var decl>
39,717, // `while
40,147, // `if
43,311, // `break
45,272, // <exp2>
47,350, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
57,41, // `+
58,130, // <exp6>
59,296, // `-
61,243, // <exp7>
65,425, // <unary exp>
66,361, // <exp8>
67,181, // `!
68,189, // INTLIT
69,317, // STRINGLIT
70,409, // CHARLIT
71,529, // `false
72,270, // `this
73,284, // `true
74,476, // `null
76,735, // `new
80,36, // `super
82,539, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,67, // letter128
103,307, // {199..218 231..250}
104,307, // {193..198 225..230}
106,314, // {"1".."9"}
107,586, // "0"
108,640, // digit128
109,2, // {176..185}
112,390, // "-"
116,692, // "#"
122,357, // ";"
124,654, // "{"
127,343, // "("
128,691, // "+"
132,292, // "@"
134,662, // "}"
135,708, // "!"
136,43, // "'"
137,225, // '"'
  }
,
{ // state 295
0x80000000|137, // match move
0x80000000|672, // no-match move
0x80000000|166, // NT-test-match state for <cast exp>
  }
,
{ // state 296
0x80000000|52, // match move
0x80000000|319, // no-match move
0x80000000|166, // NT-test-match state for <cast exp>
  }
,
{ // state 297
MIN_REDUCTION+1, // (default reduction)
  }
,
{ // state 298
19,345, // `(
26,571, // <exp>
35,183, // <stmt>
36,652, // <assign>
37,125, // <call exp>
45,272, // <exp2>
47,350, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
58,130, // <exp6>
61,243, // <exp7>
64,79, // <cast exp>
65,425, // <unary exp>
66,361, // <exp8>
127,343, // "("
  }
,
{ // state 299
19,345, // `(
26,325, // <exp>
37,653, // <call exp>
45,272, // <exp2>
47,350, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
58,130, // <exp6>
61,243, // <exp7>
64,79, // <cast exp>
65,425, // <unary exp>
66,361, // <exp8>
127,343, // "("
  }
,
{ // state 300
115,199, // " "
133,559, // {10}
142,458, // ws
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 301
115,199, // " "
133,559, // {10}
142,458, // ws
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 302
2,173, // ws*
157,MIN_REDUCTION+122, // $NT
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 303
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 304
2,145, // ws*
  }
,
{ // state 305
2,47, // ws*
115,199, // " "
133,559, // {10}
142,355, // ws
157,MIN_REDUCTION+110, // $NT
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 306
57,58, // `+
59,235, // `-
112,390, // "-"
128,691, // "+"
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 307
0x80000000|228, // match move
0x80000000|77, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 308
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 309
2,287, // ws*
  }
,
{ // state 310
2,287, // ws*
157,MIN_REDUCTION+186, // $NT
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 311
16,711, // `;
122,357, // ";"
  }
,
{ // state 312
0x80000000|397, // match move
0x80000000|615, // no-match move
0x80000000|166, // NT-test-match state for <cast exp>
  }
,
{ // state 313
MIN_REDUCTION+208, // (default reduction)
  }
,
{ // state 314
105,35, // digit
106,424, // {"1".."9"}
107,424, // "0"
108,402, // digit128
109,2, // {176..185}
145,570, // digit*
146,265, // $$2
  }
,
{ // state 315
0x80000000|478, // match move
0x80000000|723, // no-match move
0x80000000|679, // NT-test-match state for `else
  }
,
{ // state 316
0x80000000|198, // match move
0x80000000|72, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 317
0x80000000|660, // match move
0x80000000|410, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 318
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 319
7,384, // ID
19,365, // `(
37,653, // <call exp>
57,41, // `+
59,296, // `-
65,101, // <unary exp>
66,361, // <exp8>
67,181, // `!
68,189, // INTLIT
69,317, // STRINGLIT
70,409, // CHARLIT
71,529, // `false
72,270, // `this
73,284, // `true
74,476, // `null
76,735, // `new
80,36, // `super
82,539, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,67, // letter128
103,307, // {199..218 231..250}
104,307, // {193..198 225..230}
106,314, // {"1".."9"}
107,586, // "0"
108,640, // digit128
109,2, // {176..185}
112,390, // "-"
116,192, // "#"
127,343, // "("
128,691, // "+"
132,292, // "@"
135,708, // "!"
136,43, // "'"
137,225, // '"'
  }
,
{ // state 320
7,384, // ID
19,365, // `(
37,653, // <call exp>
66,175, // <exp8>
68,189, // INTLIT
69,317, // STRINGLIT
70,409, // CHARLIT
71,529, // `false
72,270, // `this
73,284, // `true
74,476, // `null
76,735, // `new
77,486, // <exp list>
80,36, // `super
82,539, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,67, // letter128
103,307, // {199..218 231..250}
104,307, // {193..198 225..230}
106,314, // {"1".."9"}
107,586, // "0"
108,640, // digit128
109,2, // {176..185}
116,192, // "#"
127,343, // "("
132,292, // "@"
136,43, // "'"
137,225, // '"'
  }
,
{ // state 321
0x80000000|59, // match move
0x80000000|162, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 322
115,199, // " "
133,559, // {10}
142,458, // ws
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 323
7,384, // ID
19,365, // `(
26,325, // <exp>
37,653, // <call exp>
45,272, // <exp2>
47,350, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
57,41, // `+
58,130, // <exp6>
59,296, // `-
61,243, // <exp7>
65,425, // <unary exp>
66,361, // <exp8>
67,181, // `!
68,189, // INTLIT
69,317, // STRINGLIT
70,409, // CHARLIT
71,529, // `false
72,270, // `this
73,284, // `true
74,476, // `null
76,735, // `new
80,36, // `super
82,539, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,67, // letter128
103,307, // {199..218 231..250}
104,307, // {193..198 225..230}
106,314, // {"1".."9"}
107,586, // "0"
108,640, // digit128
109,2, // {176..185}
112,390, // "-"
116,192, // "#"
127,343, // "("
128,691, // "+"
132,292, // "@"
135,708, // "!"
136,43, // "'"
137,225, // '"'
  }
};
}
private class Initter2{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 324
115,199, // " "
133,559, // {10}
142,458, // ws
157,MIN_REDUCTION+159, // $NT
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 325
16,3, // `;
44,556, // `||
122,357, // ";"
132,11, // "@"
  }
,
{ // state 326
7,230, // ID
15,209, // <type>
16,650, // `;
19,365, // `(
21,341, // `{
26,571, // <exp>
27,484, // `int
28,669, // `boolean
35,547, // <stmt>
36,652, // <assign>
37,125, // <call exp>
38,128, // <local var decl>
39,122, // `while
40,442, // `if
43,70, // `break
45,272, // <exp2>
47,350, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
57,41, // `+
58,130, // <exp6>
59,296, // `-
61,243, // <exp7>
65,425, // <unary exp>
66,361, // <exp8>
67,181, // `!
68,189, // INTLIT
69,317, // STRINGLIT
70,409, // CHARLIT
71,529, // `false
72,270, // `this
73,284, // `true
74,476, // `null
76,735, // `new
80,36, // `super
82,539, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,67, // letter128
103,307, // {199..218 231..250}
104,307, // {193..198 225..230}
106,314, // {"1".."9"}
107,586, // "0"
108,640, // digit128
109,2, // {176..185}
112,390, // "-"
116,692, // "#"
122,697, // ";"
124,654, // "{"
127,343, // "("
128,691, // "+"
132,292, // "@"
135,708, // "!"
136,43, // "'"
137,225, // '"'
  }
,
{ // state 327
7,384, // ID
19,365, // `(
26,690, // <exp>
37,653, // <call exp>
45,272, // <exp2>
47,350, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
57,41, // `+
58,130, // <exp6>
59,296, // `-
61,243, // <exp7>
65,425, // <unary exp>
66,361, // <exp8>
67,181, // `!
68,189, // INTLIT
69,317, // STRINGLIT
70,409, // CHARLIT
71,529, // `false
72,270, // `this
73,284, // `true
74,476, // `null
76,735, // `new
80,36, // `super
82,539, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,67, // letter128
103,307, // {199..218 231..250}
104,307, // {193..198 225..230}
106,314, // {"1".."9"}
107,586, // "0"
108,640, // digit128
109,2, // {176..185}
112,390, // "-"
116,192, // "#"
127,343, // "("
128,691, // "+"
132,292, // "@"
135,708, // "!"
136,43, // "'"
137,225, // '"'
  }
,
{ // state 328
19,345, // `(
26,571, // <exp>
35,547, // <stmt>
36,652, // <assign>
37,125, // <call exp>
45,272, // <exp2>
47,350, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
58,130, // <exp6>
61,243, // <exp7>
64,79, // <cast exp>
65,425, // <unary exp>
66,361, // <exp8>
127,343, // "("
  }
,
{ // state 329
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 330
0x80000000|111, // match move
0x80000000|536, // no-match move
0x80000000|679, // NT-test-match state for `else
  }
,
{ // state 331
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 332
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 333
33,MIN_REDUCTION+121, // `[
111,MIN_REDUCTION+121, // "["
115,598, // " "
133,321, // {10}
142,726, // ws
157,MIN_REDUCTION+121, // $NT
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 334
33,MIN_REDUCTION+67, // `[
111,MIN_REDUCTION+67, // "["
157,MIN_REDUCTION+67, // $NT
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 335
157,MIN_REDUCTION+199, // $NT
MIN_REDUCTION+199, // (default reduction)
  }
,
{ // state 336
83,392, // "a"
84,392, // "p"
85,392, // "s"
86,392, // "v"
87,392, // "c"
88,392, // "f"
89,392, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,392, // "i"
91,392, // "l"
92,392, // "o"
93,392, // "r"
94,392, // "u"
95,392, // "x"
96,392, // "b"
97,392, // "e"
98,392, // "h"
99,392, // "n"
100,392, // "t"
101,392, // "w"
103,532, // {199..218 231..250}
104,532, // {193..198 225..230}
106,392, // {"1".."9"}
107,392, // "0"
109,532, // {176..185}
110,622, // any
111,392, // "["
112,392, // "-"
113,392, // "<"
114,392, // "|"
115,392, // " "
116,392, // "#"
117,392, // "&"
118,392, // ")"
119,392, // ","
120,392, // "]"
121,392, // "/"
122,392, // ";"
123,392, // ">"
124,392, // "{"
125,392, // {0..9 11..31 "$" ":" "?" "\" "^" "`" "~"..127}
126,392, // "%"
127,392, // "("
128,392, // "+"
129,392, // "."
130,392, // "_"
131,392, // "="
132,392, // "@"
133,392, // {10}
134,392, // "}"
135,392, // "!"
136,392, // "'"
137,392, // '"'
138,392, // "*"
139,510, // any128
140,532, // {223}
141,532, // {128..175 186..192 219..222 224 251..255}
150,316, // $$4
  }
,
{ // state 337
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 338
94,391, // "u"
97,493, // "e"
  }
,
{ // state 339
31,446, // `,
78,674, // <recurse>
119,253, // ","
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 340
0x80000000|308, // match move
0x80000000|141, // no-match move
0x80000000|679, // NT-test-match state for `else
  }
,
{ // state 341
0x80000000|593, // match move
0x80000000|648, // no-match move
0x80000000|166, // NT-test-match state for <cast exp>
  }
,
{ // state 342
7,384, // ID
19,365, // `(
37,653, // <call exp>
47,416, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
57,41, // `+
58,130, // <exp6>
59,296, // `-
61,243, // <exp7>
65,425, // <unary exp>
66,361, // <exp8>
67,181, // `!
68,189, // INTLIT
69,317, // STRINGLIT
70,409, // CHARLIT
71,529, // `false
72,270, // `this
73,284, // `true
74,476, // `null
76,735, // `new
80,36, // `super
82,539, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,67, // letter128
103,307, // {199..218 231..250}
104,307, // {193..198 225..230}
106,314, // {"1".."9"}
107,586, // "0"
108,640, // digit128
109,2, // {176..185}
112,390, // "-"
116,192, // "#"
127,343, // "("
128,691, // "+"
132,292, // "@"
135,708, // "!"
136,43, // "'"
137,225, // '"'
  }
,
{ // state 343
2,618, // ws*
115,199, // " "
133,559, // {10}
142,355, // ws
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 344
0x80000000|670, // match move
0x80000000|334, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 345
7,694, // ID
15,256, // <type>
27,484, // `int
28,669, // `boolean
82,275, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,415, // letter128
103,366, // {199..218 231..250}
104,366, // {193..198 225..230}
116,488, // "#"
  }
,
{ // state 346
33,MIN_REDUCTION+188, // `[
111,MIN_REDUCTION+188, // "["
157,MIN_REDUCTION+188, // $NT
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 347
100,291, // "t"
  }
,
{ // state 348
20,30, // `)
118,729, // ")"
  }
,
{ // state 349
7,146, // ID
29,575, // <empty bracket pair>
33,273, // `[
82,275, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,415, // letter128
103,366, // {199..218 231..250}
104,366, // {193..198 225..230}
111,172, // "["
  }
,
{ // state 350
48,312, // `!=
50,176, // `==
132,401, // "@"
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 351
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 352
7,462, // ID
82,275, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,415, // letter128
103,366, // {199..218 231..250}
104,366, // {193..198 225..230}
  }
,
{ // state 353
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 354
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 355
157,MIN_REDUCTION+210, // $NT
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 356
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 357
2,301, // ws*
115,199, // " "
133,559, // {10}
142,355, // ws
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 358
0x80000000|126, // match move
0x80000000|649, // no-match move
0x80000000|679, // NT-test-match state for `else
  }
,
{ // state 359
0x80000000|470, // match move
0x80000000|472, // no-match move
0x80000000|166, // NT-test-match state for <cast exp>
  }
,
{ // state 360
157,MIN_REDUCTION+93, // $NT
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 361
0x80000000|1, // match move
0x80000000|545, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 362
2,608, // ws*
115,199, // " "
133,559, // {10}
142,355, // ws
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 363
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 364
33,381, // `[
75,69, // `.
111,172, // "["
129,61, // "."
157,MIN_REDUCTION+61, // $NT
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 365
0x80000000|120, // match move
0x80000000|534, // no-match move
0x80000000|166, // NT-test-match state for <cast exp>
  }
,
{ // state 366
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 367
19,345, // `(
22,107, // <stmt>*
26,571, // <exp>
35,469, // <stmt>
36,54, // <assign>
37,489, // <call exp>
45,272, // <exp2>
47,350, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
58,130, // <exp6>
61,243, // <exp7>
64,79, // <cast exp>
65,425, // <unary exp>
66,361, // <exp8>
127,343, // "("
  }
,
{ // state 368
0x80000000|85, // match move
0x80000000|428, // no-match move
0x80000000|166, // NT-test-match state for <cast exp>
  }
,
{ // state 369
2,668, // ws*
  }
,
{ // state 370
87,7, // "c"
  }
,
{ // state 371
7,384, // ID
19,365, // `(
20,167, // `)
37,653, // <call exp>
66,175, // <exp8>
68,189, // INTLIT
69,317, // STRINGLIT
70,409, // CHARLIT
71,529, // `false
72,270, // `this
73,284, // `true
74,476, // `null
76,735, // `new
77,115, // <exp list>
80,36, // `super
81,681, // <exp list>?
82,539, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,67, // letter128
103,307, // {199..218 231..250}
104,307, // {193..198 225..230}
106,314, // {"1".."9"}
107,586, // "0"
108,640, // digit128
109,2, // {176..185}
116,192, // "#"
118,135, // ")"
127,343, // "("
132,292, // "@"
136,43, // "'"
137,225, // '"'
  }
,
{ // state 372
19,345, // `(
26,408, // <exp>
37,653, // <call exp>
45,272, // <exp2>
47,350, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
58,130, // <exp6>
61,243, // <exp7>
64,79, // <cast exp>
65,425, // <unary exp>
66,361, // <exp8>
127,343, // "("
  }
,
{ // state 373
7,384, // ID
19,365, // `(
20,576, // `)
37,653, // <call exp>
66,175, // <exp8>
68,189, // INTLIT
69,317, // STRINGLIT
70,409, // CHARLIT
71,529, // `false
72,270, // `this
73,284, // `true
74,476, // `null
76,735, // `new
77,115, // <exp list>
80,36, // `super
81,466, // <exp list>?
82,539, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,67, // letter128
103,307, // {199..218 231..250}
104,307, // {193..198 225..230}
106,314, // {"1".."9"}
107,586, // "0"
108,640, // digit128
109,2, // {176..185}
116,192, // "#"
118,135, // ")"
127,343, // "("
132,292, // "@"
136,43, // "'"
137,225, // '"'
  }
,
{ // state 374
157,MIN_REDUCTION+159, // $NT
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 375
7,384, // ID
19,365, // `(
37,653, // <call exp>
57,41, // `+
59,296, // `-
65,712, // <unary exp>
66,361, // <exp8>
67,181, // `!
68,189, // INTLIT
69,317, // STRINGLIT
70,409, // CHARLIT
71,529, // `false
72,270, // `this
73,284, // `true
74,476, // `null
76,735, // `new
80,36, // `super
82,539, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,67, // letter128
103,307, // {199..218 231..250}
104,307, // {193..198 225..230}
106,314, // {"1".."9"}
107,586, // "0"
108,640, // digit128
109,2, // {176..185}
112,390, // "-"
116,192, // "#"
127,343, // "("
128,691, // "+"
132,292, // "@"
135,708, // "!"
136,43, // "'"
137,225, // '"'
  }
,
{ // state 376
115,199, // " "
133,559, // {10}
142,458, // ws
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 377
115,199, // " "
133,559, // {10}
142,458, // ws
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 378
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 379
2,444, // ws*
33,MIN_REDUCTION+160, // `[
111,MIN_REDUCTION+160, // "["
115,598, // " "
133,321, // {10}
142,4, // ws
157,MIN_REDUCTION+160, // $NT
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 380
115,50, // " "
133,495, // {10}
142,18, // ws
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 381
0x80000000|66, // match move
0x80000000|131, // no-match move
0x80000000|166, // NT-test-match state for <cast exp>
  }
,
{ // state 382
19,345, // `(
26,71, // <exp>
37,653, // <call exp>
45,272, // <exp2>
47,350, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
58,130, // <exp6>
61,243, // <exp7>
64,79, // <cast exp>
65,425, // <unary exp>
66,361, // <exp8>
127,343, // "("
  }
,
{ // state 383
23,161, // `}
134,662, // "}"
  }
,
{ // state 384
0x80000000|583, // match move
0x80000000|530, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 385
2,577, // ws*
33,MIN_REDUCTION+228, // `[
111,MIN_REDUCTION+228, // "["
115,598, // " "
133,321, // {10}
142,4, // ws
157,MIN_REDUCTION+228, // $NT
MIN_REDUCTION+228, // (default reduction)
  }
,
{ // state 386
82,214, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,433, // letter128
103,307, // {199..218 231..250}
104,307, // {193..198 225..230}
105,29, // digit
106,424, // {"1".."9"}
107,424, // "0"
108,661, // digit128
109,2, // {176..185}
130,633, // "_"
140,219, // {223}
144,257, // $$1
151,609, // idChar
152,19, // idChar128
  }
,
{ // state 387
157,MIN_REDUCTION+84, // $NT
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 388
7,230, // ID
15,209, // <type>
16,650, // `;
19,365, // `(
21,341, // `{
26,571, // <exp>
27,484, // `int
28,669, // `boolean
35,553, // <stmt>
36,652, // <assign>
37,125, // <call exp>
38,128, // <local var decl>
39,122, // `while
40,442, // `if
43,70, // `break
45,272, // <exp2>
47,350, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
57,41, // `+
58,130, // <exp6>
59,296, // `-
61,243, // <exp7>
65,425, // <unary exp>
66,361, // <exp8>
67,181, // `!
68,189, // INTLIT
69,317, // STRINGLIT
70,409, // CHARLIT
71,529, // `false
72,270, // `this
73,284, // `true
74,476, // `null
76,735, // `new
80,36, // `super
82,539, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,67, // letter128
103,307, // {199..218 231..250}
104,307, // {193..198 225..230}
106,314, // {"1".."9"}
107,586, // "0"
108,640, // digit128
109,2, // {176..185}
112,390, // "-"
116,692, // "#"
122,697, // ";"
124,654, // "{"
127,343, // "("
128,691, // "+"
132,292, // "@"
135,708, // "!"
136,43, // "'"
137,225, // '"'
  }
,
{ // state 389
157,MIN_REDUCTION+72, // $NT
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 390
2,322, // ws*
115,199, // " "
133,559, // {10}
142,355, // ws
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 391
0x80000000|302, // match move
0x80000000|254, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 392
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 393
33,MIN_REDUCTION+115, // `[
111,MIN_REDUCTION+115, // "["
115,598, // " "
133,321, // {10}
142,726, // ws
157,MIN_REDUCTION+115, // $NT
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 394
2,461, // ws*
115,199, // " "
133,559, // {10}
142,355, // ws
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 395
0x80000000|299, // match move
0x80000000|323, // no-match move
0x80000000|166, // NT-test-match state for <cast exp>
  }
,
{ // state 396
33,MIN_REDUCTION+85, // `[
111,MIN_REDUCTION+85, // "["
157,MIN_REDUCTION+85, // $NT
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 397
19,345, // `(
37,653, // <call exp>
49,451, // <exp4>
52,306, // <exp5>
58,130, // <exp6>
61,243, // <exp7>
64,79, // <cast exp>
65,425, // <unary exp>
66,361, // <exp8>
127,343, // "("
  }
,
{ // state 398
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 399
0x80000000|1, // match move
0x80000000|245, // no-match move
0x80000000|679, // NT-test-match state for `else
  }
,
{ // state 400
0x80000000|573, // match move
0x80000000|201, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 401
114,362, // "|"
117,741, // "&"
131,481, // "="
135,494, // "!"
  }
,
{ // state 402
0x80000000|184, // match move
0x80000000|103, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 403
2,658, // ws*
33,MIN_REDUCTION+144, // `[
111,MIN_REDUCTION+144, // "["
115,598, // " "
133,321, // {10}
142,4, // ws
157,MIN_REDUCTION+144, // $NT
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 404
0x80000000|40, // match move
0x80000000|136, // no-match move
0x80000000|679, // NT-test-match state for `else
  }
,
{ // state 405
0x80000000|159, // match move
0x80000000|569, // no-match move
0x80000000|166, // NT-test-match state for <cast exp>
  }
,
{ // state 406
115,199, // " "
133,559, // {10}
142,458, // ws
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 407
0x80000000|471, // match move
0x80000000|720, // no-match move
0x80000000|166, // NT-test-match state for <cast exp>
  }
,
{ // state 408
16,383, // `;
44,556, // `||
122,357, // ";"
132,11, // "@"
  }
,
{ // state 409
0x80000000|262, // match move
0x80000000|737, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 410
33,MIN_REDUCTION+69, // `[
111,MIN_REDUCTION+69, // "["
157,MIN_REDUCTION+69, // $NT
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 411
0x80000000|276, // match move
0x80000000|346, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 412
0x80000000|5, // match move
0x80000000|75, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 413
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 414
19,345, // `(
37,653, // <call exp>
61,621, // <exp7>
64,79, // <cast exp>
65,425, // <unary exp>
66,361, // <exp8>
127,343, // "("
  }
,
{ // state 415
2,16, // ws*
115,199, // " "
133,559, // {10}
142,355, // ws
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 416
48,312, // `!=
50,176, // `==
132,401, // "@"
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 417
2,179, // ws*
115,199, // " "
133,559, // {10}
142,355, // ws
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 418
0x80000000|487, // match move
0x80000000|281, // no-match move
0x80000000|679, // NT-test-match state for `else
  }
,
{ // state 419
7,230, // ID
15,209, // <type>
16,725, // `;
19,365, // `(
21,527, // `{
22,10, // <stmt>*
25,665, // `return
26,571, // <exp>
27,484, // `int
28,669, // `boolean
35,469, // <stmt>
36,54, // <assign>
37,489, // <call exp>
38,49, // <local var decl>
39,717, // `while
40,147, // `if
43,311, // `break
45,272, // <exp2>
47,350, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
57,41, // `+
58,130, // <exp6>
59,296, // `-
61,243, // <exp7>
65,425, // <unary exp>
66,361, // <exp8>
67,181, // `!
68,189, // INTLIT
69,317, // STRINGLIT
70,409, // CHARLIT
71,529, // `false
72,270, // `this
73,284, // `true
74,476, // `null
76,735, // `new
80,36, // `super
82,539, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,67, // letter128
103,307, // {199..218 231..250}
104,307, // {193..198 225..230}
106,314, // {"1".."9"}
107,586, // "0"
108,640, // digit128
109,2, // {176..185}
112,390, // "-"
116,515, // "#"
122,357, // ";"
124,654, // "{"
127,343, // "("
128,691, // "+"
132,292, // "@"
135,708, // "!"
136,43, // "'"
137,225, // '"'
  }
,
{ // state 420
2,590, // ws*
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 421
2,505, // ws*
115,199, // " "
133,559, // {10}
142,355, // ws
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 422
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 423
33,MIN_REDUCTION+72, // `[
111,MIN_REDUCTION+72, // "["
157,MIN_REDUCTION+72, // $NT
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 424
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 425
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 426
57,58, // `+
59,235, // `-
112,390, // "-"
128,691, // "+"
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 427
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 428
7,230, // ID
15,209, // <type>
16,725, // `;
19,365, // `(
21,527, // `{
22,164, // <stmt>*
23,413, // `}
26,571, // <exp>
27,484, // `int
28,669, // `boolean
35,469, // <stmt>
36,54, // <assign>
37,489, // <call exp>
38,49, // <local var decl>
39,717, // `while
40,147, // `if
43,311, // `break
45,272, // <exp2>
47,350, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
57,41, // `+
58,130, // <exp6>
59,296, // `-
61,243, // <exp7>
65,425, // <unary exp>
66,361, // <exp8>
67,181, // `!
68,189, // INTLIT
69,317, // STRINGLIT
70,409, // CHARLIT
71,529, // `false
72,270, // `this
73,284, // `true
74,476, // `null
76,735, // `new
80,36, // `super
82,539, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,67, // letter128
103,307, // {199..218 231..250}
104,307, // {193..198 225..230}
106,314, // {"1".."9"}
107,586, // "0"
108,640, // digit128
109,2, // {176..185}
112,390, // "-"
116,692, // "#"
122,357, // ";"
124,654, // "{"
127,343, // "("
128,691, // "+"
132,292, // "@"
134,662, // "}"
135,708, // "!"
136,43, // "'"
137,225, // '"'
  }
,
{ // state 429
157,MIN_REDUCTION+192, // $NT
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 430
19,345, // `(
26,571, // <exp>
35,553, // <stmt>
36,652, // <assign>
37,125, // <call exp>
45,272, // <exp2>
47,350, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
58,130, // <exp6>
61,243, // <exp7>
64,79, // <cast exp>
65,425, // <unary exp>
66,361, // <exp8>
127,343, // "("
  }
,
{ // state 431
97,518, // "e"
  }
,
{ // state 432
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 433
0x80000000|121, // match move
0x80000000|630, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 434
92,217, // "o"
  }
,
{ // state 435
2,279, // ws*
33,MIN_REDUCTION+234, // `[
111,MIN_REDUCTION+234, // "["
115,598, // " "
133,321, // {10}
142,4, // ws
157,MIN_REDUCTION+234, // $NT
MIN_REDUCTION+234, // (default reduction)
  }
,
{ // state 436
115,199, // " "
133,559, // {10}
142,458, // ws
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 437
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 438
84,546, // "p"
90,347, // "i"
96,651, // "b"
  }
,
{ // state 439
2,722, // ws*
115,199, // " "
133,559, // {10}
142,355, // ws
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 440
157,MIN_REDUCTION+77, // $NT
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 441
19,511, // `(
33,MIN_REDUCTION+75, // `[
111,MIN_REDUCTION+75, // "["
127,343, // "("
157,MIN_REDUCTION+75, // $NT
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 442
19,295, // `(
127,343, // "("
  }
,
{ // state 443
33,MIN_REDUCTION+231, // `[
111,MIN_REDUCTION+231, // "["
115,598, // " "
133,321, // {10}
142,726, // ws
157,MIN_REDUCTION+231, // $NT
MIN_REDUCTION+231, // (default reduction)
  }
,
{ // state 444
0x80000000|374, // match move
0x80000000|244, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 445
115,199, // " "
133,559, // {10}
142,458, // ws
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 446
0x80000000|635, // match move
0x80000000|98, // no-match move
0x80000000|166, // NT-test-match state for <cast exp>
  }
,
{ // state 447
0x80000000|200, // match move
0x80000000|93, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 448
157,MIN_REDUCTION+210, // $NT
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 449
7,384, // ID
19,365, // `(
37,653, // <call exp>
57,41, // `+
59,296, // `-
65,541, // <unary exp>
66,361, // <exp8>
67,181, // `!
68,189, // INTLIT
69,317, // STRINGLIT
70,409, // CHARLIT
71,529, // `false
72,270, // `this
73,284, // `true
74,476, // `null
76,735, // `new
80,36, // `super
82,539, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,67, // letter128
103,307, // {199..218 231..250}
104,307, // {193..198 225..230}
106,314, // {"1".."9"}
107,586, // "0"
108,640, // digit128
109,2, // {176..185}
112,390, // "-"
116,192, // "#"
127,343, // "("
128,691, // "+"
132,292, // "@"
135,708, // "!"
136,43, // "'"
137,225, // '"'
  }
,
{ // state 450
157,MIN_REDUCTION+121, // $NT
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 451
51,187, // `<
53,452, // `>
54,204, // `instanceof
55,641, // `<=
56,405, // `>=
113,656, // "<"
116,78, // "#"
123,613, // ">"
132,149, // "@"
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 452
0x80000000|709, // match move
0x80000000|73, // no-match move
0x80000000|166, // NT-test-match state for <cast exp>
  }
,
{ // state 453
19,345, // `(
37,653, // <call exp>
61,255, // <exp7>
64,79, // <cast exp>
65,425, // <unary exp>
66,361, // <exp8>
127,343, // "("
  }
,
{ // state 454
157,MIN_REDUCTION+91, // $NT
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 455
157,MIN_REDUCTION+200, // $NT
MIN_REDUCTION+200, // (default reduction)
  }
,
{ // state 456
33,MIN_REDUCTION+143, // `[
111,MIN_REDUCTION+143, // "["
115,598, // " "
133,321, // {10}
142,726, // ws
157,MIN_REDUCTION+143, // $NT
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 457
34,344, // `]
44,556, // `||
120,231, // "]"
132,11, // "@"
  }
,
{ // state 458
157,MIN_REDUCTION+209, // $NT
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 459
33,MIN_REDUCTION+93, // `[
111,MIN_REDUCTION+93, // "["
157,MIN_REDUCTION+93, // $NT
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 460
19,345, // `(
37,653, // <call exp>
47,416, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
58,130, // <exp6>
61,243, // <exp7>
64,79, // <cast exp>
65,425, // <unary exp>
66,361, // <exp8>
127,343, // "("
  }
,
{ // state 461
115,199, // " "
133,559, // {10}
142,458, // ws
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 462
5,503, // <extendsID>
6,46, // `extends
10,555, // <extendsID>?
11,378, // $$0
21,468, // `{
116,186, // "#"
124,654, // "{"
  }
,
{ // state 463
37,653, // <call exp>
65,712, // <unary exp>
66,361, // <exp8>
  }
,
{ // state 464
MIN_REDUCTION+217, // (default reduction)
  }
,
{ // state 465
157,MIN_REDUCTION+83, // $NT
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 466
20,719, // `)
118,135, // ")"
  }
,
{ // state 467
7,544, // ID
29,575, // <empty bracket pair>
33,273, // `[
82,275, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,415, // letter128
103,366, // {199..218 231..250}
104,366, // {193..198 225..230}
111,172, // "["
  }
,
{ // state 468
7,694, // ID
12,138, // <decl in class>
13,220, // <method decl>
14,398, // <instVarDecl>
15,349, // <type>
17,548, // `public
23,501, // `}
27,484, // `int
28,669, // `boolean
82,275, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,415, // letter128
103,366, // {199..218 231..250}
104,366, // {193..198 225..230}
116,438, // "#"
134,662, // "}"
155,28, // <decl in class>*
  }
,
{ // state 469
MIN_REDUCTION+204, // (default reduction)
  }
,
{ // state 470
19,345, // `(
26,283, // <exp>
37,653, // <call exp>
45,272, // <exp2>
47,350, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
58,130, // <exp6>
61,243, // <exp7>
64,79, // <cast exp>
65,425, // <unary exp>
66,361, // <exp8>
127,343, // "("
  }
,
{ // state 471
19,345, // `(
26,150, // <exp>
37,653, // <call exp>
45,272, // <exp2>
47,350, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
58,130, // <exp6>
61,243, // <exp7>
64,79, // <cast exp>
65,425, // <unary exp>
66,361, // <exp8>
127,343, // "("
  }
,
{ // state 472
7,384, // ID
19,365, // `(
26,283, // <exp>
37,653, // <call exp>
45,272, // <exp2>
47,350, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
57,41, // `+
58,130, // <exp6>
59,296, // `-
61,243, // <exp7>
65,425, // <unary exp>
66,361, // <exp8>
67,181, // `!
68,189, // INTLIT
69,317, // STRINGLIT
70,409, // CHARLIT
71,529, // `false
72,270, // `this
73,284, // `true
74,476, // `null
76,735, // `new
80,36, // `super
82,539, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,67, // letter128
103,307, // {199..218 231..250}
104,307, // {193..198 225..230}
106,314, // {"1".."9"}
107,586, // "0"
108,640, // digit128
109,2, // {176..185}
112,390, // "-"
116,192, // "#"
127,343, // "("
128,691, // "+"
132,292, // "@"
135,708, // "!"
136,43, // "'"
137,225, // '"'
  }
,
{ // state 473
91,305, // "l"
  }
,
{ // state 474
MIN_REDUCTION+220, // (default reduction)
  }
,
{ // state 475
20,716, // `)
44,556, // `||
118,729, // ")"
132,11, // "@"
  }
,
{ // state 476
0x80000000|572, // match move
0x80000000|12, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 477
157,MIN_REDUCTION+231, // $NT
MIN_REDUCTION+231, // (default reduction)
  }
,
{ // state 478
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 479
19,345, // `(
37,653, // <call exp>
52,614, // <exp5>
58,130, // <exp6>
61,243, // <exp7>
64,79, // <cast exp>
65,425, // <unary exp>
66,361, // <exp8>
127,343, // "("
  }
,
{ // state 480
157,MIN_REDUCTION+61, // $NT
  }
,
{ // state 481
2,506, // ws*
115,199, // " "
133,559, // {10}
142,355, // ws
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 482
19,226, // `(
127,343, // "("
  }
,
{ // state 483
86,434, // "v"
90,347, // "i"
96,651, // "b"
  }
,
{ // state 484
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 485
7,384, // ID
19,365, // `(
37,653, // <call exp>
52,614, // <exp5>
57,41, // `+
58,130, // <exp6>
59,296, // `-
61,243, // <exp7>
65,425, // <unary exp>
66,361, // <exp8>
67,181, // `!
68,189, // INTLIT
69,317, // STRINGLIT
70,409, // CHARLIT
71,529, // `false
72,270, // `this
73,284, // `true
74,476, // `null
76,735, // `new
80,36, // `super
82,539, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,67, // letter128
103,307, // {199..218 231..250}
104,307, // {193..198 225..230}
106,314, // {"1".."9"}
107,586, // "0"
108,640, // digit128
109,2, // {176..185}
112,390, // "-"
116,192, // "#"
127,343, // "("
128,691, // "+"
132,292, // "@"
135,708, // "!"
136,43, // "'"
137,225, // '"'
  }
,
{ // state 486
20,540, // `)
118,135, // ")"
  }
,
{ // state 487
41,512, // `else
116,718, // "#"
  }
,
{ // state 488
90,347, // "i"
96,651, // "b"
  }
,
{ // state 489
0x80000000|1, // match move
0x80000000|116, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 490
7,230, // ID
15,209, // <type>
16,650, // `;
19,365, // `(
21,341, // `{
26,571, // <exp>
27,484, // `int
28,669, // `boolean
35,340, // <stmt>
36,652, // <assign>
37,125, // <call exp>
38,128, // <local var decl>
39,122, // `while
40,442, // `if
43,70, // `break
45,272, // <exp2>
47,350, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
57,41, // `+
58,130, // <exp6>
59,296, // `-
61,243, // <exp7>
65,425, // <unary exp>
66,361, // <exp8>
67,181, // `!
68,189, // INTLIT
69,317, // STRINGLIT
70,409, // CHARLIT
71,529, // `false
72,270, // `this
73,284, // `true
74,476, // `null
76,735, // `new
80,36, // `super
82,539, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,67, // letter128
103,307, // {199..218 231..250}
104,307, // {193..198 225..230}
106,314, // {"1".."9"}
107,586, // "0"
108,640, // digit128
109,2, // {176..185}
112,390, // "-"
116,692, // "#"
122,697, // ";"
124,654, // "{"
127,343, // "("
128,691, // "+"
132,292, // "@"
135,708, // "!"
136,43, // "'"
137,225, // '"'
  }
,
{ // state 491
33,MIN_REDUCTION+78, // `[
111,MIN_REDUCTION+78, // "["
157,MIN_REDUCTION+78, // $NT
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 492
157,MIN_REDUCTION+113, // $NT
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 493
2,436, // ws*
115,199, // " "
133,559, // {10}
142,355, // ws
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 494
2,86, // ws*
115,199, // " "
133,559, // {10}
142,355, // ws
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 495
0x80000000|599, // match move
0x80000000|96, // no-match move
0x80000000|679, // NT-test-match state for `else
  }
,
{ // state 496
115,199, // " "
133,559, // {10}
142,458, // ws
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 497
157,MIN_REDUCTION+86, // $NT
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 498
7,384, // ID
19,365, // `(
37,653, // <call exp>
45,252, // <exp2>
47,350, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
57,41, // `+
58,130, // <exp6>
59,296, // `-
61,243, // <exp7>
65,425, // <unary exp>
66,361, // <exp8>
67,181, // `!
68,189, // INTLIT
69,317, // STRINGLIT
70,409, // CHARLIT
71,529, // `false
72,270, // `this
73,284, // `true
74,476, // `null
76,735, // `new
80,36, // `super
82,539, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,67, // letter128
103,307, // {199..218 231..250}
104,307, // {193..198 225..230}
106,314, // {"1".."9"}
107,586, // "0"
108,640, // digit128
109,2, // {176..185}
112,390, // "-"
116,192, // "#"
127,343, // "("
128,691, // "+"
132,292, // "@"
135,708, // "!"
136,43, // "'"
137,225, // '"'
  }
,
{ // state 499
19,345, // `(
37,653, // <call exp>
58,194, // <exp6>
61,243, // <exp7>
64,79, // <cast exp>
65,425, // <unary exp>
66,361, // <exp8>
127,343, // "("
  }
,
{ // state 500
0x80000000|738, // match move
0x80000000|636, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 501
MIN_REDUCTION+226, // (default reduction)
  }
,
{ // state 502
23,594, // `}
134,662, // "}"
  }
,
{ // state 503
MIN_REDUCTION+211, // (default reduction)
  }
,
{ // state 504
0x80000000|353, // match move
0x80000000|44, // no-match move
0x80000000|679, // NT-test-match state for `else
  }
,
{ // state 505
115,199, // " "
133,559, // {10}
142,458, // ws
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 506
115,199, // " "
133,559, // {10}
142,458, // ws
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 507
33,MIN_REDUCTION+92, // `[
111,MIN_REDUCTION+92, // "["
157,MIN_REDUCTION+92, // $NT
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 508
7,384, // ID
19,365, // `(
37,653, // <call exp>
57,41, // `+
58,194, // <exp6>
59,296, // `-
61,243, // <exp7>
65,425, // <unary exp>
66,361, // <exp8>
67,181, // `!
68,189, // INTLIT
69,317, // STRINGLIT
70,409, // CHARLIT
71,529, // `false
72,270, // `this
73,284, // `true
74,476, // `null
76,735, // `new
80,36, // `super
82,539, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,67, // letter128
103,307, // {199..218 231..250}
104,307, // {193..198 225..230}
106,314, // {"1".."9"}
107,586, // "0"
108,640, // digit128
109,2, // {176..185}
112,390, // "-"
116,192, // "#"
127,343, // "("
128,691, // "+"
132,292, // "@"
135,708, // "!"
136,43, // "'"
137,225, // '"'
  }
,
{ // state 509
MIN_REDUCTION+224, // (default reduction)
  }
,
{ // state 510
0x80000000|151, // match move
0x80000000|435, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 511
0x80000000|182, // match move
0x80000000|320, // no-match move
0x80000000|166, // NT-test-match state for <cast exp>
  }
,
{ // state 512
0x80000000|105, // match move
0x80000000|490, // no-match move
0x80000000|166, // NT-test-match state for <cast exp>
  }
,
{ // state 513
115,MIN_REDUCTION+209, // " "
133,MIN_REDUCTION+209, // {10}
142,MIN_REDUCTION+209, // ws
MIN_REDUCTION+209, // (default reduction)
  }
,
{ // state 514
0x80000000|516, // match move
0x80000000|703, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 515
85,51, // "s"
88,208, // "f"
90,347, // "i"
93,431, // "r"
96,705, // "b"
99,338, // "n"
100,60, // "t"
101,97, // "w"
128,616, // "+"
  }
,
{ // state 516
157,MIN_REDUCTION+193, // $NT
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 517
2,261, // ws*
33,MIN_REDUCTION+232, // `[
111,MIN_REDUCTION+232, // "["
115,598, // " "
133,321, // {10}
142,4, // ws
157,MIN_REDUCTION+232, // $NT
MIN_REDUCTION+232, // (default reduction)
  }
,
{ // state 518
2,376, // ws*
115,199, // " "
133,559, // {10}
142,355, // ws
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 519
157,MIN_REDUCTION+76, // $NT
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 520
33,MIN_REDUCTION+113, // `[
111,MIN_REDUCTION+113, // "["
115,598, // " "
133,321, // {10}
142,726, // ws
157,MIN_REDUCTION+113, // $NT
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 521
0x80000000|124, // match move
0x80000000|419, // no-match move
0x80000000|166, // NT-test-match state for <cast exp>
  }
,
{ // state 522
MIN_REDUCTION+203, // (default reduction)
  }
,
{ // state 523
19,345, // `(
37,653, // <call exp>
64,524, // <cast exp>
66,549, // <exp8>
127,343, // "("
  }
,
{ // state 524
157,MIN_REDUCTION+60, // $NT
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 525
2,739, // ws*
157,MIN_REDUCTION+190, // $NT
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 526
157,MIN_REDUCTION+85, // $NT
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 527
0x80000000|236, // match move
0x80000000|663, // no-match move
0x80000000|166, // NT-test-match state for <cast exp>
  }
,
{ // state 528
31,446, // `,
33,381, // `[
75,69, // `.
78,509, // <recurse>
79,339, // <recurse>*
111,172, // "["
119,253, // ","
129,61, // "."
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 529
0x80000000|148, // match move
0x80000000|704, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 530
19,733, // `(
33,MIN_REDUCTION+66, // `[
111,MIN_REDUCTION+66, // "["
127,343, // "("
157,MIN_REDUCTION+66, // $NT
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 531
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 532
0x80000000|582, // match move
0x80000000|507, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 533
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 534
7,384, // ID
19,365, // `(
26,286, // <exp>
37,653, // <call exp>
45,272, // <exp2>
47,350, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
57,41, // `+
58,130, // <exp6>
59,296, // `-
61,243, // <exp7>
65,425, // <unary exp>
66,361, // <exp8>
67,181, // `!
68,189, // INTLIT
69,317, // STRINGLIT
70,409, // CHARLIT
71,529, // `false
72,270, // `this
73,284, // `true
74,476, // `null
76,735, // `new
80,36, // `super
82,539, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,67, // letter128
103,307, // {199..218 231..250}
104,307, // {193..198 225..230}
106,314, // {"1".."9"}
107,586, // "0"
108,640, // digit128
109,2, // {176..185}
112,390, // "-"
116,192, // "#"
127,343, // "("
128,691, // "+"
132,292, // "@"
135,708, // "!"
136,43, // "'"
137,225, // '"'
  }
,
{ // state 535
115,199, // " "
133,559, // {10}
142,458, // ws
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 536
7,230, // ID
15,209, // <type>
16,725, // `;
19,365, // `(
21,527, // `{
26,571, // <exp>
27,484, // `int
28,669, // `boolean
35,45, // <stmt>
36,54, // <assign>
37,489, // <call exp>
38,49, // <local var decl>
39,717, // `while
40,147, // `if
43,311, // `break
45,272, // <exp2>
47,350, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
57,41, // `+
58,130, // <exp6>
59,296, // `-
61,243, // <exp7>
65,425, // <unary exp>
66,361, // <exp8>
67,181, // `!
68,189, // INTLIT
69,317, // STRINGLIT
70,409, // CHARLIT
71,529, // `false
72,270, // `this
73,284, // `true
74,476, // `null
76,735, // `new
80,36, // `super
82,539, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,67, // letter128
103,307, // {199..218 231..250}
104,307, // {193..198 225..230}
106,314, // {"1".."9"}
107,586, // "0"
108,640, // digit128
109,2, // {176..185}
112,390, // "-"
116,692, // "#"
122,357, // ";"
124,654, // "{"
127,343, // "("
128,691, // "+"
132,292, // "@"
135,708, // "!"
136,43, // "'"
137,225, // '"'
  }
,
{ // state 537
33,MIN_REDUCTION+83, // `[
111,MIN_REDUCTION+83, // "["
157,MIN_REDUCTION+83, // $NT
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 538
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 539
82,214, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,433, // letter128
103,307, // {199..218 231..250}
104,307, // {193..198 225..230}
105,29, // digit
106,424, // {"1".."9"}
107,424, // "0"
108,661, // digit128
109,2, // {176..185}
130,633, // "_"
140,219, // {223}
143,386, // idChar*
144,160, // $$1
151,474, // idChar
152,19, // idChar128
  }
,
{ // state 540
0x80000000|62, // match move
0x80000000|542, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 541
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 542
33,MIN_REDUCTION+79, // `[
111,MIN_REDUCTION+79, // "["
157,MIN_REDUCTION+79, // $NT
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 543
33,MIN_REDUCTION+86, // `[
111,MIN_REDUCTION+86, // "["
157,MIN_REDUCTION+86, // $NT
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 544
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 545
33,381, // `[
75,69, // `.
111,172, // "["
129,61, // "."
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 546
94,53, // "u"
  }
,
{ // state 547
0x80000000|399, // match move
0x80000000|330, // no-match move
0x80000000|166, // NT-test-match state for <cast exp>
  }
,
{ // state 548
7,694, // ID
15,171, // <type>
18,289, // `void
27,484, // `int
28,669, // `boolean
82,275, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,415, // letter128
103,366, // {199..218 231..250}
104,366, // {193..198 225..230}
116,483, // "#"
  }
,
{ // state 549
0x80000000|480, // match move
0x80000000|364, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 550
33,273, // `[
111,172, // "["
  }
,
{ // state 551
21,368, // `{
124,654, // "{"
  }
,
{ // state 552
7,384, // ID
19,365, // `(
37,653, // <call exp>
52,100, // <exp5>
57,41, // `+
58,130, // <exp6>
59,296, // `-
61,243, // <exp7>
65,425, // <unary exp>
66,361, // <exp8>
67,181, // `!
68,189, // INTLIT
69,317, // STRINGLIT
70,409, // CHARLIT
71,529, // `false
72,270, // `this
73,284, // `true
74,476, // `null
76,735, // `new
80,36, // `super
82,539, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,67, // letter128
103,307, // {199..218 231..250}
104,307, // {193..198 225..230}
106,314, // {"1".."9"}
107,586, // "0"
108,640, // digit128
109,2, // {176..185}
112,390, // "-"
116,192, // "#"
127,343, // "("
128,691, // "+"
132,292, // "@"
135,708, // "!"
136,43, // "'"
137,225, // '"'
  }
,
{ // state 553
0x80000000|55, // match move
0x80000000|418, // no-match move
0x80000000|166, // NT-test-match state for <cast exp>
  }
,
{ // state 554
7,694, // ID
15,238, // <type>
27,484, // `int
28,669, // `boolean
82,275, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,415, // letter128
103,366, // {199..218 231..250}
104,366, // {193..198 225..230}
116,488, // "#"
  }
,
{ // state 555
11,213, // $$0
21,468, // `{
124,654, // "{"
  }
,
{ // state 556
0x80000000|696, // match move
0x80000000|498, // no-match move
0x80000000|166, // NT-test-match state for <cast exp>
  }
,
{ // state 557
51,187, // `<
53,452, // `>
54,204, // `instanceof
55,641, // `<=
56,405, // `>=
113,656, // "<"
116,78, // "#"
123,613, // ">"
132,149, // "@"
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 558
115,199, // " "
133,559, // {10}
142,458, // ws
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 559
157,MIN_REDUCTION+94, // $NT
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 560
2,566, // ws*
157,MIN_REDUCTION+114, // $NT
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 561
42,359, // `=
131,163, // "="
  }
,
{ // state 562
2,287, // ws*
33,MIN_REDUCTION+186, // `[
111,MIN_REDUCTION+186, // "["
115,598, // " "
133,321, // {10}
142,4, // ws
157,MIN_REDUCTION+186, // $NT
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 563
2,587, // ws*
115,199, // " "
133,559, // {10}
142,355, // ws
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 564
16,502, // `;
44,556, // `||
122,357, // ";"
132,11, // "@"
  }
,
{ // state 565
82,214, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,629, // letter128
103,366, // {199..218 231..250}
104,366, // {193..198 225..230}
105,29, // digit
106,424, // {"1".."9"}
107,424, // "0"
108,102, // digit128
109,42, // {176..185}
130,633, // "_"
140,363, // {223}
144,337, // $$1
151,609, // idChar
152,68, // idChar128
  }
,
{ // state 566
0x80000000|492, // match move
0x80000000|520, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 567
19,345, // `(
26,571, // <exp>
35,522, // <stmt>
36,54, // <assign>
37,489, // <call exp>
45,272, // <exp2>
47,350, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
58,130, // <exp6>
61,243, // <exp7>
64,79, // <cast exp>
65,425, // <unary exp>
66,361, // <exp8>
127,343, // "("
  }
,
{ // state 568
157,MIN_REDUCTION+182, // $NT
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 569
7,384, // ID
19,365, // `(
37,653, // <call exp>
52,644, // <exp5>
57,41, // `+
58,130, // <exp6>
59,296, // `-
61,243, // <exp7>
65,425, // <unary exp>
66,361, // <exp8>
67,181, // `!
68,189, // INTLIT
69,317, // STRINGLIT
70,409, // CHARLIT
71,529, // `false
72,270, // `this
73,284, // `true
74,476, // `null
76,735, // `new
80,36, // `super
82,539, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,67, // letter128
103,307, // {199..218 231..250}
104,307, // {193..198 225..230}
106,314, // {"1".."9"}
107,586, // "0"
108,640, // digit128
109,2, // {176..185}
112,390, // "-"
116,192, // "#"
127,343, // "("
128,691, // "+"
132,292, // "@"
135,708, // "!"
136,43, // "'"
137,225, // '"'
  }
,
{ // state 570
105,233, // digit
106,424, // {"1".."9"}
107,424, // "0"
108,402, // digit128
109,2, // {176..185}
146,251, // $$2
  }
,
{ // state 571
42,113, // `=
44,556, // `||
131,163, // "="
132,11, // "@"
  }
,
{ // state 572
157,MIN_REDUCTION+74, // $NT
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 573
157,MIN_REDUCTION+229, // $NT
MIN_REDUCTION+229, // (default reduction)
  }
,
{ // state 574
33,MIN_REDUCTION+227, // `[
111,MIN_REDUCTION+227, // "["
115,598, // " "
133,321, // {10}
142,726, // ws
157,MIN_REDUCTION+227, // $NT
MIN_REDUCTION+227, // (default reduction)
  }
,
{ // state 575
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 576
0x80000000|387, // match move
0x80000000|154, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 577
0x80000000|95, // match move
0x80000000|574, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 578
33,MIN_REDUCTION+233, // `[
111,MIN_REDUCTION+233, // "["
115,598, // " "
133,321, // {10}
142,726, // ws
157,MIN_REDUCTION+233, // $NT
MIN_REDUCTION+233, // (default reduction)
  }
,
{ // state 579
20,211, // `)
44,556, // `||
118,729, // ")"
132,11, // "@"
  }
,
{ // state 580
7,384, // ID
19,365, // `(
26,475, // <exp>
37,653, // <call exp>
45,272, // <exp2>
47,350, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
57,41, // `+
58,130, // <exp6>
59,296, // `-
61,243, // <exp7>
65,425, // <unary exp>
66,361, // <exp8>
67,181, // `!
68,189, // INTLIT
69,317, // STRINGLIT
70,409, // CHARLIT
71,529, // `false
72,270, // `this
73,284, // `true
74,476, // `null
76,735, // `new
80,36, // `super
82,539, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,67, // letter128
103,307, // {199..218 231..250}
104,307, // {193..198 225..230}
106,314, // {"1".."9"}
107,586, // "0"
108,640, // digit128
109,2, // {176..185}
112,390, // "-"
116,192, // "#"
127,343, // "("
128,691, // "+"
132,292, // "@"
135,708, // "!"
136,43, // "'"
137,225, // '"'
  }
,
{ // state 581
MIN_REDUCTION+216, // (default reduction)
  }
,
{ // state 582
157,MIN_REDUCTION+92, // $NT
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 583
157,MIN_REDUCTION+66, // $NT
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 584
0x80000000|429, // match move
0x80000000|611, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 585
115,199, // " "
133,559, // {10}
142,458, // ws
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 586
83,65, // "a"
84,65, // "p"
85,65, // "s"
86,65, // "v"
87,65, // "c"
88,65, // "f"
89,65, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,65, // "i"
91,65, // "l"
92,65, // "o"
93,65, // "r"
94,65, // "u"
95,65, // "x"
96,65, // "b"
97,65, // "e"
98,65, // "h"
99,65, // "n"
100,65, // "t"
101,65, // "w"
104,112, // {193..198 225..230}
106,65, // {"1".."9"}
107,65, // "0"
109,112, // {176..185}
147,700, // hexDigit*
148,411, // $$3
153,140, // hexDigit
154,94, // hexDigit128
  }
,
{ // state 587
115,199, // " "
133,559, // {10}
142,458, // ws
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 588
19,345, // `(
37,653, // <call exp>
61,437, // <exp7>
64,79, // <cast exp>
65,425, // <unary exp>
66,361, // <exp8>
127,343, // "("
  }
,
{ // state 589
157,MIN_REDUCTION+75, // $NT
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 590
0x80000000|196, // match move
0x80000000|380, // no-match move
0x80000000|679, // NT-test-match state for `else
  }
,
{ // state 591
157,MIN_REDUCTION+117, // $NT
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 592
0x80000000|657, // match move
0x80000000|329, // no-match move
0x80000000|679, // NT-test-match state for `else
  }
,
{ // state 593
19,345, // `(
22,675, // <stmt>*
26,571, // <exp>
35,469, // <stmt>
36,54, // <assign>
37,489, // <call exp>
45,272, // <exp2>
47,350, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
58,130, // <exp6>
61,243, // <exp7>
64,79, // <cast exp>
65,425, // <unary exp>
66,361, // <exp8>
127,343, // "("
  }
,
{ // state 594
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 595
99,439, // "n"
  }
,
{ // state 596
37,653, // <call exp>
65,541, // <unary exp>
66,361, // <exp8>
  }
,
{ // state 597
0x80000000|454, // match move
0x80000000|642, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 598
0x80000000|360, // match move
0x80000000|459, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 599
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 600
156,MIN_REDUCTION+0, // $
  }
,
{ // state 601
7,384, // ID
19,365, // `(
37,653, // <call exp>
57,41, // `+
59,296, // `-
61,621, // <exp7>
65,425, // <unary exp>
66,361, // <exp8>
67,181, // `!
68,189, // INTLIT
69,317, // STRINGLIT
70,409, // CHARLIT
71,529, // `false
72,270, // `this
73,284, // `true
74,476, // `null
76,735, // `new
80,36, // `super
82,539, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,67, // letter128
103,307, // {199..218 231..250}
104,307, // {193..198 225..230}
106,314, // {"1".."9"}
107,586, // "0"
108,640, // digit128
109,2, // {176..185}
112,390, // "-"
116,192, // "#"
127,343, // "("
128,691, // "+"
132,292, // "@"
135,708, // "!"
136,43, // "'"
137,225, // '"'
  }
,
{ // state 602
2,444, // ws*
  }
,
{ // state 603
7,230, // ID
15,209, // <type>
16,725, // `;
19,365, // `(
21,527, // `{
22,107, // <stmt>*
25,395, // `return
26,571, // <exp>
27,484, // `int
28,669, // `boolean
35,469, // <stmt>
36,54, // <assign>
37,489, // <call exp>
38,49, // <local var decl>
39,717, // `while
40,147, // `if
43,311, // `break
45,272, // <exp2>
47,350, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
57,41, // `+
58,130, // <exp6>
59,296, // `-
61,243, // <exp7>
65,425, // <unary exp>
66,361, // <exp8>
67,181, // `!
68,189, // INTLIT
69,317, // STRINGLIT
70,409, // CHARLIT
71,529, // `false
72,270, // `this
73,284, // `true
74,476, // `null
76,735, // `new
80,36, // `super
82,539, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,67, // letter128
103,307, // {199..218 231..250}
104,307, // {193..198 225..230}
106,314, // {"1".."9"}
107,586, // "0"
108,640, // digit128
109,2, // {176..185}
112,390, // "-"
116,515, // "#"
122,357, // ";"
124,654, // "{"
127,343, // "("
128,691, // "+"
132,292, // "@"
135,708, // "!"
136,43, // "'"
137,225, // '"'
  }
,
{ // state 604
0x80000000|157, // match move
0x80000000|659, // no-match move
0x80000000|679, // NT-test-match state for `else
  }
,
{ // state 605
0x80000000|684, // match move
0x80000000|627, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 606
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 607
0x80000000|560, // match move
0x80000000|64, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 608
115,199, // " "
133,559, // {10}
142,458, // ws
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 609
MIN_REDUCTION+219, // (default reduction)
  }
,
{ // state 610
19,345, // `(
37,653, // <call exp>
52,100, // <exp5>
58,130, // <exp6>
61,243, // <exp7>
64,79, // <cast exp>
65,425, // <unary exp>
66,361, // <exp8>
127,343, // "("
  }
,
{ // state 611
33,MIN_REDUCTION+192, // `[
111,MIN_REDUCTION+192, // "["
157,MIN_REDUCTION+192, // $NT
MIN_REDUCTION+192, // (default reduction)
  }
};
}
private class Initter3{
public int doInit(int startIdx) {
  for (int i = 0; i < myParseTable.length; i++) {
    parseTable[i+startIdx] = myParseTable[i];
  }
  return myParseTable.length;
}
private final int[][] myParseTable = {
{ // state 612
19,345, // `(
22,628, // <stmt>*
26,571, // <exp>
35,469, // <stmt>
36,54, // <assign>
37,489, // <call exp>
45,272, // <exp2>
47,350, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
58,130, // <exp6>
61,243, // <exp7>
64,79, // <cast exp>
65,425, // <unary exp>
66,361, // <exp8>
127,343, // "("
  }
,
{ // state 613
0x80000000|1, // match move
0x80000000|143, // no-match move
// T-test match for "=":
131,
  }
,
{ // state 614
57,58, // `+
59,235, // `-
112,390, // "-"
128,691, // "+"
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 615
7,384, // ID
19,365, // `(
37,653, // <call exp>
49,451, // <exp4>
52,306, // <exp5>
57,41, // `+
58,130, // <exp6>
59,296, // `-
61,243, // <exp7>
65,425, // <unary exp>
66,361, // <exp8>
67,181, // `!
68,189, // INTLIT
69,317, // STRINGLIT
70,409, // CHARLIT
71,529, // `false
72,270, // `this
73,284, // `true
74,476, // `null
76,735, // `new
80,36, // `super
82,539, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,67, // letter128
103,307, // {199..218 231..250}
104,307, // {193..198 225..230}
106,314, // {"1".."9"}
107,586, // "0"
108,640, // digit128
109,2, // {176..185}
112,390, // "-"
116,192, // "#"
127,343, // "("
128,691, // "+"
132,292, // "@"
135,708, // "!"
136,43, // "'"
137,225, // '"'
  }
,
{ // state 616
2,48, // ws*
115,199, // " "
133,559, // {10}
142,355, // ws
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 617
2,739, // ws*
33,MIN_REDUCTION+190, // `[
111,MIN_REDUCTION+190, // "["
115,598, // " "
133,321, // {10}
142,4, // ws
157,MIN_REDUCTION+190, // $NT
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 618
115,199, // " "
133,559, // {10}
142,458, // ws
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 619
33,MIN_REDUCTION+181, // `[
111,MIN_REDUCTION+181, // "["
157,MIN_REDUCTION+181, // $NT
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 620
115,199, // " "
133,559, // {10}
142,458, // ws
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 621
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 622
MIN_REDUCTION+207, // (default reduction)
  }
,
{ // state 623
MIN_REDUCTION+222, // (default reduction)
  }
,
{ // state 624
7,384, // ID
19,365, // `(
26,408, // <exp>
37,653, // <call exp>
45,272, // <exp2>
47,350, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
57,41, // `+
58,130, // <exp6>
59,296, // `-
61,243, // <exp7>
65,425, // <unary exp>
66,361, // <exp8>
67,181, // `!
68,189, // INTLIT
69,317, // STRINGLIT
70,409, // CHARLIT
71,529, // `false
72,270, // `this
73,284, // `true
74,476, // `null
76,735, // `new
80,36, // `super
82,539, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,67, // letter128
103,307, // {199..218 231..250}
104,307, // {193..198 225..230}
106,314, // {"1".."9"}
107,586, // "0"
108,640, // digit128
109,2, // {176..185}
112,390, // "-"
116,192, // "#"
127,343, // "("
128,691, // "+"
132,292, // "@"
135,708, // "!"
136,43, // "'"
137,225, // '"'
  }
,
{ // state 625
2,412, // ws*
33,MIN_REDUCTION+180, // `[
111,MIN_REDUCTION+180, // "["
115,598, // " "
133,321, // {10}
142,4, // ws
157,MIN_REDUCTION+180, // $NT
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 626
2,577, // ws*
157,MIN_REDUCTION+228, // $NT
MIN_REDUCTION+228, // (default reduction)
  }
,
{ // state 627
33,MIN_REDUCTION+187, // `[
111,MIN_REDUCTION+187, // "["
157,MIN_REDUCTION+187, // $NT
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 628
0x80000000|567, // match move
0x80000000|84, // no-match move
0x80000000|166, // NT-test-match state for <cast exp>
  }
,
{ // state 629
MIN_REDUCTION+198, // (default reduction)
  }
,
{ // state 630
33,MIN_REDUCTION+198, // `[
111,MIN_REDUCTION+198, // "["
157,MIN_REDUCTION+198, // $NT
MIN_REDUCTION+198, // (default reduction)
  }
,
{ // state 631
7,MIN_REDUCTION+20, // ID
19,733, // `(
33,MIN_REDUCTION+66, // `[
83,MIN_REDUCTION+20, // "a"
84,MIN_REDUCTION+20, // "p"
85,MIN_REDUCTION+20, // "s"
86,MIN_REDUCTION+20, // "v"
87,MIN_REDUCTION+20, // "c"
88,MIN_REDUCTION+20, // "f"
89,MIN_REDUCTION+20, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,MIN_REDUCTION+20, // "i"
91,MIN_REDUCTION+20, // "l"
92,MIN_REDUCTION+20, // "o"
93,MIN_REDUCTION+20, // "r"
94,MIN_REDUCTION+20, // "u"
95,MIN_REDUCTION+20, // "x"
96,MIN_REDUCTION+20, // "b"
97,MIN_REDUCTION+20, // "e"
98,MIN_REDUCTION+20, // "h"
99,MIN_REDUCTION+20, // "n"
100,MIN_REDUCTION+20, // "t"
101,MIN_REDUCTION+20, // "w"
103,MIN_REDUCTION+20, // {199..218 231..250}
104,MIN_REDUCTION+20, // {193..198 225..230}
111,MIN_REDUCTION+66, // "["
127,343, // "("
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 632
0x80000000|414, // match move
0x80000000|601, // no-match move
0x80000000|166, // NT-test-match state for <cast exp>
  }
,
{ // state 633
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 634
19,710, // `(
127,343, // "("
  }
,
{ // state 635
37,653, // <call exp>
66,37, // <exp8>
  }
,
{ // state 636
2,145, // ws*
33,MIN_REDUCTION+116, // `[
111,MIN_REDUCTION+116, // "["
115,598, // " "
133,321, // {10}
142,4, // ws
157,MIN_REDUCTION+116, // $NT
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 637
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 638
33,MIN_REDUCTION+210, // `[
111,MIN_REDUCTION+210, // "["
157,MIN_REDUCTION+210, // $NT
MIN_REDUCTION+210, // (default reduction)
  }
,
{ // state 639
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 640
0x80000000|310, // match move
0x80000000|562, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 641
0x80000000|610, // match move
0x80000000|552, // no-match move
0x80000000|166, // NT-test-match state for <cast exp>
  }
,
{ // state 642
33,MIN_REDUCTION+91, // `[
111,MIN_REDUCTION+91, // "["
157,MIN_REDUCTION+91, // $NT
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 643
33,MIN_REDUCTION+76, // `[
111,MIN_REDUCTION+76, // "["
157,MIN_REDUCTION+76, // $NT
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 644
57,58, // `+
59,235, // `-
112,390, // "-"
128,691, // "+"
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 645
0x80000000|139, // match move
0x80000000|693, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 646
2,324, // ws*
115,199, // " "
133,559, // {10}
142,355, // ws
157,MIN_REDUCTION+160, // $NT
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 647
7,384, // ID
19,365, // `(
37,653, // <call exp>
57,41, // `+
59,296, // `-
61,255, // <exp7>
65,425, // <unary exp>
66,361, // <exp8>
67,181, // `!
68,189, // INTLIT
69,317, // STRINGLIT
70,409, // CHARLIT
71,529, // `false
72,270, // `this
73,284, // `true
74,476, // `null
76,735, // `new
80,36, // `super
82,539, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,67, // letter128
103,307, // {199..218 231..250}
104,307, // {193..198 225..230}
106,314, // {"1".."9"}
107,586, // "0"
108,640, // digit128
109,2, // {176..185}
112,390, // "-"
116,192, // "#"
127,343, // "("
128,691, // "+"
132,292, // "@"
135,708, // "!"
136,43, // "'"
137,225, // '"'
  }
,
{ // state 648
7,230, // ID
15,209, // <type>
16,725, // `;
19,365, // `(
21,527, // `{
22,675, // <stmt>*
23,193, // `}
26,571, // <exp>
27,484, // `int
28,669, // `boolean
35,469, // <stmt>
36,54, // <assign>
37,489, // <call exp>
38,49, // <local var decl>
39,717, // `while
40,147, // `if
43,311, // `break
45,272, // <exp2>
47,350, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
57,41, // `+
58,130, // <exp6>
59,296, // `-
61,243, // <exp7>
65,425, // <unary exp>
66,361, // <exp8>
67,181, // `!
68,189, // INTLIT
69,317, // STRINGLIT
70,409, // CHARLIT
71,529, // `false
72,270, // `this
73,284, // `true
74,476, // `null
76,735, // `new
80,36, // `super
82,539, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,67, // letter128
103,307, // {199..218 231..250}
104,307, // {193..198 225..230}
106,314, // {"1".."9"}
107,586, // "0"
108,640, // digit128
109,2, // {176..185}
112,390, // "-"
116,692, // "#"
122,357, // ";"
124,654, // "{"
127,343, // "("
128,691, // "+"
132,292, // "@"
134,82, // "}"
135,708, // "!"
136,43, // "'"
137,225, // '"'
  }
,
{ // state 649
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 650
0x80000000|56, // match move
0x80000000|266, // no-match move
0x80000000|679, // NT-test-match state for `else
  }
,
{ // state 651
92,666, // "o"
  }
,
{ // state 652
16,315, // `;
122,697, // ";"
  }
,
{ // state 653
0x80000000|134, // match move
0x80000000|491, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 654
2,377, // ws*
115,199, // " "
133,559, // {10}
142,355, // ws
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 655
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 656
2,620, // ws*
115,199, // " "
133,559, // {10}
142,355, // ws
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 657
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 658
0x80000000|218, // match move
0x80000000|456, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 659
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 660
157,MIN_REDUCTION+69, // $NT
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 661
0x80000000|335, // match move
0x80000000|263, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 662
2,87, // ws*
115,199, // " "
133,559, // {10}
142,355, // ws
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 663
7,230, // ID
15,209, // <type>
16,725, // `;
19,365, // `(
21,527, // `{
22,142, // <stmt>*
23,180, // `}
26,571, // <exp>
27,484, // `int
28,669, // `boolean
35,469, // <stmt>
36,54, // <assign>
37,489, // <call exp>
38,49, // <local var decl>
39,717, // `while
40,147, // `if
43,311, // `break
45,272, // <exp2>
47,350, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
57,41, // `+
58,130, // <exp6>
59,296, // `-
61,243, // <exp7>
65,425, // <unary exp>
66,361, // <exp8>
67,181, // `!
68,189, // INTLIT
69,317, // STRINGLIT
70,409, // CHARLIT
71,529, // `false
72,270, // `this
73,284, // `true
74,476, // `null
76,735, // `new
80,36, // `super
82,539, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,67, // letter128
103,307, // {199..218 231..250}
104,307, // {193..198 225..230}
106,314, // {"1".."9"}
107,586, // "0"
108,640, // digit128
109,2, // {176..185}
112,390, // "-"
116,692, // "#"
122,357, // ";"
124,654, // "{"
127,343, // "("
128,691, // "+"
132,292, // "@"
134,662, // "}"
135,708, // "!"
136,43, // "'"
137,225, // '"'
  }
,
{ // state 664
157,MIN_REDUCTION+202, // $NT
MIN_REDUCTION+202, // (default reduction)
  }
,
{ // state 665
0x80000000|106, // match move
0x80000000|132, // no-match move
0x80000000|166, // NT-test-match state for <cast exp>
  }
,
{ // state 666
2,535, // ws*
115,199, // " "
133,559, // {10}
142,355, // ws
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 667
0x80000000|612, // match move
0x80000000|15, // no-match move
0x80000000|166, // NT-test-match state for <cast exp>
  }
,
{ // state 668
0x80000000|591, // match move
0x80000000|88, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 669
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 670
157,MIN_REDUCTION+67, // $NT
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 671
7,384, // ID
19,365, // `(
37,653, // <call exp>
57,41, // `+
58,25, // <exp6>
59,296, // `-
61,243, // <exp7>
65,425, // <unary exp>
66,361, // <exp8>
67,181, // `!
68,189, // INTLIT
69,317, // STRINGLIT
70,409, // CHARLIT
71,529, // `false
72,270, // `this
73,284, // `true
74,476, // `null
76,735, // `new
80,36, // `super
82,539, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,67, // letter128
103,307, // {199..218 231..250}
104,307, // {193..198 225..230}
106,314, // {"1".."9"}
107,586, // "0"
108,640, // digit128
109,2, // {176..185}
112,390, // "-"
116,192, // "#"
127,343, // "("
128,691, // "+"
132,292, // "@"
135,708, // "!"
136,43, // "'"
137,225, // '"'
  }
,
{ // state 672
7,384, // ID
19,365, // `(
26,579, // <exp>
37,653, // <call exp>
45,272, // <exp2>
47,350, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
57,41, // `+
58,130, // <exp6>
59,296, // `-
61,243, // <exp7>
65,425, // <unary exp>
66,361, // <exp8>
67,181, // `!
68,189, // INTLIT
69,317, // STRINGLIT
70,409, // CHARLIT
71,529, // `false
72,270, // `this
73,284, // `true
74,476, // `null
76,735, // `new
80,36, // `super
82,539, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,67, // letter128
103,307, // {199..218 231..250}
104,307, // {193..198 225..230}
106,314, // {"1".."9"}
107,586, // "0"
108,640, // digit128
109,2, // {176..185}
112,390, // "-"
116,192, // "#"
127,343, // "("
128,691, // "+"
132,292, // "@"
135,708, // "!"
136,43, // "'"
137,225, // '"'
  }
,
{ // state 673
33,MIN_REDUCTION+77, // `[
111,MIN_REDUCTION+77, // "["
157,MIN_REDUCTION+77, // $NT
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 674
MIN_REDUCTION+223, // (default reduction)
  }
,
{ // state 675
0x80000000|567, // match move
0x80000000|108, // no-match move
0x80000000|166, // NT-test-match state for <cast exp>
  }
,
{ // state 676
2,658, // ws*
157,MIN_REDUCTION+144, // $NT
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 677
19,224, // `(
127,343, // "("
  }
,
{ // state 678
2,566, // ws*
  }
,
{ // state 679
116,718, // "#"
  }
,
{ // state 680
0x80000000|298, // match move
0x80000000|9, // no-match move
0x80000000|166, // NT-test-match state for <cast exp>
  }
,
{ // state 681
20,239, // `)
118,135, // ")"
  }
,
{ // state 682
7,230, // ID
15,209, // <type>
16,725, // `;
19,365, // `(
21,527, // `{
26,571, // <exp>
27,484, // `int
28,669, // `boolean
35,432, // <stmt>
36,54, // <assign>
37,489, // <call exp>
38,49, // <local var decl>
39,717, // `while
40,147, // `if
43,311, // `break
45,272, // <exp2>
47,350, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
57,41, // `+
58,130, // <exp6>
59,296, // `-
61,243, // <exp7>
65,425, // <unary exp>
66,361, // <exp8>
67,181, // `!
68,189, // INTLIT
69,317, // STRINGLIT
70,409, // CHARLIT
71,529, // `false
72,270, // `this
73,284, // `true
74,476, // `null
76,735, // `new
80,36, // `super
82,539, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,67, // letter128
103,307, // {199..218 231..250}
104,307, // {193..198 225..230}
106,314, // {"1".."9"}
107,586, // "0"
108,640, // digit128
109,2, // {176..185}
112,390, // "-"
116,692, // "#"
122,357, // ";"
124,654, // "{"
127,343, // "("
128,691, // "+"
132,292, // "@"
135,708, // "!"
136,43, // "'"
137,225, // '"'
  }
,
{ // state 683
7,230, // ID
15,209, // <type>
16,725, // `;
19,365, // `(
21,527, // `{
23,531, // `}
26,571, // <exp>
27,484, // `int
28,669, // `boolean
35,522, // <stmt>
36,54, // <assign>
37,489, // <call exp>
38,49, // <local var decl>
39,717, // `while
40,147, // `if
43,311, // `break
45,272, // <exp2>
47,350, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
57,41, // `+
58,130, // <exp6>
59,296, // `-
61,243, // <exp7>
65,425, // <unary exp>
66,361, // <exp8>
67,181, // `!
68,189, // INTLIT
69,317, // STRINGLIT
70,409, // CHARLIT
71,529, // `false
72,270, // `this
73,284, // `true
74,476, // `null
76,735, // `new
80,36, // `super
82,539, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,67, // letter128
103,307, // {199..218 231..250}
104,307, // {193..198 225..230}
106,314, // {"1".."9"}
107,586, // "0"
108,640, // digit128
109,2, // {176..185}
112,390, // "-"
116,692, // "#"
122,357, // ";"
124,654, // "{"
127,343, // "("
128,691, // "+"
132,292, // "@"
134,662, // "}"
135,708, // "!"
136,43, // "'"
137,225, // '"'
  }
,
{ // state 684
157,MIN_REDUCTION+187, // $NT
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 685
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 686
19,554, // `(
20,117, // `)
24,348, // <formal list>
118,729, // ")"
127,343, // "("
  }
,
{ // state 687
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 688
8,623, // <class decl>
9,352, // `class
116,370, // "#"
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 689
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 690
20,17, // `)
44,556, // `||
118,729, // ")"
132,11, // "@"
  }
,
{ // state 691
2,736, // ws*
115,199, // " "
133,559, // {10}
142,355, // ws
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 692
85,51, // "s"
88,208, // "f"
90,347, // "i"
96,705, // "b"
99,338, // "n"
100,60, // "t"
101,97, // "w"
128,616, // "+"
  }
,
{ // state 693
2,514, // ws*
33,MIN_REDUCTION+194, // `[
111,MIN_REDUCTION+194, // "["
115,598, // " "
133,321, // {10}
142,4, // ws
157,MIN_REDUCTION+194, // $NT
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 694
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 695
0x80000000|453, // match move
0x80000000|647, // no-match move
0x80000000|166, // NT-test-match state for <cast exp>
  }
,
{ // state 696
19,345, // `(
37,653, // <call exp>
45,252, // <exp2>
47,350, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
58,130, // <exp6>
61,243, // <exp7>
64,79, // <cast exp>
65,425, // <unary exp>
66,361, // <exp8>
127,343, // "("
  }
,
{ // state 697
0x80000000|420, // match move
0x80000000|280, // no-match move
0x80000000|679, // NT-test-match state for `else
  }
,
{ // state 698
2,173, // ws*
  }
,
{ // state 699
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 700
83,65, // "a"
84,65, // "p"
85,65, // "s"
86,65, // "v"
87,65, // "c"
88,65, // "f"
89,65, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,65, // "i"
91,65, // "l"
92,65, // "o"
93,65, // "r"
94,65, // "u"
95,65, // "x"
96,65, // "b"
97,65, // "e"
98,65, // "h"
99,65, // "n"
100,65, // "t"
101,65, // "w"
104,112, // {193..198 225..230}
106,65, // {"1".."9"}
107,65, // "0"
109,112, // {176..185}
148,605, // $$3
153,464, // hexDigit
154,94, // hexDigit128
  }
,
{ // state 701
0x80000000|588, // match move
0x80000000|282, // no-match move
0x80000000|166, // NT-test-match state for <cast exp>
  }
,
{ // state 702
7,384, // ID
19,365, // `(
37,653, // <call exp>
49,205, // <exp4>
52,306, // <exp5>
57,41, // `+
58,130, // <exp6>
59,296, // `-
61,243, // <exp7>
65,425, // <unary exp>
66,361, // <exp8>
67,181, // `!
68,189, // INTLIT
69,317, // STRINGLIT
70,409, // CHARLIT
71,529, // `false
72,270, // `this
73,284, // `true
74,476, // `null
76,735, // `new
80,36, // `super
82,539, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,67, // letter128
103,307, // {199..218 231..250}
104,307, // {193..198 225..230}
106,314, // {"1".."9"}
107,586, // "0"
108,640, // digit128
109,2, // {176..185}
112,390, // "-"
116,192, // "#"
127,343, // "("
128,691, // "+"
132,292, // "@"
135,708, // "!"
136,43, // "'"
137,225, // '"'
  }
,
{ // state 703
33,MIN_REDUCTION+193, // `[
111,MIN_REDUCTION+193, // "["
115,598, // " "
133,321, // {10}
142,726, // ws
157,MIN_REDUCTION+193, // $NT
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 704
33,MIN_REDUCTION+71, // `[
111,MIN_REDUCTION+71, // "["
157,MIN_REDUCTION+71, // $NT
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 705
92,666, // "o"
93,191, // "r"
  }
,
{ // state 706
MIN_REDUCTION+205, // (default reduction)
  }
,
{ // state 707
115,199, // " "
133,559, // {10}
142,458, // ws
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 708
2,707, // ws*
115,199, // " "
133,559, // {10}
142,355, // ws
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 709
19,345, // `(
37,653, // <call exp>
52,426, // <exp5>
58,130, // <exp6>
61,243, // <exp7>
64,79, // <cast exp>
65,425, // <unary exp>
66,361, // <exp8>
127,343, // "("
  }
,
{ // state 710
20,31, // `)
118,135, // ")"
  }
,
{ // state 711
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 712
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 713
33,381, // `[
75,69, // `.
111,172, // "["
129,61, // "."
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 714
0x80000000|525, // match move
0x80000000|617, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 715
33,MIN_REDUCTION+183, // `[
111,MIN_REDUCTION+183, // "["
157,MIN_REDUCTION+183, // $NT
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 716
0x80000000|731, // match move
0x80000000|682, // no-match move
0x80000000|166, // NT-test-match state for <cast exp>
  }
,
{ // state 717
19,195, // `(
127,343, // "("
  }
,
{ // state 718
97,473, // "e"
  }
,
{ // state 719
0x80000000|465, // match move
0x80000000|537, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 720
7,384, // ID
19,365, // `(
26,150, // <exp>
37,653, // <call exp>
45,272, // <exp2>
47,350, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
57,41, // `+
58,130, // <exp6>
59,296, // `-
61,243, // <exp7>
65,425, // <unary exp>
66,361, // <exp8>
67,181, // `!
68,189, // INTLIT
69,317, // STRINGLIT
70,409, // CHARLIT
71,529, // `false
72,270, // `this
73,284, // `true
74,476, // `null
76,735, // `new
80,36, // `super
82,539, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,67, // letter128
103,307, // {199..218 231..250}
104,307, // {193..198 225..230}
106,314, // {"1".."9"}
107,586, // "0"
108,640, // digit128
109,2, // {176..185}
112,390, // "-"
116,192, // "#"
127,343, // "("
128,691, // "+"
132,292, // "@"
135,708, // "!"
136,43, // "'"
137,225, // '"'
  }
,
{ // state 721
115,199, // " "
133,559, // {10}
142,458, // ws
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 722
115,199, // " "
133,559, // {10}
142,458, // ws
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 723
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 724
33,MIN_REDUCTION+184, // `[
111,MIN_REDUCTION+184, // "["
157,MIN_REDUCTION+184, // $NT
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 725
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 726
0x80000000|26, // match move
0x80000000|89, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 727
3,297, // <program>
4,688, // <class decl>+
8,740, // <class decl>
9,352, // `class
115,199, // " "
116,370, // "#"
133,559, // {10}
142,458, // ws
  }
,
{ // state 728
2,406, // ws*
115,199, // " "
133,559, // {10}
142,355, // ws
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 729
2,24, // ws*
115,199, // " "
133,559, // {10}
142,355, // ws
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 730
0x80000000|303, // match move
0x80000000|13, // no-match move
0x80000000|679, // NT-test-match state for `else
  }
,
{ // state 731
19,345, // `(
26,571, // <exp>
35,432, // <stmt>
36,54, // <assign>
37,489, // <call exp>
45,272, // <exp2>
47,350, // <exp3>
49,557, // <exp4>
52,306, // <exp5>
58,130, // <exp6>
61,243, // <exp7>
64,79, // <cast exp>
65,425, // <unary exp>
66,361, // <exp8>
127,343, // "("
  }
,
{ // state 732
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 733
0x80000000|91, // match move
0x80000000|371, // no-match move
0x80000000|166, // NT-test-match state for <cast exp>
  }
,
{ // state 734
157,MIN_REDUCTION+68, // $NT
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 735
7,634, // ID
82,275, // letter
83,216, // "a"
84,216, // "p"
85,216, // "s"
86,216, // "v"
87,216, // "c"
88,216, // "f"
89,216, // {"A".."Z" "d" "g" "j".."k" "m" "q" "y".."z"}
90,216, // "i"
91,216, // "l"
92,216, // "o"
93,216, // "r"
94,216, // "u"
95,216, // "x"
96,216, // "b"
97,216, // "e"
98,216, // "h"
99,216, // "n"
100,216, // "t"
101,216, // "w"
102,415, // letter128
103,366, // {199..218 231..250}
104,366, // {193..198 225..230}
  }
,
{ // state 736
115,199, // " "
133,559, // {10}
142,458, // ws
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 737
33,MIN_REDUCTION+70, // `[
111,MIN_REDUCTION+70, // "["
157,MIN_REDUCTION+70, // $NT
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 738
2,145, // ws*
157,MIN_REDUCTION+116, // $NT
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 739
0x80000000|133, // match move
0x80000000|250, // no-match move
0x80000000|550, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 740
MIN_REDUCTION+221, // (default reduction)
  }
,
{ // state 741
2,445, // ws*
115,199, // " "
133,559, // {10}
142,355, // ws
MIN_REDUCTION+138, // (default reduction)
  }
,
};
}
public MJGrammarParseTable(MJGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[742][];
  int doneSoFar = 0;
  doneSoFar += new Initter1().doInit(doneSoFar);
  doneSoFar += new Initter2().doInit(doneSoFar);
  doneSoFar += new Initter3().doInit(doneSoFar);
}
public int[] getProdTable() { return prodTable; }
private static int[] prodTable = {
// $$start ::= <start>
(0<<16)+1,
// <start> ::= ws* <program>
(1<<16)+2,
// <start> ::= <program>
(1<<16)+1,
// <program> ::= <class decl>+
(3<<16)+1,
// <extendsID> ::= `extends ID
(5<<16)+2,
// <class decl> ::= `class ID <extendsID>? $$0
(8<<16)+4,
// <class decl> ::= `class ID $$0
(8<<16)+3,
// <decl in class> ::= <method decl>
(12<<16)+1,
// <decl in class> ::= <instVarDecl>
(12<<16)+1,
// <instVarDecl> ::= <type> ID `;
(14<<16)+3,
// <method decl> ::= `public `void ID `( `) `{ <stmt>* `}
(13<<16)+8,
// <method decl> ::= `public `void ID `( `) `{ `}
(13<<16)+7,
// <method decl> ::= `public `void ID `( <formal list> `) `{ <stmt>* `}
(13<<16)+9,
// <method decl> ::= `public `void ID `( <formal list> `) `{ `}
(13<<16)+8,
// <method decl> ::= `public <type> ID `( `) `{ <stmt>* `return <exp> `; `}
(13<<16)+11,
// <method decl> ::= `public <type> ID `( `) `{ `return <exp> `; `}
(13<<16)+10,
// <method decl> ::= `public <type> ID `( <formal list> `) `{ <stmt>* `return <exp> `; `}
(13<<16)+12,
// <method decl> ::= `public <type> ID `( <formal list> `) `{ `return <exp> `; `}
(13<<16)+11,
// <type> ::= `int
(15<<16)+1,
// <type> ::= `boolean
(15<<16)+1,
// <type> ::= ID
(15<<16)+1,
// <type> ::= <type> <empty bracket pair>
(15<<16)+2,
// <listElm> ::= `, <type> ID
(30<<16)+3,
// <formal list> ::= `( <type> ID <listElm>* `)
(24<<16)+5,
// <formal list> ::= `( <type> ID `)
(24<<16)+4,
// <empty bracket pair> ::= `[ `]
(29<<16)+2,
// <stmt> ::= <assign> `;
(35<<16)+2,
// <stmt> ::= <call exp> `;
(35<<16)+2,
// <stmt> ::= `{ <stmt>* `}
(35<<16)+3,
// <stmt> ::= `{ `}
(35<<16)+2,
// <stmt> ::= <local var decl> `;
(35<<16)+2,
// <stmt> ::= `while `( <exp> `) <stmt>
(35<<16)+5,
// <stmt> ::= `if `( <exp> `) <stmt> `else <stmt>
(35<<16)+7,
// <stmt> ::= `if `( <exp> `) <stmt> !`else <stmt>
(35<<16)+6,
// <assign> ::= <exp> `= <exp>
(36<<16)+3,
// <local var decl> ::= <type> ID `= <exp>
(38<<16)+4,
// <stmt> ::= `break `;
(35<<16)+2,
// <stmt> ::= `;
(35<<16)+1,
// <exp> ::= <exp> `|| <exp2>
(26<<16)+3,
// <exp> ::= <exp2>
(26<<16)+1,
// <exp2> ::= <exp2> `&& <exp3>
(45<<16)+3,
// <exp2> ::= <exp3>
(45<<16)+1,
// <exp3> ::= <exp3> `!= <exp4>
(47<<16)+3,
// <exp3> ::= <exp3> `== <exp4>
(47<<16)+3,
// <exp3> ::= <exp4>
(47<<16)+1,
// <exp4> ::= <exp4> `< <exp5>
(49<<16)+3,
// <exp4> ::= <exp4> `> <exp5>
(49<<16)+3,
// <exp4> ::= <exp4> `instanceof ID
(49<<16)+3,
// <exp4> ::= <exp4> `<= <exp5>
(49<<16)+3,
// <exp4> ::= <exp4> `>= <exp5>
(49<<16)+3,
// <exp4> ::= <exp5>
(49<<16)+1,
// <exp5> ::= <exp5> `+ <exp6>
(52<<16)+3,
// <exp5> ::= <exp5> `- <exp6>
(52<<16)+3,
// <exp5> ::= <exp6>
(52<<16)+1,
// <exp6> ::= <exp6> `* <exp7>
(58<<16)+3,
// <exp6> ::= <exp6> `/ <exp7>
(58<<16)+3,
// <exp6> ::= <exp6> `% <exp7>
(58<<16)+3,
// <exp6> ::= <exp7>
(58<<16)+1,
// <exp7> ::= <cast exp>
(61<<16)+1,
// <exp7> ::= <unary exp>
(61<<16)+1,
// <cast exp> ::= `( <type> `) <cast exp>
(64<<16)+4,
// <cast exp> ::= `( <type> `) <exp8>
(64<<16)+4,
// <unary exp> ::= `- <unary exp>
(65<<16)+2,
// <unary exp> ::= `+ <unary exp>
(65<<16)+2,
// <unary exp> ::= `! <unary exp>
(65<<16)+2,
// <unary exp> ::= <exp8>
(65<<16)+1,
// <exp8> ::= ID
(66<<16)+1,
// <exp8> ::= <exp8> !<empty bracket pair> `[ <exp> `]
(66<<16)+4,
// <exp8> ::= INTLIT
(66<<16)+1,
// <exp8> ::= STRINGLIT
(66<<16)+1,
// <exp8> ::= CHARLIT
(66<<16)+1,
// <exp8> ::= `false
(66<<16)+1,
// <exp8> ::= `this
(66<<16)+1,
// <exp8> ::= `true
(66<<16)+1,
// <exp8> ::= `null
(66<<16)+1,
// <exp8> ::= <exp8> `. ID
(66<<16)+3,
// <exp8> ::= `new ID `( `)
(66<<16)+4,
// <exp8> ::= !<cast exp> `( <exp> `)
(66<<16)+3,
// <exp8> ::= <call exp>
(66<<16)+1,
// <call exp> ::= <exp8> `. ID `( <exp list> `)
(37<<16)+6,
// <recurse> ::= `, <exp8>
(78<<16)+2,
// <exp list> ::= <exp8> <recurse>*
(77<<16)+2,
// <exp list> ::= <exp8>
(77<<16)+1,
// <call exp> ::= `super `. ID `( <exp list>? `)
(37<<16)+6,
// <call exp> ::= `super `. ID `( `)
(37<<16)+5,
// <call exp> ::= ID `( <exp list>? `)
(37<<16)+4,
// <call exp> ::= ID `( `)
(37<<16)+3,
// letter ::= {"A".."Z" "a".."z"}
(82<<16)+1,
// letter128 ::= {193..218 225..250}
(102<<16)+1,
// digit ::= {"0".."9"}
(105<<16)+1,
// digit128 ::= {176..185}
(108<<16)+1,
// any ::= {0..127}
(110<<16)+1,
// any128 ::= {128..255}
(139<<16)+1,
// ws ::= " "
(142<<16)+1,
// ws ::= {10}
(142<<16)+1,
// `boolean ::= "#" "b" "o" ws*
(28<<16)+4,
// `boolean ::= "#" "b" "o"
(28<<16)+3,
// `class ::= "#" "c" "l" ws*
(9<<16)+4,
// `class ::= "#" "c" "l"
(9<<16)+3,
// `extends ::= "#" "e" "x" ws*
(6<<16)+4,
// `extends ::= "#" "e" "x"
(6<<16)+3,
// `void ::= "#" "v" "o" ws*
(18<<16)+4,
// `void ::= "#" "v" "o"
(18<<16)+3,
// `int ::= "#" "i" "t" ws*
(27<<16)+4,
// `int ::= "#" "i" "t"
(27<<16)+3,
// `while ::= "#" "w" "h" ws*
(39<<16)+4,
// `while ::= "#" "w" "h"
(39<<16)+3,
// `if ::= "#" "+" ws*
(40<<16)+3,
// `if ::= "#" "+"
(40<<16)+2,
// `else ::= "#" "e" "l" ws*
(41<<16)+4,
// `else ::= "#" "e" "l"
(41<<16)+3,
// `break ::= "#" "b" "r" ws*
(43<<16)+4,
// `break ::= "#" "b" "r"
(43<<16)+3,
// `this ::= "#" "t" "h" ws*
(72<<16)+4,
// `this ::= "#" "t" "h"
(72<<16)+3,
// `false ::= "#" "f" "a" ws*
(71<<16)+4,
// `false ::= "#" "f" "a"
(71<<16)+3,
// `true ::= "#" "t" "r" ws*
(73<<16)+4,
// `true ::= "#" "t" "r"
(73<<16)+3,
// `super ::= "#" "s" "u" ws*
(80<<16)+4,
// `super ::= "#" "s" "u"
(80<<16)+3,
// `null ::= "#" "n" "u" ws*
(74<<16)+4,
// `null ::= "#" "n" "u"
(74<<16)+3,
// `return ::= "#" "r" "e" ws*
(25<<16)+4,
// `return ::= "#" "r" "e"
(25<<16)+3,
// `instanceof ::= "#" "i" "n" ws*
(54<<16)+4,
// `instanceof ::= "#" "i" "n"
(54<<16)+3,
// `new ::= "#" "n" "e" ws*
(76<<16)+4,
// `new ::= "#" "n" "e"
(76<<16)+3,
// `public ::= "#" "p" "u" ws*
(17<<16)+4,
// `public ::= "#" "p" "u"
(17<<16)+3,
// `! ::= "!" ws*
(67<<16)+2,
// `! ::= "!"
(67<<16)+1,
// `!= ::= "@" "!" ws*
(48<<16)+3,
// `!= ::= "@" "!"
(48<<16)+2,
// `% ::= "%" ws*
(63<<16)+2,
// `% ::= "%"
(63<<16)+1,
// `&& ::= "@" "&" ws*
(46<<16)+3,
// `&& ::= "@" "&"
(46<<16)+2,
// `* ::= "*" ws*
(60<<16)+2,
// `* ::= "*"
(60<<16)+1,
// `( ::= "(" ws*
(19<<16)+2,
// `( ::= "("
(19<<16)+1,
// `) ::= ")" ws*
(20<<16)+2,
// `) ::= ")"
(20<<16)+1,
// `{ ::= "{" ws*
(21<<16)+2,
// `{ ::= "{"
(21<<16)+1,
// `} ::= "}" ws*
(23<<16)+2,
// `} ::= "}"
(23<<16)+1,
// `- ::= "-" ws*
(59<<16)+2,
// `- ::= "-"
(59<<16)+1,
// `+ ::= "+" ws*
(57<<16)+2,
// `+ ::= "+"
(57<<16)+1,
// `= ::= "=" ws*
(42<<16)+2,
// `= ::= "="
(42<<16)+1,
// `== ::= "@" "=" ws*
(50<<16)+3,
// `== ::= "@" "="
(50<<16)+2,
// `[ ::= "[" ws*
(33<<16)+2,
// `[ ::= "["
(33<<16)+1,
// `] ::= "]" ws*
(34<<16)+2,
// `] ::= "]"
(34<<16)+1,
// `|| ::= "@" "|" ws*
(44<<16)+3,
// `|| ::= "@" "|"
(44<<16)+2,
// `< ::= "<" ws*
(51<<16)+2,
// `< ::= "<"
(51<<16)+1,
// `<= ::= "@" "<" ws*
(55<<16)+3,
// `<= ::= "@" "<"
(55<<16)+2,
// `, ::= "," ws*
(31<<16)+2,
// `, ::= ","
(31<<16)+1,
// `> ::= ">" !"=" ws*
(53<<16)+2,
// `> ::= ">" !"="
(53<<16)+1,
// `>= ::= "@" ">" ws*
(56<<16)+3,
// `>= ::= "@" ">"
(56<<16)+2,
// `. ::= "." ws*
(75<<16)+2,
// `. ::= "."
(75<<16)+1,
// `; ::= ";" ws*
(16<<16)+2,
// `; ::= ";"
(16<<16)+1,
// `/ ::= "/" ws*
(62<<16)+2,
// `/ ::= "/"
(62<<16)+1,
// ID ::= letter128 ws*
(7<<16)+2,
// ID ::= letter128
(7<<16)+1,
// ID ::= letter idChar* $$1
(7<<16)+3,
// ID ::= letter $$1
(7<<16)+2,
// INTLIT ::= {"1".."9"} digit* $$2
(68<<16)+3,
// INTLIT ::= {"1".."9"} $$2
(68<<16)+2,
// INTLIT ::= digit128 ws*
(68<<16)+2,
// INTLIT ::= digit128
(68<<16)+1,
// INTLIT ::= "0" hexDigit* $$3
(68<<16)+3,
// INTLIT ::= "0" $$3
(68<<16)+2,
// STRINGLIT ::= "@" '"' ws*
(69<<16)+3,
// STRINGLIT ::= "@" '"'
(69<<16)+2,
// STRINGLIT ::= '"' any* $$4
(69<<16)+3,
// STRINGLIT ::= '"' $$4
(69<<16)+2,
// CHARLIT ::= "'" any ws*
(70<<16)+3,
// CHARLIT ::= "'" any
(70<<16)+2,
// idChar ::= letter
(151<<16)+1,
// idChar ::= digit
(151<<16)+1,
// idChar ::= "_"
(151<<16)+1,
// idChar128 ::= letter128
(152<<16)+1,
// idChar128 ::= digit128
(152<<16)+1,
// idChar128 ::= {223}
(152<<16)+1,
// hexDigit ::= {"0".."9" "A".."Z" "a".."z"}
(153<<16)+1,
// hexDigit128 ::= {176..185 193..198 225..230}
(154<<16)+1,
// <stmt>* ::= <stmt>* <stmt>
(22<<16)+2,
// <stmt>* ::= <stmt>
(22<<16)+1,
// <decl in class>* ::= <decl in class>* <decl in class>
(155<<16)+2,
// <decl in class>* ::= <decl in class>
(155<<16)+1,
// any* ::= any* any
(149<<16)+2,
// any* ::= any
(149<<16)+1,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// <extendsID>? ::= <extendsID>
(10<<16)+1,
// digit* ::= digit* digit
(145<<16)+2,
// digit* ::= digit
(145<<16)+1,
// <exp list>? ::= <exp list>
(81<<16)+1,
// <listElm>* ::= <listElm>* <listElm>
(32<<16)+2,
// <listElm>* ::= <listElm>
(32<<16)+1,
// hexDigit* ::= hexDigit* hexDigit
(147<<16)+2,
// hexDigit* ::= hexDigit
(147<<16)+1,
// idChar* ::= idChar* idChar
(143<<16)+2,
// idChar* ::= idChar
(143<<16)+1,
// <class decl>+ ::= <class decl>
(4<<16)+1,
// <class decl>+ ::= <class decl>+ <class decl>
(4<<16)+2,
// <recurse>* ::= <recurse>* <recurse>
(79<<16)+2,
// <recurse>* ::= <recurse>
(79<<16)+1,
// $$0 ::= `{ <decl in class>* `}
(11<<16)+3,
// $$0 ::= `{ `}
(11<<16)+2,
// $$1 ::= idChar128 ws*
(144<<16)+2,
// $$1 ::= idChar128
(144<<16)+1,
// $$2 ::= digit128 ws*
(146<<16)+2,
// $$2 ::= digit128
(146<<16)+1,
// $$3 ::= hexDigit128 ws*
(148<<16)+2,
// $$3 ::= hexDigit128
(148<<16)+1,
// $$4 ::= any128 ws*
(150<<16)+2,
// $$4 ::= any128
(150<<16)+1,
};
public int[] getCharMapTable() { return charMapTable; }
private static int[] charMapTable = {
125, // 0
125, // 1
125, // 2
125, // 3
125, // 4
125, // 5
125, // 6
125, // 7
125, // 8
125, // 9
133, // 10
125, // 11
125, // 12
125, // 13
125, // 14
125, // 15
125, // 16
125, // 17
125, // 18
125, // 19
125, // 20
125, // 21
125, // 22
125, // 23
125, // 24
125, // 25
125, // 26
125, // 27
125, // 28
125, // 29
125, // 30
125, // 31
115, // " "
135, // "!"
137, // '"'
116, // "#"
125, // "$"
126, // "%"
117, // "&"
136, // "'"
127, // "("
118, // ")"
138, // "*"
128, // "+"
119, // ","
112, // "-"
129, // "."
121, // "/"
107, // "0"
106, // "1"
106, // "2"
106, // "3"
106, // "4"
106, // "5"
106, // "6"
106, // "7"
106, // "8"
106, // "9"
125, // ":"
122, // ";"
113, // "<"
131, // "="
123, // ">"
125, // "?"
132, // "@"
89, // "A"
89, // "B"
89, // "C"
89, // "D"
89, // "E"
89, // "F"
89, // "G"
89, // "H"
89, // "I"
89, // "J"
89, // "K"
89, // "L"
89, // "M"
89, // "N"
89, // "O"
89, // "P"
89, // "Q"
89, // "R"
89, // "S"
89, // "T"
89, // "U"
89, // "V"
89, // "W"
89, // "X"
89, // "Y"
89, // "Z"
111, // "["
125, // "\"
120, // "]"
125, // "^"
130, // "_"
125, // "`"
83, // "a"
96, // "b"
87, // "c"
89, // "d"
97, // "e"
88, // "f"
89, // "g"
98, // "h"
90, // "i"
89, // "j"
89, // "k"
91, // "l"
89, // "m"
99, // "n"
92, // "o"
84, // "p"
89, // "q"
93, // "r"
85, // "s"
100, // "t"
94, // "u"
86, // "v"
101, // "w"
95, // "x"
89, // "y"
89, // "z"
124, // "{"
114, // "|"
134, // "}"
125, // "~"
125, // 127
141, // 128
141, // 129
141, // 130
141, // 131
141, // 132
141, // 133
141, // 134
141, // 135
141, // 136
141, // 137
141, // 138
141, // 139
141, // 140
141, // 141
141, // 142
141, // 143
141, // 144
141, // 145
141, // 146
141, // 147
141, // 148
141, // 149
141, // 150
141, // 151
141, // 152
141, // 153
141, // 154
141, // 155
141, // 156
141, // 157
141, // 158
141, // 159
141, // 160
141, // 161
141, // 162
141, // 163
141, // 164
141, // 165
141, // 166
141, // 167
141, // 168
141, // 169
141, // 170
141, // 171
141, // 172
141, // 173
141, // 174
141, // 175
109, // 176
109, // 177
109, // 178
109, // 179
109, // 180
109, // 181
109, // 182
109, // 183
109, // 184
109, // 185
141, // 186
141, // 187
141, // 188
141, // 189
141, // 190
141, // 191
141, // 192
104, // 193
104, // 194
104, // 195
104, // 196
104, // 197
104, // 198
103, // 199
103, // 200
103, // 201
103, // 202
103, // 203
103, // 204
103, // 205
103, // 206
103, // 207
103, // 208
103, // 209
103, // 210
103, // 211
103, // 212
103, // 213
103, // 214
103, // 215
103, // 216
103, // 217
103, // 218
141, // 219
141, // 220
141, // 221
141, // 222
140, // 223
141, // 224
104, // 225
104, // 226
104, // 227
104, // 228
104, // 229
104, // 230
103, // 231
103, // 232
103, // 233
103, // 234
103, // 235
103, // 236
103, // 237
103, // 238
103, // 239
103, // 240
103, // 241
103, // 242
103, // 243
103, // 244
103, // 245
103, // 246
103, // 247
103, // 248
103, // 249
103, // 250
141, // 251
141, // 252
141, // 253
141, // 254
141, // 255
};
public String[] getActionProdNameTable() { return actionProdNameTable; }
private String[] actionProdNameTable = {
"", // 0
"<start> ::= ws* <program>", // 1
"<start> ::= ws* <program>", // 2
"<program> ::= # <class decl>+", // 3
"<extendsID> ::= `extends ID", // 4
"<class decl> ::= `class # ID <extendsID>? `{ <decl in class>* `}", // 5
"<class decl> ::= `class # ID <extendsID>? `{ <decl in class>* `}", // 6
"<decl in class> ::= <method decl>", // 7
"<decl in class> ::= <instVarDecl>", // 8
"<instVarDecl> ::= <type> # ID `;", // 9
"<method decl> ::= `public `void # ID `( `) `{ <stmt>* `}", // 10
"<method decl> ::= `public `void # ID `( `) `{ <stmt>* `}", // 11
"<method decl> ::= `public `void # ID `( <formal list> `) `{ <stmt>* `}", // 12
"<method decl> ::= `public `void # ID `( <formal list> `) `{ <stmt>* `}", // 13
"<method decl> ::= `public <type> # ID `( `) `{ <stmt>* `return <exp> `; `}", // 14
"<method decl> ::= `public <type> # ID `( `) `{ <stmt>* `return <exp> `; `}", // 15
"<method decl> ::= `public <type> # ID `( <formal list> `) `{ <stmt>* `return <exp> `; `}", // 16
"<method decl> ::= `public <type> # ID `( <formal list> `) `{ <stmt>* `return <exp> `; `}", // 17
"<type> ::= # `int", // 18
"<type> ::= # `boolean", // 19
"<type> ::= # ID", // 20
"<type> ::= # <type> <empty bracket pair>", // 21
"<listElm> ::= `, <type> # ID", // 22
"<formal list> ::= `( <type> # ID <listElm>* `)", // 23
"<formal list> ::= `( <type> # ID <listElm>* `)", // 24
"<empty bracket pair> ::= `[ `]", // 25
"<stmt> ::= <assign> `;", // 26
"<stmt> ::= # <call exp> `;", // 27
"<stmt> ::= # `{ <stmt>* `}", // 28
"<stmt> ::= # `{ <stmt>* `}", // 29
"<stmt> ::= <local var decl> `;", // 30
"<stmt> ::= # `while `( <exp> `) <stmt>", // 31
"<stmt> ::= # `if `( <exp> `) <stmt> `else <stmt>", // 32
"<stmt> ::= # `if `( <exp> `) <stmt> !`else <stmt>", // 33
"<assign> ::= <exp> # `= <exp>", // 34
"<local var decl> ::= <type> # ID `= <exp>", // 35
"<stmt> ::= # `break `;", // 36
"<stmt> ::= # `;", // 37
"<exp> ::= <exp> # `|| <exp2>", // 38
"<exp> ::= <exp2>", // 39
"<exp2> ::= <exp2> # `&& <exp3>", // 40
"<exp2> ::= <exp3>", // 41
"<exp3> ::= <exp3> # `!= <exp4>", // 42
"<exp3> ::= <exp3> # `== <exp4>", // 43
"<exp3> ::= <exp4>", // 44
"<exp4> ::= <exp4> # `< <exp5>", // 45
"<exp4> ::= <exp4> # `> <exp5>", // 46
"<exp4> ::= <exp4> # `instanceof ID", // 47
"<exp4> ::= <exp4> # `<= <exp5>", // 48
"<exp4> ::= <exp4> # `>= <exp5>", // 49
"<exp4> ::= <exp5>", // 50
"<exp5> ::= <exp5> # `+ <exp6>", // 51
"<exp5> ::= <exp5> # `- <exp6>", // 52
"<exp5> ::= <exp6>", // 53
"<exp6> ::= <exp6> # `* <exp7>", // 54
"<exp6> ::= <exp6> # `/ <exp7>", // 55
"<exp6> ::= <exp6> # `% <exp7>", // 56
"<exp6> ::= <exp7>", // 57
"<exp7> ::= <cast exp>", // 58
"<exp7> ::= <unary exp>", // 59
"<cast exp> ::= # `( <type> `) <cast exp>", // 60
"<cast exp> ::= # `( <type> `) <exp8>", // 61
"<unary exp> ::= # `- <unary exp>", // 62
"<unary exp> ::= # `+ <unary exp>", // 63
"<unary exp> ::= # `! <unary exp>", // 64
"<unary exp> ::= <exp8>", // 65
"<exp8> ::= # ID", // 66
"<exp8> ::= <exp8> !<empty bracket pair> # `[ <exp> `]", // 67
"<exp8> ::= # INTLIT", // 68
"<exp8> ::= # STRINGLIT", // 69
"<exp8> ::= # CHARLIT", // 70
"<exp8> ::= # `false", // 71
"<exp8> ::= # `this", // 72
"<exp8> ::= # `true", // 73
"<exp8> ::= # `null", // 74
"<exp8> ::= # <exp8> `. ID", // 75
"<exp8> ::= # `new ID `( `)", // 76
"<exp8> ::= !<cast exp> `( <exp> `)", // 77
"<exp8> ::= <call exp>", // 78
"<call exp> ::= # <exp8> `. ID `( <exp list> `)", // 79
"<recurse> ::= `, <exp8>", // 80
"<exp list> ::= <exp8> <recurse>*", // 81
"<exp list> ::= <exp8> <recurse>*", // 82
"<call exp> ::= # `super `. ID `( <exp list>? `)", // 83
"<call exp> ::= # `super `. ID `( <exp list>? `)", // 84
"<call exp> ::= # ID `( <exp list>? `)", // 85
"<call exp> ::= # ID `( <exp list>? `)", // 86
"letter ::= {\"A\"..\"Z\" \"a\"..\"z\"}", // 87
"letter128 ::= {193..218 225..250}", // 88
"digit ::= {\"0\"..\"9\"}", // 89
"digit128 ::= {176..185}", // 90
"any ::= {0..127}", // 91
"any128 ::= {128..255}", // 92
"ws ::= \" \"", // 93
"ws ::= {10} registerNewline", // 94
"`boolean ::= \"#\" \"b\" \"o\" ws*", // 95
"`boolean ::= \"#\" \"b\" \"o\" ws*", // 96
"`class ::= \"#\" \"c\" \"l\" ws*", // 97
"`class ::= \"#\" \"c\" \"l\" ws*", // 98
"`extends ::= \"#\" \"e\" \"x\" ws*", // 99
"`extends ::= \"#\" \"e\" \"x\" ws*", // 100
"`void ::= \"#\" \"v\" \"o\" ws*", // 101
"`void ::= \"#\" \"v\" \"o\" ws*", // 102
"`int ::= \"#\" \"i\" \"t\" ws*", // 103
"`int ::= \"#\" \"i\" \"t\" ws*", // 104
"`while ::= \"#\" \"w\" \"h\" ws*", // 105
"`while ::= \"#\" \"w\" \"h\" ws*", // 106
"`if ::= \"#\" \"+\" ws*", // 107
"`if ::= \"#\" \"+\" ws*", // 108
"`else ::= \"#\" \"e\" \"l\" ws*", // 109
"`else ::= \"#\" \"e\" \"l\" ws*", // 110
"`break ::= \"#\" \"b\" \"r\" ws*", // 111
"`break ::= \"#\" \"b\" \"r\" ws*", // 112
"`this ::= \"#\" \"t\" \"h\" ws*", // 113
"`this ::= \"#\" \"t\" \"h\" ws*", // 114
"`false ::= \"#\" \"f\" \"a\" ws*", // 115
"`false ::= \"#\" \"f\" \"a\" ws*", // 116
"`true ::= \"#\" \"t\" \"r\" ws*", // 117
"`true ::= \"#\" \"t\" \"r\" ws*", // 118
"`super ::= \"#\" \"s\" \"u\" ws*", // 119
"`super ::= \"#\" \"s\" \"u\" ws*", // 120
"`null ::= \"#\" \"n\" \"u\" ws*", // 121
"`null ::= \"#\" \"n\" \"u\" ws*", // 122
"`return ::= \"#\" \"r\" \"e\" ws*", // 123
"`return ::= \"#\" \"r\" \"e\" ws*", // 124
"`instanceof ::= \"#\" \"i\" \"n\" ws*", // 125
"`instanceof ::= \"#\" \"i\" \"n\" ws*", // 126
"`new ::= \"#\" \"n\" \"e\" ws*", // 127
"`new ::= \"#\" \"n\" \"e\" ws*", // 128
"`public ::= \"#\" \"p\" \"u\" ws*", // 129
"`public ::= \"#\" \"p\" \"u\" ws*", // 130
"`! ::= \"!\" ws*", // 131
"`! ::= \"!\" ws*", // 132
"`!= ::= \"@\" \"!\" ws*", // 133
"`!= ::= \"@\" \"!\" ws*", // 134
"`% ::= \"%\" ws*", // 135
"`% ::= \"%\" ws*", // 136
"`&& ::= \"@\" \"&\" ws*", // 137
"`&& ::= \"@\" \"&\" ws*", // 138
"`* ::= \"*\" ws*", // 139
"`* ::= \"*\" ws*", // 140
"`( ::= \"(\" ws*", // 141
"`( ::= \"(\" ws*", // 142
"`) ::= \")\" ws*", // 143
"`) ::= \")\" ws*", // 144
"`{ ::= \"{\" ws*", // 145
"`{ ::= \"{\" ws*", // 146
"`} ::= \"}\" ws*", // 147
"`} ::= \"}\" ws*", // 148
"`- ::= \"-\" ws*", // 149
"`- ::= \"-\" ws*", // 150
"`+ ::= \"+\" ws*", // 151
"`+ ::= \"+\" ws*", // 152
"`= ::= \"=\" ws*", // 153
"`= ::= \"=\" ws*", // 154
"`== ::= \"@\" \"=\" ws*", // 155
"`== ::= \"@\" \"=\" ws*", // 156
"`[ ::= \"[\" ws*", // 157
"`[ ::= \"[\" ws*", // 158
"`] ::= \"]\" ws*", // 159
"`] ::= \"]\" ws*", // 160
"`|| ::= \"@\" \"|\" ws*", // 161
"`|| ::= \"@\" \"|\" ws*", // 162
"`< ::= \"<\" ws*", // 163
"`< ::= \"<\" ws*", // 164
"`<= ::= \"@\" \"<\" ws*", // 165
"`<= ::= \"@\" \"<\" ws*", // 166
"`, ::= \",\" ws*", // 167
"`, ::= \",\" ws*", // 168
"`> ::= \">\" !\"=\" ws*", // 169
"`> ::= \">\" !\"=\" ws*", // 170
"`>= ::= \"@\" \">\" ws*", // 171
"`>= ::= \"@\" \">\" ws*", // 172
"`. ::= \".\" ws*", // 173
"`. ::= \".\" ws*", // 174
"`; ::= \";\" ws*", // 175
"`; ::= \";\" ws*", // 176
"`/ ::= \"/\" ws*", // 177
"`/ ::= \"/\" ws*", // 178
"ID ::= letter128 ws*", // 179
"ID ::= letter128 ws*", // 180
"ID ::= letter idChar* idChar128 ws*", // 181
"ID ::= letter idChar* idChar128 ws*", // 182
"INTLIT ::= {\"1\"..\"9\"} digit* digit128 ws*", // 183
"INTLIT ::= {\"1\"..\"9\"} digit* digit128 ws*", // 184
"INTLIT ::= digit128 ws*", // 185
"INTLIT ::= digit128 ws*", // 186
"INTLIT ::= \"0\" hexDigit* hexDigit128 ws*", // 187
"INTLIT ::= \"0\" hexDigit* hexDigit128 ws*", // 188
"STRINGLIT ::= \"@\" \'\"\' ws*", // 189
"STRINGLIT ::= \"@\" \'\"\' ws*", // 190
"STRINGLIT ::= \'\"\' any* any128 ws*", // 191
"STRINGLIT ::= \'\"\' any* any128 ws*", // 192
"CHARLIT ::= \"\'\" any ws*", // 193
"CHARLIT ::= \"\'\" any ws*", // 194
"idChar ::= letter", // 195
"idChar ::= digit", // 196
"idChar ::= \"_\"", // 197
"idChar128 ::= letter128", // 198
"idChar128 ::= digit128", // 199
"idChar128 ::= {223}", // 200
"hexDigit ::= {\"0\"..\"9\" \"A\"..\"Z\" \"a\"..\"z\"}", // 201
"hexDigit128 ::= {176..185 193..198 225..230}", // 202
"<stmt>* ::= <stmt>* <stmt>", // 203
"<stmt>* ::= <stmt>* <stmt>", // 204
"<decl in class>* ::= <decl in class>* <decl in class>", // 205
"<decl in class>* ::= <decl in class>* <decl in class>", // 206
"any* ::= any* any", // 207
"any* ::= any* any", // 208
"ws* ::= ws* ws", // 209
"ws* ::= ws* ws", // 210
"<extendsID>? ::= <extendsID>", // 211
"digit* ::= digit* digit", // 212
"digit* ::= digit* digit", // 213
"<exp list>? ::= <exp list>", // 214
"<listElm>* ::= <listElm>* <listElm>", // 215
"<listElm>* ::= <listElm>* <listElm>", // 216
"hexDigit* ::= hexDigit* hexDigit", // 217
"hexDigit* ::= hexDigit* hexDigit", // 218
"idChar* ::= idChar* idChar", // 219
"idChar* ::= idChar* idChar", // 220
"<class decl>+ ::= <class decl>", // 221
"<class decl>+ ::= <class decl>+ <class decl>", // 222
"<recurse>* ::= <recurse>* <recurse>", // 223
"<recurse>* ::= <recurse>* <recurse>", // 224
"", // 225
"", // 226
"", // 227
"", // 228
"", // 229
"", // 230
"", // 231
"", // 232
"", // 233
"", // 234
};
public int[][] getActionTable() { return actionTable; }
private int[][] actionTable = {
    { // 0: $$start ::= <start> @pass
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 1: <start> ::= ws* <program> @topLevel(Program)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((0<<5)|0x5)/*methodCall:0*/,
    },
    { // 2: <start> ::= [ws*] <program> @topLevel(Program)=>
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((0<<5)|0x5)/*methodCall:0*/,
    },
    { // 3: <program> ::= [#] <class decl>+ @createProgram(int,List<ClassDecl>)=>Program
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0x5)/*methodCall:1*/,
    },
    { // 4: <extendsID> ::= `extends ID @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 5: <class decl> ::= `class [#] ID <extendsID>? $$0 @createClassDecl(int,String,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 6: <class decl> ::= `class [#] ID [<extendsID>?] $$0 @createClassDecl(int,String,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 7: <decl in class> ::= <method decl> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 8: <decl in class> ::= <instVarDecl> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 9: <instVarDecl> ::= <type> [#] ID `; @newInstVarDecl(Type,int,String)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 10: <method decl> ::= `public `void [#] ID `( `) `{ <stmt>* `} @createMethodDeclVoid(int,String,List<Statement>)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 11: <method decl> ::= `public `void [#] ID `( `) `{ [<stmt>*] `} @createMethodDeclVoid(int,String,List<Statement>)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 12: <method decl> ::= `public `void [#] ID `( <formal list> `) `{ <stmt>* `} @createMethodDeclVoidFormal(int,String,VarDeclList,List<Statement>)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((5<<5)|0x5)/*methodCall:5*/,
    },
    { // 13: <method decl> ::= `public `void [#] ID `( <formal list> `) `{ [<stmt>*] `} @createMethodDeclVoidFormal(int,String,VarDeclList,List<Statement>)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((5<<5)|0x5)/*methodCall:5*/,
    },
    { // 14: <method decl> ::= `public <type> [#] ID `( `) `{ <stmt>* `return <exp> `; `} @createMethodDeclNonVoid(Type,int,String,List<Statement>,Exp)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x5)/*methodCall:6*/,
    },
    { // 15: <method decl> ::= `public <type> [#] ID `( `) `{ [<stmt>*] `return <exp> `; `} @createMethodDeclNonVoid(Type,int,String,List<Statement>,Exp)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x5)/*methodCall:6*/,
    },
    { // 16: <method decl> ::= `public <type> [#] ID `( <formal list> `) `{ <stmt>* `return <exp> `; `} @createMethodDeclNonVoidWithElements(Type,int,String,VarDeclList,List<Statement>,Exp)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x5)/*methodCall:7*/,
    },
    { // 17: <method decl> ::= `public <type> [#] ID `( <formal list> `) `{ [<stmt>*] `return <exp> `; `} @createMethodDeclNonVoidWithElements(Type,int,String,VarDeclList,List<Statement>,Exp)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x5)/*methodCall:7*/,
    },
    { // 18: <type> ::= [#] `int @intType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((8<<5)|0x5)/*methodCall:8*/,
    },
    { // 19: <type> ::= [#] `boolean @booleanType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((9<<5)|0x5)/*methodCall:9*/,
    },
    { // 20: <type> ::= [#] ID @identifierType(int,String)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((10<<5)|0x5)/*methodCall:10*/,
    },
    { // 21: <type> ::= [#] <type> <empty bracket pair> @newArrayType(int,Type,Object)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 22: <listElm> ::= `, <type> [#] ID @newListElement(Type,int,String)=>VarDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((12<<5)|0x5)/*methodCall:12*/,
    },
    { // 23: <formal list> ::= `( <type> [#] ID <listElm>* `) @newVarDeclList(Type,int,String,List<VarDecl>)=>VarDeclList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 24: <formal list> ::= `( <type> [#] ID [<listElm>*] `) @newVarDeclList(Type,int,String,List<VarDecl>)=>VarDeclList
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 25: <empty bracket pair> ::= `[ `] @null
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x8)/*nullPointer:1*/,
    },
    { // 26: <stmt> ::= <assign> `; @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 27: <stmt> ::= [#] <call exp> `; @newCall(int,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 28: <stmt> ::= [#] `{ <stmt>* `} @newBlock(int,List<Statement>)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 29: <stmt> ::= [#] `{ [<stmt>*] `} @newBlock(int,List<Statement>)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 30: <stmt> ::= <local var decl> `; @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 31: <stmt> ::= [#] `while `( <exp> `) <stmt> @newWhile(int,Exp,Statement)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 32: <stmt> ::= [#] `if `( <exp> `) <stmt> `else <stmt> @newIfElse(int,Exp,Statement,Statement)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 33: <stmt> ::= [#] `if `( <exp> `) <stmt> !`else <stmt> @newIf(int,Exp,Statement,Statement)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 34: <assign> ::= <exp> [#] `= <exp> @assign(Exp,int,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 35: <local var decl> ::= <type> [#] ID `= <exp> @localVarDecl(Type,int,String,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 36: <stmt> ::= [#] `break `; @newBreak(int)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 37: <stmt> ::= [#] `; @newEmptyStatement(int)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 38: <exp> ::= <exp> [#] `|| <exp2> @newOr(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 39: <exp> ::= <exp2> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 40: <exp2> ::= <exp2> [#] `&& <exp3> @newAnd(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 41: <exp2> ::= <exp3> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 42: <exp3> ::= <exp3> [#] `!= <exp4> @newNotEqual(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 43: <exp3> ::= <exp3> [#] `== <exp4> @newEqualEquals(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 44: <exp3> ::= <exp4> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 45: <exp4> ::= <exp4> [#] `< <exp5> @newLessThan(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 46: <exp4> ::= <exp4> [#] `> <exp5> @newGreaterThan(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 47: <exp4> ::= <exp4> [#] `instanceof ID @newInstanceOf(Exp,int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
    { // 48: <exp4> ::= <exp4> [#] `<= <exp5> @newLessThanOrEqual(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((30<<5)|0x5)/*methodCall:30*/,
    },
    { // 49: <exp4> ::= <exp4> [#] `>= <exp5> @newGreaterThanOrEqual(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((31<<5)|0x5)/*methodCall:31*/,
    },
    { // 50: <exp4> ::= <exp5> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 51: <exp5> ::= <exp5> [#] `+ <exp6> @newPlus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((32<<5)|0x5)/*methodCall:32*/,
    },
    { // 52: <exp5> ::= <exp5> [#] `- <exp6> @newMinus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((33<<5)|0x5)/*methodCall:33*/,
    },
    { // 53: <exp5> ::= <exp6> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 54: <exp6> ::= <exp6> [#] `* <exp7> @newTimes(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((34<<5)|0x5)/*methodCall:34*/,
    },
    { // 55: <exp6> ::= <exp6> [#] `/ <exp7> @newDivide(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((35<<5)|0x5)/*methodCall:35*/,
    },
    { // 56: <exp6> ::= <exp6> [#] `% <exp7> @newRemainder(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((36<<5)|0x5)/*methodCall:36*/,
    },
    { // 57: <exp6> ::= <exp7> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 58: <exp7> ::= <cast exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 59: <exp7> ::= <unary exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 60: <cast exp> ::= [#] `( <type> `) <cast exp> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((37<<5)|0x5)/*methodCall:37*/,
    },
    { // 61: <cast exp> ::= [#] `( <type> `) <exp8> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((37<<5)|0x5)/*methodCall:37*/,
    },
    { // 62: <unary exp> ::= [#] `- <unary exp> @newUnaryMinus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((38<<5)|0x5)/*methodCall:38*/,
    },
    { // 63: <unary exp> ::= [#] `+ <unary exp> @newUnaryPlus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((39<<5)|0x5)/*methodCall:39*/,
    },
    { // 64: <unary exp> ::= [#] `! <unary exp> @newUnaryNot(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((40<<5)|0x5)/*methodCall:40*/,
    },
    { // 65: <unary exp> ::= <exp8> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 66: <exp8> ::= [#] ID @newIdentfierExp(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((41<<5)|0x5)/*methodCall:41*/,
    },
    { // 67: <exp8> ::= <exp8> !<empty bracket pair> [#] `[ <exp> `] @newArrayLookup(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((42<<5)|0x5)/*methodCall:42*/,
    },
    { // 68: <exp8> ::= [#] INTLIT @newIntegerLiteral(int,int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((43<<5)|0x5)/*methodCall:43*/,
    },
    { // 69: <exp8> ::= [#] STRINGLIT @newStringLiteral(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((44<<5)|0x5)/*methodCall:44*/,
    },
    { // 70: <exp8> ::= [#] CHARLIT @newCharLiteral(int,int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((45<<5)|0x5)/*methodCall:45*/,
    },
    { // 71: <exp8> ::= [#] `false @newFalse(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((46<<5)|0x5)/*methodCall:46*/,
    },
    { // 72: <exp8> ::= [#] `this @newThis(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((47<<5)|0x5)/*methodCall:47*/,
    },
    { // 73: <exp8> ::= [#] `true @newTrue(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((48<<5)|0x5)/*methodCall:48*/,
    },
    { // 74: <exp8> ::= [#] `null @newNull(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((49<<5)|0x5)/*methodCall:49*/,
    },
    { // 75: <exp8> ::= [#] <exp8> `. ID @newInstVarAccess(int,Exp,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((50<<5)|0x5)/*methodCall:50*/,
    },
    { // 76: <exp8> ::= [#] `new ID `( `) @newIdentity(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((51<<5)|0x5)/*methodCall:51*/,
    },
    { // 77: <exp8> ::= !<cast exp> `( <exp> `) @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 78: <exp8> ::= <call exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 79: <call exp> ::= [#] <exp8> `. ID `( <exp list> `) @newCallExp(int,Exp,String,ExpList)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((52<<5)|0x5)/*methodCall:52*/,
    },
    { // 80: <recurse> ::= `, <exp8> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 81: <exp list> ::= <exp8> <recurse>* @newExpList(Exp,List<Exp>)=>ExpList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((53<<5)|0x5)/*methodCall:53*/,
    },
    { // 82: <exp list> ::= <exp8> [<recurse>*] @newExpList(Exp,List<Exp>)=>ExpList
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((53<<5)|0x5)/*methodCall:53*/,
    },
    { // 83: <call exp> ::= [#] `super `. ID `( <exp list>? `) @newSuperMethod(int,String,ExpList)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((54<<5)|0x5)/*methodCall:54*/,
    },
    { // 84: <call exp> ::= [#] `super `. ID `( [<exp list>?] `) @newSuperMethod(int,String,ExpList)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((54<<5)|0x5)/*methodCall:54*/,
    },
    { // 85: <call exp> ::= [#] ID `( <exp list>? `) @newThisMethod(int,String,ExpList)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((55<<5)|0x5)/*methodCall:55*/,
    },
    { // 86: <call exp> ::= [#] ID `( [<exp list>?] `) @newThisMethod(int,String,ExpList)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((55<<5)|0x5)/*methodCall:55*/,
    },
    { // 87: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 88: letter128 ::= {193..218 225..250} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((56<<5)|0x5)/*methodCall:56*/,
    },
    { // 89: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 90: digit128 ::= {176..185} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((56<<5)|0x5)/*methodCall:56*/,
    },
    { // 91: any ::= {0..127} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 92: any128 ::= {128..255} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((56<<5)|0x5)/*methodCall:56*/,
    },
    { // 93: ws ::= " " @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 94: ws ::= {10} [registerNewline] @void
      ((12<<5)|0x6)/*nullProductionAction:12*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 95: `boolean ::= "#" "b" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 96: `boolean ::= "#" "b" "o" [ws*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 97: `class ::= "#" "c" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 98: `class ::= "#" "c" "l" [ws*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 99: `extends ::= "#" "e" "x" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 100: `extends ::= "#" "e" "x" [ws*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 101: `void ::= "#" "v" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 102: `void ::= "#" "v" "o" [ws*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 103: `int ::= "#" "i" "t" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 104: `int ::= "#" "i" "t" [ws*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 105: `while ::= "#" "w" "h" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 106: `while ::= "#" "w" "h" [ws*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 107: `if ::= "#" "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 108: `if ::= "#" "+" [ws*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 109: `else ::= "#" "e" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 110: `else ::= "#" "e" "l" [ws*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 111: `break ::= "#" "b" "r" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 112: `break ::= "#" "b" "r" [ws*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 113: `this ::= "#" "t" "h" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 114: `this ::= "#" "t" "h" [ws*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 115: `false ::= "#" "f" "a" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 116: `false ::= "#" "f" "a" [ws*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 117: `true ::= "#" "t" "r" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 118: `true ::= "#" "t" "r" [ws*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 119: `super ::= "#" "s" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 120: `super ::= "#" "s" "u" [ws*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 121: `null ::= "#" "n" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 122: `null ::= "#" "n" "u" [ws*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 123: `return ::= "#" "r" "e" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 124: `return ::= "#" "r" "e" [ws*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 125: `instanceof ::= "#" "i" "n" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 126: `instanceof ::= "#" "i" "n" [ws*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 127: `new ::= "#" "n" "e" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 128: `new ::= "#" "n" "e" [ws*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 129: `public ::= "#" "p" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 130: `public ::= "#" "p" "u" [ws*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 131: `! ::= "!" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 132: `! ::= "!" [ws*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 133: `!= ::= "@" "!" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 134: `!= ::= "@" "!" [ws*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 135: `% ::= "%" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 136: `% ::= "%" [ws*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 137: `&& ::= "@" "&" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 138: `&& ::= "@" "&" [ws*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 139: `* ::= "*" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 140: `* ::= "*" [ws*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 141: `( ::= "(" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 142: `( ::= "(" [ws*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 143: `) ::= ")" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 144: `) ::= ")" [ws*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 145: `{ ::= "{" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 146: `{ ::= "{" [ws*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 147: `} ::= "}" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 148: `} ::= "}" [ws*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 149: `- ::= "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 150: `- ::= "-" [ws*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 151: `+ ::= "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 152: `+ ::= "+" [ws*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 153: `= ::= "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 154: `= ::= "=" [ws*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 155: `== ::= "@" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 156: `== ::= "@" "=" [ws*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 157: `[ ::= "[" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 158: `[ ::= "[" [ws*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 159: `] ::= "]" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 160: `] ::= "]" [ws*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 161: `|| ::= "@" "|" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 162: `|| ::= "@" "|" [ws*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 163: `< ::= "<" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 164: `< ::= "<" [ws*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 165: `<= ::= "@" "<" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 166: `<= ::= "@" "<" [ws*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 167: `, ::= "," ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 168: `, ::= "," [ws*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 169: `> ::= ">" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 170: `> ::= ">" !"=" [ws*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 171: `>= ::= "@" ">" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 172: `>= ::= "@" ">" [ws*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 173: `. ::= "." ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 174: `. ::= "." [ws*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 175: `; ::= ";" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 176: `; ::= ";" [ws*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 177: `/ ::= "/" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 178: `/ ::= "/" [ws*] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 179: ID ::= letter128 ws* @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 180: ID ::= letter128 [ws*] @text
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 181: ID ::= letter idChar* $$1 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 182: ID ::= letter [idChar*] $$1 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 183: INTLIT ::= {"1".."9"} digit* $$2 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((57<<5)|0x5)/*methodCall:57*/,
    },
    { // 184: INTLIT ::= {"1".."9"} [digit*] $$2 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((57<<5)|0x5)/*methodCall:57*/,
    },
    { // 185: INTLIT ::= digit128 ws* @convertToInt(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((58<<5)|0x5)/*methodCall:58*/,
    },
    { // 186: INTLIT ::= digit128 [ws*] @convertToInt(char)=>int
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((58<<5)|0x5)/*methodCall:58*/,
    },
    { // 187: INTLIT ::= "0" hexDigit* $$3 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((59<<5)|0x5)/*methodCall:59*/,
    },
    { // 188: INTLIT ::= "0" [hexDigit*] $$3 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((59<<5)|0x5)/*methodCall:59*/,
    },
    { // 189: STRINGLIT ::= "@" '"' ws* @emptyString(char,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((60<<5)|0x5)/*methodCall:60*/,
    },
    { // 190: STRINGLIT ::= "@" '"' [ws*] @emptyString(char,char)=>String
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((60<<5)|0x5)/*methodCall:60*/,
    },
    { // 191: STRINGLIT ::= '"' any* $$4 @string(char,List<Character>,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((61<<5)|0x5)/*methodCall:61*/,
    },
    { // 192: STRINGLIT ::= '"' [any*] $$4 @string(char,List<Character>,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((61<<5)|0x5)/*methodCall:61*/,
    },
    { // 193: CHARLIT ::= "'" any ws* @charVal(char,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((62<<5)|0x5)/*methodCall:62*/,
    },
    { // 194: CHARLIT ::= "'" any [ws*] @charVal(char,char)=>int
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((62<<5)|0x5)/*methodCall:62*/,
    },
    { // 195: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 196: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 197: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 198: idChar128 ::= letter128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 199: idChar128 ::= digit128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 200: idChar128 ::= {223} @underscore(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((63<<5)|0x5)/*methodCall:63*/,
    },
    { // 201: hexDigit ::= {"0".."9" "A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 202: hexDigit128 ::= {176..185 193..198 225..230} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((56<<5)|0x5)/*methodCall:56*/,
    },
    { // 203: <stmt>* ::= <stmt>* <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 204: <stmt>* ::= [<stmt>*] <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 205: <decl in class>* ::= <decl in class>* <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 206: <decl in class>* ::= [<decl in class>*] <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 207: any* ::= any* any @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 208: any* ::= [any*] any @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 209: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 210: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
    },
    { // 211: <extendsID>? ::= <extendsID> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 212: digit* ::= digit* digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 213: digit* ::= [digit*] digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 214: <exp list>? ::= <exp list> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 215: <listElm>* ::= <listElm>* <listElm> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 216: <listElm>* ::= [<listElm>*] <listElm> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 217: hexDigit* ::= hexDigit* hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 218: hexDigit* ::= [hexDigit*] hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 219: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 220: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 221: <class decl>+ ::= <class decl> @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 222: <class decl>+ ::= <class decl>+ <class decl> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 223: <recurse>* ::= <recurse>* <recurse> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 224: <recurse>* ::= [<recurse>*] <recurse> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 225: $$0 ::= `{ <decl in class>* `} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 226: $$0 ::= `{ [<decl in class>*] `} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 227: $$1 ::= idChar128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 228: $$1 ::= idChar128 [ws*] @pass
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 229: $$2 ::= digit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 230: $$2 ::= digit128 [ws*] @pass
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 231: $$3 ::= hexDigit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 232: $$3 ::= hexDigit128 [ws*] @pass
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 233: $$4 ::= any128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 234: $$4 ::= any128 [ws*] @pass
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
};
public String[] getNullProdNameTable() { return nullProdNameTable; }
private String[] nullProdNameTable = {
    "<recurse>* ::=", // <recurse>*
    "<extendsID>? ::=", // <extendsID>?
    "<listElm>* ::=", // <listElm>*
    "hexDigit* ::=", // hexDigit*
    "<stmt>* ::=", // <stmt>*
    "any* ::=", // any*
    "<decl in class>* ::=", // <decl in class>*
    "ws* ::=", // ws*
    "<exp list>? ::=", // <exp list>?
    "idChar* ::=", // idChar*
    "digit* ::=", // digit*
    "# ::=", // #
    "registerNewline ::= #", // registerNewline
};
public int[][] getNullProductionActionTable() { return nullActionTable; }
private int[][] nullActionTable = {
    { // <recurse>*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // <extendsID>?
      ((1<<5)|0x8)/*nullPointer:1*/,
    },
    { // <listElm>*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // hexDigit*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // <stmt>*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // any*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // <decl in class>*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // ws*
    },
    { // <exp list>?
      ((1<<5)|0x8)/*nullPointer:1*/,
    },
    { // idChar*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // digit*
      ((1<<5)|0x9)/*emptyList:1*/,
    },
    { // #
      7/*duplicateTop*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // registerNewline
      ((11<<5)|0x6)/*nullProductionAction:11*/,
      ((64<<5)|0x5)/*methodCall:64*/,
    },
};
public void actionCall(int idx, wrangLR.runtime.SemanticInfo si) {
  switch(idx) {
    default: System.err.println("Internal error--illegal action number: "+idx);break;
    case 0: {
      Program parm0 = (Program)si.popPb();
      actionObject.topLevel(parm0);
    }
    break;
    case 1: {
      int parm0 = (Integer)si.popPb();
      List<ClassDecl> parm1 = (List<ClassDecl>)si.popPb();
      Program result = actionObject.createProgram(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 2: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      String parm2 = (String)si.popPb();
      List<Decl> parm3 = (List<Decl>)si.popPb();
      ClassDecl result = actionObject.createClassDecl(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 3: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Decl result = actionObject.newInstVarDecl(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 4: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      List<Statement> parm2 = (List<Statement>)si.popPb();
      Decl result = actionObject.createMethodDeclVoid(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 5: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      VarDeclList parm2 = (VarDeclList)si.popPb();
      List<Statement> parm3 = (List<Statement>)si.popPb();
      Decl result = actionObject.createMethodDeclVoidFormal(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 6: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      List<Statement> parm3 = (List<Statement>)si.popPb();
      Exp parm4 = (Exp)si.popPb();
      Decl result = actionObject.createMethodDeclNonVoid(parm0,parm1,parm2,parm3,parm4);
      si.pushPb(result);
    }
    break;
    case 7: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      VarDeclList parm3 = (VarDeclList)si.popPb();
      List<Statement> parm4 = (List<Statement>)si.popPb();
      Exp parm5 = (Exp)si.popPb();
      Decl result = actionObject.createMethodDeclNonVoidWithElements(parm0,parm1,parm2,parm3,parm4,parm5);
      si.pushPb(result);
    }
    break;
    case 8: {
      int parm0 = (Integer)si.popPb();
      Type result = actionObject.intType(parm0);
      si.pushPb(result);
    }
    break;
    case 9: {
      int parm0 = (Integer)si.popPb();
      Type result = actionObject.booleanType(parm0);
      si.pushPb(result);
    }
    break;
    case 10: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Type result = actionObject.identifierType(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 11: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Object parm2 = (Object)si.popPb();
      Type result = actionObject.newArrayType(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 12: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      VarDecl result = actionObject.newListElement(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 13: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      List<VarDecl> parm3 = (List<VarDecl>)si.popPb();
      VarDeclList result = actionObject.newVarDeclList(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 14: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Statement result = actionObject.newCall(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 15: {
      int parm0 = (Integer)si.popPb();
      List<Statement> parm1 = (List<Statement>)si.popPb();
      Statement result = actionObject.newBlock(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 16: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Statement parm2 = (Statement)si.popPb();
      Statement result = actionObject.newWhile(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 17: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Statement parm2 = (Statement)si.popPb();
      Statement parm3 = (Statement)si.popPb();
      Statement result = actionObject.newIfElse(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 18: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Statement parm2 = (Statement)si.popPb();
      Statement parm3 = (Statement)si.popPb();
      Statement result = actionObject.newIf(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 19: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Statement result = actionObject.assign(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 20: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Exp parm3 = (Exp)si.popPb();
      Statement result = actionObject.localVarDecl(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 21: {
      int parm0 = (Integer)si.popPb();
      Statement result = actionObject.newBreak(parm0);
      si.pushPb(result);
    }
    break;
    case 22: {
      int parm0 = (Integer)si.popPb();
      Statement result = actionObject.newEmptyStatement(parm0);
      si.pushPb(result);
    }
    break;
    case 23: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newOr(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 24: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newAnd(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 25: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newNotEqual(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 26: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newEqualEquals(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 27: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newLessThan(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 28: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newGreaterThan(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 29: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Exp result = actionObject.newInstanceOf(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 30: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newLessThanOrEqual(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 31: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newGreaterThanOrEqual(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 32: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newPlus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 33: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newMinus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 34: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newTimes(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 35: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newDivide(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 36: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newRemainder(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 37: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newCast(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 38: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryMinus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 39: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryPlus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 40: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryNot(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 41: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newIdentfierExp(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 42: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newArrayLookup(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 43: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp result = actionObject.newIntegerLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 44: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newStringLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 45: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp result = actionObject.newCharLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 46: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newFalse(parm0);
      si.pushPb(result);
    }
    break;
    case 47: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newThis(parm0);
      si.pushPb(result);
    }
    break;
    case 48: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newTrue(parm0);
      si.pushPb(result);
    }
    break;
    case 49: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newNull(parm0);
      si.pushPb(result);
    }
    break;
    case 50: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      String parm2 = (String)si.popPb();
      Exp result = actionObject.newInstVarAccess(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 51: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newIdentity(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 52: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      String parm2 = (String)si.popPb();
      ExpList parm3 = (ExpList)si.popPb();
      Exp result = actionObject.newCallExp(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 53: {
      Exp parm0 = (Exp)si.popPb();
      List<Exp> parm1 = (List<Exp>)si.popPb();
      ExpList result = actionObject.newExpList(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 54: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      ExpList parm2 = (ExpList)si.popPb();
      Exp result = actionObject.newSuperMethod(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 55: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      ExpList parm2 = (ExpList)si.popPb();
      Exp result = actionObject.newThisMethod(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 56: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.sub128(parm0);
      si.pushPb(result);
    }
    break;
    case 57: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 58: {
      char parm0 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0);
      si.pushPb(result);
    }
    break;
    case 59: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convert16ToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 60: {
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      String result = actionObject.emptyString(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 61: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      String result = actionObject.string(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 62: {
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      int result = actionObject.charVal(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 63: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.underscore(parm0);
      si.pushPb(result);
    }
    break;
    case 64: {
      int parm0 = (Integer)si.popPb();
      actionObject.registerNewline(parm0);
    }
    break;
  }
}
private String[] saNameSigTable = {
"void topLevel(Program)",
"Program createProgram(int,List<ClassDecl>)",
"ClassDecl createClassDecl(int,String,String,List<Decl>)",
"Decl newInstVarDecl(Type,int,String)",
"Decl createMethodDeclVoid(int,String,List<Statement>)",
"Decl createMethodDeclVoidFormal(int,String,VarDeclList,List<Statement>)",
"Decl createMethodDeclNonVoid(Type,int,String,List<Statement>,Exp)",
"Decl createMethodDeclNonVoidWithElements(Type,int,String,VarDeclList,List<Statement>,Exp)",
"Type intType(int)",
"Type booleanType(int)",
"Type identifierType(int,String)",
"Type newArrayType(int,Type,Object)",
"VarDecl newListElement(Type,int,String)",
"VarDeclList newVarDeclList(Type,int,String,List<VarDecl>)",
"Statement newCall(int,Exp)",
"Statement newBlock(int,List<Statement>)",
"Statement newWhile(int,Exp,Statement)",
"Statement newIfElse(int,Exp,Statement,Statement)",
"Statement newIf(int,Exp,Statement,Statement)",
"Statement assign(Exp,int,Exp)",
"Statement localVarDecl(Type,int,String,Exp)",
"Statement newBreak(int)",
"Statement newEmptyStatement(int)",
"Exp newOr(Exp,int,Exp)",
"Exp newAnd(Exp,int,Exp)",
"Exp newNotEqual(Exp,int,Exp)",
"Exp newEqualEquals(Exp,int,Exp)",
"Exp newLessThan(Exp,int,Exp)",
"Exp newGreaterThan(Exp,int,Exp)",
"Exp newInstanceOf(Exp,int,String)",
"Exp newLessThanOrEqual(Exp,int,Exp)",
"Exp newGreaterThanOrEqual(Exp,int,Exp)",
"Exp newPlus(Exp,int,Exp)",
"Exp newMinus(Exp,int,Exp)",
"Exp newTimes(Exp,int,Exp)",
"Exp newDivide(Exp,int,Exp)",
"Exp newRemainder(Exp,int,Exp)",
"Exp newCast(int,Type,Exp)",
"Exp newUnaryMinus(int,Exp)",
"Exp newUnaryPlus(int,Exp)",
"Exp newUnaryNot(int,Exp)",
"Exp newIdentfierExp(int,String)",
"Exp newArrayLookup(Exp,int,Exp)",
"Exp newIntegerLiteral(int,int)",
"Exp newStringLiteral(int,String)",
"Exp newCharLiteral(int,int)",
"Exp newFalse(int)",
"Exp newThis(int)",
"Exp newTrue(int)",
"Exp newNull(int)",
"Exp newInstVarAccess(int,Exp,String)",
"Exp newIdentity(int,String)",
"Exp newCallExp(int,Exp,String,ExpList)",
"ExpList newExpList(Exp,List<Exp>)",
"Exp newSuperMethod(int,String,ExpList)",
"Exp newThisMethod(int,String,ExpList)",
"char sub128(char)",
"int convertToInt(char,List<Character>,char)",
"int convertToInt(char)",
"int convert16ToInt(char,List<Character>,char)",
"String emptyString(char,char)",
"String string(char,List<Character>,char)",
"int charVal(char,char)",
"char underscore(char)",
"void registerNewline(int)",
};
public String[] getSaNameSigTable() {
  return saNameSigTable;
}
private int[] sigCountTable = {
1,0,
2,1,
4,1,
3,1,
3,1,
4,1,
5,1,
6,1,
1,1,
1,1,
2,1,
3,1,
3,1,
4,1,
2,1,
2,1,
3,1,
4,1,
4,1,
3,1,
4,1,
1,1,
1,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
3,1,
2,1,
2,1,
2,1,
2,1,
3,1,
2,1,
2,1,
2,1,
1,1,
1,1,
1,1,
1,1,
3,1,
2,1,
4,1,
2,1,
3,1,
3,1,
1,1,
3,1,
1,1,
3,1,
2,1,
3,1,
2,1,
1,1,
1,0,
};
public int[] getSigCountTable() {
  return sigCountTable;
}
public int[] getSymbolSizeTable() { return symbolSizeTable; }
private int[] symbolSizeTable = {
    0,
    0,
    0,
    1,
    1,
    1,
    0,
    1,
    1,
    0,
    1,
    1,
    1,
    1,
    1,
    1,
    0,
    0,
    0,
    0,
    0,
    0,
    1,
    0,
    1,
    0,
    1,
    0,
    0,
    1,
    1,
    0,
    1,
    0,
    0,
    1,
    1,
    1,
    1,
    0,
    0,
    0,
    0,
    0,
    0,
    1,
    0,
    1,
    0,
    1,
    0,
    0,
    1,
    0,
    0,
    0,
    0,
    0,
    1,
    0,
    0,
    1,
    0,
    0,
    1,
    1,
    1,
    0,
    1,
    1,
    1,
    0,
    0,
    0,
    0,
    0,
    0,
    1,
    1,
    1,
    0,
    1,
    1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    1,
    -1,
    -1,
    1,
    -1,
    -1,
    1,
    -1,
    1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    -1,
    1,
    -1,
    -1,
    0,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    1,
    -1,
    -1,
};
public Object vectorToTuple(java.util.Vector<Object> vec) {
  switch (vec.size()) {
  }
  System.err.println("Internal error--illegal Tuple size: "+vec.size());
  return null;
}
}

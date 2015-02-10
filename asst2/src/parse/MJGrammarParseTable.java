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
public int getEofSym() { return 141; }
public int getNttSym() { return 142; }
private String[] symNameTable = {
"$$start",
"<start>",
"ws*",
"<program>",
"<class decl>+",
"<class decl>",
"`class",
"ID",
"`{",
"<decl in class>*",
"`}",
"<decl in class>",
"<method decl>",
"`public",
"`void",
"`(",
"`)",
"<stmt>*",
"<type>",
"`int",
"`boolean",
"<empty bracket pair>",
"`[",
"`]",
"<stmt>",
"<assign>",
"`;",
"<local var decl>",
"<exp>",
"`=",
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
"<call exp>",
"<exp list>",
"<recurse>",
"`,",
"<recurse>*",
"`super",
"<exp list>?",
"letter",
"\"a\"",
"\"p\"",
"\"s\"",
"\"v\"",
"{\"A\"..\"Z\" \"d\" \"g\" \"j\"..\"k\" \"m\" \"q\" \"w\"..\"z\"}",
"\"c\"",
"\"f\"",
"\"i\"",
"\"l\"",
"\"o\"",
"\"r\"",
"\"u\"",
"\"b\"",
"\"e\"",
"\"h\"",
"\"n\"",
"\"t\"",
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
"$$0",
"digit*",
"$$1",
"hexDigit*",
"$$2",
"any*",
"$$3",
"idChar",
"idChar128",
"hexDigit",
"hexDigit128",
"$",
"$NT",
};
public String symName(int n) {
 return n >= 0 && n < symNameTable.length ? symNameTable[n] : "??";
}
private MJGrammar actionObject;
public int[][] getParseTable() { return parseTable; }
public int numSymbols() { return 143;}
private static final int MIN_REDUCTION = 465;
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
1,375, // <start>
2,454, // ws*
3,315, // <program>
4,91, // <class decl>+
5,462, // <class decl>
6,160, // `class
101,112, // " "
102,341, // "#"
119,340, // {10}
128,359, // ws
  }
,
{ // state 1
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 2
  }
,
{ // state 3
0x80000000|169, // match move
0x80000000|89, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 4
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 5
2,6, // ws*
101,112, // " "
119,340, // {10}
128,359, // ws
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 6
101,112, // " "
119,340, // {10}
128,286, // ws
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 7
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 8
7,92, // ID
15,184, // `(
43,352, // `+
45,291, // `-
47,204, // <exp7>
50,45, // <cast exp>
51,271, // <unary exp>
52,393, // <exp8>
53,141, // `!
54,331, // INTLIT
55,208, // STRINGLIT
56,178, // CHARLIT
57,97, // `false
58,172, // `this
59,73, // `true
60,37, // `null
62,384, // `new
63,411, // <call exp>
68,93, // `super
70,110, // letter
71,126, // "a"
72,126, // "p"
73,126, // "s"
74,126, // "v"
75,126, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
76,126, // "c"
77,126, // "f"
78,126, // "i"
79,126, // "l"
80,126, // "o"
81,126, // "r"
82,126, // "u"
83,126, // "b"
84,126, // "e"
85,126, // "h"
86,126, // "n"
87,126, // "t"
88,259, // letter128
89,198, // {199..218 231..250}
90,198, // {193..198 225..230}
92,353, // {"1".."9"}
93,134, // "0"
94,161, // digit128
95,3, // {176..185}
98,240, // "-"
102,362, // "#"
113,433, // "("
114,420, // "+"
118,32, // "@"
121,439, // "!"
122,88, // "'"
123,216, // '"'
  }
,
{ // state 9
2,260, // ws*
101,112, // " "
119,340, // {10}
128,359, // ws
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 10
101,112, // " "
119,340, // {10}
128,286, // ws
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 11
2,261, // ws*
22,MIN_REDUCTION+149, // `[
97,MIN_REDUCTION+149, // "["
101,374, // " "
119,14, // {10}
128,111, // ws
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 12
0x80000000|207, // match move
0x80000000|361, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 13
0x80000000|179, // match move
0x80000000|202, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 14
0x80000000|446, // match move
0x80000000|123, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 15
8,265, // `{
110,147, // "{"
  }
,
{ // state 16
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 17
101,112, // " "
119,340, // {10}
128,286, // ws
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 18
82,163, // "u"
84,61, // "e"
  }
,
{ // state 19
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 20
7,92, // ID
15,184, // `(
38,457, // <exp5>
43,352, // `+
44,115, // <exp6>
45,291, // `-
47,150, // <exp7>
50,45, // <cast exp>
51,271, // <unary exp>
52,393, // <exp8>
53,141, // `!
54,331, // INTLIT
55,208, // STRINGLIT
56,178, // CHARLIT
57,97, // `false
58,172, // `this
59,73, // `true
60,37, // `null
62,384, // `new
63,411, // <call exp>
68,93, // `super
70,110, // letter
71,126, // "a"
72,126, // "p"
73,126, // "s"
74,126, // "v"
75,126, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
76,126, // "c"
77,126, // "f"
78,126, // "i"
79,126, // "l"
80,126, // "o"
81,126, // "r"
82,126, // "u"
83,126, // "b"
84,126, // "e"
85,126, // "h"
86,126, // "n"
87,126, // "t"
88,259, // letter128
89,198, // {199..218 231..250}
90,198, // {193..198 225..230}
92,353, // {"1".."9"}
93,134, // "0"
94,161, // digit128
95,3, // {176..185}
98,240, // "-"
102,362, // "#"
113,433, // "("
114,420, // "+"
118,32, // "@"
121,439, // "!"
122,88, // "'"
123,216, // '"'
  }
,
{ // state 21
MIN_REDUCTION+165, // (default reduction)
  }
,
{ // state 22
142,MIN_REDUCTION+13, // $NT
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 23
2,48, // ws*
101,112, // " "
119,340, // {10}
128,359, // ws
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 24
2,317, // ws*
  }
,
{ // state 25
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 26
2,277, // ws*
101,112, // " "
119,340, // {10}
128,359, // ws
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 27
MIN_REDUCTION+175, // (default reduction)
  }
,
{ // state 28
26,456, // `;
108,46, // ";"
  }
,
{ // state 29
26,379, // `;
108,46, // ";"
  }
,
{ // state 30
0x80000000|337, // match move
0x80000000|96, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 31
2,346, // ws*
101,112, // " "
119,340, // {10}
128,359, // ws
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 32
123,129, // '"'
  }
,
{ // state 33
2,17, // ws*
101,112, // " "
119,340, // {10}
128,359, // ws
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 34
22,MIN_REDUCTION+171, // `[
97,MIN_REDUCTION+171, // "["
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 35
MIN_REDUCTION+170, // (default reduction)
  }
,
{ // state 36
16,186, // `)
104,33, // ")"
  }
,
{ // state 37
0x80000000|409, // match move
0x80000000|218, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 38
7,92, // ID
16,237, // `)
52,332, // <exp8>
54,331, // INTLIT
55,208, // STRINGLIT
56,178, // CHARLIT
57,97, // `false
58,172, // `this
59,73, // `true
60,37, // `null
62,384, // `new
63,411, // <call exp>
64,70, // <exp list>
68,93, // `super
69,327, // <exp list>?
70,110, // letter
71,126, // "a"
72,126, // "p"
73,126, // "s"
74,126, // "v"
75,126, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
76,126, // "c"
77,126, // "f"
78,126, // "i"
79,126, // "l"
80,126, // "o"
81,126, // "r"
82,126, // "u"
83,126, // "b"
84,126, // "e"
85,126, // "h"
86,126, // "n"
87,126, // "t"
88,259, // letter128
89,198, // {199..218 231..250}
90,198, // {193..198 225..230}
92,353, // {"1".."9"}
93,134, // "0"
94,161, // digit128
95,3, // {176..185}
102,362, // "#"
104,201, // ")"
118,32, // "@"
122,88, // "'"
123,216, // '"'
  }
,
{ // state 39
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 40
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 41
2,242, // ws*
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 42
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 43
22,MIN_REDUCTION+148, // `[
97,MIN_REDUCTION+148, // "["
101,374, // " "
119,14, // {10}
128,453, // ws
MIN_REDUCTION+148, // (default reduction)
  }
,
{ // state 44
22,MIN_REDUCTION+69, // `[
97,MIN_REDUCTION+69, // "["
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 45
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 46
2,196, // ws*
101,112, // " "
119,340, // {10}
128,359, // ws
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 47
2,261, // ws*
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 48
101,112, // " "
119,340, // {10}
128,286, // ws
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 49
101,112, // " "
119,340, // {10}
128,286, // ws
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 50
22,MIN_REDUCTION+88, // `[
97,MIN_REDUCTION+88, // "["
101,374, // " "
119,14, // {10}
128,453, // ws
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 51
22,MIN_REDUCTION+178, // `[
97,MIN_REDUCTION+178, // "["
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 52
22,MIN_REDUCTION+150, // `[
97,MIN_REDUCTION+150, // "["
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 53
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 54
22,MIN_REDUCTION+169, // `[
97,MIN_REDUCTION+169, // "["
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 55
100,203, // "|"
  }
,
{ // state 56
2,338, // ws*
101,112, // " "
119,340, // {10}
128,359, // ws
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 57
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 58
7,92, // ID
15,184, // `(
43,352, // `+
44,270, // <exp6>
45,291, // `-
47,150, // <exp7>
50,45, // <cast exp>
51,271, // <unary exp>
52,393, // <exp8>
53,141, // `!
54,331, // INTLIT
55,208, // STRINGLIT
56,178, // CHARLIT
57,97, // `false
58,172, // `this
59,73, // `true
60,37, // `null
62,384, // `new
63,411, // <call exp>
68,93, // `super
70,110, // letter
71,126, // "a"
72,126, // "p"
73,126, // "s"
74,126, // "v"
75,126, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
76,126, // "c"
77,126, // "f"
78,126, // "i"
79,126, // "l"
80,126, // "o"
81,126, // "r"
82,126, // "u"
83,126, // "b"
84,126, // "e"
85,126, // "h"
86,126, // "n"
87,126, // "t"
88,259, // letter128
89,198, // {199..218 231..250}
90,198, // {193..198 225..230}
92,353, // {"1".."9"}
93,134, // "0"
94,161, // digit128
95,3, // {176..185}
98,240, // "-"
102,362, // "#"
113,433, // "("
114,420, // "+"
118,32, // "@"
121,439, // "!"
122,88, // "'"
123,216, // '"'
  }
,
{ // state 59
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 60
2,276, // ws*
22,MIN_REDUCTION+129, // `[
97,MIN_REDUCTION+129, // "["
101,374, // " "
119,14, // {10}
128,111, // ws
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 61
2,273, // ws*
101,112, // " "
119,340, // {10}
128,359, // ws
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 62
15,36, // `(
113,433, // "("
  }
,
{ // state 63
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 64
22,MIN_REDUCTION+55, // `[
97,MIN_REDUCTION+55, // "["
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 65
71,35, // "a"
72,35, // "p"
73,35, // "s"
74,35, // "v"
75,35, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
76,35, // "c"
77,35, // "f"
78,35, // "i"
79,35, // "l"
80,35, // "o"
81,35, // "r"
82,35, // "u"
83,35, // "b"
84,35, // "e"
85,35, // "h"
86,35, // "n"
87,35, // "t"
90,69, // {193..198 225..230}
92,35, // {"1".."9"}
93,35, // "0"
95,69, // {176..185}
134,30, // $$2
139,290, // hexDigit
140,423, // hexDigit128
  }
,
{ // state 66
2,387, // ws*
101,112, // " "
119,340, // {10}
128,359, // ws
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 67
7,62, // ID
70,189, // letter
71,126, // "a"
72,126, // "p"
73,126, // "s"
74,126, // "v"
75,126, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
76,126, // "c"
77,126, // "f"
78,126, // "i"
79,126, // "l"
80,126, // "o"
81,126, // "r"
82,126, // "u"
83,126, // "b"
84,126, // "e"
85,126, // "h"
86,126, // "n"
87,126, // "t"
88,434, // letter128
89,227, // {199..218 231..250}
90,227, // {193..198 225..230}
  }
,
{ // state 68
2,101, // ws*
22,MIN_REDUCTION+93, // `[
97,MIN_REDUCTION+93, // "["
101,374, // " "
119,14, // {10}
128,111, // ws
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 69
0x80000000|419, // match move
0x80000000|34, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 70
MIN_REDUCTION+182, // (default reduction)
  }
,
{ // state 71
7,243, // ID
8,448, // `{
10,294, // `}
15,184, // `(
18,120, // <type>
19,258, // `int
20,391, // `boolean
24,325, // <stmt>
25,29, // <assign>
27,28, // <local var decl>
28,388, // <exp>
31,263, // <exp2>
33,80, // <exp3>
35,360, // <exp4>
38,234, // <exp5>
43,352, // `+
44,115, // <exp6>
45,291, // `-
47,150, // <exp7>
50,45, // <cast exp>
51,271, // <unary exp>
52,393, // <exp8>
53,141, // `!
54,331, // INTLIT
55,208, // STRINGLIT
56,178, // CHARLIT
57,97, // `false
58,172, // `this
59,73, // `true
60,37, // `null
62,384, // `new
63,411, // <call exp>
68,93, // `super
70,110, // letter
71,126, // "a"
72,126, // "p"
73,126, // "s"
74,126, // "v"
75,126, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
76,126, // "c"
77,126, // "f"
78,126, // "i"
79,126, // "l"
80,126, // "o"
81,126, // "r"
82,126, // "u"
83,126, // "b"
84,126, // "e"
85,126, // "h"
86,126, // "n"
87,126, // "t"
88,259, // letter128
89,198, // {199..218 231..250}
90,198, // {193..198 225..230}
92,353, // {"1".."9"}
93,134, // "0"
94,161, // digit128
95,3, // {176..185}
98,240, // "-"
102,358, // "#"
110,147, // "{"
113,433, // "("
114,420, // "+"
118,32, // "@"
120,401, // "}"
121,439, // "!"
122,88, // "'"
123,216, // '"'
  }
,
{ // state 72
101,112, // " "
119,340, // {10}
128,286, // ws
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 73
0x80000000|40, // match move
0x80000000|64, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 74
7,92, // ID
15,184, // `(
28,268, // <exp>
31,263, // <exp2>
33,80, // <exp3>
35,360, // <exp4>
38,234, // <exp5>
43,352, // `+
44,115, // <exp6>
45,291, // `-
47,150, // <exp7>
50,45, // <cast exp>
51,271, // <unary exp>
52,393, // <exp8>
53,141, // `!
54,331, // INTLIT
55,208, // STRINGLIT
56,178, // CHARLIT
57,97, // `false
58,172, // `this
59,73, // `true
60,37, // `null
62,384, // `new
63,411, // <call exp>
68,93, // `super
70,110, // letter
71,126, // "a"
72,126, // "p"
73,126, // "s"
74,126, // "v"
75,126, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
76,126, // "c"
77,126, // "f"
78,126, // "i"
79,126, // "l"
80,126, // "o"
81,126, // "r"
82,126, // "u"
83,126, // "b"
84,126, // "e"
85,126, // "h"
86,126, // "n"
87,126, // "t"
88,259, // letter128
89,198, // {199..218 231..250}
90,198, // {193..198 225..230}
92,353, // {"1".."9"}
93,134, // "0"
94,161, // digit128
95,3, // {176..185}
98,240, // "-"
102,362, // "#"
113,433, // "("
114,420, // "+"
118,32, // "@"
121,439, // "!"
122,88, // "'"
123,216, // '"'
  }
,
{ // state 75
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 76
16,257, // `)
21,447, // <empty bracket pair>
22,170, // `[
97,249, // "["
104,33, // ")"
  }
,
{ // state 77
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 78
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 79
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 80
34,235, // `!=
36,264, // `==
118,368, // "@"
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 81
0x80000000|145, // match move
0x80000000|252, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 82
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 83
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 84
0x80000000|42, // match move
0x80000000|255, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 85
MIN_REDUCTION+190, // (default reduction)
  }
,
{ // state 86
81,369, // "r"
85,231, // "h"
  }
,
{ // state 87
2,276, // ws*
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 88
71,373, // "a"
72,373, // "p"
73,373, // "s"
74,373, // "v"
75,373, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
76,373, // "c"
77,373, // "f"
78,373, // "i"
79,373, // "l"
80,373, // "o"
81,373, // "r"
82,373, // "u"
83,373, // "b"
84,373, // "e"
85,373, // "h"
86,373, // "n"
87,373, // "t"
92,373, // {"1".."9"}
93,373, // "0"
96,305, // any
97,373, // "["
98,373, // "-"
99,373, // "<"
100,373, // "|"
101,373, // " "
102,373, // "#"
103,373, // "&"
104,373, // ")"
105,373, // ","
106,373, // "]"
107,373, // "/"
108,373, // ";"
109,373, // ">"
110,373, // "{"
111,373, // {0..9 11..31 "$" ":" "?" "\" "^" "`" "~"..127}
112,373, // "%"
113,373, // "("
114,373, // "+"
115,373, // "."
116,373, // "_"
117,373, // "="
118,373, // "@"
119,373, // {10}
120,373, // "}"
121,373, // "!"
122,373, // "'"
123,373, // '"'
124,373, // "*"
  }
,
{ // state 89
22,MIN_REDUCTION+71, // `[
97,MIN_REDUCTION+71, // "["
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 90
101,112, // " "
119,340, // {10}
128,286, // ws
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 91
5,390, // <class decl>
6,160, // `class
102,341, // "#"
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 92
0x80000000|1, // match move
0x80000000|279, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 93
61,342, // `.
115,224, // "."
  }
,
{ // state 94
43,414, // `+
45,58, // `-
98,240, // "-"
114,420, // "+"
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 95
22,MIN_REDUCTION+151, // `[
97,MIN_REDUCTION+151, // "["
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 96
22,MIN_REDUCTION+156, // `[
97,MIN_REDUCTION+156, // "["
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 97
0x80000000|397, // match move
0x80000000|452, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 98
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 99
22,MIN_REDUCTION+161, // `[
97,MIN_REDUCTION+161, // "["
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 100
0x80000000|2, // match move
0x80000000|383, // no-match move
// T-test match for "=":
117,
  }
,
{ // state 101
0x80000000|280, // match move
0x80000000|210, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 102
22,MIN_REDUCTION+193, // `[
97,MIN_REDUCTION+193, // "["
101,374, // " "
119,14, // {10}
128,453, // ws
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 103
2,459, // ws*
22,MIN_REDUCTION+159, // `[
97,MIN_REDUCTION+159, // "["
101,374, // " "
119,14, // {10}
128,111, // ws
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 104
101,112, // " "
119,340, // {10}
128,286, // ws
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 105
2,183, // ws*
22,MIN_REDUCTION+155, // `[
97,MIN_REDUCTION+155, // "["
101,374, // " "
119,14, // {10}
128,111, // ws
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 106
0x80000000|98, // match move
0x80000000|153, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 107
MIN_REDUCTION+173, // (default reduction)
  }
,
{ // state 108
2,348, // ws*
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 109
22,MIN_REDUCTION+195, // `[
97,MIN_REDUCTION+195, // "["
101,374, // " "
119,14, // {10}
128,453, // ws
MIN_REDUCTION+195, // (default reduction)
  }
,
{ // state 110
70,125, // letter
71,126, // "a"
72,126, // "p"
73,126, // "s"
74,126, // "v"
75,126, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
76,126, // "c"
77,126, // "f"
78,126, // "i"
79,126, // "l"
80,126, // "o"
81,126, // "r"
82,126, // "u"
83,126, // "b"
84,126, // "e"
85,126, // "h"
86,126, // "n"
87,126, // "t"
88,272, // letter128
89,198, // {199..218 231..250}
90,198, // {193..198 225..230}
91,21, // digit
92,269, // {"1".."9"}
93,269, // "0"
94,417, // digit128
95,3, // {176..185}
116,398, // "_"
126,131, // {223}
129,432, // idChar*
130,425, // $$0
137,334, // idChar
138,13, // idChar128
  }
,
{ // state 111
0x80000000|435, // match move
0x80000000|236, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 112
142,MIN_REDUCTION+74, // $NT
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 113
2,155, // ws*
101,112, // " "
119,340, // {10}
128,359, // ws
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 114
2,459, // ws*
  }
,
{ // state 115
46,230, // `*
48,8, // `/
49,463, // `%
107,238, // "/"
112,5, // "%"
124,219, // "*"
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 116
22,MIN_REDUCTION+154, // `[
97,MIN_REDUCTION+154, // "["
101,374, // " "
119,14, // {10}
128,453, // ws
MIN_REDUCTION+154, // (default reduction)
  }
,
{ // state 117
22,MIN_REDUCTION+52, // `[
97,MIN_REDUCTION+52, // "["
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 118
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 119
14,67, // `void
102,392, // "#"
  }
,
{ // state 120
7,221, // ID
21,447, // <empty bracket pair>
22,170, // `[
70,189, // letter
71,126, // "a"
72,126, // "p"
73,126, // "s"
74,126, // "v"
75,126, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
76,126, // "c"
77,126, // "f"
78,126, // "i"
79,126, // "l"
80,126, // "o"
81,126, // "r"
82,126, // "u"
83,126, // "b"
84,126, // "e"
85,126, // "h"
86,126, // "n"
87,126, // "t"
88,434, // letter128
89,227, // {199..218 231..250}
90,227, // {193..198 225..230}
97,249, // "["
  }
,
{ // state 121
MIN_REDUCTION+150, // (default reduction)
  }
,
{ // state 122
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 123
22,MIN_REDUCTION+75, // `[
97,MIN_REDUCTION+75, // "["
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 124
101,112, // " "
119,340, // {10}
128,286, // ws
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 125
MIN_REDUCTION+164, // (default reduction)
  }
,
{ // state 126
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 127
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 128
82,113, // "u"
  }
,
{ // state 129
0x80000000|321, // match move
0x80000000|103, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 130
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 131
0x80000000|283, // match move
0x80000000|54, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 132
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 133
10,188, // `}
11,444, // <decl in class>
12,130, // <method decl>
13,119, // `public
102,335, // "#"
120,401, // "}"
  }
,
{ // state 134
71,35, // "a"
72,35, // "p"
73,35, // "s"
74,35, // "v"
75,35, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
76,35, // "c"
77,35, // "f"
78,35, // "i"
79,35, // "l"
80,35, // "o"
81,35, // "r"
82,35, // "u"
83,35, // "b"
84,35, // "e"
85,35, // "h"
86,35, // "n"
87,35, // "t"
90,69, // {193..198 225..230}
92,35, // {"1".."9"}
93,35, // "0"
95,69, // {176..185}
133,65, // hexDigit*
134,253, // $$2
139,177, // hexDigit
140,423, // hexDigit128
  }
,
{ // state 135
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 136
15,357, // `(
22,MIN_REDUCTION+57, // `[
97,MIN_REDUCTION+57, // "["
113,433, // "("
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 137
22,MIN_REDUCTION+54, // `[
97,MIN_REDUCTION+54, // "["
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 138
7,92, // ID
15,184, // `(
38,372, // <exp5>
43,352, // `+
44,115, // <exp6>
45,291, // `-
47,150, // <exp7>
50,45, // <cast exp>
51,271, // <unary exp>
52,393, // <exp8>
53,141, // `!
54,331, // INTLIT
55,208, // STRINGLIT
56,178, // CHARLIT
57,97, // `false
58,172, // `this
59,73, // `true
60,37, // `null
62,384, // `new
63,411, // <call exp>
68,93, // `super
70,110, // letter
71,126, // "a"
72,126, // "p"
73,126, // "s"
74,126, // "v"
75,126, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
76,126, // "c"
77,126, // "f"
78,126, // "i"
79,126, // "l"
80,126, // "o"
81,126, // "r"
82,126, // "u"
83,126, // "b"
84,126, // "e"
85,126, // "h"
86,126, // "n"
87,126, // "t"
88,259, // letter128
89,198, // {199..218 231..250}
90,198, // {193..198 225..230}
92,353, // {"1".."9"}
93,134, // "0"
94,161, // digit128
95,3, // {176..185}
98,240, // "-"
102,362, // "#"
113,433, // "("
114,420, // "+"
118,32, // "@"
121,439, // "!"
122,88, // "'"
123,216, // '"'
  }
,
{ // state 139
22,MIN_REDUCTION+51, // `[
97,MIN_REDUCTION+51, // "["
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 140
MIN_REDUCTION+180, // (default reduction)
  }
,
{ // state 141
7,92, // ID
43,352, // `+
45,291, // `-
51,220, // <unary exp>
52,393, // <exp8>
53,141, // `!
54,331, // INTLIT
55,208, // STRINGLIT
56,178, // CHARLIT
57,97, // `false
58,172, // `this
59,73, // `true
60,37, // `null
62,384, // `new
63,411, // <call exp>
68,93, // `super
70,110, // letter
71,126, // "a"
72,126, // "p"
73,126, // "s"
74,126, // "v"
75,126, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
76,126, // "c"
77,126, // "f"
78,126, // "i"
79,126, // "l"
80,126, // "o"
81,126, // "r"
82,126, // "u"
83,126, // "b"
84,126, // "e"
85,126, // "h"
86,126, // "n"
87,126, // "t"
88,259, // letter128
89,198, // {199..218 231..250}
90,198, // {193..198 225..230}
92,353, // {"1".."9"}
93,134, // "0"
94,161, // digit128
95,3, // {176..185}
98,240, // "-"
102,362, // "#"
114,420, // "+"
118,32, // "@"
121,439, // "!"
122,88, // "'"
123,216, // '"'
  }
,
{ // state 142
7,92, // ID
15,184, // `(
38,385, // <exp5>
43,352, // `+
44,115, // <exp6>
45,291, // `-
47,150, // <exp7>
50,45, // <cast exp>
51,271, // <unary exp>
52,393, // <exp8>
53,141, // `!
54,331, // INTLIT
55,208, // STRINGLIT
56,178, // CHARLIT
57,97, // `false
58,172, // `this
59,73, // `true
60,37, // `null
62,384, // `new
63,411, // <call exp>
68,93, // `super
70,110, // letter
71,126, // "a"
72,126, // "p"
73,126, // "s"
74,126, // "v"
75,126, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
76,126, // "c"
77,126, // "f"
78,126, // "i"
79,126, // "l"
80,126, // "o"
81,126, // "r"
82,126, // "u"
83,126, // "b"
84,126, // "e"
85,126, // "h"
86,126, // "n"
87,126, // "t"
88,259, // letter128
89,198, // {199..218 231..250}
90,198, // {193..198 225..230}
92,353, // {"1".."9"}
93,134, // "0"
94,161, // digit128
95,3, // {176..185}
98,240, // "-"
102,362, // "#"
113,433, // "("
114,420, // "+"
118,32, // "@"
121,439, // "!"
122,88, // "'"
123,216, // '"'
  }
,
{ // state 143
7,92, // ID
15,184, // `(
28,449, // <exp>
31,263, // <exp2>
33,80, // <exp3>
35,360, // <exp4>
38,234, // <exp5>
43,352, // `+
44,115, // <exp6>
45,291, // `-
47,150, // <exp7>
50,45, // <cast exp>
51,271, // <unary exp>
52,393, // <exp8>
53,141, // `!
54,331, // INTLIT
55,208, // STRINGLIT
56,178, // CHARLIT
57,97, // `false
58,172, // `this
59,73, // `true
60,37, // `null
62,384, // `new
63,411, // <call exp>
68,93, // `super
70,110, // letter
71,126, // "a"
72,126, // "p"
73,126, // "s"
74,126, // "v"
75,126, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
76,126, // "c"
77,126, // "f"
78,126, // "i"
79,126, // "l"
80,126, // "o"
81,126, // "r"
82,126, // "u"
83,126, // "b"
84,126, // "e"
85,126, // "h"
86,126, // "n"
87,126, // "t"
88,259, // letter128
89,198, // {199..218 231..250}
90,198, // {193..198 225..230}
92,353, // {"1".."9"}
93,134, // "0"
94,161, // digit128
95,3, // {176..185}
98,240, // "-"
102,362, // "#"
113,433, // "("
114,420, // "+"
118,32, // "@"
121,439, // "!"
122,88, // "'"
123,216, // '"'
  }
,
{ // state 144
7,243, // ID
8,448, // `{
10,247, // `}
15,184, // `(
18,120, // <type>
19,258, // `int
20,391, // `boolean
24,325, // <stmt>
25,29, // <assign>
27,28, // <local var decl>
28,388, // <exp>
31,263, // <exp2>
33,80, // <exp3>
35,360, // <exp4>
38,234, // <exp5>
43,352, // `+
44,115, // <exp6>
45,291, // `-
47,150, // <exp7>
50,45, // <cast exp>
51,271, // <unary exp>
52,393, // <exp8>
53,141, // `!
54,331, // INTLIT
55,208, // STRINGLIT
56,178, // CHARLIT
57,97, // `false
58,172, // `this
59,73, // `true
60,37, // `null
62,384, // `new
63,411, // <call exp>
68,93, // `super
70,110, // letter
71,126, // "a"
72,126, // "p"
73,126, // "s"
74,126, // "v"
75,126, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
76,126, // "c"
77,126, // "f"
78,126, // "i"
79,126, // "l"
80,126, // "o"
81,126, // "r"
82,126, // "u"
83,126, // "b"
84,126, // "e"
85,126, // "h"
86,126, // "n"
87,126, // "t"
88,259, // letter128
89,198, // {199..218 231..250}
90,198, // {193..198 225..230}
92,353, // {"1".."9"}
93,134, // "0"
94,161, // digit128
95,3, // {176..185}
98,240, // "-"
102,358, // "#"
110,147, // "{"
113,433, // "("
114,420, // "+"
118,32, // "@"
120,401, // "}"
121,439, // "!"
122,88, // "'"
123,216, // '"'
  }
,
{ // state 145
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 146
101,112, // " "
119,340, // {10}
128,286, // ws
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 147
2,241, // ws*
101,112, // " "
119,340, // {10}
128,359, // ws
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 148
2,416, // ws*
  }
,
{ // state 149
86,275, // "n"
  }
,
{ // state 150
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 151
0x80000000|213, // match move
0x80000000|250, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 152
22,MIN_REDUCTION+128, // `[
97,MIN_REDUCTION+128, // "["
101,374, // " "
119,14, // {10}
128,453, // ws
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 153
22,MIN_REDUCTION+153, // `[
97,MIN_REDUCTION+153, // "["
MIN_REDUCTION+153, // (default reduction)
  }
,
{ // state 154
67,217, // <recurse>*
  }
,
{ // state 155
101,112, // " "
119,340, // {10}
128,286, // ws
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 156
80,31, // "o"
  }
,
{ // state 157
22,399, // `[
61,289, // `.
97,249, // "["
115,224, // "."
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 158
22,MIN_REDUCTION+158, // `[
97,MIN_REDUCTION+158, // "["
101,374, // " "
119,14, // {10}
128,453, // ws
MIN_REDUCTION+158, // (default reduction)
  }
,
{ // state 159
22,399, // `[
61,289, // `.
97,249, // "["
115,224, // "."
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 160
7,15, // ID
70,189, // letter
71,126, // "a"
72,126, // "p"
73,126, // "s"
74,126, // "v"
75,126, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
76,126, // "c"
77,126, // "f"
78,126, // "i"
79,126, // "l"
80,126, // "o"
81,126, // "r"
82,126, // "u"
83,126, // "b"
84,126, // "e"
85,126, // "h"
86,126, // "n"
87,126, // "t"
88,434, // letter128
89,227, // {199..218 231..250}
90,227, // {193..198 225..230}
  }
,
{ // state 161
0x80000000|244, // match move
0x80000000|105, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 162
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 163
0x80000000|166, // match move
0x80000000|68, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 164
22,MIN_REDUCTION+168, // `[
97,MIN_REDUCTION+168, // "["
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 165
87,297, // "t"
  }
,
{ // state 166
2,101, // ws*
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 167
101,112, // " "
119,340, // {10}
128,286, // ws
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 168
0x80000000|83, // match move
0x80000000|136, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 169
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 170
23,22, // `]
106,422, // "]"
  }
,
{ // state 171
101,112, // " "
119,340, // {10}
128,286, // ws
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 172
0x80000000|303, // match move
0x80000000|137, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 173
32,248, // `&&
118,287, // "@"
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 174
2,317, // ws*
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 175
79,9, // "l"
  }
,
{ // state 176
22,MIN_REDUCTION+67, // `[
97,MIN_REDUCTION+67, // "["
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 177
MIN_REDUCTION+184, // (default reduction)
  }
,
{ // state 178
0x80000000|299, // match move
0x80000000|117, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 179
2,81, // ws*
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 180
22,MIN_REDUCTION+197, // `[
97,MIN_REDUCTION+197, // "["
101,374, // " "
119,14, // {10}
128,453, // ws
MIN_REDUCTION+197, // (default reduction)
  }
,
{ // state 181
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 182
0x80000000|426, // match move
0x80000000|292, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 183
0x80000000|16, // match move
0x80000000|116, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 184
7,162, // ID
18,76, // <type>
19,258, // `int
20,391, // `boolean
70,189, // letter
71,126, // "a"
72,126, // "p"
73,126, // "s"
74,126, // "v"
75,126, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
76,126, // "c"
77,126, // "f"
78,126, // "i"
79,126, // "l"
80,126, // "o"
81,126, // "r"
82,126, // "u"
83,126, // "b"
84,126, // "e"
85,126, // "h"
86,126, // "n"
87,126, // "t"
88,434, // letter128
89,227, // {199..218 231..250}
90,227, // {193..198 225..230}
102,195, // "#"
  }
,
{ // state 185
0x80000000|376, // match move
0x80000000|366, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 186
8,412, // `{
110,147, // "{"
  }
,
{ // state 187
22,MIN_REDUCTION+64, // `[
97,MIN_REDUCTION+64, // "["
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 188
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 189
70,125, // letter
71,126, // "a"
72,126, // "p"
73,126, // "s"
74,126, // "v"
75,126, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
76,126, // "c"
77,126, // "f"
78,126, // "i"
79,126, // "l"
80,126, // "o"
81,126, // "r"
82,126, // "u"
83,126, // "b"
84,126, // "e"
85,126, // "h"
86,126, // "n"
87,126, // "t"
88,394, // letter128
89,227, // {199..218 231..250}
90,227, // {193..198 225..230}
91,21, // digit
92,269, // {"1".."9"}
93,269, // "0"
94,57, // digit128
95,25, // {176..185}
116,398, // "_"
126,225, // {223}
129,371, // idChar*
130,63, // $$0
137,334, // idChar
138,350, // idChar128
  }
,
{ // state 190
34,235, // `!=
36,264, // `==
118,368, // "@"
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 191
MIN_REDUCTION+181, // (default reduction)
  }
,
{ // state 192
23,443, // `]
30,245, // `||
106,442, // "]"
118,55, // "@"
  }
,
{ // state 193
MIN_REDUCTION+1, // (default reduction)
  }
,
{ // state 194
101,112, // " "
119,340, // {10}
128,286, // ws
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 195
78,165, // "i"
83,407, // "b"
  }
,
{ // state 196
101,112, // " "
119,340, // {10}
128,286, // ws
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 197
2,84, // ws*
  }
,
{ // state 198
0x80000000|135, // match move
0x80000000|44, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 199
0x80000000|415, // match move
0x80000000|102, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 200
2,183, // ws*
  }
,
{ // state 201
0x80000000|304, // match move
0x80000000|345, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 202
2,81, // ws*
22,MIN_REDUCTION+192, // `[
97,MIN_REDUCTION+192, // "["
101,374, // " "
119,14, // {10}
128,111, // ws
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 203
2,381, // ws*
101,112, // " "
119,340, // {10}
128,359, // ws
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 204
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 205
101,112, // " "
119,340, // {10}
128,286, // ws
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 206
101,112, // " "
119,340, // {10}
128,286, // ws
142,MIN_REDUCTION+128, // $NT
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 207
2,84, // ws*
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 208
0x80000000|400, // match move
0x80000000|139, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 209
16,431, // `)
104,201, // ")"
  }
,
{ // state 210
22,MIN_REDUCTION+92, // `[
97,MIN_REDUCTION+92, // "["
101,374, // " "
119,14, // {10}
128,453, // ws
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 211
MIN_REDUCTION+161, // (default reduction)
  }
,
{ // state 212
16,256, // `)
104,201, // ")"
  }
,
{ // state 213
2,199, // ws*
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 214
MIN_REDUCTION+168, // (default reduction)
  }
,
{ // state 215
16,437, // `)
104,201, // ")"
  }
,
{ // state 216
71,254, // "a"
72,254, // "p"
73,254, // "s"
74,254, // "v"
75,254, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
76,254, // "c"
77,254, // "f"
78,254, // "i"
79,254, // "l"
80,254, // "o"
81,254, // "r"
82,254, // "u"
83,254, // "b"
84,254, // "e"
85,254, // "h"
86,254, // "n"
87,254, // "t"
89,336, // {199..218 231..250}
90,336, // {193..198 225..230}
92,254, // {"1".."9"}
93,254, // "0"
95,336, // {176..185}
96,455, // any
97,254, // "["
98,254, // "-"
99,254, // "<"
100,254, // "|"
101,254, // " "
102,254, // "#"
103,254, // "&"
104,254, // ")"
105,254, // ","
106,254, // "]"
107,254, // "/"
108,254, // ";"
109,254, // ">"
110,254, // "{"
111,254, // {0..9 11..31 "$" ":" "?" "\" "^" "`" "~"..127}
112,254, // "%"
113,254, // "("
114,254, // "+"
115,254, // "."
116,254, // "_"
117,254, // "="
118,254, // "@"
119,254, // {10}
120,254, // "}"
121,254, // "!"
122,254, // "'"
123,254, // '"'
124,254, // "*"
125,185, // any128
126,336, // {223}
127,336, // {128..175 186..192 219..222 224 251..255}
135,441, // any*
136,228, // $$3
  }
,
{ // state 217
65,427, // <recurse>
66,278, // `,
105,402, // ","
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 218
22,MIN_REDUCTION+56, // `[
97,MIN_REDUCTION+56, // "["
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 219
2,124, // ws*
101,112, // " "
119,340, // {10}
128,359, // ws
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 220
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 221
29,74, // `=
117,226, // "="
  }
,
{ // state 222
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 223
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 224
2,194, // ws*
101,112, // " "
119,340, // {10}
128,359, // ws
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 225
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 226
2,146, // ws*
101,112, // " "
119,340, // {10}
128,359, // ws
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 227
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 228
0x80000000|211, // match move
0x80000000|99, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 229
2,421, // ws*
  }
,
{ // state 230
7,92, // ID
15,184, // `(
43,352, // `+
45,291, // `-
47,367, // <exp7>
50,45, // <cast exp>
51,271, // <unary exp>
52,393, // <exp8>
53,141, // `!
54,331, // INTLIT
55,208, // STRINGLIT
56,178, // CHARLIT
57,97, // `false
58,172, // `this
59,73, // `true
60,37, // `null
62,384, // `new
63,411, // <call exp>
68,93, // `super
70,110, // letter
71,126, // "a"
72,126, // "p"
73,126, // "s"
74,126, // "v"
75,126, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
76,126, // "c"
77,126, // "f"
78,126, // "i"
79,126, // "l"
80,126, // "o"
81,126, // "r"
82,126, // "u"
83,126, // "b"
84,126, // "e"
85,126, // "h"
86,126, // "n"
87,126, // "t"
88,259, // letter128
89,198, // {199..218 231..250}
90,198, // {193..198 225..230}
92,353, // {"1".."9"}
93,134, // "0"
94,161, // digit128
95,3, // {176..185}
98,240, // "-"
102,362, // "#"
113,433, // "("
114,420, // "+"
118,32, // "@"
121,439, // "!"
122,88, // "'"
123,216, // '"'
  }
,
{ // state 231
0x80000000|108, // match move
0x80000000|266, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 232
71,12, // "a"
  }
,
{ // state 233
0x80000000|2, // match move
0x80000000|157, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 234
43,414, // `+
45,58, // `-
98,240, // "-"
114,420, // "+"
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 235
7,92, // ID
15,184, // `(
35,262, // <exp4>
38,234, // <exp5>
43,352, // `+
44,115, // <exp6>
45,291, // `-
47,150, // <exp7>
50,45, // <cast exp>
51,271, // <unary exp>
52,393, // <exp8>
53,141, // `!
54,331, // INTLIT
55,208, // STRINGLIT
56,178, // CHARLIT
57,97, // `false
58,172, // `this
59,73, // `true
60,37, // `null
62,384, // `new
63,411, // <call exp>
68,93, // `super
70,110, // letter
71,126, // "a"
72,126, // "p"
73,126, // "s"
74,126, // "v"
75,126, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
76,126, // "c"
77,126, // "f"
78,126, // "i"
79,126, // "l"
80,126, // "o"
81,126, // "r"
82,126, // "u"
83,126, // "b"
84,126, // "e"
85,126, // "h"
86,126, // "n"
87,126, // "t"
88,259, // letter128
89,198, // {199..218 231..250}
90,198, // {193..198 225..230}
92,353, // {"1".."9"}
93,134, // "0"
94,161, // digit128
95,3, // {176..185}
98,240, // "-"
102,362, // "#"
113,433, // "("
114,420, // "+"
118,32, // "@"
121,439, // "!"
122,88, // "'"
123,216, // '"'
  }
,
{ // state 236
22,MIN_REDUCTION+179, // `[
97,MIN_REDUCTION+179, // "["
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 237
0x80000000|79, // match move
0x80000000|176, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 238
2,309, // ws*
101,112, // " "
119,340, // {10}
128,359, // ws
MIN_REDUCTION+147, // (default reduction)
  }
,
{ // state 239
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 240
2,205, // ws*
101,112, // " "
119,340, // {10}
128,359, // ws
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 241
101,112, // " "
119,340, // {10}
128,286, // ws
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 242
0x80000000|355, // match move
0x80000000|109, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 243
0x80000000|118, // match move
0x80000000|296, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 244
2,183, // ws*
MIN_REDUCTION+155, // (default reduction)
  }
,
{ // state 245
7,92, // ID
15,184, // `(
31,173, // <exp2>
33,80, // <exp3>
35,360, // <exp4>
38,234, // <exp5>
43,352, // `+
44,115, // <exp6>
45,291, // `-
47,150, // <exp7>
50,45, // <cast exp>
51,271, // <unary exp>
52,393, // <exp8>
53,141, // `!
54,331, // INTLIT
55,208, // STRINGLIT
56,178, // CHARLIT
57,97, // `false
58,172, // `this
59,73, // `true
60,37, // `null
62,384, // `new
63,411, // <call exp>
68,93, // `super
70,110, // letter
71,126, // "a"
72,126, // "p"
73,126, // "s"
74,126, // "v"
75,126, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
76,126, // "c"
77,126, // "f"
78,126, // "i"
79,126, // "l"
80,126, // "o"
81,126, // "r"
82,126, // "u"
83,126, // "b"
84,126, // "e"
85,126, // "h"
86,126, // "n"
87,126, // "t"
88,259, // letter128
89,198, // {199..218 231..250}
90,198, // {193..198 225..230}
92,353, // {"1".."9"}
93,134, // "0"
94,161, // digit128
95,3, // {176..185}
98,240, // "-"
102,362, // "#"
113,433, // "("
114,420, // "+"
118,32, // "@"
121,439, // "!"
122,88, // "'"
123,216, // '"'
  }
,
{ // state 246
15,354, // `(
113,433, // "("
  }
,
{ // state 247
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 248
7,92, // ID
15,184, // `(
33,190, // <exp3>
35,360, // <exp4>
38,234, // <exp5>
43,352, // `+
44,115, // <exp6>
45,291, // `-
47,150, // <exp7>
50,45, // <cast exp>
51,271, // <unary exp>
52,393, // <exp8>
53,141, // `!
54,331, // INTLIT
55,208, // STRINGLIT
56,178, // CHARLIT
57,97, // `false
58,172, // `this
59,73, // `true
60,37, // `null
62,384, // `new
63,411, // <call exp>
68,93, // `super
70,110, // letter
71,126, // "a"
72,126, // "p"
73,126, // "s"
74,126, // "v"
75,126, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
76,126, // "c"
77,126, // "f"
78,126, // "i"
79,126, // "l"
80,126, // "o"
81,126, // "r"
82,126, // "u"
83,126, // "b"
84,126, // "e"
85,126, // "h"
86,126, // "n"
87,126, // "t"
88,259, // letter128
89,198, // {199..218 231..250}
90,198, // {193..198 225..230}
92,353, // {"1".."9"}
93,134, // "0"
94,161, // digit128
95,3, // {176..185}
98,240, // "-"
102,362, // "#"
113,433, // "("
114,420, // "+"
118,32, // "@"
121,439, // "!"
122,88, // "'"
123,216, // '"'
  }
,
{ // state 249
2,167, // ws*
101,112, // " "
119,340, // {10}
128,359, // ws
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 250
2,199, // ws*
22,MIN_REDUCTION+194, // `[
97,MIN_REDUCTION+194, // "["
101,374, // " "
119,14, // {10}
128,111, // ws
MIN_REDUCTION+194, // (default reduction)
  }
,
{ // state 251
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 252
22,MIN_REDUCTION+191, // `[
97,MIN_REDUCTION+191, // "["
101,374, // " "
119,14, // {10}
128,453, // ws
MIN_REDUCTION+191, // (default reduction)
  }
,
{ // state 253
0x80000000|330, // match move
0x80000000|329, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 254
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 255
22,MIN_REDUCTION+86, // `[
97,MIN_REDUCTION+86, // "["
101,374, // " "
119,14, // {10}
128,453, // ws
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 256
0x80000000|302, // match move
0x80000000|410, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 257
7,92, // ID
15,184, // `(
50,300, // <cast exp>
52,233, // <exp8>
54,331, // INTLIT
55,208, // STRINGLIT
56,178, // CHARLIT
57,97, // `false
58,172, // `this
59,73, // `true
60,37, // `null
62,384, // `new
63,411, // <call exp>
68,93, // `super
70,110, // letter
71,126, // "a"
72,126, // "p"
73,126, // "s"
74,126, // "v"
75,126, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
76,126, // "c"
77,126, // "f"
78,126, // "i"
79,126, // "l"
80,126, // "o"
81,126, // "r"
82,126, // "u"
83,126, // "b"
84,126, // "e"
85,126, // "h"
86,126, // "n"
87,126, // "t"
88,259, // letter128
89,198, // {199..218 231..250}
90,198, // {193..198 225..230}
92,353, // {"1".."9"}
93,134, // "0"
94,161, // digit128
95,3, // {176..185}
102,362, // "#"
113,433, // "("
118,32, // "@"
122,88, // "'"
123,216, // '"'
  }
,
{ // state 258
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 259
0x80000000|47, // match move
0x80000000|11, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 260
101,112, // " "
119,340, // {10}
128,286, // ws
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 261
0x80000000|4, // match move
0x80000000|43, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 262
37,424, // `<
39,138, // `>
40,316, // `instanceof
41,20, // `<=
42,142, // `>=
99,66, // "<"
102,295, // "#"
109,100, // ">"
118,380, // "@"
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 263
32,248, // `&&
118,287, // "@"
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 264
7,92, // ID
15,184, // `(
35,326, // <exp4>
38,234, // <exp5>
43,352, // `+
44,115, // <exp6>
45,291, // `-
47,150, // <exp7>
50,45, // <cast exp>
51,271, // <unary exp>
52,393, // <exp8>
53,141, // `!
54,331, // INTLIT
55,208, // STRINGLIT
56,178, // CHARLIT
57,97, // `false
58,172, // `this
59,73, // `true
60,37, // `null
62,384, // `new
63,411, // <call exp>
68,93, // `super
70,110, // letter
71,126, // "a"
72,126, // "p"
73,126, // "s"
74,126, // "v"
75,126, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
76,126, // "c"
77,126, // "f"
78,126, // "i"
79,126, // "l"
80,126, // "o"
81,126, // "r"
82,126, // "u"
83,126, // "b"
84,126, // "e"
85,126, // "h"
86,126, // "n"
87,126, // "t"
88,259, // letter128
89,198, // {199..218 231..250}
90,198, // {193..198 225..230}
92,353, // {"1".."9"}
93,134, // "0"
94,161, // digit128
95,3, // {176..185}
98,240, // "-"
102,362, // "#"
113,433, // "("
114,420, // "+"
118,32, // "@"
121,439, // "!"
122,88, // "'"
123,216, // '"'
  }
,
{ // state 265
9,133, // <decl in class>*
10,181, // `}
11,27, // <decl in class>
12,130, // <method decl>
13,119, // `public
102,335, // "#"
120,401, // "}"
  }
,
{ // state 266
2,348, // ws*
22,MIN_REDUCTION+85, // `[
97,MIN_REDUCTION+85, // "["
101,374, // " "
119,14, // {10}
128,111, // ws
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 267
22,399, // `[
61,289, // `.
97,249, // "["
115,224, // "."
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 268
30,245, // `||
118,55, // "@"
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 269
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 270
46,230, // `*
48,8, // `/
49,463, // `%
107,238, // "/"
112,5, // "%"
124,219, // "*"
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 271
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 272
0x80000000|75, // match move
0x80000000|396, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 273
101,112, // " "
119,340, // {10}
128,286, // ws
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 274
2,242, // ws*
22,MIN_REDUCTION+196, // `[
97,MIN_REDUCTION+196, // "["
101,374, // " "
119,14, // {10}
128,111, // ws
MIN_REDUCTION+196, // (default reduction)
  }
,
{ // state 275
2,451, // ws*
101,112, // " "
119,340, // {10}
128,359, // ws
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 276
0x80000000|239, // match move
0x80000000|152, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 277
101,112, // " "
119,340, // {10}
128,286, // ws
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 278
7,92, // ID
52,349, // <exp8>
54,331, // INTLIT
55,208, // STRINGLIT
56,178, // CHARLIT
57,97, // `false
58,172, // `this
59,73, // `true
60,37, // `null
62,384, // `new
63,411, // <call exp>
68,93, // `super
70,110, // letter
71,126, // "a"
72,126, // "p"
73,126, // "s"
74,126, // "v"
75,126, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
76,126, // "c"
77,126, // "f"
78,126, // "i"
79,126, // "l"
80,126, // "o"
81,126, // "r"
82,126, // "u"
83,126, // "b"
84,126, // "e"
85,126, // "h"
86,126, // "n"
87,126, // "t"
88,259, // letter128
89,198, // {199..218 231..250}
90,198, // {193..198 225..230}
92,353, // {"1".."9"}
93,134, // "0"
94,161, // digit128
95,3, // {176..185}
102,362, // "#"
118,32, // "@"
122,88, // "'"
123,216, // '"'
  }
,
{ // state 279
15,38, // `(
22,MIN_REDUCTION+48, // `[
97,MIN_REDUCTION+48, // "["
113,433, // "("
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 280
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 281
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 282
22,MIN_REDUCTION+112, // `[
97,MIN_REDUCTION+112, // "["
101,374, // " "
119,14, // {10}
128,453, // ws
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 283
MIN_REDUCTION+169, // (default reduction)
  }
,
{ // state 284
91,140, // digit
92,269, // {"1".."9"}
93,269, // "0"
94,151, // digit128
95,3, // {176..185}
132,182, // $$1
  }
,
{ // state 285
22,MIN_REDUCTION+74, // `[
97,MIN_REDUCTION+74, // "["
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 286
142,MIN_REDUCTION+178, // $NT
MIN_REDUCTION+178, // (default reduction)
  }
,
{ // state 287
100,203, // "|"
103,26, // "&"
  }
,
{ // state 288
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 289
7,168, // ID
70,110, // letter
71,126, // "a"
72,126, // "p"
73,126, // "s"
74,126, // "v"
75,126, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
76,126, // "c"
77,126, // "f"
78,126, // "i"
79,126, // "l"
80,126, // "o"
81,126, // "r"
82,126, // "u"
83,126, // "b"
84,126, // "e"
85,126, // "h"
86,126, // "n"
87,126, // "t"
88,259, // letter128
89,198, // {199..218 231..250}
90,198, // {193..198 225..230}
  }
,
{ // state 290
MIN_REDUCTION+183, // (default reduction)
  }
,
{ // state 291
7,92, // ID
43,352, // `+
45,291, // `-
51,324, // <unary exp>
52,393, // <exp8>
53,141, // `!
54,331, // INTLIT
55,208, // STRINGLIT
56,178, // CHARLIT
57,97, // `false
58,172, // `this
59,73, // `true
60,37, // `null
62,384, // `new
63,411, // <call exp>
68,93, // `super
70,110, // letter
71,126, // "a"
72,126, // "p"
73,126, // "s"
74,126, // "v"
75,126, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
76,126, // "c"
77,126, // "f"
78,126, // "i"
79,126, // "l"
80,126, // "o"
81,126, // "r"
82,126, // "u"
83,126, // "b"
84,126, // "e"
85,126, // "h"
86,126, // "n"
87,126, // "t"
88,259, // letter128
89,198, // {199..218 231..250}
90,198, // {193..198 225..230}
92,353, // {"1".."9"}
93,134, // "0"
94,161, // digit128
95,3, // {176..185}
98,240, // "-"
102,362, // "#"
114,420, // "+"
118,32, // "@"
121,439, // "!"
122,88, // "'"
123,216, // '"'
  }
,
{ // state 292
22,MIN_REDUCTION+152, // `[
97,MIN_REDUCTION+152, // "["
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 293
22,MIN_REDUCTION+66, // `[
97,MIN_REDUCTION+66, // "["
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 294
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 295
78,149, // "i"
  }
,
{ // state 296
7,MIN_REDUCTION+11, // ID
15,38, // `(
22,MIN_REDUCTION+48, // `[
71,MIN_REDUCTION+11, // "a"
72,MIN_REDUCTION+11, // "p"
73,MIN_REDUCTION+11, // "s"
74,MIN_REDUCTION+11, // "v"
75,MIN_REDUCTION+11, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
76,MIN_REDUCTION+11, // "c"
77,MIN_REDUCTION+11, // "f"
78,MIN_REDUCTION+11, // "i"
79,MIN_REDUCTION+11, // "l"
80,MIN_REDUCTION+11, // "o"
81,MIN_REDUCTION+11, // "r"
82,MIN_REDUCTION+11, // "u"
83,MIN_REDUCTION+11, // "b"
84,MIN_REDUCTION+11, // "e"
85,MIN_REDUCTION+11, // "h"
86,MIN_REDUCTION+11, // "n"
87,MIN_REDUCTION+11, // "t"
89,MIN_REDUCTION+11, // {199..218 231..250}
90,MIN_REDUCTION+11, // {193..198 225..230}
97,MIN_REDUCTION+48, // "["
113,433, // "("
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 297
2,365, // ws*
101,112, // " "
119,340, // {10}
128,359, // ws
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 298
22,MIN_REDUCTION+60, // `[
97,MIN_REDUCTION+60, // "["
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 299
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 300
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 301
2,347, // ws*
  }
,
{ // state 302
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 303
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 304
2,416, // ws*
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 305
0x80000000|174, // match move
0x80000000|319, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 306
22,399, // `[
61,289, // `.
65,85, // <recurse>
66,278, // `,
67,217, // <recurse>*
97,249, // "["
105,402, // ","
115,224, // "."
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 307
22,MIN_REDUCTION+59, // `[
97,MIN_REDUCTION+59, // "["
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 308
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 309
101,112, // " "
119,340, // {10}
128,286, // ws
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 310
101,112, // " "
119,340, // {10}
128,286, // ws
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 311
22,MIN_REDUCTION+73, // `[
97,MIN_REDUCTION+73, // "["
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 312
101,112, // " "
119,340, // {10}
128,286, // ws
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 313
82,328, // "u"
  }
,
{ // state 314
22,MIN_REDUCTION+49, // `[
97,MIN_REDUCTION+49, // "["
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 315
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 316
7,53, // ID
70,189, // letter
71,126, // "a"
72,126, // "p"
73,126, // "s"
74,126, // "v"
75,126, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
76,126, // "c"
77,126, // "f"
78,126, // "i"
79,126, // "l"
80,126, // "o"
81,126, // "r"
82,126, // "u"
83,126, // "b"
84,126, // "e"
85,126, // "h"
86,126, // "n"
87,126, // "t"
88,434, // letter128
89,227, // {199..218 231..250}
90,227, // {193..198 225..230}
  }
,
{ // state 317
0x80000000|322, // match move
0x80000000|440, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 318
0x80000000|121, // match move
0x80000000|52, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 319
2,317, // ws*
22,MIN_REDUCTION+163, // `[
97,MIN_REDUCTION+163, // "["
101,374, // " "
119,14, // {10}
128,111, // ws
MIN_REDUCTION+163, // (default reduction)
  }
,
{ // state 320
22,MIN_REDUCTION+65, // `[
97,MIN_REDUCTION+65, // "["
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 321
2,459, // ws*
MIN_REDUCTION+159, // (default reduction)
  }
,
{ // state 322
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 323
22,MIN_REDUCTION+84, // `[
97,MIN_REDUCTION+84, // "["
101,374, // " "
119,14, // {10}
128,453, // ws
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 324
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 325
MIN_REDUCTION+172, // (default reduction)
  }
,
{ // state 326
37,424, // `<
39,138, // `>
40,316, // `instanceof
41,20, // `<=
42,142, // `>=
99,66, // "<"
102,295, // "#"
109,100, // ">"
118,380, // "@"
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 327
16,436, // `)
104,201, // ")"
  }
,
{ // state 328
2,171, // ws*
101,112, // " "
119,340, // {10}
128,359, // ws
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 329
22,MIN_REDUCTION+157, // `[
97,MIN_REDUCTION+157, // "["
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 330
MIN_REDUCTION+157, // (default reduction)
  }
,
{ // state 331
0x80000000|406, // match move
0x80000000|418, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 332
0x80000000|154, // match move
0x80000000|306, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 333
0x80000000|395, // match move
0x80000000|405, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 334
MIN_REDUCTION+186, // (default reduction)
  }
,
{ // state 335
72,128, // "p"
  }
,
{ // state 336
0x80000000|363, // match move
0x80000000|311, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 337
MIN_REDUCTION+156, // (default reduction)
  }
,
{ // state 338
101,112, // " "
119,340, // {10}
128,286, // ws
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 339
2,312, // ws*
101,112, // " "
119,340, // {10}
128,359, // ws
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 340
142,MIN_REDUCTION+75, // $NT
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 341
76,175, // "c"
  }
,
{ // state 342
7,246, // ID
70,189, // letter
71,126, // "a"
72,126, // "p"
73,126, // "s"
74,126, // "v"
75,126, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
76,126, // "c"
77,126, // "f"
78,126, // "i"
79,126, // "l"
80,126, // "o"
81,126, // "r"
82,126, // "u"
83,126, // "b"
84,126, // "e"
85,126, // "h"
86,126, // "n"
87,126, // "t"
88,434, // letter128
89,227, // {199..218 231..250}
90,227, // {193..198 225..230}
  }
,
{ // state 343
22,170, // `[
97,249, // "["
  }
,
{ // state 344
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 345
2,416, // ws*
22,MIN_REDUCTION+113, // `[
97,MIN_REDUCTION+113, // "["
101,374, // " "
119,14, // {10}
128,111, // ws
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 346
101,112, // " "
119,340, // {10}
128,286, // ws
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 347
0x80000000|59, // match move
0x80000000|180, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 348
0x80000000|308, // match move
0x80000000|323, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 349
0x80000000|2, // match move
0x80000000|267, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 350
2,90, // ws*
101,112, // " "
119,340, // {10}
128,359, // ws
MIN_REDUCTION+192, // (default reduction)
  }
,
{ // state 351
MIN_REDUCTION+151, // (default reduction)
  }
,
{ // state 352
7,92, // ID
43,352, // `+
45,291, // `-
51,288, // <unary exp>
52,393, // <exp8>
53,141, // `!
54,331, // INTLIT
55,208, // STRINGLIT
56,178, // CHARLIT
57,97, // `false
58,172, // `this
59,73, // `true
60,37, // `null
62,384, // `new
63,411, // <call exp>
68,93, // `super
70,110, // letter
71,126, // "a"
72,126, // "p"
73,126, // "s"
74,126, // "v"
75,126, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
76,126, // "c"
77,126, // "f"
78,126, // "i"
79,126, // "l"
80,126, // "o"
81,126, // "r"
82,126, // "u"
83,126, // "b"
84,126, // "e"
85,126, // "h"
86,126, // "n"
87,126, // "t"
88,259, // letter128
89,198, // {199..218 231..250}
90,198, // {193..198 225..230}
92,353, // {"1".."9"}
93,134, // "0"
94,161, // digit128
95,3, // {176..185}
98,240, // "-"
102,362, // "#"
114,420, // "+"
118,32, // "@"
121,439, // "!"
122,88, // "'"
123,216, // '"'
  }
,
{ // state 353
91,191, // digit
92,269, // {"1".."9"}
93,269, // "0"
94,151, // digit128
95,3, // {176..185}
131,284, // digit*
132,106, // $$1
  }
,
{ // state 354
7,92, // ID
16,408, // `)
52,332, // <exp8>
54,331, // INTLIT
55,208, // STRINGLIT
56,178, // CHARLIT
57,97, // `false
58,172, // `this
59,73, // `true
60,37, // `null
62,384, // `new
63,411, // <call exp>
64,70, // <exp list>
68,93, // `super
69,215, // <exp list>?
70,110, // letter
71,126, // "a"
72,126, // "p"
73,126, // "s"
74,126, // "v"
75,126, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
76,126, // "c"
77,126, // "f"
78,126, // "i"
79,126, // "l"
80,126, // "o"
81,126, // "r"
82,126, // "u"
83,126, // "b"
84,126, // "e"
85,126, // "h"
86,126, // "n"
87,126, // "t"
88,259, // letter128
89,198, // {199..218 231..250}
90,198, // {193..198 225..230}
92,353, // {"1".."9"}
93,134, // "0"
94,161, // digit128
95,3, // {176..185}
102,362, // "#"
104,201, // ")"
118,32, // "@"
122,88, // "'"
123,216, // '"'
  }
,
{ // state 355
MIN_REDUCTION+195, // (default reduction)
  }
,
{ // state 356
2,310, // ws*
101,112, // " "
119,340, // {10}
128,359, // ws
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 357
7,92, // ID
52,332, // <exp8>
54,331, // INTLIT
55,208, // STRINGLIT
56,178, // CHARLIT
57,97, // `false
58,172, // `this
59,73, // `true
60,37, // `null
62,384, // `new
63,411, // <call exp>
64,209, // <exp list>
68,93, // `super
70,110, // letter
71,126, // "a"
72,126, // "p"
73,126, // "s"
74,126, // "v"
75,126, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
76,126, // "c"
77,126, // "f"
78,126, // "i"
79,126, // "l"
80,126, // "o"
81,126, // "r"
82,126, // "u"
83,126, // "b"
84,126, // "e"
85,126, // "h"
86,126, // "n"
87,126, // "t"
88,259, // letter128
89,198, // {199..218 231..250}
90,198, // {193..198 225..230}
92,353, // {"1".."9"}
93,134, // "0"
94,161, // digit128
95,3, // {176..185}
102,362, // "#"
118,32, // "@"
122,88, // "'"
123,216, // '"'
  }
,
{ // state 358
73,313, // "s"
77,232, // "f"
78,165, // "i"
83,407, // "b"
86,18, // "n"
87,86, // "t"
  }
,
{ // state 359
142,MIN_REDUCTION+179, // $NT
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 360
37,424, // `<
39,138, // `>
40,316, // `instanceof
41,20, // `<=
42,142, // `>=
99,66, // "<"
102,295, // "#"
109,100, // ">"
118,380, // "@"
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 361
2,84, // ws*
22,MIN_REDUCTION+87, // `[
97,MIN_REDUCTION+87, // "["
101,374, // " "
119,14, // {10}
128,111, // ws
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 362
73,313, // "s"
77,232, // "f"
86,18, // "n"
87,86, // "t"
  }
,
{ // state 363
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 364
15,212, // `(
113,433, // "("
  }
,
{ // state 365
101,112, // " "
119,340, // {10}
128,286, // ws
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 366
2,347, // ws*
22,MIN_REDUCTION+198, // `[
97,MIN_REDUCTION+198, // "["
101,374, // " "
119,14, // {10}
128,111, // ws
MIN_REDUCTION+198, // (default reduction)
  }
,
{ // state 367
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 368
100,203, // "|"
103,26, // "&"
117,339, // "="
121,23, // "!"
  }
,
{ // state 369
0x80000000|413, // match move
0x80000000|430, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 370
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 371
70,125, // letter
71,126, // "a"
72,126, // "p"
73,126, // "s"
74,126, // "v"
75,126, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
76,126, // "c"
77,126, // "f"
78,126, // "i"
79,126, // "l"
80,126, // "o"
81,126, // "r"
82,126, // "u"
83,126, // "b"
84,126, // "e"
85,126, // "h"
86,126, // "n"
87,126, // "t"
88,394, // letter128
89,227, // {199..218 231..250}
90,227, // {193..198 225..230}
91,21, // digit
92,269, // {"1".."9"}
93,269, // "0"
94,57, // digit128
95,25, // {176..185}
116,398, // "_"
126,225, // {223}
130,82, // $$0
137,382, // idChar
138,350, // idChar128
  }
,
{ // state 372
43,414, // `+
45,58, // `-
98,240, // "-"
114,420, // "+"
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 373
0x80000000|281, // match move
0x80000000|404, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 374
0x80000000|223, // match move
0x80000000|285, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 375
141,MIN_REDUCTION+0, // $
  }
,
{ // state 376
2,347, // ws*
MIN_REDUCTION+198, // (default reduction)
  }
,
{ // state 377
2,276, // ws*
  }
,
{ // state 378
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 379
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 380
99,403, // "<"
100,203, // "|"
103,26, // "&"
109,356, // ">"
117,339, // "="
121,23, // "!"
  }
,
{ // state 381
101,112, // " "
119,340, // {10}
128,286, // ws
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 382
MIN_REDUCTION+185, // (default reduction)
  }
,
{ // state 383
2,72, // ws*
101,112, // " "
119,340, // {10}
128,359, // ws
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 384
7,364, // ID
70,189, // letter
71,126, // "a"
72,126, // "p"
73,126, // "s"
74,126, // "v"
75,126, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
76,126, // "c"
77,126, // "f"
78,126, // "i"
79,126, // "l"
80,126, // "o"
81,126, // "r"
82,126, // "u"
83,126, // "b"
84,126, // "e"
85,126, // "h"
86,126, // "n"
87,126, // "t"
88,434, // letter128
89,227, // {199..218 231..250}
90,227, // {193..198 225..230}
  }
,
{ // state 385
43,414, // `+
45,58, // `-
98,240, // "-"
114,420, // "+"
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 386
101,112, // " "
119,340, // {10}
128,286, // ws
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 387
101,112, // " "
119,340, // {10}
128,286, // ws
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 388
29,143, // `=
30,245, // `||
117,226, // "="
118,55, // "@"
  }
,
{ // state 389
MIN_REDUCTION+176, // (default reduction)
  }
,
{ // state 390
MIN_REDUCTION+188, // (default reduction)
  }
,
{ // state 391
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 392
74,156, // "v"
  }
,
{ // state 393
0x80000000|2, // match move
0x80000000|159, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 394
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 395
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 396
22,MIN_REDUCTION+167, // `[
97,MIN_REDUCTION+167, // "["
MIN_REDUCTION+167, // (default reduction)
  }
,
{ // state 397
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 398
MIN_REDUCTION+166, // (default reduction)
  }
,
{ // state 399
7,92, // ID
15,184, // `(
28,192, // <exp>
31,263, // <exp2>
33,80, // <exp3>
35,360, // <exp4>
38,234, // <exp5>
43,352, // `+
44,115, // <exp6>
45,291, // `-
47,150, // <exp7>
50,45, // <cast exp>
51,271, // <unary exp>
52,393, // <exp8>
53,141, // `!
54,331, // INTLIT
55,208, // STRINGLIT
56,178, // CHARLIT
57,97, // `false
58,172, // `this
59,73, // `true
60,37, // `null
62,384, // `new
63,411, // <call exp>
68,93, // `super
70,110, // letter
71,126, // "a"
72,126, // "p"
73,126, // "s"
74,126, // "v"
75,126, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
76,126, // "c"
77,126, // "f"
78,126, // "i"
79,126, // "l"
80,126, // "o"
81,126, // "r"
82,126, // "u"
83,126, // "b"
84,126, // "e"
85,126, // "h"
86,126, // "n"
87,126, // "t"
88,259, // letter128
89,198, // {199..218 231..250}
90,198, // {193..198 225..230}
92,353, // {"1".."9"}
93,134, // "0"
94,161, // digit128
95,3, // {176..185}
98,240, // "-"
102,362, // "#"
113,433, // "("
114,420, // "+"
118,32, // "@"
121,439, // "!"
122,88, // "'"
123,216, // '"'
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
{ // state 400
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 401
2,49, // ws*
101,112, // " "
119,340, // {10}
128,359, // ws
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 402
2,450, // ws*
101,112, // " "
119,340, // {10}
128,359, // ws
MIN_REDUCTION+137, // (default reduction)
  }
,
{ // state 403
2,104, // ws*
101,112, // " "
119,340, // {10}
128,359, // ws
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 404
22,MIN_REDUCTION+72, // `[
97,MIN_REDUCTION+72, // "["
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 405
22,MIN_REDUCTION+160, // `[
97,MIN_REDUCTION+160, // "["
MIN_REDUCTION+160, // (default reduction)
  }
,
{ // state 406
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 407
80,56, // "o"
  }
,
{ // state 408
0x80000000|378, // match move
0x80000000|320, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 409
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 410
22,MIN_REDUCTION+58, // `[
97,MIN_REDUCTION+58, // "["
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 411
0x80000000|78, // match move
0x80000000|307, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 412
7,243, // ID
8,448, // `{
10,251, // `}
15,184, // `(
17,71, // <stmt>*
18,120, // <type>
19,258, // `int
20,391, // `boolean
24,107, // <stmt>
25,29, // <assign>
27,28, // <local var decl>
28,388, // <exp>
31,263, // <exp2>
33,80, // <exp3>
35,360, // <exp4>
38,234, // <exp5>
43,352, // `+
44,115, // <exp6>
45,291, // `-
47,150, // <exp7>
50,45, // <cast exp>
51,271, // <unary exp>
52,393, // <exp8>
53,141, // `!
54,331, // INTLIT
55,208, // STRINGLIT
56,178, // CHARLIT
57,97, // `false
58,172, // `this
59,73, // `true
60,37, // `null
62,384, // `new
63,411, // <call exp>
68,93, // `super
70,110, // letter
71,126, // "a"
72,126, // "p"
73,126, // "s"
74,126, // "v"
75,126, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
76,126, // "c"
77,126, // "f"
78,126, // "i"
79,126, // "l"
80,126, // "o"
81,126, // "r"
82,126, // "u"
83,126, // "b"
84,126, // "e"
85,126, // "h"
86,126, // "n"
87,126, // "t"
88,259, // letter128
89,198, // {199..218 231..250}
90,198, // {193..198 225..230}
92,353, // {"1".."9"}
93,134, // "0"
94,161, // digit128
95,3, // {176..185}
98,240, // "-"
102,358, // "#"
110,147, // "{"
113,433, // "("
114,420, // "+"
118,32, // "@"
120,401, // "}"
121,439, // "!"
122,88, // "'"
123,216, // '"'
  }
,
{ // state 413
2,421, // ws*
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 414
7,92, // ID
15,184, // `(
43,352, // `+
44,428, // <exp6>
45,291, // `-
47,150, // <exp7>
50,45, // <cast exp>
51,271, // <unary exp>
52,393, // <exp8>
53,141, // `!
54,331, // INTLIT
55,208, // STRINGLIT
56,178, // CHARLIT
57,97, // `false
58,172, // `this
59,73, // `true
60,37, // `null
62,384, // `new
63,411, // <call exp>
68,93, // `super
70,110, // letter
71,126, // "a"
72,126, // "p"
73,126, // "s"
74,126, // "v"
75,126, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
76,126, // "c"
77,126, // "f"
78,126, // "i"
79,126, // "l"
80,126, // "o"
81,126, // "r"
82,126, // "u"
83,126, // "b"
84,126, // "e"
85,126, // "h"
86,126, // "n"
87,126, // "t"
88,259, // letter128
89,198, // {199..218 231..250}
90,198, // {193..198 225..230}
92,353, // {"1".."9"}
93,134, // "0"
94,161, // digit128
95,3, // {176..185}
98,240, // "-"
102,362, // "#"
113,433, // "("
114,420, // "+"
118,32, // "@"
121,439, // "!"
122,88, // "'"
123,216, // '"'
  }
,
{ // state 415
MIN_REDUCTION+193, // (default reduction)
  }
,
{ // state 416
0x80000000|127, // match move
0x80000000|282, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 417
0x80000000|214, // match move
0x80000000|164, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 418
22,MIN_REDUCTION+50, // `[
97,MIN_REDUCTION+50, // "["
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 419
MIN_REDUCTION+171, // (default reduction)
  }
,
{ // state 420
2,458, // ws*
101,112, // " "
119,340, // {10}
128,359, // ws
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 421
0x80000000|370, // match move
0x80000000|50, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 422
2,206, // ws*
101,112, // " "
119,340, // {10}
128,359, // ws
142,MIN_REDUCTION+129, // $NT
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 423
0x80000000|41, // match move
0x80000000|274, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 424
7,92, // ID
15,184, // `(
38,94, // <exp5>
43,352, // `+
44,115, // <exp6>
45,291, // `-
47,150, // <exp7>
50,45, // <cast exp>
51,271, // <unary exp>
52,393, // <exp8>
53,141, // `!
54,331, // INTLIT
55,208, // STRINGLIT
56,178, // CHARLIT
57,97, // `false
58,172, // `this
59,73, // `true
60,37, // `null
62,384, // `new
63,411, // <call exp>
68,93, // `super
70,110, // letter
71,126, // "a"
72,126, // "p"
73,126, // "s"
74,126, // "v"
75,126, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
76,126, // "c"
77,126, // "f"
78,126, // "i"
79,126, // "l"
80,126, // "o"
81,126, // "r"
82,126, // "u"
83,126, // "b"
84,126, // "e"
85,126, // "h"
86,126, // "n"
87,126, // "t"
88,259, // letter128
89,198, // {199..218 231..250}
90,198, // {193..198 225..230}
92,353, // {"1".."9"}
93,134, // "0"
94,161, // digit128
95,3, // {176..185}
98,240, // "-"
102,362, // "#"
113,433, // "("
114,420, // "+"
118,32, // "@"
121,439, // "!"
122,88, // "'"
123,216, // '"'
  }
,
{ // state 425
0x80000000|351, // match move
0x80000000|95, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 426
MIN_REDUCTION+152, // (default reduction)
  }
,
{ // state 427
MIN_REDUCTION+189, // (default reduction)
  }
,
{ // state 428
46,230, // `*
48,8, // `/
49,463, // `%
107,238, // "/"
112,5, // "%"
124,219, // "*"
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 429
2,348, // ws*
  }
,
{ // state 430
2,421, // ws*
22,MIN_REDUCTION+89, // `[
97,MIN_REDUCTION+89, // "["
101,374, // " "
119,14, // {10}
128,111, // ws
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 431
0x80000000|222, // match move
0x80000000|298, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 432
70,125, // letter
71,126, // "a"
72,126, // "p"
73,126, // "s"
74,126, // "v"
75,126, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
76,126, // "c"
77,126, // "f"
78,126, // "i"
79,126, // "l"
80,126, // "o"
81,126, // "r"
82,126, // "u"
83,126, // "b"
84,126, // "e"
85,126, // "h"
86,126, // "n"
87,126, // "t"
88,272, // letter128
89,198, // {199..218 231..250}
90,198, // {193..198 225..230}
91,21, // digit
92,269, // {"1".."9"}
93,269, // "0"
94,417, // digit128
95,3, // {176..185}
116,398, // "_"
126,131, // {223}
130,318, // $$0
137,382, // idChar
138,13, // idChar128
  }
,
{ // state 433
2,386, // ws*
101,112, // " "
119,340, // {10}
128,359, // ws
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 434
2,10, // ws*
101,112, // " "
119,340, // {10}
128,359, // ws
MIN_REDUCTION+149, // (default reduction)
  }
,
{ // state 435
MIN_REDUCTION+179, // (default reduction)
  }
,
{ // state 436
0x80000000|132, // match move
0x80000000|293, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 437
0x80000000|7, // match move
0x80000000|187, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 438
2,101, // ws*
  }
,
{ // state 439
2,445, // ws*
101,112, // " "
119,340, // {10}
128,359, // ws
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 440
22,MIN_REDUCTION+162, // `[
97,MIN_REDUCTION+162, // "["
101,374, // " "
119,14, // {10}
128,453, // ws
MIN_REDUCTION+162, // (default reduction)
  }
,
{ // state 441
71,254, // "a"
72,254, // "p"
73,254, // "s"
74,254, // "v"
75,254, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
76,254, // "c"
77,254, // "f"
78,254, // "i"
79,254, // "l"
80,254, // "o"
81,254, // "r"
82,254, // "u"
83,254, // "b"
84,254, // "e"
85,254, // "h"
86,254, // "n"
87,254, // "t"
89,336, // {199..218 231..250}
90,336, // {193..198 225..230}
92,254, // {"1".."9"}
93,254, // "0"
95,336, // {176..185}
96,389, // any
97,254, // "["
98,254, // "-"
99,254, // "<"
100,254, // "|"
101,254, // " "
102,254, // "#"
103,254, // "&"
104,254, // ")"
105,254, // ","
106,254, // "]"
107,254, // "/"
108,254, // ";"
109,254, // ">"
110,254, // "{"
111,254, // {0..9 11..31 "$" ":" "?" "\" "^" "`" "~"..127}
112,254, // "%"
113,254, // "("
114,254, // "+"
115,254, // "."
116,254, // "_"
117,254, // "="
118,254, // "@"
119,254, // {10}
120,254, // "}"
121,254, // "!"
122,254, // "'"
123,254, // '"'
124,254, // "*"
125,185, // any128
126,336, // {223}
127,336, // {128..175 186..192 219..222 224 251..255}
136,333, // $$3
  }
,
{ // state 442
0x80000000|87, // match move
0x80000000|60, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 443
0x80000000|344, // match move
0x80000000|314, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 444
MIN_REDUCTION+174, // (default reduction)
  }
,
{ // state 445
101,112, // " "
119,340, // {10}
128,286, // ws
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 446
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 447
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 448
7,243, // ID
8,448, // `{
10,122, // `}
15,184, // `(
17,144, // <stmt>*
18,120, // <type>
19,258, // `int
20,391, // `boolean
24,107, // <stmt>
25,29, // <assign>
27,28, // <local var decl>
28,388, // <exp>
31,263, // <exp2>
33,80, // <exp3>
35,360, // <exp4>
38,234, // <exp5>
43,352, // `+
44,115, // <exp6>
45,291, // `-
47,150, // <exp7>
50,45, // <cast exp>
51,271, // <unary exp>
52,393, // <exp8>
53,141, // `!
54,331, // INTLIT
55,208, // STRINGLIT
56,178, // CHARLIT
57,97, // `false
58,172, // `this
59,73, // `true
60,37, // `null
62,384, // `new
63,411, // <call exp>
68,93, // `super
70,110, // letter
71,126, // "a"
72,126, // "p"
73,126, // "s"
74,126, // "v"
75,126, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
76,126, // "c"
77,126, // "f"
78,126, // "i"
79,126, // "l"
80,126, // "o"
81,126, // "r"
82,126, // "u"
83,126, // "b"
84,126, // "e"
85,126, // "h"
86,126, // "n"
87,126, // "t"
88,259, // letter128
89,198, // {199..218 231..250}
90,198, // {193..198 225..230}
92,353, // {"1".."9"}
93,134, // "0"
94,161, // digit128
95,3, // {176..185}
98,240, // "-"
102,358, // "#"
110,147, // "{"
113,433, // "("
114,420, // "+"
118,32, // "@"
120,401, // "}"
121,439, // "!"
122,88, // "'"
123,216, // '"'
  }
,
{ // state 449
30,245, // `||
118,55, // "@"
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 450
101,112, // " "
119,340, // {10}
128,286, // ws
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 451
101,112, // " "
119,340, // {10}
128,286, // ws
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 452
22,MIN_REDUCTION+53, // `[
97,MIN_REDUCTION+53, // "["
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 453
0x80000000|19, // match move
0x80000000|51, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 454
3,193, // <program>
4,91, // <class decl>+
5,462, // <class decl>
6,160, // `class
101,112, // " "
102,341, // "#"
119,340, // {10}
128,286, // ws
  }
,
{ // state 455
MIN_REDUCTION+177, // (default reduction)
  }
,
{ // state 456
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 457
43,414, // `+
45,58, // `-
98,240, // "-"
114,420, // "+"
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 458
101,112, // " "
119,340, // {10}
128,286, // ws
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 459
0x80000000|77, // match move
0x80000000|158, // no-match move
0x80000000|343, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 460
2,242, // ws*
  }
,
{ // state 461
2,199, // ws*
  }
,
{ // state 462
MIN_REDUCTION+187, // (default reduction)
  }
,
{ // state 463
7,92, // ID
15,184, // `(
43,352, // `+
45,291, // `-
47,39, // <exp7>
50,45, // <cast exp>
51,271, // <unary exp>
52,393, // <exp8>
53,141, // `!
54,331, // INTLIT
55,208, // STRINGLIT
56,178, // CHARLIT
57,97, // `false
58,172, // `this
59,73, // `true
60,37, // `null
62,384, // `new
63,411, // <call exp>
68,93, // `super
70,110, // letter
71,126, // "a"
72,126, // "p"
73,126, // "s"
74,126, // "v"
75,126, // {"A".."Z" "d" "g" "j".."k" "m" "q" "w".."z"}
76,126, // "c"
77,126, // "f"
78,126, // "i"
79,126, // "l"
80,126, // "o"
81,126, // "r"
82,126, // "u"
83,126, // "b"
84,126, // "e"
85,126, // "h"
86,126, // "n"
87,126, // "t"
88,259, // letter128
89,198, // {199..218 231..250}
90,198, // {193..198 225..230}
92,353, // {"1".."9"}
93,134, // "0"
94,161, // digit128
95,3, // {176..185}
98,240, // "-"
102,362, // "#"
113,433, // "("
114,420, // "+"
118,32, // "@"
121,439, // "!"
122,88, // "'"
123,216, // '"'
  }
,
};
}
public MJGrammarParseTable(MJGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[464][];
  int doneSoFar = 0;
  doneSoFar += new Initter1().doInit(doneSoFar);
  doneSoFar += new Initter2().doInit(doneSoFar);
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
// <class decl> ::= `class ID `{ <decl in class>* `}
(5<<16)+5,
// <class decl> ::= `class ID `{ `}
(5<<16)+4,
// <decl in class> ::= <method decl>
(11<<16)+1,
// <method decl> ::= `public `void ID `( `) `{ <stmt>* `}
(12<<16)+8,
// <method decl> ::= `public `void ID `( `) `{ `}
(12<<16)+7,
// <type> ::= `int
(18<<16)+1,
// <type> ::= `boolean
(18<<16)+1,
// <type> ::= ID
(18<<16)+1,
// <type> ::= <type> <empty bracket pair>
(18<<16)+2,
// <empty bracket pair> ::= `[ `]
(21<<16)+2,
// <stmt> ::= <assign> `;
(24<<16)+2,
// <stmt> ::= `{ <stmt>* `}
(24<<16)+3,
// <stmt> ::= `{ `}
(24<<16)+2,
// <stmt> ::= <local var decl> `;
(24<<16)+2,
// <assign> ::= <exp> `= <exp>
(25<<16)+3,
// <local var decl> ::= <type> ID `= <exp>
(27<<16)+4,
// <exp> ::= <exp> `|| <exp2>
(28<<16)+3,
// <exp> ::= <exp2>
(28<<16)+1,
// <exp2> ::= <exp2> `&& <exp3>
(31<<16)+3,
// <exp2> ::= <exp3>
(31<<16)+1,
// <exp3> ::= <exp3> `!= <exp4>
(33<<16)+3,
// <exp3> ::= <exp3> `== <exp4>
(33<<16)+3,
// <exp3> ::= <exp4>
(33<<16)+1,
// <exp4> ::= <exp4> `< <exp5>
(35<<16)+3,
// <exp4> ::= <exp4> `> <exp5>
(35<<16)+3,
// <exp4> ::= <exp4> `instanceof ID
(35<<16)+3,
// <exp4> ::= <exp4> `<= <exp5>
(35<<16)+3,
// <exp4> ::= <exp4> `>= <exp5>
(35<<16)+3,
// <exp4> ::= <exp5>
(35<<16)+1,
// <exp5> ::= <exp5> `+ <exp6>
(38<<16)+3,
// <exp5> ::= <exp5> `- <exp6>
(38<<16)+3,
// <exp5> ::= <exp6>
(38<<16)+1,
// <exp6> ::= <exp6> `* <exp7>
(44<<16)+3,
// <exp6> ::= <exp6> `/ <exp7>
(44<<16)+3,
// <exp6> ::= <exp6> `% <exp7>
(44<<16)+3,
// <exp6> ::= <exp7>
(44<<16)+1,
// <exp7> ::= <cast exp>
(47<<16)+1,
// <exp7> ::= <unary exp>
(47<<16)+1,
// <cast exp> ::= `( <type> `) <cast exp>
(50<<16)+4,
// <cast exp> ::= `( <type> `) <exp8>
(50<<16)+4,
// <unary exp> ::= `- <unary exp>
(51<<16)+2,
// <unary exp> ::= `+ <unary exp>
(51<<16)+2,
// <unary exp> ::= `! <unary exp>
(51<<16)+2,
// <unary exp> ::= <exp8>
(51<<16)+1,
// <exp8> ::= ID
(52<<16)+1,
// <exp8> ::= <exp8> !<empty bracket pair> `[ <exp> `]
(52<<16)+4,
// <exp8> ::= INTLIT
(52<<16)+1,
// <exp8> ::= STRINGLIT
(52<<16)+1,
// <exp8> ::= CHARLIT
(52<<16)+1,
// <exp8> ::= `false
(52<<16)+1,
// <exp8> ::= `this
(52<<16)+1,
// <exp8> ::= `true
(52<<16)+1,
// <exp8> ::= `null
(52<<16)+1,
// <exp8> ::= <exp8> `. ID
(52<<16)+3,
// <exp8> ::= `new ID `( `)
(52<<16)+4,
// <exp8> ::= <call exp>
(52<<16)+1,
// <call exp> ::= <exp8> `. ID `( <exp list> `)
(63<<16)+6,
// <recurse> ::= `, <exp8>
(65<<16)+2,
// <exp list> ::= <exp8> <recurse>*
(64<<16)+2,
// <exp list> ::= <exp8>
(64<<16)+1,
// <call exp> ::= `super `. ID `( <exp list>? `)
(63<<16)+6,
// <call exp> ::= `super `. ID `( `)
(63<<16)+5,
// <call exp> ::= ID `( <exp list>? `)
(63<<16)+4,
// <call exp> ::= ID `( `)
(63<<16)+3,
// letter ::= {"A".."Z" "a".."z"}
(70<<16)+1,
// letter128 ::= {193..218 225..250}
(88<<16)+1,
// digit ::= {"0".."9"}
(91<<16)+1,
// digit128 ::= {176..185}
(94<<16)+1,
// any ::= {0..127}
(96<<16)+1,
// any128 ::= {128..255}
(125<<16)+1,
// ws ::= " "
(128<<16)+1,
// ws ::= {10}
(128<<16)+1,
// `boolean ::= "#" "b" "o" ws*
(20<<16)+4,
// `boolean ::= "#" "b" "o"
(20<<16)+3,
// `class ::= "#" "c" "l" ws*
(6<<16)+4,
// `class ::= "#" "c" "l"
(6<<16)+3,
// `void ::= "#" "v" "o" ws*
(14<<16)+4,
// `void ::= "#" "v" "o"
(14<<16)+3,
// `int ::= "#" "i" "t" ws*
(19<<16)+4,
// `int ::= "#" "i" "t"
(19<<16)+3,
// `this ::= "#" "t" "h" ws*
(58<<16)+4,
// `this ::= "#" "t" "h"
(58<<16)+3,
// `false ::= "#" "f" "a" ws*
(57<<16)+4,
// `false ::= "#" "f" "a"
(57<<16)+3,
// `true ::= "#" "t" "r" ws*
(59<<16)+4,
// `true ::= "#" "t" "r"
(59<<16)+3,
// `super ::= "#" "s" "u" ws*
(68<<16)+4,
// `super ::= "#" "s" "u"
(68<<16)+3,
// `null ::= "#" "n" "u" ws*
(60<<16)+4,
// `null ::= "#" "n" "u"
(60<<16)+3,
// `instanceof ::= "#" "i" "n" ws*
(40<<16)+4,
// `instanceof ::= "#" "i" "n"
(40<<16)+3,
// `new ::= "#" "n" "e" ws*
(62<<16)+4,
// `new ::= "#" "n" "e"
(62<<16)+3,
// `public ::= "#" "p" "u" ws*
(13<<16)+4,
// `public ::= "#" "p" "u"
(13<<16)+3,
// `! ::= "!" ws*
(53<<16)+2,
// `! ::= "!"
(53<<16)+1,
// `!= ::= "@" "!" ws*
(34<<16)+3,
// `!= ::= "@" "!"
(34<<16)+2,
// `% ::= "%" ws*
(49<<16)+2,
// `% ::= "%"
(49<<16)+1,
// `&& ::= "@" "&" ws*
(32<<16)+3,
// `&& ::= "@" "&"
(32<<16)+2,
// `* ::= "*" ws*
(46<<16)+2,
// `* ::= "*"
(46<<16)+1,
// `( ::= "(" ws*
(15<<16)+2,
// `( ::= "("
(15<<16)+1,
// `) ::= ")" ws*
(16<<16)+2,
// `) ::= ")"
(16<<16)+1,
// `{ ::= "{" ws*
(8<<16)+2,
// `{ ::= "{"
(8<<16)+1,
// `} ::= "}" ws*
(10<<16)+2,
// `} ::= "}"
(10<<16)+1,
// `- ::= "-" ws*
(45<<16)+2,
// `- ::= "-"
(45<<16)+1,
// `+ ::= "+" ws*
(43<<16)+2,
// `+ ::= "+"
(43<<16)+1,
// `= ::= "=" ws*
(29<<16)+2,
// `= ::= "="
(29<<16)+1,
// `== ::= "@" "=" ws*
(36<<16)+3,
// `== ::= "@" "="
(36<<16)+2,
// `[ ::= "[" ws*
(22<<16)+2,
// `[ ::= "["
(22<<16)+1,
// `] ::= "]" ws*
(23<<16)+2,
// `] ::= "]"
(23<<16)+1,
// `|| ::= "@" "|" ws*
(30<<16)+3,
// `|| ::= "@" "|"
(30<<16)+2,
// `< ::= "<" ws*
(37<<16)+2,
// `< ::= "<"
(37<<16)+1,
// `<= ::= "@" "<" ws*
(41<<16)+3,
// `<= ::= "@" "<"
(41<<16)+2,
// `, ::= "," ws*
(66<<16)+2,
// `, ::= ","
(66<<16)+1,
// `> ::= ">" !"=" ws*
(39<<16)+2,
// `> ::= ">" !"="
(39<<16)+1,
// `>= ::= "@" ">" ws*
(42<<16)+3,
// `>= ::= "@" ">"
(42<<16)+2,
// `. ::= "." ws*
(61<<16)+2,
// `. ::= "."
(61<<16)+1,
// `; ::= ";" ws*
(26<<16)+2,
// `; ::= ";"
(26<<16)+1,
// `/ ::= "/" ws*
(48<<16)+2,
// `/ ::= "/"
(48<<16)+1,
// ID ::= letter128 ws*
(7<<16)+2,
// ID ::= letter128
(7<<16)+1,
// ID ::= letter idChar* $$0
(7<<16)+3,
// ID ::= letter $$0
(7<<16)+2,
// INTLIT ::= {"1".."9"} digit* $$1
(54<<16)+3,
// INTLIT ::= {"1".."9"} $$1
(54<<16)+2,
// INTLIT ::= digit128 ws*
(54<<16)+2,
// INTLIT ::= digit128
(54<<16)+1,
// INTLIT ::= "0" hexDigit* $$2
(54<<16)+3,
// INTLIT ::= "0" $$2
(54<<16)+2,
// STRINGLIT ::= "@" '"' ws*
(55<<16)+3,
// STRINGLIT ::= "@" '"'
(55<<16)+2,
// STRINGLIT ::= '"' any* $$3
(55<<16)+3,
// STRINGLIT ::= '"' $$3
(55<<16)+2,
// CHARLIT ::= "'" any ws*
(56<<16)+3,
// CHARLIT ::= "'" any
(56<<16)+2,
// idChar ::= letter
(137<<16)+1,
// idChar ::= digit
(137<<16)+1,
// idChar ::= "_"
(137<<16)+1,
// idChar128 ::= letter128
(138<<16)+1,
// idChar128 ::= digit128
(138<<16)+1,
// idChar128 ::= {223}
(138<<16)+1,
// hexDigit ::= {"0".."9" "A".."Z" "a".."z"}
(139<<16)+1,
// hexDigit128 ::= {176..185 193..198 225..230}
(140<<16)+1,
// <stmt>* ::= <stmt>* <stmt>
(17<<16)+2,
// <stmt>* ::= <stmt>
(17<<16)+1,
// <decl in class>* ::= <decl in class>* <decl in class>
(9<<16)+2,
// <decl in class>* ::= <decl in class>
(9<<16)+1,
// any* ::= any* any
(135<<16)+2,
// any* ::= any
(135<<16)+1,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// digit* ::= digit* digit
(131<<16)+2,
// digit* ::= digit
(131<<16)+1,
// <exp list>? ::= <exp list>
(69<<16)+1,
// hexDigit* ::= hexDigit* hexDigit
(133<<16)+2,
// hexDigit* ::= hexDigit
(133<<16)+1,
// idChar* ::= idChar* idChar
(129<<16)+2,
// idChar* ::= idChar
(129<<16)+1,
// <class decl>+ ::= <class decl>
(4<<16)+1,
// <class decl>+ ::= <class decl>+ <class decl>
(4<<16)+2,
// <recurse>* ::= <recurse>* <recurse>
(67<<16)+2,
// <recurse>* ::= <recurse>
(67<<16)+1,
// $$0 ::= idChar128 ws*
(130<<16)+2,
// $$0 ::= idChar128
(130<<16)+1,
// $$1 ::= digit128 ws*
(132<<16)+2,
// $$1 ::= digit128
(132<<16)+1,
// $$2 ::= hexDigit128 ws*
(134<<16)+2,
// $$2 ::= hexDigit128
(134<<16)+1,
// $$3 ::= any128 ws*
(136<<16)+2,
// $$3 ::= any128
(136<<16)+1,
};
public int[] getCharMapTable() { return charMapTable; }
private static int[] charMapTable = {
111, // 0
111, // 1
111, // 2
111, // 3
111, // 4
111, // 5
111, // 6
111, // 7
111, // 8
111, // 9
119, // 10
111, // 11
111, // 12
111, // 13
111, // 14
111, // 15
111, // 16
111, // 17
111, // 18
111, // 19
111, // 20
111, // 21
111, // 22
111, // 23
111, // 24
111, // 25
111, // 26
111, // 27
111, // 28
111, // 29
111, // 30
111, // 31
101, // " "
121, // "!"
123, // '"'
102, // "#"
111, // "$"
112, // "%"
103, // "&"
122, // "'"
113, // "("
104, // ")"
124, // "*"
114, // "+"
105, // ","
98, // "-"
115, // "."
107, // "/"
93, // "0"
92, // "1"
92, // "2"
92, // "3"
92, // "4"
92, // "5"
92, // "6"
92, // "7"
92, // "8"
92, // "9"
111, // ":"
108, // ";"
99, // "<"
117, // "="
109, // ">"
111, // "?"
118, // "@"
75, // "A"
75, // "B"
75, // "C"
75, // "D"
75, // "E"
75, // "F"
75, // "G"
75, // "H"
75, // "I"
75, // "J"
75, // "K"
75, // "L"
75, // "M"
75, // "N"
75, // "O"
75, // "P"
75, // "Q"
75, // "R"
75, // "S"
75, // "T"
75, // "U"
75, // "V"
75, // "W"
75, // "X"
75, // "Y"
75, // "Z"
97, // "["
111, // "\"
106, // "]"
111, // "^"
116, // "_"
111, // "`"
71, // "a"
83, // "b"
76, // "c"
75, // "d"
84, // "e"
77, // "f"
75, // "g"
85, // "h"
78, // "i"
75, // "j"
75, // "k"
79, // "l"
75, // "m"
86, // "n"
80, // "o"
72, // "p"
75, // "q"
81, // "r"
73, // "s"
87, // "t"
82, // "u"
74, // "v"
75, // "w"
75, // "x"
75, // "y"
75, // "z"
110, // "{"
100, // "|"
120, // "}"
111, // "~"
111, // 127
127, // 128
127, // 129
127, // 130
127, // 131
127, // 132
127, // 133
127, // 134
127, // 135
127, // 136
127, // 137
127, // 138
127, // 139
127, // 140
127, // 141
127, // 142
127, // 143
127, // 144
127, // 145
127, // 146
127, // 147
127, // 148
127, // 149
127, // 150
127, // 151
127, // 152
127, // 153
127, // 154
127, // 155
127, // 156
127, // 157
127, // 158
127, // 159
127, // 160
127, // 161
127, // 162
127, // 163
127, // 164
127, // 165
127, // 166
127, // 167
127, // 168
127, // 169
127, // 170
127, // 171
127, // 172
127, // 173
127, // 174
127, // 175
95, // 176
95, // 177
95, // 178
95, // 179
95, // 180
95, // 181
95, // 182
95, // 183
95, // 184
95, // 185
127, // 186
127, // 187
127, // 188
127, // 189
127, // 190
127, // 191
127, // 192
90, // 193
90, // 194
90, // 195
90, // 196
90, // 197
90, // 198
89, // 199
89, // 200
89, // 201
89, // 202
89, // 203
89, // 204
89, // 205
89, // 206
89, // 207
89, // 208
89, // 209
89, // 210
89, // 211
89, // 212
89, // 213
89, // 214
89, // 215
89, // 216
89, // 217
89, // 218
127, // 219
127, // 220
127, // 221
127, // 222
126, // 223
127, // 224
90, // 225
90, // 226
90, // 227
90, // 228
90, // 229
90, // 230
89, // 231
89, // 232
89, // 233
89, // 234
89, // 235
89, // 236
89, // 237
89, // 238
89, // 239
89, // 240
89, // 241
89, // 242
89, // 243
89, // 244
89, // 245
89, // 246
89, // 247
89, // 248
89, // 249
89, // 250
127, // 251
127, // 252
127, // 253
127, // 254
127, // 255
};
public String[] getActionProdNameTable() { return actionProdNameTable; }
private String[] actionProdNameTable = {
"", // 0
"<start> ::= ws* <program>", // 1
"<start> ::= ws* <program>", // 2
"<program> ::= # <class decl>+", // 3
"<class decl> ::= `class # ID `{ <decl in class>* `}", // 4
"<class decl> ::= `class # ID `{ <decl in class>* `}", // 5
"<decl in class> ::= <method decl>", // 6
"<method decl> ::= `public `void # ID `( `) `{ <stmt>* `}", // 7
"<method decl> ::= `public `void # ID `( `) `{ <stmt>* `}", // 8
"<type> ::= # `int", // 9
"<type> ::= # `boolean", // 10
"<type> ::= # ID", // 11
"<type> ::= # <type> <empty bracket pair>", // 12
"<empty bracket pair> ::= `[ `]", // 13
"<stmt> ::= <assign> `;", // 14
"<stmt> ::= # `{ <stmt>* `}", // 15
"<stmt> ::= # `{ <stmt>* `}", // 16
"<stmt> ::= <local var decl> `;", // 17
"<assign> ::= <exp> # `= <exp>", // 18
"<local var decl> ::= <type> # ID `= <exp>", // 19
"<exp> ::= <exp> # `|| <exp2>", // 20
"<exp> ::= <exp2>", // 21
"<exp2> ::= <exp2> # `&& <exp3>", // 22
"<exp2> ::= <exp3>", // 23
"<exp3> ::= <exp3> # `!= <exp4>", // 24
"<exp3> ::= <exp3> # `== <exp4>", // 25
"<exp3> ::= <exp4>", // 26
"<exp4> ::= <exp4> # `< <exp5>", // 27
"<exp4> ::= <exp4> # `> <exp5>", // 28
"<exp4> ::= <exp4> # `instanceof ID", // 29
"<exp4> ::= <exp4> # `<= <exp5>", // 30
"<exp4> ::= <exp4> # `>= <exp5>", // 31
"<exp4> ::= <exp5>", // 32
"<exp5> ::= <exp5> # `+ <exp6>", // 33
"<exp5> ::= <exp5> # `- <exp6>", // 34
"<exp5> ::= <exp6>", // 35
"<exp6> ::= <exp6> # `* <exp7>", // 36
"<exp6> ::= <exp6> # `/ <exp7>", // 37
"<exp6> ::= <exp6> # `% <exp7>", // 38
"<exp6> ::= <exp7>", // 39
"<exp7> ::= <cast exp>", // 40
"<exp7> ::= <unary exp>", // 41
"<cast exp> ::= # `( <type> `) <cast exp>", // 42
"<cast exp> ::= # `( <type> `) <exp8>", // 43
"<unary exp> ::= # `- <unary exp>", // 44
"<unary exp> ::= # `+ <unary exp>", // 45
"<unary exp> ::= # `! <unary exp>", // 46
"<unary exp> ::= <exp8>", // 47
"<exp8> ::= # ID", // 48
"<exp8> ::= <exp8> !<empty bracket pair> # `[ <exp> `]", // 49
"<exp8> ::= # INTLIT", // 50
"<exp8> ::= # STRINGLIT", // 51
"<exp8> ::= # CHARLIT", // 52
"<exp8> ::= # `false", // 53
"<exp8> ::= # `this", // 54
"<exp8> ::= # `true", // 55
"<exp8> ::= # `null", // 56
"<exp8> ::= # <exp8> `. ID", // 57
"<exp8> ::= # `new ID `( `)", // 58
"<exp8> ::= <call exp>", // 59
"<call exp> ::= # <exp8> `. ID `( <exp list> `)", // 60
"<recurse> ::= `, <exp8>", // 61
"<exp list> ::= <exp8> <recurse>*", // 62
"<exp list> ::= <exp8> <recurse>*", // 63
"<call exp> ::= # `super `. ID `( <exp list>? `)", // 64
"<call exp> ::= # `super `. ID `( <exp list>? `)", // 65
"<call exp> ::= # ID `( <exp list>? `)", // 66
"<call exp> ::= # ID `( <exp list>? `)", // 67
"letter ::= {\"A\"..\"Z\" \"a\"..\"z\"}", // 68
"letter128 ::= {193..218 225..250}", // 69
"digit ::= {\"0\"..\"9\"}", // 70
"digit128 ::= {176..185}", // 71
"any ::= {0..127}", // 72
"any128 ::= {128..255}", // 73
"ws ::= \" \"", // 74
"ws ::= {10} registerNewline", // 75
"`boolean ::= \"#\" \"b\" \"o\" ws*", // 76
"`boolean ::= \"#\" \"b\" \"o\" ws*", // 77
"`class ::= \"#\" \"c\" \"l\" ws*", // 78
"`class ::= \"#\" \"c\" \"l\" ws*", // 79
"`void ::= \"#\" \"v\" \"o\" ws*", // 80
"`void ::= \"#\" \"v\" \"o\" ws*", // 81
"`int ::= \"#\" \"i\" \"t\" ws*", // 82
"`int ::= \"#\" \"i\" \"t\" ws*", // 83
"`this ::= \"#\" \"t\" \"h\" ws*", // 84
"`this ::= \"#\" \"t\" \"h\" ws*", // 85
"`false ::= \"#\" \"f\" \"a\" ws*", // 86
"`false ::= \"#\" \"f\" \"a\" ws*", // 87
"`true ::= \"#\" \"t\" \"r\" ws*", // 88
"`true ::= \"#\" \"t\" \"r\" ws*", // 89
"`super ::= \"#\" \"s\" \"u\" ws*", // 90
"`super ::= \"#\" \"s\" \"u\" ws*", // 91
"`null ::= \"#\" \"n\" \"u\" ws*", // 92
"`null ::= \"#\" \"n\" \"u\" ws*", // 93
"`instanceof ::= \"#\" \"i\" \"n\" ws*", // 94
"`instanceof ::= \"#\" \"i\" \"n\" ws*", // 95
"`new ::= \"#\" \"n\" \"e\" ws*", // 96
"`new ::= \"#\" \"n\" \"e\" ws*", // 97
"`public ::= \"#\" \"p\" \"u\" ws*", // 98
"`public ::= \"#\" \"p\" \"u\" ws*", // 99
"`! ::= \"!\" ws*", // 100
"`! ::= \"!\" ws*", // 101
"`!= ::= \"@\" \"!\" ws*", // 102
"`!= ::= \"@\" \"!\" ws*", // 103
"`% ::= \"%\" ws*", // 104
"`% ::= \"%\" ws*", // 105
"`&& ::= \"@\" \"&\" ws*", // 106
"`&& ::= \"@\" \"&\" ws*", // 107
"`* ::= \"*\" ws*", // 108
"`* ::= \"*\" ws*", // 109
"`( ::= \"(\" ws*", // 110
"`( ::= \"(\" ws*", // 111
"`) ::= \")\" ws*", // 112
"`) ::= \")\" ws*", // 113
"`{ ::= \"{\" ws*", // 114
"`{ ::= \"{\" ws*", // 115
"`} ::= \"}\" ws*", // 116
"`} ::= \"}\" ws*", // 117
"`- ::= \"-\" ws*", // 118
"`- ::= \"-\" ws*", // 119
"`+ ::= \"+\" ws*", // 120
"`+ ::= \"+\" ws*", // 121
"`= ::= \"=\" ws*", // 122
"`= ::= \"=\" ws*", // 123
"`== ::= \"@\" \"=\" ws*", // 124
"`== ::= \"@\" \"=\" ws*", // 125
"`[ ::= \"[\" ws*", // 126
"`[ ::= \"[\" ws*", // 127
"`] ::= \"]\" ws*", // 128
"`] ::= \"]\" ws*", // 129
"`|| ::= \"@\" \"|\" ws*", // 130
"`|| ::= \"@\" \"|\" ws*", // 131
"`< ::= \"<\" ws*", // 132
"`< ::= \"<\" ws*", // 133
"`<= ::= \"@\" \"<\" ws*", // 134
"`<= ::= \"@\" \"<\" ws*", // 135
"`, ::= \",\" ws*", // 136
"`, ::= \",\" ws*", // 137
"`> ::= \">\" !\"=\" ws*", // 138
"`> ::= \">\" !\"=\" ws*", // 139
"`>= ::= \"@\" \">\" ws*", // 140
"`>= ::= \"@\" \">\" ws*", // 141
"`. ::= \".\" ws*", // 142
"`. ::= \".\" ws*", // 143
"`; ::= \";\" ws*", // 144
"`; ::= \";\" ws*", // 145
"`/ ::= \"/\" ws*", // 146
"`/ ::= \"/\" ws*", // 147
"ID ::= letter128 ws*", // 148
"ID ::= letter128 ws*", // 149
"ID ::= letter idChar* idChar128 ws*", // 150
"ID ::= letter idChar* idChar128 ws*", // 151
"INTLIT ::= {\"1\"..\"9\"} digit* digit128 ws*", // 152
"INTLIT ::= {\"1\"..\"9\"} digit* digit128 ws*", // 153
"INTLIT ::= digit128 ws*", // 154
"INTLIT ::= digit128 ws*", // 155
"INTLIT ::= \"0\" hexDigit* hexDigit128 ws*", // 156
"INTLIT ::= \"0\" hexDigit* hexDigit128 ws*", // 157
"STRINGLIT ::= \"@\" \'\"\' ws*", // 158
"STRINGLIT ::= \"@\" \'\"\' ws*", // 159
"STRINGLIT ::= \'\"\' any* any128 ws*", // 160
"STRINGLIT ::= \'\"\' any* any128 ws*", // 161
"CHARLIT ::= \"\'\" any ws*", // 162
"CHARLIT ::= \"\'\" any ws*", // 163
"idChar ::= letter", // 164
"idChar ::= digit", // 165
"idChar ::= \"_\"", // 166
"idChar128 ::= letter128", // 167
"idChar128 ::= digit128", // 168
"idChar128 ::= {223}", // 169
"hexDigit ::= {\"0\"..\"9\" \"A\"..\"Z\" \"a\"..\"z\"}", // 170
"hexDigit128 ::= {176..185 193..198 225..230}", // 171
"<stmt>* ::= <stmt>* <stmt>", // 172
"<stmt>* ::= <stmt>* <stmt>", // 173
"<decl in class>* ::= <decl in class>* <decl in class>", // 174
"<decl in class>* ::= <decl in class>* <decl in class>", // 175
"any* ::= any* any", // 176
"any* ::= any* any", // 177
"ws* ::= ws* ws", // 178
"ws* ::= ws* ws", // 179
"digit* ::= digit* digit", // 180
"digit* ::= digit* digit", // 181
"<exp list>? ::= <exp list>", // 182
"hexDigit* ::= hexDigit* hexDigit", // 183
"hexDigit* ::= hexDigit* hexDigit", // 184
"idChar* ::= idChar* idChar", // 185
"idChar* ::= idChar* idChar", // 186
"<class decl>+ ::= <class decl>", // 187
"<class decl>+ ::= <class decl>+ <class decl>", // 188
"<recurse>* ::= <recurse>* <recurse>", // 189
"<recurse>* ::= <recurse>* <recurse>", // 190
"", // 191
"", // 192
"", // 193
"", // 194
"", // 195
"", // 196
"", // 197
"", // 198
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
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((0<<5)|0x5)/*methodCall:0*/,
    },
    { // 3: <program> ::= [#] <class decl>+ @createProgram(int,List<ClassDecl>)=>Program
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0x5)/*methodCall:1*/,
    },
    { // 4: <class decl> ::= `class [#] ID `{ <decl in class>* `} @createClassDecl(int,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 5: <class decl> ::= `class [#] ID `{ [<decl in class>*] `} @createClassDecl(int,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 6: <decl in class> ::= <method decl> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 7: <method decl> ::= `public `void [#] ID `( `) `{ <stmt>* `} @createMethodDeclVoid(int,String,List<Statement>)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 8: <method decl> ::= `public `void [#] ID `( `) `{ [<stmt>*] `} @createMethodDeclVoid(int,String,List<Statement>)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 9: <type> ::= [#] `int @intType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 10: <type> ::= [#] `boolean @booleanType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((5<<5)|0x5)/*methodCall:5*/,
    },
    { // 11: <type> ::= [#] ID @identifierType(int,String)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((6<<5)|0x5)/*methodCall:6*/,
    },
    { // 12: <type> ::= [#] <type> <empty bracket pair> @newArrayType(int,Type,Object)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((7<<5)|0x5)/*methodCall:7*/,
    },
    { // 13: <empty bracket pair> ::= `[ `] @null
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x8)/*nullPointer:1*/,
    },
    { // 14: <stmt> ::= <assign> `; @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 15: <stmt> ::= [#] `{ <stmt>* `} @newBlock(int,List<Statement>)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((8<<5)|0x5)/*methodCall:8*/,
    },
    { // 16: <stmt> ::= [#] `{ [<stmt>*] `} @newBlock(int,List<Statement>)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((8<<5)|0x5)/*methodCall:8*/,
    },
    { // 17: <stmt> ::= <local var decl> `; @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 18: <assign> ::= <exp> [#] `= <exp> @assign(Exp,int,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x5)/*methodCall:9*/,
    },
    { // 19: <local var decl> ::= <type> [#] ID `= <exp> @localVarDecl(Type,int,String,Exp)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x5)/*methodCall:10*/,
    },
    { // 20: <exp> ::= <exp> [#] `|| <exp2> @newOr(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 21: <exp> ::= <exp2> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 22: <exp2> ::= <exp2> [#] `&& <exp3> @newAnd(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x5)/*methodCall:12*/,
    },
    { // 23: <exp2> ::= <exp3> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 24: <exp3> ::= <exp3> [#] `!= <exp4> @newNotEqual(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 25: <exp3> ::= <exp3> [#] `== <exp4> @newEqualEquals(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 26: <exp3> ::= <exp4> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 27: <exp4> ::= <exp4> [#] `< <exp5> @newLessThan(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 28: <exp4> ::= <exp4> [#] `> <exp5> @newGreaterThan(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 29: <exp4> ::= <exp4> [#] `instanceof ID @newInstanceOf(Exp,int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 30: <exp4> ::= <exp4> [#] `<= <exp5> @newLessThanOrEqual(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 31: <exp4> ::= <exp4> [#] `>= <exp5> @newGreaterThanOrEqual(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 32: <exp4> ::= <exp5> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 33: <exp5> ::= <exp5> [#] `+ <exp6> @newPlus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 34: <exp5> ::= <exp5> [#] `- <exp6> @newMinus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 35: <exp5> ::= <exp6> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 36: <exp6> ::= <exp6> [#] `* <exp7> @newTimes(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 37: <exp6> ::= <exp6> [#] `/ <exp7> @newDivide(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 38: <exp6> ::= <exp6> [#] `% <exp7> @newRemainder(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 39: <exp6> ::= <exp7> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 40: <exp7> ::= <cast exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 41: <exp7> ::= <unary exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 42: <cast exp> ::= [#] `( <type> `) <cast exp> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 43: <cast exp> ::= [#] `( <type> `) <exp8> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 44: <unary exp> ::= [#] `- <unary exp> @newUnaryMinus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 45: <unary exp> ::= [#] `+ <unary exp> @newUnaryPlus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 46: <unary exp> ::= [#] `! <unary exp> @newUnaryNot(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 47: <unary exp> ::= <exp8> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 48: <exp8> ::= [#] ID @newIdentfierExp(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
    { // 49: <exp8> ::= <exp8> !<empty bracket pair> [#] `[ <exp> `] @newArrayLookup(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((30<<5)|0x5)/*methodCall:30*/,
    },
    { // 50: <exp8> ::= [#] INTLIT @newIntegerLiteral(int,int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((31<<5)|0x5)/*methodCall:31*/,
    },
    { // 51: <exp8> ::= [#] STRINGLIT @newStringLiteral(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((32<<5)|0x5)/*methodCall:32*/,
    },
    { // 52: <exp8> ::= [#] CHARLIT @newCharLiteral(int,int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((33<<5)|0x5)/*methodCall:33*/,
    },
    { // 53: <exp8> ::= [#] `false @newFalse(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((34<<5)|0x5)/*methodCall:34*/,
    },
    { // 54: <exp8> ::= [#] `this @newThis(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((35<<5)|0x5)/*methodCall:35*/,
    },
    { // 55: <exp8> ::= [#] `true @newTrue(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((36<<5)|0x5)/*methodCall:36*/,
    },
    { // 56: <exp8> ::= [#] `null @newNull(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((37<<5)|0x5)/*methodCall:37*/,
    },
    { // 57: <exp8> ::= [#] <exp8> `. ID @newInstVarAccess(int,Exp,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((38<<5)|0x5)/*methodCall:38*/,
    },
    { // 58: <exp8> ::= [#] `new ID `( `) @newIdentity(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((39<<5)|0x5)/*methodCall:39*/,
    },
    { // 59: <exp8> ::= <call exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 60: <call exp> ::= [#] <exp8> `. ID `( <exp list> `) @newCallExp(int,Exp,String,ExpList)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((40<<5)|0x5)/*methodCall:40*/,
    },
    { // 61: <recurse> ::= `, <exp8> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 62: <exp list> ::= <exp8> <recurse>* @newExpList(Exp,List<Exp>)=>ExpList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((41<<5)|0x5)/*methodCall:41*/,
    },
    { // 63: <exp list> ::= <exp8> [<recurse>*] @newExpList(Exp,List<Exp>)=>ExpList
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((41<<5)|0x5)/*methodCall:41*/,
    },
    { // 64: <call exp> ::= [#] `super `. ID `( <exp list>? `) @newSuperMethod(int,String,ExpList)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((42<<5)|0x5)/*methodCall:42*/,
    },
    { // 65: <call exp> ::= [#] `super `. ID `( [<exp list>?] `) @newSuperMethod(int,String,ExpList)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((42<<5)|0x5)/*methodCall:42*/,
    },
    { // 66: <call exp> ::= [#] ID `( <exp list>? `) @newThisMethod(int,String,ExpList)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((43<<5)|0x5)/*methodCall:43*/,
    },
    { // 67: <call exp> ::= [#] ID `( [<exp list>?] `) @newThisMethod(int,String,ExpList)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((43<<5)|0x5)/*methodCall:43*/,
    },
    { // 68: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 69: letter128 ::= {193..218 225..250} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((44<<5)|0x5)/*methodCall:44*/,
    },
    { // 70: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 71: digit128 ::= {176..185} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((44<<5)|0x5)/*methodCall:44*/,
    },
    { // 72: any ::= {0..127} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 73: any128 ::= {128..255} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((44<<5)|0x5)/*methodCall:44*/,
    },
    { // 74: ws ::= " " @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 75: ws ::= {10} [registerNewline] @void
      ((10<<5)|0x6)/*nullProductionAction:10*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 76: `boolean ::= "#" "b" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 77: `boolean ::= "#" "b" "o" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 78: `class ::= "#" "c" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 79: `class ::= "#" "c" "l" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 80: `void ::= "#" "v" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 81: `void ::= "#" "v" "o" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 82: `int ::= "#" "i" "t" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 83: `int ::= "#" "i" "t" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 84: `this ::= "#" "t" "h" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 85: `this ::= "#" "t" "h" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 86: `false ::= "#" "f" "a" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 87: `false ::= "#" "f" "a" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 88: `true ::= "#" "t" "r" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 89: `true ::= "#" "t" "r" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 90: `super ::= "#" "s" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 91: `super ::= "#" "s" "u" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 92: `null ::= "#" "n" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 93: `null ::= "#" "n" "u" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 94: `instanceof ::= "#" "i" "n" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 95: `instanceof ::= "#" "i" "n" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 96: `new ::= "#" "n" "e" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 97: `new ::= "#" "n" "e" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 98: `public ::= "#" "p" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 99: `public ::= "#" "p" "u" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 100: `! ::= "!" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 101: `! ::= "!" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 102: `!= ::= "@" "!" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 103: `!= ::= "@" "!" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 104: `% ::= "%" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 105: `% ::= "%" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 106: `&& ::= "@" "&" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 107: `&& ::= "@" "&" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 108: `* ::= "*" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 109: `* ::= "*" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 110: `( ::= "(" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 111: `( ::= "(" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 112: `) ::= ")" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 113: `) ::= ")" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 114: `{ ::= "{" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 115: `{ ::= "{" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 116: `} ::= "}" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 117: `} ::= "}" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 118: `- ::= "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 119: `- ::= "-" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 120: `+ ::= "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 121: `+ ::= "+" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 122: `= ::= "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 123: `= ::= "=" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 124: `== ::= "@" "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 125: `== ::= "@" "=" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 126: `[ ::= "[" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 127: `[ ::= "[" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 128: `] ::= "]" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 129: `] ::= "]" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 130: `|| ::= "@" "|" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 131: `|| ::= "@" "|" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 132: `< ::= "<" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 133: `< ::= "<" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 134: `<= ::= "@" "<" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 135: `<= ::= "@" "<" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 136: `, ::= "," ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 137: `, ::= "," [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 138: `> ::= ">" !"=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 139: `> ::= ">" !"=" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 140: `>= ::= "@" ">" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 141: `>= ::= "@" ">" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x3)/*popOffPushBack:2*/,
    },
    { // 142: `. ::= "." ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 143: `. ::= "." [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 144: `; ::= ";" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 145: `; ::= ";" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 146: `/ ::= "/" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 147: `/ ::= "/" [ws*] @void
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 148: ID ::= letter128 ws* @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 149: ID ::= letter128 [ws*] @text
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 150: ID ::= letter idChar* $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 151: ID ::= letter [idChar*] $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 152: INTLIT ::= {"1".."9"} digit* $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((45<<5)|0x5)/*methodCall:45*/,
    },
    { // 153: INTLIT ::= {"1".."9"} [digit*] $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((45<<5)|0x5)/*methodCall:45*/,
    },
    { // 154: INTLIT ::= digit128 ws* @convertToInt(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((46<<5)|0x5)/*methodCall:46*/,
    },
    { // 155: INTLIT ::= digit128 [ws*] @convertToInt(char)=>int
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((46<<5)|0x5)/*methodCall:46*/,
    },
    { // 156: INTLIT ::= "0" hexDigit* $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((47<<5)|0x5)/*methodCall:47*/,
    },
    { // 157: INTLIT ::= "0" [hexDigit*] $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((47<<5)|0x5)/*methodCall:47*/,
    },
    { // 158: STRINGLIT ::= "@" '"' ws* @emptyString(char,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((48<<5)|0x5)/*methodCall:48*/,
    },
    { // 159: STRINGLIT ::= "@" '"' [ws*] @emptyString(char,char)=>String
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((48<<5)|0x5)/*methodCall:48*/,
    },
    { // 160: STRINGLIT ::= '"' any* $$3 @string(char,List<Character>,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((49<<5)|0x5)/*methodCall:49*/,
    },
    { // 161: STRINGLIT ::= '"' [any*] $$3 @string(char,List<Character>,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((49<<5)|0x5)/*methodCall:49*/,
    },
    { // 162: CHARLIT ::= "'" any ws* @charVal(char,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((50<<5)|0x5)/*methodCall:50*/,
    },
    { // 163: CHARLIT ::= "'" any [ws*] @charVal(char,char)=>int
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((50<<5)|0x5)/*methodCall:50*/,
    },
    { // 164: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 165: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 166: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 167: idChar128 ::= letter128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 168: idChar128 ::= digit128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 169: idChar128 ::= {223} @underscore(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((51<<5)|0x5)/*methodCall:51*/,
    },
    { // 170: hexDigit ::= {"0".."9" "A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 171: hexDigit128 ::= {176..185 193..198 225..230} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((44<<5)|0x5)/*methodCall:44*/,
    },
    { // 172: <stmt>* ::= <stmt>* <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 173: <stmt>* ::= [<stmt>*] <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 174: <decl in class>* ::= <decl in class>* <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 175: <decl in class>* ::= [<decl in class>*] <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 176: any* ::= any* any @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 177: any* ::= [any*] any @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 178: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 179: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
    },
    { // 180: digit* ::= digit* digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 181: digit* ::= [digit*] digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 182: <exp list>? ::= <exp list> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 183: hexDigit* ::= hexDigit* hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 184: hexDigit* ::= [hexDigit*] hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 185: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 186: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 187: <class decl>+ ::= <class decl> @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 188: <class decl>+ ::= <class decl>+ <class decl> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 189: <recurse>* ::= <recurse>* <recurse> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 190: <recurse>* ::= [<recurse>*] <recurse> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 191: $$0 ::= idChar128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 192: $$0 ::= idChar128 [ws*] @pass
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 193: $$1 ::= digit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 194: $$1 ::= digit128 [ws*] @pass
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 195: $$2 ::= hexDigit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 196: $$2 ::= hexDigit128 [ws*] @pass
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 197: $$3 ::= any128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 198: $$3 ::= any128 [ws*] @pass
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
};
public String[] getNullProdNameTable() { return nullProdNameTable; }
private String[] nullProdNameTable = {
    "<recurse>* ::=", // <recurse>*
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
      ((9<<5)|0x6)/*nullProductionAction:9*/,
      ((52<<5)|0x5)/*methodCall:52*/,
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
      List<Decl> parm2 = (List<Decl>)si.popPb();
      ClassDecl result = actionObject.createClassDecl(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 3: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      List<Statement> parm2 = (List<Statement>)si.popPb();
      Decl result = actionObject.createMethodDeclVoid(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 4: {
      int parm0 = (Integer)si.popPb();
      Type result = actionObject.intType(parm0);
      si.pushPb(result);
    }
    break;
    case 5: {
      int parm0 = (Integer)si.popPb();
      Type result = actionObject.booleanType(parm0);
      si.pushPb(result);
    }
    break;
    case 6: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Type result = actionObject.identifierType(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 7: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Object parm2 = (Object)si.popPb();
      Type result = actionObject.newArrayType(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 8: {
      int parm0 = (Integer)si.popPb();
      List<Statement> parm1 = (List<Statement>)si.popPb();
      Statement result = actionObject.newBlock(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 9: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Statement result = actionObject.assign(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 10: {
      Type parm0 = (Type)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Exp parm3 = (Exp)si.popPb();
      Statement result = actionObject.localVarDecl(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 11: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newOr(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 12: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newAnd(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 13: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newNotEqual(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 14: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newEqualEquals(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 15: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newLessThan(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 16: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newGreaterThan(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 17: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      String parm2 = (String)si.popPb();
      Exp result = actionObject.newInstanceOf(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 18: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newLessThanOrEqual(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 19: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newGreaterThanOrEqual(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 20: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newPlus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 21: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newMinus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 22: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newTimes(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 23: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newDivide(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 24: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newRemainder(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 25: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newCast(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 26: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryMinus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 27: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryPlus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 28: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryNot(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 29: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newIdentfierExp(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 30: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newArrayLookup(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 31: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp result = actionObject.newIntegerLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 32: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newStringLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 33: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp result = actionObject.newCharLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 34: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newFalse(parm0);
      si.pushPb(result);
    }
    break;
    case 35: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newThis(parm0);
      si.pushPb(result);
    }
    break;
    case 36: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newTrue(parm0);
      si.pushPb(result);
    }
    break;
    case 37: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newNull(parm0);
      si.pushPb(result);
    }
    break;
    case 38: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      String parm2 = (String)si.popPb();
      Exp result = actionObject.newInstVarAccess(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 39: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newIdentity(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 40: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      String parm2 = (String)si.popPb();
      ExpList parm3 = (ExpList)si.popPb();
      Exp result = actionObject.newCallExp(parm0,parm1,parm2,parm3);
      si.pushPb(result);
    }
    break;
    case 41: {
      Exp parm0 = (Exp)si.popPb();
      List<Exp> parm1 = (List<Exp>)si.popPb();
      ExpList result = actionObject.newExpList(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 42: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      ExpList parm2 = (ExpList)si.popPb();
      Exp result = actionObject.newSuperMethod(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 43: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      ExpList parm2 = (ExpList)si.popPb();
      Exp result = actionObject.newThisMethod(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 44: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.sub128(parm0);
      si.pushPb(result);
    }
    break;
    case 45: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 46: {
      char parm0 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0);
      si.pushPb(result);
    }
    break;
    case 47: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convert16ToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 48: {
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      String result = actionObject.emptyString(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 49: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      String result = actionObject.string(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 50: {
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      int result = actionObject.charVal(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 51: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.underscore(parm0);
      si.pushPb(result);
    }
    break;
    case 52: {
      int parm0 = (Integer)si.popPb();
      actionObject.registerNewline(parm0);
    }
    break;
  }
}
private String[] saNameSigTable = {
"void topLevel(Program)",
"Program createProgram(int,List<ClassDecl>)",
"ClassDecl createClassDecl(int,String,List<Decl>)",
"Decl createMethodDeclVoid(int,String,List<Statement>)",
"Type intType(int)",
"Type booleanType(int)",
"Type identifierType(int,String)",
"Type newArrayType(int,Type,Object)",
"Statement newBlock(int,List<Statement>)",
"Statement assign(Exp,int,Exp)",
"Statement localVarDecl(Type,int,String,Exp)",
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
3,1,
3,1,
1,1,
1,1,
2,1,
3,1,
2,1,
3,1,
4,1,
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
    0,
    1,
    0,
    1,
    1,
    0,
    0,
    0,
    0,
    1,
    1,
    0,
    0,
    1,
    0,
    0,
    1,
    1,
    0,
    1,
    1,
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

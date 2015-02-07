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
public int getEofSym() { return 112; }
public int getNttSym() { return 113; }
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
"<exp5>",
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
"INTLIT",
"STRINGLIT",
"CHARLIT",
"`false",
"`this",
"`true",
"`null",
"`.",
"letter",
"\"a\"",
"\"p\"",
"\"v\"",
"\"c\"",
"\"f\"",
"\"i\"",
"\"l\"",
"\"o\"",
"\"r\"",
"\"u\"",
"{\"A\"..\"Z\" \"d\"..\"e\" \"g\" \"j\"..\"k\" \"m\" \"q\" \"s\" \"w\"..\"z\"}",
"\"b\"",
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
"{0..9 11..31 \"!\" \"$\" \"&\" \",\" \":\" \"<\" \">\"..\"?\" \"\\\" \"^\" \"`\" \"|\" \"~\"..127}",
"\" \"",
"\"#\"",
"\")\"",
"\"]\"",
"\"/\"",
"\";\"",
"\"{\"",
"\"%\"",
"\"(\"",
"\"+\"",
"\".\"",
"\"_\"",
"\"=\"",
"\"@\"",
"10",
"\"}\"",
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
public int numSymbols() { return 114;}
private static final int MIN_REDUCTION = 320;
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
1,202, // <start>
2,306, // ws*
3,19, // <program>
4,285, // <class decl>+
5,318, // <class decl>
6,150, // `class
77,159, // " "
78,8, // "#"
91,51, // {10}
99,267, // ws
  }
,
{ // state 1
0x80000000|241, // match move
0x80000000|123, // no-match move
0x80000000|161, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 2
  }
,
{ // state 3
2,113, // ws*
77,159, // " "
91,51, // {10}
99,267, // ws
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 4
0x80000000|124, // match move
0x80000000|223, // no-match move
0x80000000|161, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 5
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 6
2,69, // ws*
22,MIN_REDUCTION+92, // `[
74,MIN_REDUCTION+92, // "["
77,201, // " "
91,262, // {10}
99,57, // ws
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 7
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 8
53,227, // "c"
  }
,
{ // state 9
77,159, // " "
91,51, // {10}
99,84, // ws
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 10
7,80, // ID
49,148, // letter
50,178, // "a"
51,178, // "p"
52,178, // "v"
53,178, // "c"
54,178, // "f"
55,178, // "i"
56,178, // "l"
57,178, // "o"
58,178, // "r"
59,178, // "u"
60,178, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
61,178, // "b"
62,178, // "h"
63,178, // "n"
64,178, // "t"
65,175, // letter128
66,272, // {199..218 231..250}
67,272, // {193..198 225..230}
  }
,
{ // state 11
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 12
54,37, // "f"
63,232, // "n"
64,194, // "t"
  }
,
{ // state 13
57,265, // "o"
  }
,
{ // state 14
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 15
22,MIN_REDUCTION+44, // `[
74,MIN_REDUCTION+44, // "["
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 16
0x80000000|2, // match move
0x80000000|135, // no-match move
0x80000000|161, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 17
2,246, // ws*
  }
,
{ // state 18
77,159, // " "
91,51, // {10}
99,84, // ws
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 19
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 20
77,159, // " "
91,51, // {10}
99,84, // ws
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 21
0x80000000|2, // match move
0x80000000|149, // no-match move
0x80000000|161, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 22
0x80000000|2, // match move
0x80000000|48, // no-match move
0x80000000|161, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 23
77,159, // " "
91,51, // {10}
99,84, // ws
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 24
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 25
7,248, // ID
15,144, // `(
31,114, // `+
33,30, // `-
35,52, // <exp7>
38,60, // <cast exp>
39,56, // <unary exp>
40,107, // <exp8>
41,22, // INTLIT
42,255, // STRINGLIT
43,242, // CHARLIT
44,313, // `false
45,89, // `this
46,31, // `true
47,103, // `null
49,148, // letter
50,178, // "a"
51,178, // "p"
52,178, // "v"
53,178, // "c"
54,178, // "f"
55,178, // "i"
56,178, // "l"
57,178, // "o"
58,178, // "r"
59,178, // "u"
60,178, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
61,178, // "b"
62,178, // "h"
63,178, // "n"
64,178, // "t"
65,175, // letter128
66,272, // {199..218 231..250}
67,272, // {193..198 225..230}
69,88, // {"1".."9"}
70,302, // "0"
71,235, // digit128
72,1, // {176..185}
75,254, // "-"
78,12, // "#"
85,184, // "("
86,250, // "+"
90,183, // "@"
93,108, // "'"
94,303, // '"'
  }
,
{ // state 26
MIN_REDUCTION+116, // (default reduction)
  }
,
{ // state 27
0x80000000|2, // match move
0x80000000|157, // no-match move
0x80000000|161, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 28
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 29
113,MIN_REDUCTION+13, // $NT
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 30
7,248, // ID
31,114, // `+
33,30, // `-
39,28, // <unary exp>
40,107, // <exp8>
41,22, // INTLIT
42,255, // STRINGLIT
43,242, // CHARLIT
44,313, // `false
45,89, // `this
46,31, // `true
47,103, // `null
49,148, // letter
50,178, // "a"
51,178, // "p"
52,178, // "v"
53,178, // "c"
54,178, // "f"
55,178, // "i"
56,178, // "l"
57,178, // "o"
58,178, // "r"
59,178, // "u"
60,178, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
61,178, // "b"
62,178, // "h"
63,178, // "n"
64,178, // "t"
65,175, // letter128
66,272, // {199..218 231..250}
67,272, // {193..198 225..230}
69,88, // {"1".."9"}
70,302, // "0"
71,235, // digit128
72,1, // {176..185}
75,254, // "-"
78,12, // "#"
86,250, // "+"
90,183, // "@"
93,108, // "'"
94,303, // '"'
  }
,
{ // state 31
0x80000000|2, // match move
0x80000000|72, // no-match move
0x80000000|161, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 32
22,MIN_REDUCTION+139, // `[
74,MIN_REDUCTION+139, // "["
77,201, // " "
91,262, // {10}
99,305, // ws
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 33
2,128, // ws*
  }
,
{ // state 34
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 35
22,MIN_REDUCTION+63, // `[
74,MIN_REDUCTION+63, // "["
77,201, // " "
91,262, // {10}
99,305, // ws
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 36
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 37
50,121, // "a"
  }
,
{ // state 38
8,171, // `{
83,238, // "{"
  }
,
{ // state 39
26,308, // `;
82,50, // ";"
  }
,
{ // state 40
26,205, // `;
82,50, // ";"
  }
,
{ // state 41
0x80000000|2, // match move
0x80000000|133, // no-match move
0x80000000|161, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 42
77,159, // " "
91,51, // {10}
99,84, // ws
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 43
0x80000000|5, // match move
0x80000000|58, // no-match move
0x80000000|161, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 44
2,236, // ws*
77,159, // " "
91,51, // {10}
99,267, // ws
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 45
22,MIN_REDUCTION+122, // `[
74,MIN_REDUCTION+122, // "["
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 46
MIN_REDUCTION+121, // (default reduction)
  }
,
{ // state 47
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 48
22,MIN_REDUCTION+37, // `[
74,MIN_REDUCTION+37, // "["
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 49
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 50
2,269, // ws*
77,159, // " "
91,51, // {10}
99,267, // ws
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 51
113,MIN_REDUCTION+52, // $NT
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 52
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 53
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 54
22,261, // `[
48,10, // `.
74,44, // "["
87,154, // "."
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 55
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 56
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 57
0x80000000|139, // match move
0x80000000|109, // no-match move
0x80000000|161, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 58
22,MIN_REDUCTION+99, // `[
74,MIN_REDUCTION+99, // "["
77,201, // " "
91,262, // {10}
99,305, // ws
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 59
22,MIN_REDUCTION+46, // `[
74,MIN_REDUCTION+46, // "["
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 60
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 61
0x80000000|102, // match move
0x80000000|222, // no-match move
0x80000000|161, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 62
34,206, // `*
36,25, // `/
37,127, // `%
81,3, // "/"
84,170, // "%"
95,312, // "*"
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 63
2,64, // ws*
77,159, // " "
91,51, // {10}
99,267, // ws
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 64
77,159, // " "
91,51, // {10}
99,84, // ws
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 65
7,248, // ID
15,144, // `(
31,114, // `+
32,169, // <exp6>
33,30, // `-
35,210, // <exp7>
38,60, // <cast exp>
39,56, // <unary exp>
40,107, // <exp8>
41,22, // INTLIT
42,255, // STRINGLIT
43,242, // CHARLIT
44,313, // `false
45,89, // `this
46,31, // `true
47,103, // `null
49,148, // letter
50,178, // "a"
51,178, // "p"
52,178, // "v"
53,178, // "c"
54,178, // "f"
55,178, // "i"
56,178, // "l"
57,178, // "o"
58,178, // "r"
59,178, // "u"
60,178, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
61,178, // "b"
62,178, // "h"
63,178, // "n"
64,178, // "t"
65,175, // letter128
66,272, // {199..218 231..250}
67,272, // {193..198 225..230}
69,88, // {"1".."9"}
70,302, // "0"
71,235, // digit128
72,1, // {176..185}
75,254, // "-"
78,12, // "#"
85,184, // "("
86,250, // "+"
90,183, // "@"
93,108, // "'"
94,303, // '"'
  }
,
{ // state 66
22,MIN_REDUCTION+65, // `[
74,MIN_REDUCTION+65, // "["
77,201, // " "
91,262, // {10}
99,305, // ws
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 67
22,MIN_REDUCTION+101, // `[
74,MIN_REDUCTION+101, // "["
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 68
22,MIN_REDUCTION+129, // `[
74,MIN_REDUCTION+129, // "["
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 69
0x80000000|2, // match move
0x80000000|212, // no-match move
0x80000000|161, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 70
22,MIN_REDUCTION+52, // `[
74,MIN_REDUCTION+52, // "["
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 71
2,147, // ws*
77,159, // " "
91,51, // {10}
99,267, // ws
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 72
22,MIN_REDUCTION+42, // `[
74,MIN_REDUCTION+42, // "["
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 73
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 74
22,MIN_REDUCTION+120, // `[
74,MIN_REDUCTION+120, // "["
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 75
54,37, // "f"
55,224, // "i"
61,293, // "b"
63,232, // "n"
64,194, // "t"
  }
,
{ // state 76
2,203, // ws*
77,159, // " "
91,51, // {10}
99,267, // ws
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 77
MIN_REDUCTION+126, // (default reduction)
  }
,
{ // state 78
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 79
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 80
0x80000000|2, // match move
0x80000000|15, // no-match move
0x80000000|161, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 81
7,316, // ID
21,138, // <empty bracket pair>
22,243, // `[
49,234, // letter
50,178, // "a"
51,178, // "p"
52,178, // "v"
53,178, // "c"
54,178, // "f"
55,178, // "i"
56,178, // "l"
57,178, // "o"
58,178, // "r"
59,178, // "u"
60,178, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
61,178, // "b"
62,178, // "h"
63,178, // "n"
64,178, // "t"
65,213, // letter128
66,14, // {199..218 231..250}
67,14, // {193..198 225..230}
74,44, // "["
  }
,
{ // state 82
MIN_REDUCTION+120, // (default reduction)
  }
,
{ // state 83
68,193, // digit
69,53, // {"1".."9"}
70,53, // "0"
71,160, // digit128
72,1, // {176..185}
103,256, // $$1
  }
,
{ // state 84
113,MIN_REDUCTION+129, // $NT
MIN_REDUCTION+129, // (default reduction)
  }
,
{ // state 85
22,MIN_REDUCTION+51, // `[
74,MIN_REDUCTION+51, // "["
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 86
50,46, // "a"
51,46, // "p"
52,46, // "v"
53,46, // "c"
54,46, // "f"
55,46, // "i"
56,46, // "l"
57,46, // "o"
58,46, // "r"
59,46, // "u"
60,46, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
61,46, // "b"
62,46, // "h"
63,46, // "n"
64,46, // "t"
67,92, // {193..198 225..230}
69,46, // {"1".."9"}
70,46, // "0"
72,92, // {176..185}
105,41, // $$2
110,87, // hexDigit
111,143, // hexDigit128
  }
,
{ // state 87
MIN_REDUCTION+133, // (default reduction)
  }
,
{ // state 88
68,226, // digit
69,53, // {"1".."9"}
70,53, // "0"
71,160, // digit128
72,1, // {176..185}
102,83, // digit*
103,249, // $$1
  }
,
{ // state 89
0x80000000|2, // match move
0x80000000|296, // no-match move
0x80000000|161, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 90
7,248, // ID
15,144, // `(
31,114, // `+
32,62, // <exp6>
33,30, // `-
35,210, // <exp7>
38,60, // <cast exp>
39,56, // <unary exp>
40,107, // <exp8>
41,22, // INTLIT
42,255, // STRINGLIT
43,242, // CHARLIT
44,313, // `false
45,89, // `this
46,31, // `true
47,103, // `null
49,148, // letter
50,178, // "a"
51,178, // "p"
52,178, // "v"
53,178, // "c"
54,178, // "f"
55,178, // "i"
56,178, // "l"
57,178, // "o"
58,178, // "r"
59,178, // "u"
60,178, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
61,178, // "b"
62,178, // "h"
63,178, // "n"
64,178, // "t"
65,175, // letter128
66,272, // {199..218 231..250}
67,272, // {193..198 225..230}
69,88, // {"1".."9"}
70,302, // "0"
71,235, // digit128
72,1, // {176..185}
75,254, // "-"
78,12, // "#"
85,184, // "("
86,250, // "+"
90,183, // "@"
93,108, // "'"
94,303, // '"'
  }
,
{ // state 91
22,MIN_REDUCTION+103, // `[
74,MIN_REDUCTION+103, // "["
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 92
0x80000000|245, // match move
0x80000000|45, // no-match move
0x80000000|161, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 93
0x80000000|180, // match move
0x80000000|195, // no-match move
0x80000000|161, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 94
22,MIN_REDUCTION+104, // `[
74,MIN_REDUCTION+104, // "["
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 95
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 96
2,274, // ws*
22,MIN_REDUCTION+142, // `[
74,MIN_REDUCTION+142, // "["
77,201, // " "
91,262, // {10}
99,57, // ws
MIN_REDUCTION+142, // (default reduction)
  }
,
{ // state 97
14,130, // `void
78,276, // "#"
  }
,
{ // state 98
31,90, // `+
33,65, // `-
75,254, // "-"
86,250, // "+"
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 99
2,42, // ws*
77,159, // " "
91,51, // {10}
99,267, // ws
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 100
51,118, // "p"
  }
,
{ // state 101
0x80000000|2, // match move
0x80000000|179, // no-match move
0x80000000|161, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 102
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 103
0x80000000|2, // match move
0x80000000|209, // no-match move
0x80000000|161, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 104
2,167, // ws*
  }
,
{ // state 105
8,174, // `{
83,238, // "{"
  }
,
{ // state 106
16,38, // `)
79,190, // ")"
  }
,
{ // state 107
0x80000000|2, // match move
0x80000000|54, // no-match move
0x80000000|161, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 108
50,198, // "a"
51,198, // "p"
52,198, // "v"
53,198, // "c"
54,198, // "f"
55,198, // "i"
56,198, // "l"
57,198, // "o"
58,198, // "r"
59,198, // "u"
60,198, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
61,198, // "b"
62,198, // "h"
63,198, // "n"
64,198, // "t"
69,198, // {"1".."9"}
70,198, // "0"
73,268, // any
74,198, // "["
75,198, // "-"
76,198, // {0..9 11..31 "!" "$" "&" "," ":" "<" ">".."?" "\" "^" "`" "|" "~"..127}
77,198, // " "
78,198, // "#"
79,198, // ")"
80,198, // "]"
81,198, // "/"
82,198, // ";"
83,198, // "{"
84,198, // "%"
85,198, // "("
86,198, // "+"
87,198, // "."
88,198, // "_"
89,198, // "="
90,198, // "@"
91,198, // {10}
92,198, // "}"
93,198, // "'"
94,198, // '"'
95,198, // "*"
  }
,
{ // state 109
22,MIN_REDUCTION+130, // `[
74,MIN_REDUCTION+130, // "["
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 110
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 111
0x80000000|199, // match move
0x80000000|32, // no-match move
0x80000000|161, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 112
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 113
77,159, // " "
91,51, // {10}
99,84, // ws
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 114
7,248, // ID
31,114, // `+
33,30, // `-
39,309, // <unary exp>
40,107, // <exp8>
41,22, // INTLIT
42,255, // STRINGLIT
43,242, // CHARLIT
44,313, // `false
45,89, // `this
46,31, // `true
47,103, // `null
49,148, // letter
50,178, // "a"
51,178, // "p"
52,178, // "v"
53,178, // "c"
54,178, // "f"
55,178, // "i"
56,178, // "l"
57,178, // "o"
58,178, // "r"
59,178, // "u"
60,178, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
61,178, // "b"
62,178, // "h"
63,178, // "n"
64,178, // "t"
65,175, // letter128
66,272, // {199..218 231..250}
67,272, // {193..198 225..230}
69,88, // {"1".."9"}
70,302, // "0"
71,235, // digit128
72,1, // {176..185}
75,254, // "-"
78,12, // "#"
86,250, // "+"
90,183, // "@"
93,108, // "'"
94,303, // '"'
  }
,
{ // state 115
0x80000000|2, // match move
0x80000000|35, // no-match move
0x80000000|161, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 116
34,206, // `*
36,25, // `/
37,127, // `%
81,3, // "/"
84,170, // "%"
95,312, // "*"
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 117
2,216, // ws*
77,159, // " "
91,51, // {10}
99,267, // ws
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 118
59,117, // "u"
  }
,
{ // state 119
0x80000000|2, // match move
0x80000000|221, // no-match move
0x80000000|161, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 120
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
4, // ID
220, // `{
-1, // <decl in class>*
110, // `}
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
144, // `(
-1, // `)
-1, // <stmt>*
81, // <type>
73, // `int
95, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
134, // <stmt>
40, // <assign>
-1, // `;
39, // <local var decl>
200, // <exp>
-1, // `=
98, // <exp5>
114, // `+
116, // <exp6>
30, // `-
-1, // `*
210, // <exp7>
-1, // `/
-1, // `%
60, // <cast exp>
56, // <unary exp>
107, // <exp8>
22, // INTLIT
255, // STRINGLIT
242, // CHARLIT
313, // `false
89, // `this
31, // `true
103, // `null
-1, // `.
148, // letter
178, // "a"
178, // "p"
178, // "v"
178, // "c"
178, // "f"
178, // "i"
178, // "l"
178, // "o"
178, // "r"
178, // "u"
178, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
178, // "b"
178, // "h"
178, // "n"
178, // "t"
175, // letter128
272, // {199..218 231..250}
272, // {193..198 225..230}
-1, // digit
88, // {"1".."9"}
302, // "0"
235, // digit128
1, // {176..185}
-1, // any
-1, // "["
254, // "-"
-1, // {0..9 11..31 "!" "$" "&" "," ":" "<" ">".."?" "\" "^" "`" "|" "~"..127}
-1, // " "
75, // "#"
-1, // ")"
-1, // "]"
-1, // "/"
-1, // ";"
238, // "{"
-1, // "%"
184, // "("
250, // "+"
-1, // "."
-1, // "_"
-1, // "="
183, // "@"
-1, // {10}
63, // "}"
108, // "'"
303, // '"'
-1, // "*"
-1, // any128
-1, // {223}
-1, // {128..175 186..192 219..222 224 251..255}
-1, // ws
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // any*
-1, // $$3
-1, // idChar
-1, // idChar128
-1, // hexDigit
-1, // hexDigit128
-1, // $
-1, // $NT
  }
,
{ // state 121
0x80000000|271, // match move
0x80000000|260, // no-match move
0x80000000|161, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 122
7,248, // ID
15,144, // `(
38,55, // <cast exp>
40,27, // <exp8>
41,22, // INTLIT
42,255, // STRINGLIT
43,242, // CHARLIT
44,313, // `false
45,89, // `this
46,31, // `true
47,103, // `null
49,148, // letter
50,178, // "a"
51,178, // "p"
52,178, // "v"
53,178, // "c"
54,178, // "f"
55,178, // "i"
56,178, // "l"
57,178, // "o"
58,178, // "r"
59,178, // "u"
60,178, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
61,178, // "b"
62,178, // "h"
63,178, // "n"
64,178, // "t"
65,175, // letter128
66,272, // {199..218 231..250}
67,272, // {193..198 225..230}
69,88, // {"1".."9"}
70,302, // "0"
71,235, // digit128
72,1, // {176..185}
78,12, // "#"
85,184, // "("
90,183, // "@"
93,108, // "'"
94,303, // '"'
  }
,
{ // state 123
22,MIN_REDUCTION+48, // `[
74,MIN_REDUCTION+48, // "["
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 124
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 125
22,MIN_REDUCTION+50, // `[
74,MIN_REDUCTION+50, // "["
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 126
77,159, // " "
91,51, // {10}
99,84, // ws
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 127
7,248, // ID
15,144, // `(
31,114, // `+
33,30, // `-
35,291, // <exp7>
38,60, // <cast exp>
39,56, // <unary exp>
40,107, // <exp8>
41,22, // INTLIT
42,255, // STRINGLIT
43,242, // CHARLIT
44,313, // `false
45,89, // `this
46,31, // `true
47,103, // `null
49,148, // letter
50,178, // "a"
51,178, // "p"
52,178, // "v"
53,178, // "c"
54,178, // "f"
55,178, // "i"
56,178, // "l"
57,178, // "o"
58,178, // "r"
59,178, // "u"
60,178, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
61,178, // "b"
62,178, // "h"
63,178, // "n"
64,178, // "t"
65,175, // letter128
66,272, // {199..218 231..250}
67,272, // {193..198 225..230}
69,88, // {"1".."9"}
70,302, // "0"
71,235, // digit128
72,1, // {176..185}
75,254, // "-"
78,12, // "#"
85,184, // "("
86,250, // "+"
90,183, // "@"
93,108, // "'"
94,303, // '"'
  }
,
{ // state 128
0x80000000|2, // match move
0x80000000|275, // no-match move
0x80000000|161, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 129
0x80000000|168, // match move
0x80000000|67, // no-match move
0x80000000|161, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 130
7,136, // ID
49,234, // letter
50,178, // "a"
51,178, // "p"
52,178, // "v"
53,178, // "c"
54,178, // "f"
55,178, // "i"
56,178, // "l"
57,178, // "o"
58,178, // "r"
59,178, // "u"
60,178, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
61,178, // "b"
62,178, // "h"
63,178, // "n"
64,178, // "t"
65,213, // letter128
66,14, // {199..218 231..250}
67,14, // {193..198 225..230}
  }
,
{ // state 131
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 132
22,MIN_REDUCTION+61, // `[
74,MIN_REDUCTION+61, // "["
77,201, // " "
91,262, // {10}
99,305, // ws
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 133
22,MIN_REDUCTION+107, // `[
74,MIN_REDUCTION+107, // "["
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 134
MIN_REDUCTION+123, // (default reduction)
  }
,
{ // state 135
22,MIN_REDUCTION+112, // `[
74,MIN_REDUCTION+112, // "["
MIN_REDUCTION+112, // (default reduction)
  }
,
{ // state 136
15,106, // `(
85,184, // "("
  }
,
{ // state 137
0x80000000|2, // match move
0x80000000|298, // no-match move
0x80000000|161, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 138
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 139
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 140
22,MIN_REDUCTION+141, // `[
74,MIN_REDUCTION+141, // "["
77,201, // " "
91,262, // {10}
99,305, // ws
MIN_REDUCTION+141, // (default reduction)
  }
,
{ // state 141
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 142
0x80000000|2, // match move
0x80000000|229, // no-match move
0x80000000|161, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 143
0x80000000|315, // match move
0x80000000|208, // no-match move
0x80000000|161, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 144
7,153, // ID
18,284, // <type>
19,73, // `int
20,95, // `boolean
49,234, // letter
50,178, // "a"
51,178, // "p"
52,178, // "v"
53,178, // "c"
54,178, // "f"
55,178, // "i"
56,178, // "l"
57,178, // "o"
58,178, // "r"
59,178, // "u"
60,178, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
61,178, // "b"
62,178, // "h"
63,178, // "n"
64,178, // "t"
65,213, // letter128
66,14, // {199..218 231..250}
67,14, // {193..198 225..230}
78,173, // "#"
  }
,
{ // state 145
0x80000000|189, // match move
0x80000000|125, // no-match move
0x80000000|161, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 146
2,126, // ws*
77,159, // " "
91,51, // {10}
99,267, // ws
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 147
77,159, // " "
91,51, // {10}
99,84, // ws
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 148
49,176, // letter
50,178, // "a"
51,178, // "p"
52,178, // "v"
53,178, // "c"
54,178, // "f"
55,178, // "i"
56,178, // "l"
57,178, // "o"
58,178, // "r"
59,178, // "u"
60,178, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
61,178, // "b"
62,178, // "h"
63,178, // "n"
64,178, // "t"
65,61, // letter128
66,272, // {199..218 231..250}
67,272, // {193..198 225..230}
68,26, // digit
69,53, // {"1".."9"}
70,53, // "0"
71,244, // digit128
72,1, // {176..185}
88,225, // "_"
97,181, // {223}
100,259, // idChar*
101,93, // $$0
108,304, // idChar
109,162, // idChar128
  }
,
{ // state 149
22,MIN_REDUCTION+143, // `[
74,MIN_REDUCTION+143, // "["
77,201, // " "
91,262, // {10}
99,305, // ws
MIN_REDUCTION+143, // (default reduction)
  }
,
{ // state 150
7,105, // ID
49,234, // letter
50,178, // "a"
51,178, // "p"
52,178, // "v"
53,178, // "c"
54,178, // "f"
55,178, // "i"
56,178, // "l"
57,178, // "o"
58,178, // "r"
59,178, // "u"
60,178, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
61,178, // "b"
62,178, // "h"
63,178, // "n"
64,178, // "t"
65,213, // letter128
66,14, // {199..218 231..250}
67,14, // {193..198 225..230}
  }
,
{ // state 151
2,111, // ws*
22,MIN_REDUCTION+140, // `[
74,MIN_REDUCTION+140, // "["
77,201, // " "
91,262, // {10}
99,57, // ws
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 152
22,MIN_REDUCTION+38, // `[
74,MIN_REDUCTION+38, // "["
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 153
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 154
2,266, // ws*
77,159, // " "
91,51, // {10}
99,267, // ws
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 155
2,167, // ws*
22,MIN_REDUCTION+146, // `[
74,MIN_REDUCTION+146, // "["
77,201, // " "
91,262, // {10}
99,57, // ws
MIN_REDUCTION+146, // (default reduction)
  }
,
{ // state 156
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 157
22,261, // `[
48,10, // `.
74,44, // "["
87,154, // "."
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 158
22,MIN_REDUCTION+35, // `[
74,MIN_REDUCTION+35, // "["
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 159
113,MIN_REDUCTION+51, // $NT
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 160
0x80000000|317, // match move
0x80000000|96, // no-match move
0x80000000|161, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 161
22,243, // `[
74,44, // "["
  }
,
{ // state 162
0x80000000|279, // match move
0x80000000|151, // no-match move
0x80000000|161, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 163
2,314, // ws*
  }
,
{ // state 164
22,MIN_REDUCTION+105, // `[
74,MIN_REDUCTION+105, // "["
77,201, // " "
91,262, // {10}
99,305, // ws
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 165
0x80000000|204, // match move
0x80000000|6, // no-match move
0x80000000|161, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 166
77,159, // " "
91,51, // {10}
99,84, // ws
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 167
0x80000000|2, // match move
0x80000000|253, // no-match move
0x80000000|161, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 168
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 169
34,206, // `*
36,25, // `/
37,127, // `%
81,3, // "/"
84,170, // "%"
95,312, // "*"
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 170
2,9, // ws*
77,159, // " "
91,51, // {10}
99,267, // ws
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 171
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
4, // ID
220, // `{
-1, // <decl in class>*
263, // `}
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
144, // `(
-1, // `)
120, // <stmt>*
81, // <type>
73, // `int
95, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
299, // <stmt>
40, // <assign>
-1, // `;
39, // <local var decl>
200, // <exp>
-1, // `=
98, // <exp5>
114, // `+
116, // <exp6>
30, // `-
-1, // `*
210, // <exp7>
-1, // `/
-1, // `%
60, // <cast exp>
56, // <unary exp>
107, // <exp8>
22, // INTLIT
255, // STRINGLIT
242, // CHARLIT
313, // `false
89, // `this
31, // `true
103, // `null
-1, // `.
148, // letter
178, // "a"
178, // "p"
178, // "v"
178, // "c"
178, // "f"
178, // "i"
178, // "l"
178, // "o"
178, // "r"
178, // "u"
178, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
178, // "b"
178, // "h"
178, // "n"
178, // "t"
175, // letter128
272, // {199..218 231..250}
272, // {193..198 225..230}
-1, // digit
88, // {"1".."9"}
302, // "0"
235, // digit128
1, // {176..185}
-1, // any
-1, // "["
254, // "-"
-1, // {0..9 11..31 "!" "$" "&" "," ":" "<" ">".."?" "\" "^" "`" "|" "~"..127}
-1, // " "
75, // "#"
-1, // ")"
-1, // "]"
-1, // "/"
-1, // ";"
238, // "{"
-1, // "%"
184, // "("
250, // "+"
-1, // "."
-1, // "_"
-1, // "="
183, // "@"
-1, // {10}
63, // "}"
108, // "'"
303, // '"'
-1, // "*"
-1, // any128
-1, // {223}
-1, // {128..175 186..192 219..222 224 251..255}
-1, // ws
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // any*
-1, // $$3
-1, // idChar
-1, // idChar128
-1, // hexDigit
-1, // hexDigit128
-1, // $
-1, // $NT
  }
,
{ // state 172
0x80000000|2, // match move
0x80000000|132, // no-match move
0x80000000|161, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 173
55,224, // "i"
61,293, // "b"
  }
,
{ // state 174
9,294, // <decl in class>*
10,297, // `}
11,77, // <decl in class>
12,182, // <method decl>
13,97, // `public
78,100, // "#"
92,63, // "}"
  }
,
{ // state 175
0x80000000|292, // match move
0x80000000|240, // no-match move
0x80000000|161, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 176
MIN_REDUCTION+115, // (default reduction)
  }
,
{ // state 177
77,159, // " "
91,51, // {10}
99,84, // ws
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 178
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 179
22,MIN_REDUCTION+36, // `[
74,MIN_REDUCTION+36, // "["
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 180
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 181
0x80000000|82, // match move
0x80000000|74, // no-match move
0x80000000|161, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 182
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 183
94,247, // '"'
  }
,
{ // state 184
2,214, // ws*
77,159, // " "
91,51, // {10}
99,267, // ws
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 185
22,MIN_REDUCTION+39, // `[
74,MIN_REDUCTION+39, // "["
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 186
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
4, // ID
220, // `{
-1, // <decl in class>*
156, // `}
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
144, // `(
-1, // `)
-1, // <stmt>*
81, // <type>
73, // `int
95, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
134, // <stmt>
40, // <assign>
-1, // `;
39, // <local var decl>
200, // <exp>
-1, // `=
98, // <exp5>
114, // `+
116, // <exp6>
30, // `-
-1, // `*
210, // <exp7>
-1, // `/
-1, // `%
60, // <cast exp>
56, // <unary exp>
107, // <exp8>
22, // INTLIT
255, // STRINGLIT
242, // CHARLIT
313, // `false
89, // `this
31, // `true
103, // `null
-1, // `.
148, // letter
178, // "a"
178, // "p"
178, // "v"
178, // "c"
178, // "f"
178, // "i"
178, // "l"
178, // "o"
178, // "r"
178, // "u"
178, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
178, // "b"
178, // "h"
178, // "n"
178, // "t"
175, // letter128
272, // {199..218 231..250}
272, // {193..198 225..230}
-1, // digit
88, // {"1".."9"}
302, // "0"
235, // digit128
1, // {176..185}
-1, // any
-1, // "["
254, // "-"
-1, // {0..9 11..31 "!" "$" "&" "," ":" "<" ">".."?" "\" "^" "`" "|" "~"..127}
-1, // " "
75, // "#"
-1, // ")"
-1, // "]"
-1, // "/"
-1, // ";"
238, // "{"
-1, // "%"
184, // "("
250, // "+"
-1, // "."
-1, // "_"
-1, // "="
183, // "@"
-1, // {10}
63, // "}"
108, // "'"
303, // '"'
-1, // "*"
-1, // any128
-1, // {223}
-1, // {128..175 186..192 219..222 224 251..255}
-1, // ws
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // any*
-1, // $$3
-1, // idChar
-1, // idChar128
-1, // hexDigit
-1, // hexDigit128
-1, // $
-1, // $NT
  }
,
{ // state 187
0x80000000|270, // match move
0x80000000|197, // no-match move
0x80000000|161, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 188
2,290, // ws*
77,159, // " "
91,51, // {10}
99,267, // ws
113,MIN_REDUCTION+92, // $NT
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 189
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 190
2,23, // ws*
77,159, // " "
91,51, // {10}
99,267, // ws
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 191
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 192
77,159, // " "
91,51, // {10}
99,84, // ws
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 193
MIN_REDUCTION+131, // (default reduction)
  }
,
{ // state 194
58,231, // "r"
62,230, // "h"
  }
,
{ // state 195
22,MIN_REDUCTION+102, // `[
74,MIN_REDUCTION+102, // "["
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 196
49,176, // letter
50,178, // "a"
51,178, // "p"
52,178, // "v"
53,178, // "c"
54,178, // "f"
55,178, // "i"
56,178, // "l"
57,178, // "o"
58,178, // "r"
59,178, // "u"
60,178, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
61,178, // "b"
62,178, // "h"
63,178, // "n"
64,178, // "t"
65,219, // letter128
66,14, // {199..218 231..250}
67,14, // {193..198 225..230}
68,26, // digit
69,53, // {"1".."9"}
70,53, // "0"
71,79, // digit128
72,36, // {176..185}
88,225, // "_"
97,11, // {223}
101,112, // $$0
108,207, // idChar
109,146, // idChar128
  }
,
{ // state 197
2,137, // ws*
22,MIN_REDUCTION+68, // `[
74,MIN_REDUCTION+68, // "["
77,201, // " "
91,262, // {10}
99,57, // ws
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 198
0x80000000|78, // match move
0x80000000|228, // no-match move
0x80000000|161, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 199
MIN_REDUCTION+139, // (default reduction)
  }
,
{ // state 200
29,287, // `=
89,76, // "="
  }
,
{ // state 201
0x80000000|7, // match move
0x80000000|85, // no-match move
0x80000000|161, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 202
112,MIN_REDUCTION+0, // $
  }
,
{ // state 203
77,159, // " "
91,51, // {10}
99,84, // ws
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 204
2,69, // ws*
  }
,
{ // state 205
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 206
7,248, // ID
15,144, // `(
31,114, // `+
33,30, // `-
35,283, // <exp7>
38,60, // <cast exp>
39,56, // <unary exp>
40,107, // <exp8>
41,22, // INTLIT
42,255, // STRINGLIT
43,242, // CHARLIT
44,313, // `false
45,89, // `this
46,31, // `true
47,103, // `null
49,148, // letter
50,178, // "a"
51,178, // "p"
52,178, // "v"
53,178, // "c"
54,178, // "f"
55,178, // "i"
56,178, // "l"
57,178, // "o"
58,178, // "r"
59,178, // "u"
60,178, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
61,178, // "b"
62,178, // "h"
63,178, // "n"
64,178, // "t"
65,175, // letter128
66,272, // {199..218 231..250}
67,272, // {193..198 225..230}
69,88, // {"1".."9"}
70,302, // "0"
71,235, // digit128
72,1, // {176..185}
75,254, // "-"
78,12, // "#"
85,184, // "("
86,250, // "+"
90,183, // "@"
93,108, // "'"
94,303, // '"'
  }
,
{ // state 207
MIN_REDUCTION+135, // (default reduction)
  }
,
{ // state 208
2,21, // ws*
22,MIN_REDUCTION+144, // `[
74,MIN_REDUCTION+144, // "["
77,201, // " "
91,262, // {10}
99,57, // ws
MIN_REDUCTION+144, // (default reduction)
  }
,
{ // state 209
22,MIN_REDUCTION+43, // `[
74,MIN_REDUCTION+43, // "["
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 210
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 211
23,101, // `]
80,165, // "]"
  }
,
{ // state 212
22,MIN_REDUCTION+91, // `[
74,MIN_REDUCTION+91, // "["
77,201, // " "
91,262, // {10}
99,305, // ws
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 213
2,18, // ws*
77,159, // " "
91,51, // {10}
99,267, // ws
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 214
77,159, // " "
91,51, // {10}
99,84, // ws
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 215
MIN_REDUCTION+127, // (default reduction)
  }
,
{ // state 216
77,159, // " "
91,51, // {10}
99,84, // ws
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 217
MIN_REDUCTION+138, // (default reduction)
  }
,
{ // state 218
22,MIN_REDUCTION+109, // `[
74,MIN_REDUCTION+109, // "["
77,201, // " "
91,262, // {10}
99,305, // ws
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 219
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 220
-1, // $$start
-1, // <start>
-1, // ws*
-1, // <program>
-1, // <class decl>+
-1, // <class decl>
-1, // `class
4, // ID
220, // `{
-1, // <decl in class>*
47, // `}
-1, // <decl in class>
-1, // <method decl>
-1, // `public
-1, // `void
144, // `(
-1, // `)
186, // <stmt>*
81, // <type>
73, // `int
95, // `boolean
-1, // <empty bracket pair>
-1, // `[
-1, // `]
299, // <stmt>
40, // <assign>
-1, // `;
39, // <local var decl>
200, // <exp>
-1, // `=
98, // <exp5>
114, // `+
116, // <exp6>
30, // `-
-1, // `*
210, // <exp7>
-1, // `/
-1, // `%
60, // <cast exp>
56, // <unary exp>
107, // <exp8>
22, // INTLIT
255, // STRINGLIT
242, // CHARLIT
313, // `false
89, // `this
31, // `true
103, // `null
-1, // `.
148, // letter
178, // "a"
178, // "p"
178, // "v"
178, // "c"
178, // "f"
178, // "i"
178, // "l"
178, // "o"
178, // "r"
178, // "u"
178, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
178, // "b"
178, // "h"
178, // "n"
178, // "t"
175, // letter128
272, // {199..218 231..250}
272, // {193..198 225..230}
-1, // digit
88, // {"1".."9"}
302, // "0"
235, // digit128
1, // {176..185}
-1, // any
-1, // "["
254, // "-"
-1, // {0..9 11..31 "!" "$" "&" "," ":" "<" ">".."?" "\" "^" "`" "|" "~"..127}
-1, // " "
75, // "#"
-1, // ")"
-1, // "]"
-1, // "/"
-1, // ";"
238, // "{"
-1, // "%"
184, // "("
250, // "+"
-1, // "."
-1, // "_"
-1, // "="
183, // "@"
-1, // {10}
63, // "}"
108, // "'"
303, // '"'
-1, // "*"
-1, // any128
-1, // {223}
-1, // {128..175 186..192 219..222 224 251..255}
-1, // ws
-1, // idChar*
-1, // $$0
-1, // digit*
-1, // $$1
-1, // hexDigit*
-1, // $$2
-1, // any*
-1, // $$3
-1, // idChar
-1, // idChar128
-1, // hexDigit
-1, // hexDigit128
-1, // $
-1, // $NT
  }
,
{ // state 221
22,MIN_REDUCTION+108, // `[
74,MIN_REDUCTION+108, // "["
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 222
22,MIN_REDUCTION+118, // `[
74,MIN_REDUCTION+118, // "["
MIN_REDUCTION+118, // (default reduction)
  }
,
{ // state 223
22,MIN_REDUCTION+35, // `[
29,MIN_REDUCTION+35, // `=
31,MIN_REDUCTION+35, // `+
33,MIN_REDUCTION+35, // `-
34,MIN_REDUCTION+35, // `*
36,MIN_REDUCTION+35, // `/
37,MIN_REDUCTION+35, // `%
48,MIN_REDUCTION+35, // `.
74,MIN_REDUCTION+35, // "["
75,MIN_REDUCTION+35, // "-"
81,MIN_REDUCTION+35, // "/"
84,MIN_REDUCTION+35, // "%"
86,MIN_REDUCTION+35, // "+"
87,MIN_REDUCTION+35, // "."
89,MIN_REDUCTION+35, // "="
95,MIN_REDUCTION+35, // "*"
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 224
64,289, // "t"
  }
,
{ // state 225
MIN_REDUCTION+117, // (default reduction)
  }
,
{ // state 226
MIN_REDUCTION+132, // (default reduction)
  }
,
{ // state 227
56,99, // "l"
  }
,
{ // state 228
22,MIN_REDUCTION+49, // `[
74,MIN_REDUCTION+49, // "["
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 229
22,MIN_REDUCTION+111, // `[
74,MIN_REDUCTION+111, // "["
MIN_REDUCTION+111, // (default reduction)
  }
,
{ // state 230
0x80000000|251, // match move
0x80000000|300, // no-match move
0x80000000|161, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 231
0x80000000|17, // match move
0x80000000|311, // no-match move
0x80000000|161, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 232
59,187, // "u"
  }
,
{ // state 233
22,MIN_REDUCTION+119, // `[
74,MIN_REDUCTION+119, // "["
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 234
49,176, // letter
50,178, // "a"
51,178, // "p"
52,178, // "v"
53,178, // "c"
54,178, // "f"
55,178, // "i"
56,178, // "l"
57,178, // "o"
58,178, // "r"
59,178, // "u"
60,178, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
61,178, // "b"
62,178, // "h"
63,178, // "n"
64,178, // "t"
65,219, // letter128
66,14, // {199..218 231..250}
67,14, // {193..198 225..230}
68,26, // digit
69,53, // {"1".."9"}
70,53, // "0"
71,79, // digit128
72,36, // {176..185}
88,225, // "_"
97,11, // {223}
100,196, // idChar*
101,237, // $$0
108,304, // idChar
109,146, // idChar128
  }
,
{ // state 235
0x80000000|273, // match move
0x80000000|278, // no-match move
0x80000000|161, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 236
77,159, // " "
91,51, // {10}
99,84, // ws
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 237
MIN_REDUCTION+102, // (default reduction)
  }
,
{ // state 238
2,20, // ws*
77,159, // " "
91,51, // {10}
99,267, // ws
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 239
22,MIN_REDUCTION+40, // `[
74,MIN_REDUCTION+40, // "["
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 240
2,43, // ws*
22,MIN_REDUCTION+100, // `[
74,MIN_REDUCTION+100, // "["
77,201, // " "
91,262, // {10}
99,57, // ws
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 241
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 242
0x80000000|2, // match move
0x80000000|185, // no-match move
0x80000000|161, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 243
23,29, // `]
80,188, // "]"
  }
,
{ // state 244
0x80000000|301, // match move
0x80000000|233, // no-match move
0x80000000|161, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 245
MIN_REDUCTION+122, // (default reduction)
  }
,
{ // state 246
0x80000000|2, // match move
0x80000000|66, // no-match move
0x80000000|161, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 247
0x80000000|163, // match move
0x80000000|252, // no-match move
0x80000000|161, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 248
0x80000000|2, // match move
0x80000000|158, // no-match move
0x80000000|161, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 249
0x80000000|2, // match move
0x80000000|94, // no-match move
0x80000000|161, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 250
2,310, // ws*
77,159, // " "
91,51, // {10}
99,267, // ws
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 251
2,172, // ws*
  }
,
{ // state 252
2,314, // ws*
22,MIN_REDUCTION+110, // `[
74,MIN_REDUCTION+110, // "["
77,201, // " "
91,262, // {10}
99,57, // ws
MIN_REDUCTION+110, // (default reduction)
  }
,
{ // state 253
22,MIN_REDUCTION+145, // `[
74,MIN_REDUCTION+145, // "["
77,201, // " "
91,262, // {10}
99,305, // ws
MIN_REDUCTION+145, // (default reduction)
  }
,
{ // state 254
2,286, // ws*
77,159, // " "
91,51, // {10}
99,267, // ws
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 255
0x80000000|2, // match move
0x80000000|152, // no-match move
0x80000000|161, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 256
0x80000000|2, // match move
0x80000000|91, // no-match move
0x80000000|161, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 257
0x80000000|2, // match move
0x80000000|164, // no-match move
0x80000000|161, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 258
7,248, // ID
15,144, // `(
28,141, // <exp>
30,98, // <exp5>
31,114, // `+
32,116, // <exp6>
33,30, // `-
35,210, // <exp7>
38,60, // <cast exp>
39,56, // <unary exp>
40,107, // <exp8>
41,22, // INTLIT
42,255, // STRINGLIT
43,242, // CHARLIT
44,313, // `false
45,89, // `this
46,31, // `true
47,103, // `null
49,148, // letter
50,178, // "a"
51,178, // "p"
52,178, // "v"
53,178, // "c"
54,178, // "f"
55,178, // "i"
56,178, // "l"
57,178, // "o"
58,178, // "r"
59,178, // "u"
60,178, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
61,178, // "b"
62,178, // "h"
63,178, // "n"
64,178, // "t"
65,175, // letter128
66,272, // {199..218 231..250}
67,272, // {193..198 225..230}
69,88, // {"1".."9"}
70,302, // "0"
71,235, // digit128
72,1, // {176..185}
75,254, // "-"
78,12, // "#"
85,184, // "("
86,250, // "+"
90,183, // "@"
93,108, // "'"
94,303, // '"'
  }
,
{ // state 259
49,176, // letter
50,178, // "a"
51,178, // "p"
52,178, // "v"
53,178, // "c"
54,178, // "f"
55,178, // "i"
56,178, // "l"
57,178, // "o"
58,178, // "r"
59,178, // "u"
60,178, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
61,178, // "b"
62,178, // "h"
63,178, // "n"
64,178, // "t"
65,61, // letter128
66,272, // {199..218 231..250}
67,272, // {193..198 225..230}
68,26, // digit
69,53, // {"1".."9"}
70,53, // "0"
71,244, // digit128
72,1, // {176..185}
88,225, // "_"
97,181, // {223}
101,129, // $$0
108,207, // idChar
109,162, // idChar128
  }
,
{ // state 260
2,115, // ws*
22,MIN_REDUCTION+64, // `[
74,MIN_REDUCTION+64, // "["
77,201, // " "
91,262, // {10}
99,57, // ws
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 261
7,248, // ID
15,144, // `(
28,211, // <exp>
30,98, // <exp5>
31,114, // `+
32,116, // <exp6>
33,30, // `-
35,210, // <exp7>
38,60, // <cast exp>
39,56, // <unary exp>
40,107, // <exp8>
41,22, // INTLIT
42,255, // STRINGLIT
43,242, // CHARLIT
44,313, // `false
45,89, // `this
46,31, // `true
47,103, // `null
49,148, // letter
50,178, // "a"
51,178, // "p"
52,178, // "v"
53,178, // "c"
54,178, // "f"
55,178, // "i"
56,178, // "l"
57,178, // "o"
58,178, // "r"
59,178, // "u"
60,178, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
61,178, // "b"
62,178, // "h"
63,178, // "n"
64,178, // "t"
65,175, // letter128
66,272, // {199..218 231..250}
67,272, // {193..198 225..230}
69,88, // {"1".."9"}
70,302, // "0"
71,235, // digit128
72,1, // {176..185}
75,254, // "-"
78,12, // "#"
85,184, // "("
86,250, // "+"
90,183, // "@"
93,108, // "'"
94,303, // '"'
  }
,
{ // state 262
0x80000000|49, // match move
0x80000000|70, // no-match move
0x80000000|161, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 263
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 264
MIN_REDUCTION+1, // (default reduction)
  }
,
{ // state 265
2,166, // ws*
77,159, // " "
91,51, // {10}
99,267, // ws
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 266
77,159, // " "
91,51, // {10}
99,84, // ws
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 267
113,MIN_REDUCTION+130, // $NT
MIN_REDUCTION+130, // (default reduction)
  }
,
{ // state 268
0x80000000|33, // match move
0x80000000|281, // no-match move
0x80000000|161, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 269
77,159, // " "
91,51, // {10}
99,84, // ws
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 270
2,137, // ws*
  }
,
{ // state 271
2,115, // ws*
  }
,
{ // state 272
0x80000000|191, // match move
0x80000000|59, // no-match move
0x80000000|161, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 273
2,257, // ws*
  }
,
{ // state 274
0x80000000|2, // match move
0x80000000|140, // no-match move
0x80000000|161, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 275
22,MIN_REDUCTION+113, // `[
74,MIN_REDUCTION+113, // "["
77,201, // " "
91,262, // {10}
99,305, // ws
MIN_REDUCTION+113, // (default reduction)
  }
,
{ // state 276
52,13, // "v"
  }
,
{ // state 277
50,34, // "a"
51,34, // "p"
52,34, // "v"
53,34, // "c"
54,34, // "f"
55,34, // "i"
56,34, // "l"
57,34, // "o"
58,34, // "r"
59,34, // "u"
60,34, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
61,34, // "b"
62,34, // "h"
63,34, // "n"
64,34, // "t"
66,145, // {199..218 231..250}
67,145, // {193..198 225..230}
69,34, // {"1".."9"}
70,34, // "0"
72,145, // {176..185}
73,215, // any
74,34, // "["
75,34, // "-"
76,34, // {0..9 11..31 "!" "$" "&" "," ":" "<" ">".."?" "\" "^" "`" "|" "~"..127}
77,34, // " "
78,34, // "#"
79,34, // ")"
80,34, // "]"
81,34, // "/"
82,34, // ";"
83,34, // "{"
84,34, // "%"
85,34, // "("
86,34, // "+"
87,34, // "."
88,34, // "_"
89,34, // "="
90,34, // "@"
91,34, // {10}
92,34, // "}"
93,34, // "'"
94,34, // '"'
95,34, // "*"
96,295, // any128
97,145, // {223}
98,145, // {128..175 186..192 219..222 224 251..255}
107,142, // $$3
  }
,
{ // state 278
2,257, // ws*
22,MIN_REDUCTION+106, // `[
74,MIN_REDUCTION+106, // "["
77,201, // " "
91,262, // {10}
99,57, // ws
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 279
2,111, // ws*
MIN_REDUCTION+140, // (default reduction)
  }
,
{ // state 280
MIN_REDUCTION+125, // (default reduction)
  }
,
{ // state 281
2,128, // ws*
22,MIN_REDUCTION+114, // `[
74,MIN_REDUCTION+114, // "["
77,201, // " "
91,262, // {10}
99,57, // ws
MIN_REDUCTION+114, // (default reduction)
  }
,
{ // state 282
MIN_REDUCTION+134, // (default reduction)
  }
,
{ // state 283
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 284
16,122, // `)
21,138, // <empty bracket pair>
22,243, // `[
74,44, // "["
79,190, // ")"
  }
,
{ // state 285
5,217, // <class decl>
6,150, // `class
78,8, // "#"
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 286
77,159, // " "
91,51, // {10}
99,84, // ws
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 287
7,248, // ID
15,144, // `(
28,288, // <exp>
30,98, // <exp5>
31,114, // `+
32,116, // <exp6>
33,30, // `-
35,210, // <exp7>
38,60, // <cast exp>
39,56, // <unary exp>
40,107, // <exp8>
41,22, // INTLIT
42,255, // STRINGLIT
43,242, // CHARLIT
44,313, // `false
45,89, // `this
46,31, // `true
47,103, // `null
49,148, // letter
50,178, // "a"
51,178, // "p"
52,178, // "v"
53,178, // "c"
54,178, // "f"
55,178, // "i"
56,178, // "l"
57,178, // "o"
58,178, // "r"
59,178, // "u"
60,178, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
61,178, // "b"
62,178, // "h"
63,178, // "n"
64,178, // "t"
65,175, // letter128
66,272, // {199..218 231..250}
67,272, // {193..198 225..230}
69,88, // {"1".."9"}
70,302, // "0"
71,235, // digit128
72,1, // {176..185}
75,254, // "-"
78,12, // "#"
85,184, // "("
86,250, // "+"
90,183, // "@"
93,108, // "'"
94,303, // '"'
  }
,
{ // state 288
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 289
2,192, // ws*
77,159, // " "
91,51, // {10}
99,267, // ws
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 290
77,159, // " "
91,51, // {10}
99,84, // ws
113,MIN_REDUCTION+91, // $NT
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 291
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 292
2,43, // ws*
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 293
57,71, // "o"
  }
,
{ // state 294
10,131, // `}
11,280, // <decl in class>
12,182, // <method decl>
13,97, // `public
78,100, // "#"
92,63, // "}"
  }
,
{ // state 295
0x80000000|104, // match move
0x80000000|155, // no-match move
0x80000000|161, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 296
22,MIN_REDUCTION+41, // `[
74,MIN_REDUCTION+41, // "["
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 297
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 298
22,MIN_REDUCTION+67, // `[
74,MIN_REDUCTION+67, // "["
77,201, // " "
91,262, // {10}
99,305, // ws
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 299
MIN_REDUCTION+124, // (default reduction)
  }
,
{ // state 300
2,172, // ws*
22,MIN_REDUCTION+62, // `[
74,MIN_REDUCTION+62, // "["
77,201, // " "
91,262, // {10}
99,57, // ws
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 301
MIN_REDUCTION+119, // (default reduction)
  }
,
{ // state 302
50,46, // "a"
51,46, // "p"
52,46, // "v"
53,46, // "c"
54,46, // "f"
55,46, // "i"
56,46, // "l"
57,46, // "o"
58,46, // "r"
59,46, // "u"
60,46, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
61,46, // "b"
62,46, // "h"
63,46, // "n"
64,46, // "t"
67,92, // {193..198 225..230}
69,46, // {"1".."9"}
70,46, // "0"
72,92, // {176..185}
104,86, // hexDigit*
105,119, // $$2
110,282, // hexDigit
111,143, // hexDigit128
  }
,
{ // state 303
50,34, // "a"
51,34, // "p"
52,34, // "v"
53,34, // "c"
54,34, // "f"
55,34, // "i"
56,34, // "l"
57,34, // "o"
58,34, // "r"
59,34, // "u"
60,34, // {"A".."Z" "d".."e" "g" "j".."k" "m" "q" "s" "w".."z"}
61,34, // "b"
62,34, // "h"
63,34, // "n"
64,34, // "t"
66,145, // {199..218 231..250}
67,145, // {193..198 225..230}
69,34, // {"1".."9"}
70,34, // "0"
72,145, // {176..185}
73,307, // any
74,34, // "["
75,34, // "-"
76,34, // {0..9 11..31 "!" "$" "&" "," ":" "<" ">".."?" "\" "^" "`" "|" "~"..127}
77,34, // " "
78,34, // "#"
79,34, // ")"
80,34, // "]"
81,34, // "/"
82,34, // ";"
83,34, // "{"
84,34, // "%"
85,34, // "("
86,34, // "+"
87,34, // "."
88,34, // "_"
89,34, // "="
90,34, // "@"
91,34, // {10}
92,34, // "}"
93,34, // "'"
94,34, // '"'
95,34, // "*"
96,295, // any128
97,145, // {223}
98,145, // {128..175 186..192 219..222 224 251..255}
106,277, // any*
107,16, // $$3
  }
,
{ // state 304
MIN_REDUCTION+136, // (default reduction)
  }
,
{ // state 305
0x80000000|24, // match move
0x80000000|68, // no-match move
0x80000000|161, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 306
3,264, // <program>
4,285, // <class decl>+
5,318, // <class decl>
6,150, // `class
77,159, // " "
78,8, // "#"
91,51, // {10}
99,84, // ws
  }
,
{ // state 307
MIN_REDUCTION+128, // (default reduction)
  }
,
{ // state 308
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 309
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 310
77,159, // " "
91,51, // {10}
99,84, // ws
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 311
2,246, // ws*
22,MIN_REDUCTION+66, // `[
74,MIN_REDUCTION+66, // "["
77,201, // " "
91,262, // {10}
99,57, // ws
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 312
2,177, // ws*
77,159, // " "
91,51, // {10}
99,267, // ws
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 313
0x80000000|2, // match move
0x80000000|239, // no-match move
0x80000000|161, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 314
0x80000000|2, // match move
0x80000000|218, // no-match move
0x80000000|161, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 315
2,21, // ws*
  }
,
{ // state 316
29,258, // `=
89,76, // "="
  }
,
{ // state 317
2,274, // ws*
  }
,
{ // state 318
MIN_REDUCTION+137, // (default reduction)
  }
,
};
}
public MJGrammarParseTable(MJGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[319][];
  int doneSoFar = 0;
  doneSoFar += new Initter1().doInit(doneSoFar);
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
// <exp> ::= <exp5>
(28<<16)+1,
// <exp5> ::= <exp5> `+ <exp6>
(30<<16)+3,
// <exp5> ::= <exp5> `- <exp6>
(30<<16)+3,
// <exp5> ::= <exp6>
(30<<16)+1,
// <exp6> ::= <exp6> `* <exp7>
(32<<16)+3,
// <exp6> ::= <exp6> `/ <exp7>
(32<<16)+3,
// <exp6> ::= <exp6> `% <exp7>
(32<<16)+3,
// <exp6> ::= <exp7>
(32<<16)+1,
// <exp7> ::= <cast exp>
(35<<16)+1,
// <exp7> ::= <unary exp>
(35<<16)+1,
// <cast exp> ::= `( <type> `) <cast exp>
(38<<16)+4,
// <cast exp> ::= `( <type> `) <exp8>
(38<<16)+4,
// <unary exp> ::= `- <unary exp>
(39<<16)+2,
// <unary exp> ::= `+ <unary exp>
(39<<16)+2,
// <unary exp> ::= <exp8>
(39<<16)+1,
// <exp8> ::= ID
(40<<16)+1,
// <exp8> ::= <exp8> !<empty bracket pair> `[ <exp> `]
(40<<16)+4,
// <exp8> ::= INTLIT
(40<<16)+1,
// <exp8> ::= STRINGLIT
(40<<16)+1,
// <exp8> ::= CHARLIT
(40<<16)+1,
// <exp8> ::= `false
(40<<16)+1,
// <exp8> ::= `this
(40<<16)+1,
// <exp8> ::= `true
(40<<16)+1,
// <exp8> ::= `null
(40<<16)+1,
// <exp8> ::= <exp8> `. ID
(40<<16)+3,
// letter ::= {"A".."Z" "a".."z"}
(49<<16)+1,
// letter128 ::= {193..218 225..250}
(65<<16)+1,
// digit ::= {"0".."9"}
(68<<16)+1,
// digit128 ::= {176..185}
(71<<16)+1,
// any ::= {0..127}
(73<<16)+1,
// any128 ::= {128..255}
(96<<16)+1,
// ws ::= " "
(99<<16)+1,
// ws ::= {10}
(99<<16)+1,
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
(45<<16)+4,
// `this ::= "#" "t" "h"
(45<<16)+3,
// `false ::= "#" "f" "a" ws*
(44<<16)+4,
// `false ::= "#" "f" "a"
(44<<16)+3,
// `true ::= "#" "t" "r" ws*
(46<<16)+4,
// `true ::= "#" "t" "r"
(46<<16)+3,
// `null ::= "#" "n" "u" ws*
(47<<16)+4,
// `null ::= "#" "n" "u"
(47<<16)+3,
// `public ::= "#" "p" "u" ws*
(13<<16)+4,
// `public ::= "#" "p" "u"
(13<<16)+3,
// `% ::= "%" ws*
(37<<16)+2,
// `% ::= "%"
(37<<16)+1,
// `* ::= "*" ws*
(34<<16)+2,
// `* ::= "*"
(34<<16)+1,
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
(33<<16)+2,
// `- ::= "-"
(33<<16)+1,
// `+ ::= "+" ws*
(31<<16)+2,
// `+ ::= "+"
(31<<16)+1,
// `= ::= "=" ws*
(29<<16)+2,
// `= ::= "="
(29<<16)+1,
// `[ ::= "[" ws*
(22<<16)+2,
// `[ ::= "["
(22<<16)+1,
// `] ::= "]" ws*
(23<<16)+2,
// `] ::= "]"
(23<<16)+1,
// `. ::= "." ws*
(48<<16)+2,
// `. ::= "."
(48<<16)+1,
// `; ::= ";" ws*
(26<<16)+2,
// `; ::= ";"
(26<<16)+1,
// `/ ::= "/" ws*
(36<<16)+2,
// `/ ::= "/"
(36<<16)+1,
// ID ::= letter128 ws*
(7<<16)+2,
// ID ::= letter128
(7<<16)+1,
// ID ::= letter idChar* $$0
(7<<16)+3,
// ID ::= letter $$0
(7<<16)+2,
// INTLIT ::= {"1".."9"} digit* $$1
(41<<16)+3,
// INTLIT ::= {"1".."9"} $$1
(41<<16)+2,
// INTLIT ::= digit128 ws*
(41<<16)+2,
// INTLIT ::= digit128
(41<<16)+1,
// INTLIT ::= "0" hexDigit* $$2
(41<<16)+3,
// INTLIT ::= "0" $$2
(41<<16)+2,
// STRINGLIT ::= "@" '"' ws*
(42<<16)+3,
// STRINGLIT ::= "@" '"'
(42<<16)+2,
// STRINGLIT ::= '"' any* $$3
(42<<16)+3,
// STRINGLIT ::= '"' $$3
(42<<16)+2,
// CHARLIT ::= "'" any ws*
(43<<16)+3,
// CHARLIT ::= "'" any
(43<<16)+2,
// idChar ::= letter
(108<<16)+1,
// idChar ::= digit
(108<<16)+1,
// idChar ::= "_"
(108<<16)+1,
// idChar128 ::= letter128
(109<<16)+1,
// idChar128 ::= digit128
(109<<16)+1,
// idChar128 ::= {223}
(109<<16)+1,
// hexDigit ::= {"0".."9" "A".."Z" "a".."z"}
(110<<16)+1,
// hexDigit128 ::= {176..185 193..198 225..230}
(111<<16)+1,
// <stmt>* ::= <stmt>* <stmt>
(17<<16)+2,
// <stmt>* ::= <stmt>
(17<<16)+1,
// <decl in class>* ::= <decl in class>* <decl in class>
(9<<16)+2,
// <decl in class>* ::= <decl in class>
(9<<16)+1,
// any* ::= any* any
(106<<16)+2,
// any* ::= any
(106<<16)+1,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// digit* ::= digit* digit
(102<<16)+2,
// digit* ::= digit
(102<<16)+1,
// hexDigit* ::= hexDigit* hexDigit
(104<<16)+2,
// hexDigit* ::= hexDigit
(104<<16)+1,
// idChar* ::= idChar* idChar
(100<<16)+2,
// idChar* ::= idChar
(100<<16)+1,
// <class decl>+ ::= <class decl>
(4<<16)+1,
// <class decl>+ ::= <class decl>+ <class decl>
(4<<16)+2,
// $$0 ::= idChar128 ws*
(101<<16)+2,
// $$0 ::= idChar128
(101<<16)+1,
// $$1 ::= digit128 ws*
(103<<16)+2,
// $$1 ::= digit128
(103<<16)+1,
// $$2 ::= hexDigit128 ws*
(105<<16)+2,
// $$2 ::= hexDigit128
(105<<16)+1,
// $$3 ::= any128 ws*
(107<<16)+2,
// $$3 ::= any128
(107<<16)+1,
};
public int[] getCharMapTable() { return charMapTable; }
private static int[] charMapTable = {
76, // 0
76, // 1
76, // 2
76, // 3
76, // 4
76, // 5
76, // 6
76, // 7
76, // 8
76, // 9
91, // 10
76, // 11
76, // 12
76, // 13
76, // 14
76, // 15
76, // 16
76, // 17
76, // 18
76, // 19
76, // 20
76, // 21
76, // 22
76, // 23
76, // 24
76, // 25
76, // 26
76, // 27
76, // 28
76, // 29
76, // 30
76, // 31
77, // " "
76, // "!"
94, // '"'
78, // "#"
76, // "$"
84, // "%"
76, // "&"
93, // "'"
85, // "("
79, // ")"
95, // "*"
86, // "+"
76, // ","
75, // "-"
87, // "."
81, // "/"
70, // "0"
69, // "1"
69, // "2"
69, // "3"
69, // "4"
69, // "5"
69, // "6"
69, // "7"
69, // "8"
69, // "9"
76, // ":"
82, // ";"
76, // "<"
89, // "="
76, // ">"
76, // "?"
90, // "@"
60, // "A"
60, // "B"
60, // "C"
60, // "D"
60, // "E"
60, // "F"
60, // "G"
60, // "H"
60, // "I"
60, // "J"
60, // "K"
60, // "L"
60, // "M"
60, // "N"
60, // "O"
60, // "P"
60, // "Q"
60, // "R"
60, // "S"
60, // "T"
60, // "U"
60, // "V"
60, // "W"
60, // "X"
60, // "Y"
60, // "Z"
74, // "["
76, // "\"
80, // "]"
76, // "^"
88, // "_"
76, // "`"
50, // "a"
61, // "b"
53, // "c"
60, // "d"
60, // "e"
54, // "f"
60, // "g"
62, // "h"
55, // "i"
60, // "j"
60, // "k"
56, // "l"
60, // "m"
63, // "n"
57, // "o"
51, // "p"
60, // "q"
58, // "r"
60, // "s"
64, // "t"
59, // "u"
52, // "v"
60, // "w"
60, // "x"
60, // "y"
60, // "z"
83, // "{"
76, // "|"
92, // "}"
76, // "~"
76, // 127
98, // 128
98, // 129
98, // 130
98, // 131
98, // 132
98, // 133
98, // 134
98, // 135
98, // 136
98, // 137
98, // 138
98, // 139
98, // 140
98, // 141
98, // 142
98, // 143
98, // 144
98, // 145
98, // 146
98, // 147
98, // 148
98, // 149
98, // 150
98, // 151
98, // 152
98, // 153
98, // 154
98, // 155
98, // 156
98, // 157
98, // 158
98, // 159
98, // 160
98, // 161
98, // 162
98, // 163
98, // 164
98, // 165
98, // 166
98, // 167
98, // 168
98, // 169
98, // 170
98, // 171
98, // 172
98, // 173
98, // 174
98, // 175
72, // 176
72, // 177
72, // 178
72, // 179
72, // 180
72, // 181
72, // 182
72, // 183
72, // 184
72, // 185
98, // 186
98, // 187
98, // 188
98, // 189
98, // 190
98, // 191
98, // 192
67, // 193
67, // 194
67, // 195
67, // 196
67, // 197
67, // 198
66, // 199
66, // 200
66, // 201
66, // 202
66, // 203
66, // 204
66, // 205
66, // 206
66, // 207
66, // 208
66, // 209
66, // 210
66, // 211
66, // 212
66, // 213
66, // 214
66, // 215
66, // 216
66, // 217
66, // 218
98, // 219
98, // 220
98, // 221
98, // 222
97, // 223
98, // 224
67, // 225
67, // 226
67, // 227
67, // 228
67, // 229
67, // 230
66, // 231
66, // 232
66, // 233
66, // 234
66, // 235
66, // 236
66, // 237
66, // 238
66, // 239
66, // 240
66, // 241
66, // 242
66, // 243
66, // 244
66, // 245
66, // 246
66, // 247
66, // 248
66, // 249
66, // 250
98, // 251
98, // 252
98, // 253
98, // 254
98, // 255
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
"<exp> ::= <exp5>", // 20
"<exp5> ::= <exp5> # `+ <exp6>", // 21
"<exp5> ::= <exp5> # `- <exp6>", // 22
"<exp5> ::= <exp6>", // 23
"<exp6> ::= <exp6> # `* <exp7>", // 24
"<exp6> ::= <exp6> # `/ <exp7>", // 25
"<exp6> ::= <exp6> # `% <exp7>", // 26
"<exp6> ::= <exp7>", // 27
"<exp7> ::= <cast exp>", // 28
"<exp7> ::= <unary exp>", // 29
"<cast exp> ::= # `( <type> `) <cast exp>", // 30
"<cast exp> ::= # `( <type> `) <exp8>", // 31
"<unary exp> ::= # `- <unary exp>", // 32
"<unary exp> ::= # `+ <unary exp>", // 33
"<unary exp> ::= <exp8>", // 34
"<exp8> ::= # ID", // 35
"<exp8> ::= <exp8> !<empty bracket pair> # `[ <exp> `]", // 36
"<exp8> ::= # INTLIT", // 37
"<exp8> ::= # STRINGLIT", // 38
"<exp8> ::= # CHARLIT", // 39
"<exp8> ::= # `false", // 40
"<exp8> ::= # `this", // 41
"<exp8> ::= # `true", // 42
"<exp8> ::= # `null", // 43
"<exp8> ::= # <exp8> `. ID", // 44
"letter ::= {\"A\"..\"Z\" \"a\"..\"z\"}", // 45
"letter128 ::= {193..218 225..250}", // 46
"digit ::= {\"0\"..\"9\"}", // 47
"digit128 ::= {176..185}", // 48
"any ::= {0..127}", // 49
"any128 ::= {128..255}", // 50
"ws ::= \" \"", // 51
"ws ::= {10} registerNewline", // 52
"`boolean ::= \"#\" \"b\" \"o\" ws*", // 53
"`boolean ::= \"#\" \"b\" \"o\" ws*", // 54
"`class ::= \"#\" \"c\" \"l\" ws*", // 55
"`class ::= \"#\" \"c\" \"l\" ws*", // 56
"`void ::= \"#\" \"v\" \"o\" ws*", // 57
"`void ::= \"#\" \"v\" \"o\" ws*", // 58
"`int ::= \"#\" \"i\" \"t\" ws*", // 59
"`int ::= \"#\" \"i\" \"t\" ws*", // 60
"`this ::= \"#\" \"t\" \"h\" ws*", // 61
"`this ::= \"#\" \"t\" \"h\" ws*", // 62
"`false ::= \"#\" \"f\" \"a\" ws*", // 63
"`false ::= \"#\" \"f\" \"a\" ws*", // 64
"`true ::= \"#\" \"t\" \"r\" ws*", // 65
"`true ::= \"#\" \"t\" \"r\" ws*", // 66
"`null ::= \"#\" \"n\" \"u\" ws*", // 67
"`null ::= \"#\" \"n\" \"u\" ws*", // 68
"`public ::= \"#\" \"p\" \"u\" ws*", // 69
"`public ::= \"#\" \"p\" \"u\" ws*", // 70
"`% ::= \"%\" ws*", // 71
"`% ::= \"%\" ws*", // 72
"`* ::= \"*\" ws*", // 73
"`* ::= \"*\" ws*", // 74
"`( ::= \"(\" ws*", // 75
"`( ::= \"(\" ws*", // 76
"`) ::= \")\" ws*", // 77
"`) ::= \")\" ws*", // 78
"`{ ::= \"{\" ws*", // 79
"`{ ::= \"{\" ws*", // 80
"`} ::= \"}\" ws*", // 81
"`} ::= \"}\" ws*", // 82
"`- ::= \"-\" ws*", // 83
"`- ::= \"-\" ws*", // 84
"`+ ::= \"+\" ws*", // 85
"`+ ::= \"+\" ws*", // 86
"`= ::= \"=\" ws*", // 87
"`= ::= \"=\" ws*", // 88
"`[ ::= \"[\" ws*", // 89
"`[ ::= \"[\" ws*", // 90
"`] ::= \"]\" ws*", // 91
"`] ::= \"]\" ws*", // 92
"`. ::= \".\" ws*", // 93
"`. ::= \".\" ws*", // 94
"`; ::= \";\" ws*", // 95
"`; ::= \";\" ws*", // 96
"`/ ::= \"/\" ws*", // 97
"`/ ::= \"/\" ws*", // 98
"ID ::= letter128 ws*", // 99
"ID ::= letter128 ws*", // 100
"ID ::= letter idChar* idChar128 ws*", // 101
"ID ::= letter idChar* idChar128 ws*", // 102
"INTLIT ::= {\"1\"..\"9\"} digit* digit128 ws*", // 103
"INTLIT ::= {\"1\"..\"9\"} digit* digit128 ws*", // 104
"INTLIT ::= digit128 ws*", // 105
"INTLIT ::= digit128 ws*", // 106
"INTLIT ::= \"0\" hexDigit* hexDigit128 ws*", // 107
"INTLIT ::= \"0\" hexDigit* hexDigit128 ws*", // 108
"STRINGLIT ::= \"@\" \'\"\' ws*", // 109
"STRINGLIT ::= \"@\" \'\"\' ws*", // 110
"STRINGLIT ::= \'\"\' any* any128 ws*", // 111
"STRINGLIT ::= \'\"\' any* any128 ws*", // 112
"CHARLIT ::= \"\'\" any ws*", // 113
"CHARLIT ::= \"\'\" any ws*", // 114
"idChar ::= letter", // 115
"idChar ::= digit", // 116
"idChar ::= \"_\"", // 117
"idChar128 ::= letter128", // 118
"idChar128 ::= digit128", // 119
"idChar128 ::= {223}", // 120
"hexDigit ::= {\"0\"..\"9\" \"A\"..\"Z\" \"a\"..\"z\"}", // 121
"hexDigit128 ::= {176..185 193..198 225..230}", // 122
"<stmt>* ::= <stmt>* <stmt>", // 123
"<stmt>* ::= <stmt>* <stmt>", // 124
"<decl in class>* ::= <decl in class>* <decl in class>", // 125
"<decl in class>* ::= <decl in class>* <decl in class>", // 126
"any* ::= any* any", // 127
"any* ::= any* any", // 128
"ws* ::= ws* ws", // 129
"ws* ::= ws* ws", // 130
"digit* ::= digit* digit", // 131
"digit* ::= digit* digit", // 132
"hexDigit* ::= hexDigit* hexDigit", // 133
"hexDigit* ::= hexDigit* hexDigit", // 134
"idChar* ::= idChar* idChar", // 135
"idChar* ::= idChar* idChar", // 136
"<class decl>+ ::= <class decl>", // 137
"<class decl>+ ::= <class decl>+ <class decl>", // 138
"", // 139
"", // 140
"", // 141
"", // 142
"", // 143
"", // 144
"", // 145
"", // 146
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
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((0<<5)|0x5)/*methodCall:0*/,
    },
    { // 3: <program> ::= [#] <class decl>+ @createProgram(int,List<ClassDecl>)=>Program
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0x5)/*methodCall:1*/,
    },
    { // 4: <class decl> ::= `class [#] ID `{ <decl in class>* `} @createClassDecl(int,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 5: <class decl> ::= `class [#] ID `{ [<decl in class>*] `} @createClassDecl(int,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 8: <method decl> ::= `public `void [#] ID `( `) `{ [<stmt>*] `} @createMethodDeclVoid(int,String,List<Statement>)=>Decl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 9: <type> ::= [#] `int @intType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 10: <type> ::= [#] `boolean @booleanType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((5<<5)|0x5)/*methodCall:5*/,
    },
    { // 11: <type> ::= [#] ID @identifierType(int,String)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((6<<5)|0x5)/*methodCall:6*/,
    },
    { // 12: <type> ::= [#] <type> <empty bracket pair> @newArrayType(int,Type,Object)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((8<<5)|0x5)/*methodCall:8*/,
    },
    { // 16: <stmt> ::= [#] `{ [<stmt>*] `} @newBlock(int,List<Statement>)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((10<<5)|0x5)/*methodCall:10*/,
    },
    { // 20: <exp> ::= <exp5> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 21: <exp5> ::= <exp5> [#] `+ <exp6> @newPlus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 22: <exp5> ::= <exp5> [#] `- <exp6> @newMinus(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x5)/*methodCall:12*/,
    },
    { // 23: <exp5> ::= <exp6> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 24: <exp6> ::= <exp6> [#] `* <exp7> @newTimes(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 25: <exp6> ::= <exp6> [#] `/ <exp7> @newDivide(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 26: <exp6> ::= <exp6> [#] `% <exp7> @newRemainder(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 27: <exp6> ::= <exp7> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 28: <exp7> ::= <cast exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 29: <exp7> ::= <unary exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 30: <cast exp> ::= [#] `( <type> `) <cast exp> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 31: <cast exp> ::= [#] `( <type> `) <exp8> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 32: <unary exp> ::= [#] `- <unary exp> @newUnaryMinus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 33: <unary exp> ::= [#] `+ <unary exp> @newUnaryPlus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 34: <unary exp> ::= <exp8> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 35: <exp8> ::= [#] ID @newIdentfierExp(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 36: <exp8> ::= <exp8> !<empty bracket pair> [#] `[ <exp> `] @newArrayLookup(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 37: <exp8> ::= [#] INTLIT @newIntegerLiteral(int,int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 38: <exp8> ::= [#] STRINGLIT @newStringLiteral(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 39: <exp8> ::= [#] CHARLIT @newCharLiteral(int,int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((23<<5)|0x5)/*methodCall:23*/,
    },
    { // 40: <exp8> ::= [#] `false @newFalse(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((24<<5)|0x5)/*methodCall:24*/,
    },
    { // 41: <exp8> ::= [#] `this @newThis(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((25<<5)|0x5)/*methodCall:25*/,
    },
    { // 42: <exp8> ::= [#] `true @newTrue(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((26<<5)|0x5)/*methodCall:26*/,
    },
    { // 43: <exp8> ::= [#] `null @newNull(int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((27<<5)|0x5)/*methodCall:27*/,
    },
    { // 44: <exp8> ::= [#] <exp8> `. ID @newInstVarAccess(int,Exp,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((28<<5)|0x5)/*methodCall:28*/,
    },
    { // 45: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 46: letter128 ::= {193..218 225..250} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
    { // 47: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 48: digit128 ::= {176..185} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
    { // 49: any ::= {0..127} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 50: any128 ::= {128..255} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
    { // 51: ws ::= " " @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 52: ws ::= {10} [registerNewline] @void
      ((8<<5)|0x6)/*nullProductionAction:8*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 53: `boolean ::= "#" "b" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 54: `boolean ::= "#" "b" "o" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 55: `class ::= "#" "c" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 56: `class ::= "#" "c" "l" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 57: `void ::= "#" "v" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 58: `void ::= "#" "v" "o" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 59: `int ::= "#" "i" "t" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 60: `int ::= "#" "i" "t" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 61: `this ::= "#" "t" "h" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 62: `this ::= "#" "t" "h" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 63: `false ::= "#" "f" "a" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 64: `false ::= "#" "f" "a" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 65: `true ::= "#" "t" "r" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 66: `true ::= "#" "t" "r" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 67: `null ::= "#" "n" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 68: `null ::= "#" "n" "u" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 69: `public ::= "#" "p" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 70: `public ::= "#" "p" "u" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 71: `% ::= "%" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 72: `% ::= "%" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 73: `* ::= "*" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 74: `* ::= "*" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 75: `( ::= "(" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 76: `( ::= "(" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 77: `) ::= ")" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 78: `) ::= ")" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 79: `{ ::= "{" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 80: `{ ::= "{" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 81: `} ::= "}" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 82: `} ::= "}" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 83: `- ::= "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 84: `- ::= "-" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 85: `+ ::= "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 86: `+ ::= "+" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 87: `= ::= "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 88: `= ::= "=" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 89: `[ ::= "[" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 90: `[ ::= "[" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 91: `] ::= "]" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 92: `] ::= "]" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 93: `. ::= "." ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 94: `. ::= "." [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 95: `; ::= ";" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 96: `; ::= ";" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 97: `/ ::= "/" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 98: `/ ::= "/" [ws*] @void
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 99: ID ::= letter128 ws* @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 100: ID ::= letter128 [ws*] @text
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 101: ID ::= letter idChar* $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 102: ID ::= letter [idChar*] $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 103: INTLIT ::= {"1".."9"} digit* $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((30<<5)|0x5)/*methodCall:30*/,
    },
    { // 104: INTLIT ::= {"1".."9"} [digit*] $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((30<<5)|0x5)/*methodCall:30*/,
    },
    { // 105: INTLIT ::= digit128 ws* @convertToInt(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((31<<5)|0x5)/*methodCall:31*/,
    },
    { // 106: INTLIT ::= digit128 [ws*] @convertToInt(char)=>int
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((31<<5)|0x5)/*methodCall:31*/,
    },
    { // 107: INTLIT ::= "0" hexDigit* $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((32<<5)|0x5)/*methodCall:32*/,
    },
    { // 108: INTLIT ::= "0" [hexDigit*] $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((32<<5)|0x5)/*methodCall:32*/,
    },
    { // 109: STRINGLIT ::= "@" '"' ws* @emptyString(char,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((33<<5)|0x5)/*methodCall:33*/,
    },
    { // 110: STRINGLIT ::= "@" '"' [ws*] @emptyString(char,char)=>String
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((33<<5)|0x5)/*methodCall:33*/,
    },
    { // 111: STRINGLIT ::= '"' any* $$3 @string(char,List<Character>,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((34<<5)|0x5)/*methodCall:34*/,
    },
    { // 112: STRINGLIT ::= '"' [any*] $$3 @string(char,List<Character>,char)=>String
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((34<<5)|0x5)/*methodCall:34*/,
    },
    { // 113: CHARLIT ::= "'" any ws* @charVal(char,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((35<<5)|0x5)/*methodCall:35*/,
    },
    { // 114: CHARLIT ::= "'" any [ws*] @charVal(char,char)=>int
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((35<<5)|0x5)/*methodCall:35*/,
    },
    { // 115: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 116: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 117: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 118: idChar128 ::= letter128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 119: idChar128 ::= digit128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 120: idChar128 ::= {223} @underscore(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((36<<5)|0x5)/*methodCall:36*/,
    },
    { // 121: hexDigit ::= {"0".."9" "A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 122: hexDigit128 ::= {176..185 193..198 225..230} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((29<<5)|0x5)/*methodCall:29*/,
    },
    { // 123: <stmt>* ::= <stmt>* <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 124: <stmt>* ::= [<stmt>*] <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 125: <decl in class>* ::= <decl in class>* <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 126: <decl in class>* ::= [<decl in class>*] <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 127: any* ::= any* any @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 128: any* ::= [any*] any @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 129: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 130: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
    },
    { // 131: digit* ::= digit* digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 132: digit* ::= [digit*] digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 133: hexDigit* ::= hexDigit* hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 134: hexDigit* ::= [hexDigit*] hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 135: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 136: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 137: <class decl>+ ::= <class decl> @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 138: <class decl>+ ::= <class decl>+ <class decl> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 139: $$0 ::= idChar128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 140: $$0 ::= idChar128 [ws*] @pass
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 141: $$1 ::= digit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 142: $$1 ::= digit128 [ws*] @pass
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 143: $$2 ::= hexDigit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 144: $$2 ::= hexDigit128 [ws*] @pass
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 145: $$3 ::= any128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 146: $$3 ::= any128 [ws*] @pass
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
};
public String[] getNullProdNameTable() { return nullProdNameTable; }
private String[] nullProdNameTable = {
    "hexDigit* ::=", // hexDigit*
    "<stmt>* ::=", // <stmt>*
    "any* ::=", // any*
    "<decl in class>* ::=", // <decl in class>*
    "ws* ::=", // ws*
    "idChar* ::=", // idChar*
    "digit* ::=", // digit*
    "# ::=", // #
    "registerNewline ::= #", // registerNewline
};
public int[][] getNullProductionActionTable() { return nullActionTable; }
private int[][] nullActionTable = {
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
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((37<<5)|0x5)/*methodCall:37*/,
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
      Exp result = actionObject.newPlus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 12: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newMinus(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 13: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newTimes(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 14: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newDivide(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 15: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newRemainder(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 16: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newCast(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 17: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryMinus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 18: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryPlus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 19: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newIdentfierExp(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 20: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newArrayLookup(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 21: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp result = actionObject.newIntegerLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 22: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newStringLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 23: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp result = actionObject.newCharLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 24: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newFalse(parm0);
      si.pushPb(result);
    }
    break;
    case 25: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newThis(parm0);
      si.pushPb(result);
    }
    break;
    case 26: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newTrue(parm0);
      si.pushPb(result);
    }
    break;
    case 27: {
      int parm0 = (Integer)si.popPb();
      Exp result = actionObject.newNull(parm0);
      si.pushPb(result);
    }
    break;
    case 28: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      String parm2 = (String)si.popPb();
      Exp result = actionObject.newInstVarAccess(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 29: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.sub128(parm0);
      si.pushPb(result);
    }
    break;
    case 30: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 31: {
      char parm0 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0);
      si.pushPb(result);
    }
    break;
    case 32: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convert16ToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 33: {
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      String result = actionObject.emptyString(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 34: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      String result = actionObject.string(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 35: {
      char parm0 = (Character)si.popPb();
      char parm1 = (Character)si.popPb();
      int result = actionObject.charVal(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 36: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.underscore(parm0);
      si.pushPb(result);
    }
    break;
    case 37: {
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
"Exp newPlus(Exp,int,Exp)",
"Exp newMinus(Exp,int,Exp)",
"Exp newTimes(Exp,int,Exp)",
"Exp newDivide(Exp,int,Exp)",
"Exp newRemainder(Exp,int,Exp)",
"Exp newCast(int,Type,Exp)",
"Exp newUnaryMinus(int,Exp)",
"Exp newUnaryPlus(int,Exp)",
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
    1,
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
    1,
    1,
    1,
    0,
    0,
    0,
    0,
    0,
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

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
public int getEofSym() { return 86; }
public int getNttSym() { return 87; }
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
"`*",
"<exp7>",
"<cast exp>",
"<unary exp>",
"<exp8>",
"`-",
"INTLIT",
"letter",
"\"p\"",
"\"v\"",
"\"b\"",
"{\"A\"..\"Z\" \"a\" \"d\"..\"h\" \"j\"..\"k\" \"m\"..\"n\" \"q\"..\"s\" \"w\"..\"z\"}",
"\"t\"",
"\"c\"",
"\"i\"",
"\"l\"",
"\"o\"",
"\"u\"",
"letter128",
"{199..218 231..250}",
"{193..198 225..230}",
"digit",
"{\"1\"..\"9\"}",
"\"0\"",
"digit128",
"{176..185}",
"ws",
"\" \"",
"10",
"\"#\"",
"\"*\"",
"\"(\"",
"\")\"",
"\"{\"",
"\"}\"",
"\"-\"",
"\"+\"",
"\"=\"",
"\"[\"",
"\"]\"",
"\";\"",
"idChar*",
"$$0",
"digit*",
"$$1",
"hexDigit*",
"$$2",
"idChar",
"\"_\"",
"idChar128",
"223",
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
public int numSymbols() { return 88;}
private static final int MIN_REDUCTION = 234;
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
1,151, // <start>
2,226, // ws*
3,79, // <program>
4,94, // <class decl>+
5,232, // <class decl>
6,137, // `class
59,91, // ws
60,115, // " "
61,112, // {10}
62,175, // "#"
  }
,
{ // state 1
0x80000000|183, // match move
0x80000000|92, // no-match move
0x80000000|117, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 2
29,76, // `=
70,125, // "="
  }
,
{ // state 3
  }
,
{ // state 4
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 5
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 6
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 7
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 8
7,201, // ID
15,198, // `(
34,142, // <exp7>
35,41, // <cast exp>
36,36, // <unary exp>
37,98, // <exp8>
38,64, // `-
39,107, // INTLIT
40,110, // letter
41,132, // "p"
42,132, // "v"
43,132, // "b"
44,132, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
45,132, // "t"
46,132, // "c"
47,132, // "i"
48,132, // "l"
49,132, // "o"
50,132, // "u"
51,96, // letter128
52,206, // {199..218 231..250}
53,206, // {193..198 225..230}
55,63, // {"1".."9"}
56,223, // "0"
57,158, // digit128
58,1, // {176..185}
64,131, // "("
68,114, // "-"
  }
,
{ // state 9
59,58, // ws
60,115, // " "
61,112, // {10}
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 10
59,58, // ws
60,115, // " "
61,112, // {10}
MIN_REDUCTION+56, // (default reduction)
  }
,
{ // state 11
0x80000000|3, // match move
0x80000000|111, // no-match move
0x80000000|117, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 12
9,136, // <decl in class>*
10,154, // `}
11,87, // <decl in class>
12,135, // <method decl>
13,57, // `public
62,127, // "#"
67,49, // "}"
  }
,
{ // state 13
0x80000000|215, // match move
0x80000000|126, // no-match move
0x80000000|117, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 14
59,58, // ws
60,115, // " "
61,112, // {10}
MIN_REDUCTION+54, // (default reduction)
  }
,
{ // state 15
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 16
MIN_REDUCTION+15, // (default reduction)
  }
,
{ // state 17
7,121, // ID
8,211, // `{
10,172, // `}
15,198, // `(
17,73, // <stmt>*
18,124, // <type>
19,28, // `int
20,164, // `boolean
24,221, // <stmt>
25,25, // <assign>
27,23, // <local var decl>
28,184, // <exp>
30,86, // <exp5>
32,105, // <exp6>
34,159, // <exp7>
35,41, // <cast exp>
36,36, // <unary exp>
37,98, // <exp8>
38,64, // `-
39,107, // INTLIT
40,110, // letter
41,132, // "p"
42,132, // "v"
43,132, // "b"
44,132, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
45,132, // "t"
46,132, // "c"
47,132, // "i"
48,132, // "l"
49,132, // "o"
50,132, // "u"
51,96, // letter128
52,206, // {199..218 231..250}
53,206, // {193..198 225..230}
55,63, // {"1".."9"}
56,223, // "0"
57,158, // digit128
58,1, // {176..185}
62,194, // "#"
64,131, // "("
66,193, // "{"
67,49, // "}"
68,114, // "-"
  }
,
{ // state 18
MIN_REDUCTION+83, // (default reduction)
  }
,
{ // state 19
87,MIN_REDUCTION+13, // $NT
MIN_REDUCTION+13, // (default reduction)
  }
,
{ // state 20
2,162, // ws*
59,91, // ws
60,115, // " "
61,112, // {10}
MIN_REDUCTION+49, // (default reduction)
  }
,
{ // state 21
22,MIN_REDUCTION+104, // `[
59,225, // ws
60,150, // " "
61,13, // {10}
71,MIN_REDUCTION+104, // "["
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 22
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 23
26,227, // `;
73,195, // ";"
  }
,
{ // state 24
22,MIN_REDUCTION+31, // `[
29,MIN_REDUCTION+31, // `=
31,MIN_REDUCTION+31, // `+
33,MIN_REDUCTION+31, // `*
63,MIN_REDUCTION+31, // "*"
69,MIN_REDUCTION+31, // "+"
70,MIN_REDUCTION+31, // "="
71,MIN_REDUCTION+31, // "["
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 25
26,155, // `;
73,195, // ";"
  }
,
{ // state 26
7,201, // ID
15,198, // `(
35,78, // <cast exp>
37,113, // <exp8>
39,107, // INTLIT
40,110, // letter
41,132, // "p"
42,132, // "v"
43,132, // "b"
44,132, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
45,132, // "t"
46,132, // "c"
47,132, // "i"
48,132, // "l"
49,132, // "o"
50,132, // "u"
51,96, // letter128
52,206, // {199..218 231..250}
53,206, // {193..198 225..230}
55,63, // {"1".."9"}
56,223, // "0"
57,158, // digit128
58,1, // {176..185}
64,131, // "("
  }
,
{ // state 27
0x80000000|3, // match move
0x80000000|100, // no-match move
0x80000000|117, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 28
MIN_REDUCTION+9, // (default reduction)
  }
,
{ // state 29
59,58, // ws
60,115, // " "
61,112, // {10}
MIN_REDUCTION+42, // (default reduction)
  }
,
{ // state 30
0x80000000|4, // match move
0x80000000|38, // no-match move
0x80000000|117, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 31
22,MIN_REDUCTION+89, // `[
71,MIN_REDUCTION+89, // "["
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 32
MIN_REDUCTION+88, // (default reduction)
  }
,
{ // state 33
2,48, // ws*
22,MIN_REDUCTION+69, // `[
59,202, // ws
60,150, // " "
61,13, // {10}
71,MIN_REDUCTION+69, // "["
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 34
MIN_REDUCTION+36, // (default reduction)
  }
,
{ // state 35
2,14, // ws*
59,91, // ws
60,115, // " "
61,112, // {10}
MIN_REDUCTION+55, // (default reduction)
  }
,
{ // state 36
MIN_REDUCTION+26, // (default reduction)
  }
,
{ // state 37
45,104, // "t"
  }
,
{ // state 38
22,MIN_REDUCTION+72, // `[
59,225, // ws
60,150, // " "
61,13, // {10}
71,MIN_REDUCTION+72, // "["
MIN_REDUCTION+72, // (default reduction)
  }
,
{ // state 39
22,MIN_REDUCTION+35, // `[
71,MIN_REDUCTION+35, // "["
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 40
2,11, // ws*
22,MIN_REDUCTION+109, // `[
59,202, // ws
60,150, // " "
61,13, // {10}
71,MIN_REDUCTION+109, // "["
MIN_REDUCTION+109, // (default reduction)
  }
,
{ // state 41
MIN_REDUCTION+25, // (default reduction)
  }
,
{ // state 42
0x80000000|128, // match move
0x80000000|90, // no-match move
0x80000000|117, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 43
0x80000000|75, // match move
0x80000000|166, // no-match move
0x80000000|117, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 44
59,58, // ws
60,115, // " "
61,112, // {10}
MIN_REDUCTION+58, // (default reduction)
  }
,
{ // state 45
22,MIN_REDUCTION+94, // `[
71,MIN_REDUCTION+94, // "["
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 46
22,MIN_REDUCTION+74, // `[
71,MIN_REDUCTION+74, // "["
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 47
2,30, // ws*
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 48
0x80000000|3, // match move
0x80000000|160, // no-match move
0x80000000|117, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 49
2,44, // ws*
59,91, // ws
60,115, // " "
61,112, // {10}
MIN_REDUCTION+59, // (default reduction)
  }
,
{ // state 50
22,168, // `[
71,66, // "["
MIN_REDUCTION+30, // (default reduction)
  }
,
{ // state 51
22,MIN_REDUCTION+87, // `[
71,MIN_REDUCTION+87, // "["
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 52
22,168, // `[
71,66, // "["
MIN_REDUCTION+28, // (default reduction)
  }
,
{ // state 53
MIN_REDUCTION+16, // (default reduction)
  }
,
{ // state 54
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 55
MIN_REDUCTION+87, // (default reduction)
  }
,
{ // state 56
54,141, // digit
55,34, // {"1".."9"}
56,34, // "0"
57,70, // digit128
58,1, // {176..185}
77,196, // $$1
  }
,
{ // state 57
14,99, // `void
62,145, // "#"
  }
,
{ // state 58
87,MIN_REDUCTION+94, // $NT
MIN_REDUCTION+94, // (default reduction)
  }
,
{ // state 59
22,MIN_REDUCTION+38, // `[
71,MIN_REDUCTION+38, // "["
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 60
41,32, // "p"
42,32, // "v"
43,32, // "b"
44,32, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
45,32, // "t"
46,32, // "c"
47,32, // "i"
48,32, // "l"
49,32, // "o"
50,32, // "u"
53,69, // {193..198 225..230}
55,32, // {"1".."9"}
56,32, // "0"
58,69, // {176..185}
79,27, // $$2
84,62, // hexDigit
85,102, // hexDigit128
  }
,
{ // state 61
2,30, // ws*
22,MIN_REDUCTION+73, // `[
59,202, // ws
60,150, // " "
61,13, // {10}
71,MIN_REDUCTION+73, // "["
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 62
MIN_REDUCTION+98, // (default reduction)
  }
,
{ // state 63
54,171, // digit
55,34, // {"1".."9"}
56,34, // "0"
57,70, // digit128
58,1, // {176..185}
76,56, // digit*
77,191, // $$1
  }
,
{ // state 64
7,201, // ID
36,101, // <unary exp>
37,98, // <exp8>
38,64, // `-
39,107, // INTLIT
40,110, // letter
41,132, // "p"
42,132, // "v"
43,132, // "b"
44,132, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
45,132, // "t"
46,132, // "c"
47,132, // "i"
48,132, // "l"
49,132, // "o"
50,132, // "u"
51,96, // letter128
52,206, // {199..218 231..250}
53,206, // {193..198 225..230}
55,63, // {"1".."9"}
56,223, // "0"
57,158, // digit128
58,1, // {176..185}
68,114, // "-"
  }
,
{ // state 65
33,8, // `*
63,180, // "*"
MIN_REDUCTION+21, // (default reduction)
  }
,
{ // state 66
2,179, // ws*
59,91, // ws
60,115, // " "
61,112, // {10}
MIN_REDUCTION+67, // (default reduction)
  }
,
{ // state 67
22,MIN_REDUCTION+76, // `[
71,MIN_REDUCTION+76, // "["
MIN_REDUCTION+76, // (default reduction)
  }
,
{ // state 68
0x80000000|133, // match move
0x80000000|143, // no-match move
0x80000000|117, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 69
0x80000000|190, // match move
0x80000000|31, // no-match move
0x80000000|117, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 70
0x80000000|231, // match move
0x80000000|139, // no-match move
0x80000000|117, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 71
22,MIN_REDUCTION+77, // `[
71,MIN_REDUCTION+77, // "["
MIN_REDUCTION+77, // (default reduction)
  }
,
{ // state 72
MIN_REDUCTION+7, // (default reduction)
  }
,
{ // state 73
7,121, // ID
8,211, // `{
10,72, // `}
15,198, // `(
18,124, // <type>
19,28, // `int
20,164, // `boolean
24,103, // <stmt>
25,25, // <assign>
27,23, // <local var decl>
28,184, // <exp>
30,86, // <exp5>
32,105, // <exp6>
34,159, // <exp7>
35,41, // <cast exp>
36,36, // <unary exp>
37,98, // <exp8>
38,64, // `-
39,107, // INTLIT
40,110, // letter
41,132, // "p"
42,132, // "v"
43,132, // "b"
44,132, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
45,132, // "t"
46,132, // "c"
47,132, // "i"
48,132, // "l"
49,132, // "o"
50,132, // "u"
51,96, // letter128
52,206, // {199..218 231..250}
53,206, // {193..198 225..230}
55,63, // {"1".."9"}
56,223, // "0"
57,158, // digit128
58,1, // {176..185}
62,194, // "#"
64,131, // "("
66,193, // "{"
67,49, // "}"
68,114, // "-"
  }
,
{ // state 74
MIN_REDUCTION+19, // (default reduction)
  }
,
{ // state 75
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 76
7,201, // ID
15,198, // `(
28,74, // <exp>
30,86, // <exp5>
32,105, // <exp6>
34,159, // <exp7>
35,41, // <cast exp>
36,36, // <unary exp>
37,98, // <exp8>
38,64, // `-
39,107, // INTLIT
40,110, // letter
41,132, // "p"
42,132, // "v"
43,132, // "b"
44,132, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
45,132, // "t"
46,132, // "c"
47,132, // "i"
48,132, // "l"
49,132, // "o"
50,132, // "u"
51,96, // letter128
52,206, // {199..218 231..250}
53,206, // {193..198 225..230}
55,63, // {"1".."9"}
56,223, // "0"
57,158, // digit128
58,1, // {176..185}
64,131, // "("
68,114, // "-"
  }
,
{ // state 77
16,26, // `)
21,218, // <empty bracket pair>
22,186, // `[
65,35, // ")"
71,66, // "["
  }
,
{ // state 78
MIN_REDUCTION+27, // (default reduction)
  }
,
{ // state 79
MIN_REDUCTION+2, // (default reduction)
  }
,
{ // state 80
2,197, // ws*
22,MIN_REDUCTION+79, // `[
59,202, // ws
60,150, // " "
61,13, // {10}
71,MIN_REDUCTION+79, // "["
MIN_REDUCTION+79, // (default reduction)
  }
,
{ // state 81
MIN_REDUCTION+18, // (default reduction)
  }
,
{ // state 82
15,83, // `(
64,131, // "("
  }
,
{ // state 83
16,214, // `)
65,35, // ")"
  }
,
{ // state 84
0x80000000|149, // match move
0x80000000|21, // no-match move
0x80000000|117, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 85
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 86
31,182, // `+
69,108, // "+"
MIN_REDUCTION+20, // (default reduction)
  }
,
{ // state 87
MIN_REDUCTION+93, // (default reduction)
  }
,
{ // state 88
0x80000000|3, // match move
0x80000000|165, // no-match move
0x80000000|117, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 89
2,93, // ws*
59,91, // ws
60,115, // " "
61,112, // {10}
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 90
2,84, // ws*
22,MIN_REDUCTION+105, // `[
59,202, // ws
60,150, // " "
61,13, // {10}
71,MIN_REDUCTION+105, // "["
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 91
87,MIN_REDUCTION+95, // $NT
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 92
22,MIN_REDUCTION+37, // `[
71,MIN_REDUCTION+37, // "["
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 93
59,58, // ws
60,115, // " "
61,112, // {10}
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 94
5,163, // <class decl>
6,137, // `class
62,175, // "#"
MIN_REDUCTION+3, // (default reduction)
  }
,
{ // state 95
22,MIN_REDUCTION+32, // `[
71,MIN_REDUCTION+32, // "["
MIN_REDUCTION+32, // (default reduction)
  }
,
{ // state 96
0x80000000|47, // match move
0x80000000|61, // no-match move
0x80000000|117, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 97
0x80000000|123, // match move
0x80000000|46, // no-match move
0x80000000|117, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 98
0x80000000|3, // match move
0x80000000|50, // no-match move
0x80000000|117, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 99
7,82, // ID
40,178, // letter
41,132, // "p"
42,132, // "v"
43,132, // "b"
44,132, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
45,132, // "t"
46,132, // "c"
47,132, // "i"
48,132, // "l"
49,132, // "o"
50,132, // "u"
51,116, // letter128
52,7, // {199..218 231..250}
53,7, // {193..198 225..230}
  }
,
{ // state 100
22,MIN_REDUCTION+80, // `[
71,MIN_REDUCTION+80, // "["
MIN_REDUCTION+80, // (default reduction)
  }
,
{ // state 101
MIN_REDUCTION+29, // (default reduction)
  }
,
{ // state 102
0x80000000|230, // match move
0x80000000|40, // no-match move
0x80000000|117, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 103
MIN_REDUCTION+90, // (default reduction)
  }
,
{ // state 104
2,140, // ws*
59,91, // ws
60,115, // " "
61,112, // {10}
MIN_REDUCTION+47, // (default reduction)
  }
,
{ // state 105
33,8, // `*
63,180, // "*"
MIN_REDUCTION+22, // (default reduction)
  }
,
{ // state 106
22,MIN_REDUCTION+106, // `[
59,225, // ws
60,150, // " "
61,13, // {10}
71,MIN_REDUCTION+106, // "["
MIN_REDUCTION+106, // (default reduction)
  }
,
{ // state 107
0x80000000|3, // match move
0x80000000|189, // no-match move
0x80000000|117, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 108
2,228, // ws*
59,91, // ws
60,115, // " "
61,112, // {10}
MIN_REDUCTION+63, // (default reduction)
  }
,
{ // state 109
59,58, // ws
60,115, // " "
61,112, // {10}
MIN_REDUCTION+40, // (default reduction)
  }
,
{ // state 110
40,129, // letter
41,132, // "p"
42,132, // "v"
43,132, // "b"
44,132, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
45,132, // "t"
46,132, // "c"
47,132, // "i"
48,132, // "l"
49,132, // "o"
50,132, // "u"
51,43, // letter128
52,206, // {199..218 231..250}
53,206, // {193..198 225..230}
54,18, // digit
55,34, // {"1".."9"}
56,34, // "0"
57,185, // digit128
58,1, // {176..185}
74,200, // idChar*
75,68, // $$0
80,224, // idChar
81,169, // "_"
82,42, // idChar128
83,134, // {223}
  }
,
{ // state 111
22,MIN_REDUCTION+108, // `[
59,225, // ws
60,150, // " "
61,13, // {10}
71,MIN_REDUCTION+108, // "["
MIN_REDUCTION+108, // (default reduction)
  }
,
{ // state 112
87,MIN_REDUCTION+39, // $NT
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 113
0x80000000|3, // match move
0x80000000|52, // no-match move
0x80000000|117, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 114
2,217, // ws*
59,91, // ws
60,115, // " "
61,112, // {10}
MIN_REDUCTION+61, // (default reduction)
  }
,
{ // state 115
87,MIN_REDUCTION+38, // $NT
MIN_REDUCTION+38, // (default reduction)
  }
,
{ // state 116
2,9, // ws*
59,91, // ws
60,115, // " "
61,112, // {10}
MIN_REDUCTION+73, // (default reduction)
  }
,
{ // state 117
22,186, // `[
71,66, // "["
  }
,
{ // state 118
48,220, // "l"
  }
,
{ // state 119
22,MIN_REDUCTION+78, // `[
59,225, // ws
60,150, // " "
61,13, // {10}
71,MIN_REDUCTION+78, // "["
MIN_REDUCTION+78, // (default reduction)
  }
,
{ // state 120
59,58, // ws
60,115, // " "
61,112, // {10}
MIN_REDUCTION+44, // (default reduction)
  }
,
{ // state 121
0x80000000|122, // match move
0x80000000|24, // no-match move
0x80000000|117, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 122
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 123
MIN_REDUCTION+74, // (default reduction)
  }
,
{ // state 124
7,2, // ID
21,218, // <empty bracket pair>
22,186, // `[
40,178, // letter
41,132, // "p"
42,132, // "v"
43,132, // "b"
44,132, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
45,132, // "t"
46,132, // "c"
47,132, // "i"
48,132, // "l"
49,132, // "o"
50,132, // "u"
51,116, // letter128
52,7, // {199..218 231..250}
53,7, // {193..198 225..230}
71,66, // "["
  }
,
{ // state 125
2,153, // ws*
59,91, // ws
60,115, // " "
61,112, // {10}
MIN_REDUCTION+65, // (default reduction)
  }
,
{ // state 126
22,MIN_REDUCTION+39, // `[
71,MIN_REDUCTION+39, // "["
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 127
41,170, // "p"
  }
,
{ // state 128
2,84, // ws*
MIN_REDUCTION+105, // (default reduction)
  }
,
{ // state 129
MIN_REDUCTION+82, // (default reduction)
  }
,
{ // state 130
59,58, // ws
60,115, // " "
61,112, // {10}
MIN_REDUCTION+50, // (default reduction)
  }
,
{ // state 131
2,161, // ws*
59,91, // ws
60,115, // " "
61,112, // {10}
MIN_REDUCTION+53, // (default reduction)
  }
,
{ // state 132
MIN_REDUCTION+34, // (default reduction)
  }
,
{ // state 133
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 134
0x80000000|55, // match move
0x80000000|51, // no-match move
0x80000000|117, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 135
MIN_REDUCTION+6, // (default reduction)
  }
,
{ // state 136
10,199, // `}
11,213, // <decl in class>
12,135, // <method decl>
13,57, // `public
62,127, // "#"
67,49, // "}"
  }
,
{ // state 137
7,229, // ID
40,178, // letter
41,132, // "p"
42,132, // "v"
43,132, // "b"
44,132, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
45,132, // "t"
46,132, // "c"
47,132, // "i"
48,132, // "l"
49,132, // "o"
50,132, // "u"
51,116, // letter128
52,7, // {199..218 231..250}
53,7, // {193..198 225..230}
  }
,
{ // state 138
MIN_REDUCTION+35, // (default reduction)
  }
,
{ // state 139
2,208, // ws*
22,MIN_REDUCTION+107, // `[
59,202, // ws
60,150, // " "
61,13, // {10}
71,MIN_REDUCTION+107, // "["
MIN_REDUCTION+107, // (default reduction)
  }
,
{ // state 140
59,58, // ws
60,115, // " "
61,112, // {10}
MIN_REDUCTION+46, // (default reduction)
  }
,
{ // state 141
MIN_REDUCTION+96, // (default reduction)
  }
,
{ // state 142
MIN_REDUCTION+23, // (default reduction)
  }
,
{ // state 143
22,MIN_REDUCTION+75, // `[
71,MIN_REDUCTION+75, // "["
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 144
7,201, // ID
15,198, // `(
28,81, // <exp>
30,86, // <exp5>
32,105, // <exp6>
34,159, // <exp7>
35,41, // <cast exp>
36,36, // <unary exp>
37,98, // <exp8>
38,64, // `-
39,107, // INTLIT
40,110, // letter
41,132, // "p"
42,132, // "v"
43,132, // "b"
44,132, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
45,132, // "t"
46,132, // "c"
47,132, // "i"
48,132, // "l"
49,132, // "o"
50,132, // "u"
51,96, // letter128
52,206, // {199..218 231..250}
53,206, // {193..198 225..230}
55,63, // {"1".."9"}
56,223, // "0"
57,158, // digit128
58,1, // {176..185}
64,131, // "("
68,114, // "-"
  }
,
{ // state 145
42,174, // "v"
  }
,
{ // state 146
23,212, // `]
72,209, // "]"
  }
,
{ // state 147
7,121, // ID
8,211, // `{
10,16, // `}
15,198, // `(
18,124, // <type>
19,28, // `int
20,164, // `boolean
24,103, // <stmt>
25,25, // <assign>
27,23, // <local var decl>
28,184, // <exp>
30,86, // <exp5>
32,105, // <exp6>
34,159, // <exp7>
35,41, // <cast exp>
36,36, // <unary exp>
37,98, // <exp8>
38,64, // `-
39,107, // INTLIT
40,110, // letter
41,132, // "p"
42,132, // "v"
43,132, // "b"
44,132, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
45,132, // "t"
46,132, // "c"
47,132, // "i"
48,132, // "l"
49,132, // "o"
50,132, // "u"
51,96, // letter128
52,206, // {199..218 231..250}
53,206, // {193..198 225..230}
55,63, // {"1".."9"}
56,223, // "0"
57,158, // digit128
58,1, // {176..185}
62,194, // "#"
64,131, // "("
66,193, // "{"
67,49, // "}"
68,114, // "-"
  }
,
{ // state 148
40,129, // letter
41,132, // "p"
42,132, // "v"
43,132, // "b"
44,132, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
45,132, // "t"
46,132, // "c"
47,132, // "i"
48,132, // "l"
49,132, // "o"
50,132, // "u"
51,167, // letter128
52,7, // {199..218 231..250}
53,7, // {193..198 225..230}
54,18, // digit
55,34, // {"1".."9"}
56,34, // "0"
57,54, // digit128
58,22, // {176..185}
75,85, // $$0
80,157, // idChar
81,169, // "_"
82,89, // idChar128
83,6, // {223}
  }
,
{ // state 149
MIN_REDUCTION+104, // (default reduction)
  }
,
{ // state 150
0x80000000|5, // match move
0x80000000|59, // no-match move
0x80000000|117, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 151
86,MIN_REDUCTION+0, // $
  }
,
{ // state 152
2,48, // ws*
  }
,
{ // state 153
59,58, // ws
60,115, // " "
61,112, // {10}
MIN_REDUCTION+64, // (default reduction)
  }
,
{ // state 154
MIN_REDUCTION+5, // (default reduction)
  }
,
{ // state 155
MIN_REDUCTION+14, // (default reduction)
  }
,
{ // state 156
22,MIN_REDUCTION+31, // `[
71,MIN_REDUCTION+31, // "["
MIN_REDUCTION+31, // (default reduction)
  }
,
{ // state 157
MIN_REDUCTION+100, // (default reduction)
  }
,
{ // state 158
0x80000000|207, // match move
0x80000000|80, // no-match move
0x80000000|117, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 159
MIN_REDUCTION+24, // (default reduction)
  }
,
{ // state 160
22,MIN_REDUCTION+68, // `[
59,225, // ws
60,150, // " "
61,13, // {10}
71,MIN_REDUCTION+68, // "["
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 161
59,58, // ws
60,115, // " "
61,112, // {10}
MIN_REDUCTION+52, // (default reduction)
  }
,
{ // state 162
59,58, // ws
60,115, // " "
61,112, // {10}
MIN_REDUCTION+48, // (default reduction)
  }
,
{ // state 163
MIN_REDUCTION+103, // (default reduction)
  }
,
{ // state 164
MIN_REDUCTION+10, // (default reduction)
  }
,
{ // state 165
22,MIN_REDUCTION+81, // `[
71,MIN_REDUCTION+81, // "["
MIN_REDUCTION+81, // (default reduction)
  }
,
{ // state 166
22,MIN_REDUCTION+85, // `[
71,MIN_REDUCTION+85, // "["
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 167
MIN_REDUCTION+85, // (default reduction)
  }
,
{ // state 168
7,201, // ID
15,198, // `(
28,146, // <exp>
30,86, // <exp5>
32,105, // <exp6>
34,159, // <exp7>
35,41, // <cast exp>
36,36, // <unary exp>
37,98, // <exp8>
38,64, // `-
39,107, // INTLIT
40,110, // letter
41,132, // "p"
42,132, // "v"
43,132, // "b"
44,132, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
45,132, // "t"
46,132, // "c"
47,132, // "i"
48,132, // "l"
49,132, // "o"
50,132, // "u"
51,96, // letter128
52,206, // {199..218 231..250}
53,206, // {193..198 225..230}
55,63, // {"1".."9"}
56,223, // "0"
57,158, // digit128
58,1, // {176..185}
64,131, // "("
68,114, // "-"
  }
,
{ // state 169
MIN_REDUCTION+84, // (default reduction)
  }
,
{ // state 170
50,20, // "u"
  }
,
{ // state 171
MIN_REDUCTION+97, // (default reduction)
  }
,
{ // state 172
MIN_REDUCTION+8, // (default reduction)
  }
,
{ // state 173
2,120, // ws*
59,91, // ws
60,115, // " "
61,112, // {10}
MIN_REDUCTION+45, // (default reduction)
  }
,
{ // state 174
49,173, // "o"
  }
,
{ // state 175
46,118, // "c"
  }
,
{ // state 176
MIN_REDUCTION+11, // (default reduction)
  }
,
{ // state 177
22,MIN_REDUCTION+86, // `[
71,MIN_REDUCTION+86, // "["
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 178
40,129, // letter
41,132, // "p"
42,132, // "v"
43,132, // "b"
44,132, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
45,132, // "t"
46,132, // "c"
47,132, // "i"
48,132, // "l"
49,132, // "o"
50,132, // "u"
51,167, // letter128
52,7, // {199..218 231..250}
53,7, // {193..198 225..230}
54,18, // digit
55,34, // {"1".."9"}
56,34, // "0"
57,54, // digit128
58,22, // {176..185}
74,148, // idChar*
75,181, // $$0
80,224, // idChar
81,169, // "_"
82,89, // idChar128
83,6, // {223}
  }
,
{ // state 179
59,58, // ws
60,115, // " "
61,112, // {10}
MIN_REDUCTION+66, // (default reduction)
  }
,
{ // state 180
2,130, // ws*
59,91, // ws
60,115, // " "
61,112, // {10}
MIN_REDUCTION+51, // (default reduction)
  }
,
{ // state 181
MIN_REDUCTION+75, // (default reduction)
  }
,
{ // state 182
7,201, // ID
15,198, // `(
32,65, // <exp6>
34,159, // <exp7>
35,41, // <cast exp>
36,36, // <unary exp>
37,98, // <exp8>
38,64, // `-
39,107, // INTLIT
40,110, // letter
41,132, // "p"
42,132, // "v"
43,132, // "b"
44,132, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
45,132, // "t"
46,132, // "c"
47,132, // "i"
48,132, // "l"
49,132, // "o"
50,132, // "u"
51,96, // letter128
52,206, // {199..218 231..250}
53,206, // {193..198 225..230}
55,63, // {"1".."9"}
56,223, // "0"
57,158, // digit128
58,1, // {176..185}
64,131, // "("
68,114, // "-"
  }
,
{ // state 183
MIN_REDUCTION+37, // (default reduction)
  }
,
{ // state 184
29,144, // `=
70,125, // "="
  }
,
{ // state 185
0x80000000|222, // match move
0x80000000|177, // no-match move
0x80000000|117, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 186
23,19, // `]
72,187, // "]"
  }
,
{ // state 187
2,219, // ws*
59,91, // ws
60,115, // " "
61,112, // {10}
87,MIN_REDUCTION+69, // $NT
MIN_REDUCTION+69, // (default reduction)
  }
,
{ // state 188
49,210, // "o"
  }
,
{ // state 189
22,MIN_REDUCTION+33, // `[
71,MIN_REDUCTION+33, // "["
MIN_REDUCTION+33, // (default reduction)
  }
,
{ // state 190
MIN_REDUCTION+89, // (default reduction)
  }
,
{ // state 191
0x80000000|3, // match move
0x80000000|71, // no-match move
0x80000000|117, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 192
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 193
2,10, // ws*
59,91, // ws
60,115, // " "
61,112, // {10}
MIN_REDUCTION+57, // (default reduction)
  }
,
{ // state 194
43,188, // "b"
47,37, // "i"
  }
,
{ // state 195
2,204, // ws*
59,91, // ws
60,115, // " "
61,112, // {10}
MIN_REDUCTION+71, // (default reduction)
  }
,
{ // state 196
0x80000000|3, // match move
0x80000000|67, // no-match move
0x80000000|117, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 197
0x80000000|3, // match move
0x80000000|119, // no-match move
0x80000000|117, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 198
7,176, // ID
18,77, // <type>
19,28, // `int
20,164, // `boolean
40,178, // letter
41,132, // "p"
42,132, // "v"
43,132, // "b"
44,132, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
45,132, // "t"
46,132, // "c"
47,132, // "i"
48,132, // "l"
49,132, // "o"
50,132, // "u"
51,116, // letter128
52,7, // {199..218 231..250}
53,7, // {193..198 225..230}
62,194, // "#"
  }
,
{ // state 199
MIN_REDUCTION+4, // (default reduction)
  }
,
{ // state 200
40,129, // letter
41,132, // "p"
42,132, // "v"
43,132, // "b"
44,132, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
45,132, // "t"
46,132, // "c"
47,132, // "i"
48,132, // "l"
49,132, // "o"
50,132, // "u"
51,43, // letter128
52,206, // {199..218 231..250}
53,206, // {193..198 225..230}
54,18, // digit
55,34, // {"1".."9"}
56,34, // "0"
57,185, // digit128
58,1, // {176..185}
75,97, // $$0
80,157, // idChar
81,169, // "_"
82,42, // idChar128
83,134, // {223}
  }
,
{ // state 201
0x80000000|3, // match move
0x80000000|156, // no-match move
0x80000000|117, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 202
0x80000000|192, // match move
0x80000000|205, // no-match move
0x80000000|117, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 203
MIN_REDUCTION+1, // (default reduction)
  }
,
{ // state 204
59,58, // ws
60,115, // " "
61,112, // {10}
MIN_REDUCTION+70, // (default reduction)
  }
,
{ // state 205
22,MIN_REDUCTION+95, // `[
71,MIN_REDUCTION+95, // "["
MIN_REDUCTION+95, // (default reduction)
  }
,
{ // state 206
0x80000000|138, // match move
0x80000000|39, // no-match move
0x80000000|117, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 207
2,197, // ws*
  }
,
{ // state 208
0x80000000|3, // match move
0x80000000|106, // no-match move
0x80000000|117, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 209
0x80000000|152, // match move
0x80000000|33, // no-match move
0x80000000|117, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 210
2,109, // ws*
59,91, // ws
60,115, // " "
61,112, // {10}
MIN_REDUCTION+41, // (default reduction)
  }
,
{ // state 211
7,121, // ID
8,211, // `{
10,53, // `}
15,198, // `(
17,147, // <stmt>*
18,124, // <type>
19,28, // `int
20,164, // `boolean
24,221, // <stmt>
25,25, // <assign>
27,23, // <local var decl>
28,184, // <exp>
30,86, // <exp5>
32,105, // <exp6>
34,159, // <exp7>
35,41, // <cast exp>
36,36, // <unary exp>
37,98, // <exp8>
38,64, // `-
39,107, // INTLIT
40,110, // letter
41,132, // "p"
42,132, // "v"
43,132, // "b"
44,132, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
45,132, // "t"
46,132, // "c"
47,132, // "i"
48,132, // "l"
49,132, // "o"
50,132, // "u"
51,96, // letter128
52,206, // {199..218 231..250}
53,206, // {193..198 225..230}
55,63, // {"1".."9"}
56,223, // "0"
57,158, // digit128
58,1, // {176..185}
62,194, // "#"
64,131, // "("
66,193, // "{"
67,49, // "}"
68,114, // "-"
  }
,
{ // state 212
0x80000000|3, // match move
0x80000000|95, // no-match move
0x80000000|117, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 213
MIN_REDUCTION+92, // (default reduction)
  }
,
{ // state 214
8,17, // `{
66,193, // "{"
  }
,
{ // state 215
MIN_REDUCTION+39, // (default reduction)
  }
,
{ // state 216
MIN_REDUCTION+99, // (default reduction)
  }
,
{ // state 217
59,58, // ws
60,115, // " "
61,112, // {10}
MIN_REDUCTION+60, // (default reduction)
  }
,
{ // state 218
MIN_REDUCTION+12, // (default reduction)
  }
,
{ // state 219
59,58, // ws
60,115, // " "
61,112, // {10}
87,MIN_REDUCTION+68, // $NT
MIN_REDUCTION+68, // (default reduction)
  }
,
{ // state 220
2,29, // ws*
59,91, // ws
60,115, // " "
61,112, // {10}
MIN_REDUCTION+43, // (default reduction)
  }
,
{ // state 221
MIN_REDUCTION+91, // (default reduction)
  }
,
{ // state 222
MIN_REDUCTION+86, // (default reduction)
  }
,
{ // state 223
41,32, // "p"
42,32, // "v"
43,32, // "b"
44,32, // {"A".."Z" "a" "d".."h" "j".."k" "m".."n" "q".."s" "w".."z"}
45,32, // "t"
46,32, // "c"
47,32, // "i"
48,32, // "l"
49,32, // "o"
50,32, // "u"
53,69, // {193..198 225..230}
55,32, // {"1".."9"}
56,32, // "0"
58,69, // {176..185}
78,60, // hexDigit*
79,88, // $$2
84,216, // hexDigit
85,102, // hexDigit128
  }
,
{ // state 224
MIN_REDUCTION+101, // (default reduction)
  }
,
{ // state 225
0x80000000|15, // match move
0x80000000|45, // no-match move
0x80000000|117, // NT-test-match state for <empty bracket pair>
  }
,
{ // state 226
3,203, // <program>
4,94, // <class decl>+
5,232, // <class decl>
6,137, // `class
59,58, // ws
60,115, // " "
61,112, // {10}
62,175, // "#"
  }
,
{ // state 227
MIN_REDUCTION+17, // (default reduction)
  }
,
{ // state 228
59,58, // ws
60,115, // " "
61,112, // {10}
MIN_REDUCTION+62, // (default reduction)
  }
,
{ // state 229
8,12, // `{
66,193, // "{"
  }
,
{ // state 230
2,11, // ws*
  }
,
{ // state 231
2,208, // ws*
  }
,
{ // state 232
MIN_REDUCTION+102, // (default reduction)
  }
,
};
}
public MJGrammarParseTable(MJGrammar actionObj) {
  actionObject = actionObj;
  parseTable = new int[233][];
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
// <exp5> ::= <exp6>
(30<<16)+1,
// <exp6> ::= <exp6> `* <exp7>
(32<<16)+3,
// <exp6> ::= <exp7>
(32<<16)+1,
// <exp7> ::= <cast exp>
(34<<16)+1,
// <exp7> ::= <unary exp>
(34<<16)+1,
// <cast exp> ::= `( <type> `) <cast exp>
(35<<16)+4,
// <cast exp> ::= `( <type> `) <exp8>
(35<<16)+4,
// <unary exp> ::= `- <unary exp>
(36<<16)+2,
// <unary exp> ::= <exp8>
(36<<16)+1,
// <exp8> ::= ID
(37<<16)+1,
// <exp8> ::= <exp8> !<empty bracket pair> `[ <exp> `]
(37<<16)+4,
// <exp8> ::= INTLIT
(37<<16)+1,
// letter ::= {"A".."Z" "a".."z"}
(40<<16)+1,
// letter128 ::= {193..218 225..250}
(51<<16)+1,
// digit ::= {"0".."9"}
(54<<16)+1,
// digit128 ::= {176..185}
(57<<16)+1,
// ws ::= " "
(59<<16)+1,
// ws ::= {10}
(59<<16)+1,
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
// `public ::= "#" "p" "u" ws*
(13<<16)+4,
// `public ::= "#" "p" "u"
(13<<16)+3,
// `* ::= "*" ws*
(33<<16)+2,
// `* ::= "*"
(33<<16)+1,
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
(38<<16)+2,
// `- ::= "-"
(38<<16)+1,
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
// `; ::= ";" ws*
(26<<16)+2,
// `; ::= ";"
(26<<16)+1,
// ID ::= letter128 ws*
(7<<16)+2,
// ID ::= letter128
(7<<16)+1,
// ID ::= letter idChar* $$0
(7<<16)+3,
// ID ::= letter $$0
(7<<16)+2,
// INTLIT ::= {"1".."9"} digit* $$1
(39<<16)+3,
// INTLIT ::= {"1".."9"} $$1
(39<<16)+2,
// INTLIT ::= digit128 ws*
(39<<16)+2,
// INTLIT ::= digit128
(39<<16)+1,
// INTLIT ::= "0" hexDigit* $$2
(39<<16)+3,
// INTLIT ::= "0" $$2
(39<<16)+2,
// idChar ::= letter
(80<<16)+1,
// idChar ::= digit
(80<<16)+1,
// idChar ::= "_"
(80<<16)+1,
// idChar128 ::= letter128
(82<<16)+1,
// idChar128 ::= digit128
(82<<16)+1,
// idChar128 ::= {223}
(82<<16)+1,
// hexDigit ::= {"0".."9" "A".."Z" "a".."z"}
(84<<16)+1,
// hexDigit128 ::= {176..185 193..198 225..230}
(85<<16)+1,
// <stmt>* ::= <stmt>* <stmt>
(17<<16)+2,
// <stmt>* ::= <stmt>
(17<<16)+1,
// <decl in class>* ::= <decl in class>* <decl in class>
(9<<16)+2,
// <decl in class>* ::= <decl in class>
(9<<16)+1,
// ws* ::= ws* ws
(2<<16)+2,
// ws* ::= ws
(2<<16)+1,
// digit* ::= digit* digit
(76<<16)+2,
// digit* ::= digit
(76<<16)+1,
// hexDigit* ::= hexDigit* hexDigit
(78<<16)+2,
// hexDigit* ::= hexDigit
(78<<16)+1,
// idChar* ::= idChar* idChar
(74<<16)+2,
// idChar* ::= idChar
(74<<16)+1,
// <class decl>+ ::= <class decl>
(4<<16)+1,
// <class decl>+ ::= <class decl>+ <class decl>
(4<<16)+2,
// $$0 ::= idChar128 ws*
(75<<16)+2,
// $$0 ::= idChar128
(75<<16)+1,
// $$1 ::= digit128 ws*
(77<<16)+2,
// $$1 ::= digit128
(77<<16)+1,
// $$2 ::= hexDigit128 ws*
(79<<16)+2,
// $$2 ::= hexDigit128
(79<<16)+1,
};
public int[] getCharMapTable() { return charMapTable; }
private static int[] charMapTable = {
-1, // 0
-1, // 1
-1, // 2
-1, // 3
-1, // 4
-1, // 5
-1, // 6
-1, // 7
-1, // 8
-1, // 9
61, // 10
-1, // 11
-1, // 12
-1, // 13
-1, // 14
-1, // 15
-1, // 16
-1, // 17
-1, // 18
-1, // 19
-1, // 20
-1, // 21
-1, // 22
-1, // 23
-1, // 24
-1, // 25
-1, // 26
-1, // 27
-1, // 28
-1, // 29
-1, // 30
-1, // 31
60, // " "
-1, // "!"
-1, // '"'
62, // "#"
-1, // "$"
-1, // "%"
-1, // "&"
-1, // "'"
64, // "("
65, // ")"
63, // "*"
69, // "+"
-1, // ","
68, // "-"
-1, // "."
-1, // "/"
56, // "0"
55, // "1"
55, // "2"
55, // "3"
55, // "4"
55, // "5"
55, // "6"
55, // "7"
55, // "8"
55, // "9"
-1, // ":"
73, // ";"
-1, // "<"
70, // "="
-1, // ">"
-1, // "?"
-1, // "@"
44, // "A"
44, // "B"
44, // "C"
44, // "D"
44, // "E"
44, // "F"
44, // "G"
44, // "H"
44, // "I"
44, // "J"
44, // "K"
44, // "L"
44, // "M"
44, // "N"
44, // "O"
44, // "P"
44, // "Q"
44, // "R"
44, // "S"
44, // "T"
44, // "U"
44, // "V"
44, // "W"
44, // "X"
44, // "Y"
44, // "Z"
71, // "["
-1, // "\"
72, // "]"
-1, // "^"
81, // "_"
-1, // "`"
44, // "a"
43, // "b"
46, // "c"
44, // "d"
44, // "e"
44, // "f"
44, // "g"
44, // "h"
47, // "i"
44, // "j"
44, // "k"
48, // "l"
44, // "m"
44, // "n"
49, // "o"
41, // "p"
44, // "q"
44, // "r"
44, // "s"
45, // "t"
50, // "u"
42, // "v"
44, // "w"
44, // "x"
44, // "y"
44, // "z"
66, // "{"
-1, // "|"
67, // "}"
-1, // "~"
-1, // 127
-1, // 128
-1, // 129
-1, // 130
-1, // 131
-1, // 132
-1, // 133
-1, // 134
-1, // 135
-1, // 136
-1, // 137
-1, // 138
-1, // 139
-1, // 140
-1, // 141
-1, // 142
-1, // 143
-1, // 144
-1, // 145
-1, // 146
-1, // 147
-1, // 148
-1, // 149
-1, // 150
-1, // 151
-1, // 152
-1, // 153
-1, // 154
-1, // 155
-1, // 156
-1, // 157
-1, // 158
-1, // 159
-1, // 160
-1, // 161
-1, // 162
-1, // 163
-1, // 164
-1, // 165
-1, // 166
-1, // 167
-1, // 168
-1, // 169
-1, // 170
-1, // 171
-1, // 172
-1, // 173
-1, // 174
-1, // 175
58, // 176
58, // 177
58, // 178
58, // 179
58, // 180
58, // 181
58, // 182
58, // 183
58, // 184
58, // 185
-1, // 186
-1, // 187
-1, // 188
-1, // 189
-1, // 190
-1, // 191
-1, // 192
53, // 193
53, // 194
53, // 195
53, // 196
53, // 197
53, // 198
52, // 199
52, // 200
52, // 201
52, // 202
52, // 203
52, // 204
52, // 205
52, // 206
52, // 207
52, // 208
52, // 209
52, // 210
52, // 211
52, // 212
52, // 213
52, // 214
52, // 215
52, // 216
52, // 217
52, // 218
-1, // 219
-1, // 220
-1, // 221
-1, // 222
83, // 223
-1, // 224
53, // 225
53, // 226
53, // 227
53, // 228
53, // 229
53, // 230
52, // 231
52, // 232
52, // 233
52, // 234
52, // 235
52, // 236
52, // 237
52, // 238
52, // 239
52, // 240
52, // 241
52, // 242
52, // 243
52, // 244
52, // 245
52, // 246
52, // 247
52, // 248
52, // 249
52, // 250
-1, // 251
-1, // 252
-1, // 253
-1, // 254
-1, // 255
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
"<exp5> ::= <exp6>", // 22
"<exp6> ::= <exp6> # `* <exp7>", // 23
"<exp6> ::= <exp7>", // 24
"<exp7> ::= <cast exp>", // 25
"<exp7> ::= <unary exp>", // 26
"<cast exp> ::= # `( <type> `) <cast exp>", // 27
"<cast exp> ::= # `( <type> `) <exp8>", // 28
"<unary exp> ::= # `- <unary exp>", // 29
"<unary exp> ::= <exp8>", // 30
"<exp8> ::= # ID", // 31
"<exp8> ::= <exp8> !<empty bracket pair> # `[ <exp> `]", // 32
"<exp8> ::= # INTLIT", // 33
"letter ::= {\"A\"..\"Z\" \"a\"..\"z\"}", // 34
"letter128 ::= {193..218 225..250}", // 35
"digit ::= {\"0\"..\"9\"}", // 36
"digit128 ::= {176..185}", // 37
"ws ::= \" \"", // 38
"ws ::= {10} registerNewline", // 39
"`boolean ::= \"#\" \"b\" \"o\" ws*", // 40
"`boolean ::= \"#\" \"b\" \"o\" ws*", // 41
"`class ::= \"#\" \"c\" \"l\" ws*", // 42
"`class ::= \"#\" \"c\" \"l\" ws*", // 43
"`void ::= \"#\" \"v\" \"o\" ws*", // 44
"`void ::= \"#\" \"v\" \"o\" ws*", // 45
"`int ::= \"#\" \"i\" \"t\" ws*", // 46
"`int ::= \"#\" \"i\" \"t\" ws*", // 47
"`public ::= \"#\" \"p\" \"u\" ws*", // 48
"`public ::= \"#\" \"p\" \"u\" ws*", // 49
"`* ::= \"*\" ws*", // 50
"`* ::= \"*\" ws*", // 51
"`( ::= \"(\" ws*", // 52
"`( ::= \"(\" ws*", // 53
"`) ::= \")\" ws*", // 54
"`) ::= \")\" ws*", // 55
"`{ ::= \"{\" ws*", // 56
"`{ ::= \"{\" ws*", // 57
"`} ::= \"}\" ws*", // 58
"`} ::= \"}\" ws*", // 59
"`- ::= \"-\" ws*", // 60
"`- ::= \"-\" ws*", // 61
"`+ ::= \"+\" ws*", // 62
"`+ ::= \"+\" ws*", // 63
"`= ::= \"=\" ws*", // 64
"`= ::= \"=\" ws*", // 65
"`[ ::= \"[\" ws*", // 66
"`[ ::= \"[\" ws*", // 67
"`] ::= \"]\" ws*", // 68
"`] ::= \"]\" ws*", // 69
"`; ::= \";\" ws*", // 70
"`; ::= \";\" ws*", // 71
"ID ::= letter128 ws*", // 72
"ID ::= letter128 ws*", // 73
"ID ::= letter idChar* idChar128 ws*", // 74
"ID ::= letter idChar* idChar128 ws*", // 75
"INTLIT ::= {\"1\"..\"9\"} digit* digit128 ws*", // 76
"INTLIT ::= {\"1\"..\"9\"} digit* digit128 ws*", // 77
"INTLIT ::= digit128 ws*", // 78
"INTLIT ::= digit128 ws*", // 79
"INTLIT ::= \"0\" hexDigit* hexDigit128 ws*", // 80
"INTLIT ::= \"0\" hexDigit* hexDigit128 ws*", // 81
"idChar ::= letter", // 82
"idChar ::= digit", // 83
"idChar ::= \"_\"", // 84
"idChar128 ::= letter128", // 85
"idChar128 ::= digit128", // 86
"idChar128 ::= {223}", // 87
"hexDigit ::= {\"0\"..\"9\" \"A\"..\"Z\" \"a\"..\"z\"}", // 88
"hexDigit128 ::= {176..185 193..198 225..230}", // 89
"<stmt>* ::= <stmt>* <stmt>", // 90
"<stmt>* ::= <stmt>* <stmt>", // 91
"<decl in class>* ::= <decl in class>* <decl in class>", // 92
"<decl in class>* ::= <decl in class>* <decl in class>", // 93
"ws* ::= ws* ws", // 94
"ws* ::= ws* ws", // 95
"digit* ::= digit* digit", // 96
"digit* ::= digit* digit", // 97
"hexDigit* ::= hexDigit* hexDigit", // 98
"hexDigit* ::= hexDigit* hexDigit", // 99
"idChar* ::= idChar* idChar", // 100
"idChar* ::= idChar* idChar", // 101
"<class decl>+ ::= <class decl>", // 102
"<class decl>+ ::= <class decl>+ <class decl>", // 103
"", // 104
"", // 105
"", // 106
"", // 107
"", // 108
"", // 109
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
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((0<<5)|0x5)/*methodCall:0*/,
    },
    { // 3: <program> ::= [#] <class decl>+ @createProgram(int,List<ClassDecl>)=>Program
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0x5)/*methodCall:1*/,
    },
    { // 4: <class decl> ::= `class [#] ID `{ <decl in class>* `} @createClassDecl(int,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x5)/*methodCall:2*/,
    },
    { // 5: <class decl> ::= `class [#] ID `{ [<decl in class>*] `} @createClassDecl(int,String,List<Decl>)=>ClassDecl
      ((1<<5)|0xe)/*popPos:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x5)/*methodCall:3*/,
    },
    { // 9: <type> ::= [#] `int @intType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((4<<5)|0x5)/*methodCall:4*/,
    },
    { // 10: <type> ::= [#] `boolean @booleanType(int)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((5<<5)|0x5)/*methodCall:5*/,
    },
    { // 11: <type> ::= [#] ID @identifierType(int,String)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((6<<5)|0x5)/*methodCall:6*/,
    },
    { // 12: <type> ::= [#] <type> <empty bracket pair> @newArrayType(int,Type,Object)=>Type
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((8<<5)|0x5)/*methodCall:8*/,
    },
    { // 16: <stmt> ::= [#] `{ [<stmt>*] `} @newBlock(int,List<Statement>)=>Statement
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((11<<5)|0x5)/*methodCall:11*/,
    },
    { // 22: <exp5> ::= <exp6> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 23: <exp6> ::= <exp6> [#] `* <exp7> @newTimes(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((12<<5)|0x5)/*methodCall:12*/,
    },
    { // 24: <exp6> ::= <exp7> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 25: <exp7> ::= <cast exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 26: <exp7> ::= <unary exp> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 27: <cast exp> ::= [#] `( <type> `) <cast exp> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 28: <cast exp> ::= [#] `( <type> `) <exp8> @newCast(int,Type,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((13<<5)|0x5)/*methodCall:13*/,
    },
    { // 29: <unary exp> ::= [#] `- <unary exp> @newUnaryMinus(int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((14<<5)|0x5)/*methodCall:14*/,
    },
    { // 30: <unary exp> ::= <exp8> @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 31: <exp8> ::= [#] ID @newIdentfierExp(int,String)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((15<<5)|0x5)/*methodCall:15*/,
    },
    { // 32: <exp8> ::= <exp8> !<empty bracket pair> [#] `[ <exp> `] @newArrayLookup(Exp,int,Exp)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((16<<5)|0x5)/*methodCall:16*/,
    },
    { // 33: <exp8> ::= [#] INTLIT @newIntegerLiteral(int,int)=>Exp
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((17<<5)|0x5)/*methodCall:17*/,
    },
    { // 34: letter ::= {"A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 35: letter128 ::= {193..218 225..250} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 36: digit ::= {"0".."9"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 37: digit128 ::= {176..185} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 38: ws ::= " " @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 39: ws ::= {10} [registerNewline] @void
      ((7<<5)|0x6)/*nullProductionAction:7*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 40: `boolean ::= "#" "b" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 41: `boolean ::= "#" "b" "o" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 42: `class ::= "#" "c" "l" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 43: `class ::= "#" "c" "l" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 44: `void ::= "#" "v" "o" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 45: `void ::= "#" "v" "o" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 46: `int ::= "#" "i" "t" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 47: `int ::= "#" "i" "t" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 48: `public ::= "#" "p" "u" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 49: `public ::= "#" "p" "u" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x3)/*popOffPushBack:3*/,
    },
    { // 50: `* ::= "*" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 51: `* ::= "*" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 52: `( ::= "(" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 53: `( ::= "(" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 54: `) ::= ")" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 55: `) ::= ")" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 56: `{ ::= "{" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 57: `{ ::= "{" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 58: `} ::= "}" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 59: `} ::= "}" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 60: `- ::= "-" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 61: `- ::= "-" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 62: `+ ::= "+" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 63: `+ ::= "+" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 64: `= ::= "=" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 65: `= ::= "=" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 66: `[ ::= "[" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 67: `[ ::= "[" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 68: `] ::= "]" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 69: `] ::= "]" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 70: `; ::= ";" ws* @void
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 71: `; ::= ";" [ws*] @void
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x3)/*popOffPushBack:1*/,
    },
    { // 72: ID ::= letter128 ws* @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 73: ID ::= letter128 [ws*] @text
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x4)/*stringConcat:1*/,
    },
    { // 74: ID ::= letter idChar* $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 75: ID ::= letter [idChar*] $$0 @text
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((3<<5)|0x4)/*stringConcat:3*/,
    },
    { // 76: INTLIT ::= {"1".."9"} digit* $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 77: INTLIT ::= {"1".."9"} [digit*] $$1 @convertToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((19<<5)|0x5)/*methodCall:19*/,
    },
    { // 78: INTLIT ::= digit128 ws* @convertToInt(char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 79: INTLIT ::= digit128 [ws*] @convertToInt(char)=>int
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((20<<5)|0x5)/*methodCall:20*/,
    },
    { // 80: INTLIT ::= "0" hexDigit* $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 81: INTLIT ::= "0" [hexDigit*] $$2 @convert16ToInt(char,List<Character>,char)=>int
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((21<<5)|0x5)/*methodCall:21*/,
    },
    { // 82: idChar ::= letter @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 83: idChar ::= digit @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 84: idChar ::= "_" @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 85: idChar128 ::= letter128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 86: idChar128 ::= digit128 @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 87: idChar128 ::= {223} @underscore(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((22<<5)|0x5)/*methodCall:22*/,
    },
    { // 88: hexDigit ::= {"0".."9" "A".."Z" "a".."z"} @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 89: hexDigit128 ::= {176..185 193..198 225..230} @sub128(char)=>char
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((18<<5)|0x5)/*methodCall:18*/,
    },
    { // 90: <stmt>* ::= <stmt>* <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 91: <stmt>* ::= [<stmt>*] <stmt> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0x6)/*nullProductionAction:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 92: <decl in class>* ::= <decl in class>* <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 93: <decl in class>* ::= [<decl in class>*] <decl in class> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((2<<5)|0x6)/*nullProductionAction:2*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 94: ws* ::= ws* ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
    },
    { // 95: ws* ::= [ws*] ws @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((3<<5)|0x6)/*nullProductionAction:3*/,
    },
    { // 96: digit* ::= digit* digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 97: digit* ::= [digit*] digit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((5<<5)|0x6)/*nullProductionAction:5*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 98: hexDigit* ::= hexDigit* hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 99: hexDigit* ::= [hexDigit*] hexDigit @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((0<<5)|0x6)/*nullProductionAction:0*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 100: idChar* ::= idChar* idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 101: idChar* ::= [idChar*] idChar @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((4<<5)|0x6)/*nullProductionAction:4*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 102: <class decl>+ ::= <class decl> @singleList
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xa)/*singleList:1*/,
    },
    { // 103: <class decl>+ ::= <class decl>+ <class decl> @append
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
      ((1<<5)|0xb)/*append:1*/,
    },
    { // 104: $$0 ::= idChar128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 105: $$0 ::= idChar128 [ws*] @pass
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 106: $$1 ::= digit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 107: $$1 ::= digit128 [ws*] @pass
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 108: $$2 ::= hexDigit128 ws* @pass
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
    { // 109: $$2 ::= hexDigit128 [ws*] @pass
      ((3<<5)|0x6)/*nullProductionAction:3*/,
      ((1<<5)|0xe)/*popPos:1*/,
      ((1<<5)|0x0)/*popToPushBack:1*/,
    },
};
public String[] getNullProdNameTable() { return nullProdNameTable; }
private String[] nullProdNameTable = {
    "hexDigit* ::=", // hexDigit*
    "<stmt>* ::=", // <stmt>*
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
      ((6<<5)|0x6)/*nullProductionAction:6*/,
      ((23<<5)|0x5)/*methodCall:23*/,
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
      Exp result = actionObject.newTimes(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 13: {
      int parm0 = (Integer)si.popPb();
      Type parm1 = (Type)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newCast(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 14: {
      int parm0 = (Integer)si.popPb();
      Exp parm1 = (Exp)si.popPb();
      Exp result = actionObject.newUnaryMinus(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 15: {
      int parm0 = (Integer)si.popPb();
      String parm1 = (String)si.popPb();
      Exp result = actionObject.newIdentfierExp(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 16: {
      Exp parm0 = (Exp)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp parm2 = (Exp)si.popPb();
      Exp result = actionObject.newArrayLookup(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 17: {
      int parm0 = (Integer)si.popPb();
      int parm1 = (Integer)si.popPb();
      Exp result = actionObject.newIntegerLiteral(parm0,parm1);
      si.pushPb(result);
    }
    break;
    case 18: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.sub128(parm0);
      si.pushPb(result);
    }
    break;
    case 19: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 20: {
      char parm0 = (Character)si.popPb();
      int result = actionObject.convertToInt(parm0);
      si.pushPb(result);
    }
    break;
    case 21: {
      char parm0 = (Character)si.popPb();
      List<Character> parm1 = (List<Character>)si.popPb();
      char parm2 = (Character)si.popPb();
      int result = actionObject.convert16ToInt(parm0,parm1,parm2);
      si.pushPb(result);
    }
    break;
    case 22: {
      char parm0 = (Character)si.popPb();
      char result = actionObject.underscore(parm0);
      si.pushPb(result);
    }
    break;
    case 23: {
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
"Exp newTimes(Exp,int,Exp)",
"Exp newCast(int,Type,Exp)",
"Exp newUnaryMinus(int,Exp)",
"Exp newIdentfierExp(int,String)",
"Exp newArrayLookup(Exp,int,Exp)",
"Exp newIntegerLiteral(int,int)",
"char sub128(char)",
"int convertToInt(char,List<Character>,char)",
"int convertToInt(char)",
"int convert16ToInt(char,List<Character>,char)",
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
2,1,
2,1,
3,1,
2,1,
1,1,
3,1,
1,1,
3,1,
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
    1,
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
    1,
    -1,
    -1,
    1,
    -1,
    -1,
    1,
    -1,
    0,
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
    1,
    1,
    1,
    1,
    1,
    1,
    -1,
    1,
    -1,
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

expC
====
大学の情報科学実験Cで必要になるメモリイメージの、
メモリ番地の書き込み
ex)
d8 -- LDIA
2
d9 -- LDIB
1
80 -- ADDA A is (2 + 1)
d8
1
d9
FF
80 -- ADDA A is (1 + (-1)) Z,C
80 -- ADDA A is 0 + (-1)
d8 -- LDIA
2
d9 -- LDIB
1
が
0000 d8 -- LDIA
0001 2
0002 d9 -- LDIB
0003 1
0004 80 -- ADDA A is (2 + 1)
0005 d8
0006 1
0007 d9
0008 FF
0009 80 -- ADDA A is (1 + (-1)) Z,C
000a 80 -- ADDA A is 0 + (-1)
000b d8 -- LDIA
000c 2
000d d9 -- LDIB
000e 1
になる

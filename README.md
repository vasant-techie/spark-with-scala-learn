# spark-with-scala-learn
\
Provided two Data Frames (DF1) and (DF2) as shown below, get the range wise output. Expected output is shown below as well.\
\
Data Frame #1 (DF1)\
###################\
ref | ver | count \
SB1 | 1 | 100 \
SB1 | 2 | 120 \
SB1 | 3 | 200 \
SB1 | 4 | 50 \
SB1 | 5 | 30 \
SB1 | 6 | 400 \
SB1 | 7 | 300 \
SB2 | 1 | 300 \
SB2 | 2 | 10 \
SB2 | 3 | 30 \
SB2 | 4 | 3000 \
SB2 | 5 | 140 \
SB2 | 6 | 180\
\
Data Frame #2 (DF2)\
###################\
0 to 50 \
51 to 100 \
101 to 150 \
151 to 350 \
351 to 1000 \
1001 to 1010 \
1011 to 10000\
\
Expected Output\
################\
Range wise count\
DF3 Range | count\ 
0 to 50, 4 \
51 to 100 = 1 \
101 to 150 = 2 \
151 to 350 = 4 \
Greater than 350 = 2 \
\

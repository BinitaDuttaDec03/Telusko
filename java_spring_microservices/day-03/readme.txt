1) Can you convert the following?
    byte b=127;
    int a=256;

    b = a; --> not allowed (since we are trying to expand the holding capacity of var b, which is not allowed in JAVA)
    a = b; --> allowed (since we are trying to narrow down the holding capacity of var a, which is not allowed in JAVA)

2) You cannot assign an integer to a byte format.
    int a = 12;
    byte b = a;  --> not allowed
    byte b = (byte)a;  --> allowed

3) int a = 257;
    byte k = (byte) a;   
    System.out.println(k);  

Java handles narrowing conversions by truncating higher-order bits, effectively taking the integer modulo 256 for the byte conversion range. Hence, 257 % 256 = 1 in the byte type range.
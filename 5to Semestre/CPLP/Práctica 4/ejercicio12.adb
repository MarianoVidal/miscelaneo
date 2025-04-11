    with text_io; use text_io;
Procedure Main is;
    type vector is array(integer range <>);
    a, n, p: integer;
    v1:vector(1..100);
    c1: constant integer:= 10;
Procedure Uno is;
    type puntero is access integer;
        v2:vector(0..n);
        c1, c2: character;
        p, q: puntero;
    begin
        n:= 4;
        v2(n):= v2(1) + v1(5);
        p:= new puntero;
        q:= p;
        free p;
        free q;
    end;
begin
    n:=5;
     Uno;
     a:=n+2;
end

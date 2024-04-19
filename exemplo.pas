program exemplo;
var
  a, b, c: boolean;
begin
  a := true;
  b := false;
  c := a AND b; // c recebe falso
  writeln(c);
  c := a OR b; // c recebe verdadeiro
  writeln(c);
  c := NOT a; // c recebe falso
  writeln(c);
  c := a XOR b; // c recebe verdadeiro
  writeln(c);
end.

%                             EJERCICIO 1
clc
clear all
x1=0;
y1=0;
r1=input("Escribe el Radio de la circunferencia en el origen: ");
x2=input("Escribe el valor X del punto; ");
y2=input("Escribe el valor Y del punto: ");
 
dist=sqrt(((x2-x1)^2)+((y2-y1)^2));
 
if dist<=r1
    texto="El punto esta dentro de circunferencia";
else
    texto="El punto no esta dentro de circunferencia";
end
disp(texto)
if x2>0 && y2>0
  cuad="Primer cuadrante";
elseif x2<0 && y2>0  
  cuad="Segundo cuadrante";
elseif x2<0 && y2<0  
  cuad="Tercer cuadrante";
elseif x2>0 && y2<0  
  cuad="Cuarto cuadrante";  
else
  cuad="Origen";
end
fprintf("El punto se encuentra en el %s",cuad)




%                             EJERCICIO 2

clc
clear all
a=input("Escribe un numero: ");
b=input("Escribe un numero: ");
c=input("Escribe un numero: ");
if c>b
    aux=b;
    b=c;
    c=aux;
end
if b>a
    aux=a;
    a=b;
    b=aux;
end
if c>b
    aux=b;
    b=c;
    c=aux;
end
l=[a,b,c];
disp(l)




%                             EJERCICIO 3
clc
clear all
num=input("escribe un numero de 3 digitos: ");
k=num2str(num);
longitud=length(k);
while longitud~=3
    num=input("escribe un numero de 3 digitos: ");
    k=num2str(num);
    longitud=length(k);
end
cen=str2num(k(1));
dec=str2num(k(2));
uni=str2num(k(3));
 
fprintf('Centenas %d\n',cen)
fprintf('Decenas %d\n',dec)
fprintf('Unidades %d\n',uni)




%                             EJERCICIO 4
clc
clear all
num=input("Escribe un numero: ");
if mod(num,1)~=0    
    if num>0
        entero=num-mod(num,1);
    elseif num<0
        entero=num+(1-mod(num,1))-1;
    end
else
    entero=num;
end
disp(entero)




%                             EJERCICIO 5
clc
clear all
num=input("Escribe un numero: ");
if mod(num,1)~=0
    if num>0
        entero=(num-mod(num,1))+1;
    elseif num<0
        entero=num+(1-mod(num,1));
    end
 else
    entero=num;
end
disp(entero)




%                             EJERCICIO 6
clc
clear all
num=input("Escribe un numero: ");
if mod(num,1)~=0
    if num>0
        entero=num-mod(num,1);
    elseif num<0
        entero=num+(1-mod(num,1));
    end
else
    entero=num;
end
disp(entero)



%                             EJERCICIO 7
clc;clear all
disp("Operaciones disponibles");
fprintf(" 1 -  Suma\n 2 -  Resta\n 3 -  Multiplicación\n 4 -  División\n");
op=input('Escribe el numero de la operacion a realizar: ');
while op<1 || op>4
    op=input('Escribe el numero de la operacion a realizar: ');
end
n1=input("Escribe el primer numero ");
n2=input("Escribe el segundo numero ");
 
if op==1
    res=n1+n2;
elseif op==2
    res=n1-n2;
elseif op==3
    res=n1*n2;
else
    while n2==0
        n2=input("Escribe otro numero (no puede ser cero): ");
    end
    res=n1/n2;
end
fprintf("El resultado es %f",res)




%                             EJERCICIO 8
clc
clear all
num=input("Escribe los pasos de la rana, de 1 a 6 (Nums de un dado): ");
while num<=0 || num>6 || mod(num,1)>0
    num=input("Escribe los pasos de la rana (1 a 6): ");
end
if num==1
    texto="un ";
elseif num==2
    texto="dos ";
elseif num==3
    texto="tres ";
elseif num==4
    texto="cuatro ";
elseif num==5
    texto="cinco ";
elseif num==6
    texto="seis ";
end
fprintf("La rana sube %spasos, pero inmediatamente desciende dos\n",texto)




%                             EJERCICIO 9
clc
clear all
x1=input("Escribe el eje X de la primer circunferencia: ");
y1=input("Escribe el eje Y de la primer circunferencia: ");
r1=input("Escribe el radio de la primer circunferencia: ");
x2=input("Escribe el eje X de la segunda circunferencia: ");
y2=input("Escribe el eje Y de la segunda circunferencia: ");
r2=input("Escribe el radio de la segunda circunferencia: ");
dist=sqrt(((x2-x1)^2)+((y2-y1)^2));

if dist>(r1+r2)
    texto="Exteriores";
elseif dist==r1+r2
    texto="Tangentes Exteriores";
elseif dist<(r1+r2) && dist>abs(r1-r2)    
    texto="Secantes";
elseif dist>0 && dist<abs(r1-r2)
    texto="Interiores";
elseif dist==(r1-r2)    
    texto="Tangentes Interiores";
elseif dist==0
    texto="Concentricas";
end

fprintf("Circunferencias %s",texto)





%                             EJERCICIO 10
clc
clear all
ang1=input("escribe el primer ángulo: ");
ang2=input("escribe el segundo ángulo: ");
ang3=input("escribe el tercer ángulo: ");
suma=ang1+ang2+ang3;
if suma==180
    if ang1==90 || ang2==90 ||ang3==90
        texto="Angulo Rectángulo";
    elseif ang1<90 && ang2<90 && ang3<90
        texto="Angulo Acutángulo";
    elseif ang1>90 || ang2>90 ||ang3>90
        texto="Angulo Obtusángulo";
    end
else
    texto="Los angulos no corresponden a un triangulo";
end
disp(texto)

/*
- Crear un programa en `JavaScript` que realice lo siguiente:

- Input
  - Solicitar por prompt tres datos y guardarlos en sus respectivas variables.

- Output
  - Mostrar los números por consola o DOM ordenados de mayor a menor, y de menor a mayor.
  - Mostrar un mensaje en consola o por el DOM si los números son iguales.
*/

// Ejecutado en NodeJS

const prompt = require("prompt-sync")();

var num1 = parseInt(prompt("Escribe un numero "));
var num2 = parseInt(prompt("Escribe un numero "));
var num3 = parseInt(prompt("Escribe un numero "));

let grande,medio, menor,arr=[],ax;

arr[0]=num1;
arr[1]=num2;
arr[2]=num3;


for (let i = 1; i >= 0; i--) {
    let na=arr[i],nb=arr[i+1],nx;
    if(nb<na){
        nx=na;
        na=nb;
        nb=nx;
        arr[i]=na;
        arr[i+1]=nb;
    }
}
//console.log(arr)

if(arr[2]<arr[1]){
    let a,b;
    a=arr[2];
    b=arr[1];
    arr[1]=a;
    arr[2]=b;
}
//console.log(arr)

if(arr[0]==arr[1]&&arr[1]==arr[2]){
    console.log("Los tres numeros: " + arr[0] +" son iguales")
}
else if(arr[0]==arr[1]){
    console.log("Los primeros dos numeros: " + arr[0] + " son iguales, el tercer numero es "+arr[2])
}
else if(arr[1]==arr[2]){
    console.log("El primer numero es "+ arr[0] +" los dos ultimos numeros: "+ arr[1] +"son iguales")
}
else{
    console.log("El numero menor es "+arr[0]+" el medio es "+arr[1]+' el mayor es '+arr[2])
    console.log("El numero mayor es "+arr[2]+" el medio es "+arr[1]+' el menor es '+arr[0])

}
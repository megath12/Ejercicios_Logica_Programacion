
/* 
- Crear un programa en `JavaScript` que realice lo siguiente:

- Pedir al usuario por prompt o input un número del 1 al 100 para adivinar un número secreto.

- Input
  - El dato ingresado por el usuario (número del 1 al 100).
  
- Output
  - Imprimir por consola o DOM un mensaje diciendo "Ups, el número secreto es incorrecto, vuelve a intentarlo." y volver a solicitarle que ingrese un número, en caso de no adivinar el número secreto.
  - Imprimir por consola o DOM un mensaje diciendo "Felicidades, adivinaste el número secreto." en caso de adivinar el número secreto.
  - Imprimr por consola o DOM la lista de númros introducidos antes de adivinar el número secreto.

 */

    
  // Ejecutado en NodeJS
  // instalar: npm install prompt-sync

    console.log("Adivina el numero")
    const prompt = require("prompt-sync")();
    let num = parseInt(prompt("Escribe un numero "));
    let nums=[];
    let cont=0;
    let numAleatorio =Math.round(Math.random()*100);
    //console.log("Num aleatorio "+numAleatorio)
    nums[cont]=num;
    while(!(num==numAleatorio)){
        cont++
        console.log("Ups, el número secreto es incorrecto, vuelve a intentarlo.")
        num = parseInt(prompt("Escribe otro numero "));
        nums[cont]=num;
    }
    console.log("Felicidades, adivinaste el número secreto.")
    console.log(nums)

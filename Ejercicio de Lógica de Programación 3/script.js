/* 
Crear un programa en `JavaScript` que realice lo siguiente:
- Input
  - Solicitar por prompt o input un número.
  
- Output
  - Imprimir por consola o DOM el factorial del número recibido.
 */

  // Ejecutado en NodeJS
  // instalar: npm install prompt-sync



const factor=(n)=>{
    if(n>1){
        return n*factor(n-1)
    }
    else{
        return 1
    }
}

const prompt = require("prompt-sync")();
let num = parseInt(prompt("Escribe un numero "));
let k=factor(num)
console.log("El factorial de " + num +" es: "+k);


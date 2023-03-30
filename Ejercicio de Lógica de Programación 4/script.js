/* 
Crear un programa en `JavaScript` que realice lo siguiente:

- Input
  - Solicitar por prompt o input un número.
  
- Output
  - Imprimir por consola o DOM la serie de fibonacci dependiendo el número recibido.
---  */

  
  // Ejecutado en NodeJS
  // instalar: npm install prompt-sync


  const fibo=(n)=>{
    if(n==1){
        console.log(0)
    }
    else if(n==2){
        console.log(0)
        console.log(1)
    }
    else{
        nu=0;
        n1=0;
        n2=1;
        console.log(0)
        console.log(1)
        for(let i=3;i<=n;i++){
            nu=n1+n2;
            console.log(nu);
            n1=n2;
            n2=nu;
        }
        
    }
}

const prompt = require("prompt-sync")();
let num = parseInt(prompt("Escribe un numero "));
let k=fibo(num)




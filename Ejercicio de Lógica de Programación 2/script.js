
/*

- Input
  - Solicitar al usuario por input o prompt la temperatura en grados Celcius

- Output
  - Imprimir por consola o DOM la temperatura ingresada convertida de grados Celsius a grados Farenheit.
  - Imprimir por consola o DOM la temperatura ingresada convertida de grados Celsius a grados Kelvin.

--- 

- Identificar si los números ingresados son de tipo `number`, en caso contrario debe mostrarse un mensaje de error y volver a solicitar los datos.
- Si no conoces las fórmulas para las conversiones, puedes apoyarte de `Google`.
- Recuerda convertir a number el valor solicitado por prompt y verificar que sea un número para evitar errores en tu programa.
- Recuerda que para mostrar mensajes por consola o por el DOM, debes crear un archivo `HTML` y enlazar tu script.

*/


function funcion(event){
    event.preventDefault();
    const numCelsius =parseInt(document.getElementById("numb").value);
    const conv1 = document.getElementById('conv1');
    const conv2 = document.getElementById('conv2');
    let ke = numCelsius+273.15;
    let fa = numCelsius*9/5 +32;
    let kelvin = ke+" K"
    let fahrenheit = fa+"° F"
    conv1.innerHTML=kelvin;
    conv2.innerHTML=fahrenheit;
}

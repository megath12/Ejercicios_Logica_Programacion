# Ejercicio 8

## Instrucciones

- Crear un programa en `Java` que realice lo siguiente:
- Input
  - Solicitar al usuario 10 números por consola y almacenarlos en un *array*
- Colocar todos los números primos a las primeras posiciones, desplazando el resto al final de forma que ningún número se pierda.
- Output
  - Mostrar por consola el array que contiene los números primos al inicio, mostrando el índice seguido del valor de la posición.
- El orden de los números **no importa** siempre y cuando los números primos se encuentren al inicio del array.

--- 

Input: 
``` Java
1, 2, 3, 4, 5, 6, 7, 8, 9, 10
```

Output: Array mostrando la posicion del array y el valor correspondiente
```Java
pos[0] = 1
pos[1] = 2
pos[2] = 3
pos[3] = 4
pos[4] = 5
pos[5] = 6
pos[6] = 7
pos[7] = 8
pos[8] = 9
pos[9] = 10

// Array ordenado

pos[0] = 2
pos[1] = 3
pos[2] = 5
pos[3] = 7
pos[4] = 1
pos[5] = 4
pos[6] = 6
pos[7] = 8
pos[8] = 9
pos[9] = 10

```

## Consideraciones:

- Agregar a ésta carpeta el archivo `.java` que contenga la clase principal, así como su método `void main`
- Hacer diferentes pruebas con numeros de input diferentes
- Puedes desarrollar el algoritmo y su pseudocódigo
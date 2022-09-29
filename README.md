# P1-Arrays
Ex_03

3. Escribe un programa que genere 20 números al azar entre 0 y 9. Estos números deben
de ser introducidos en un array de 4 filas y 5 columnas que se le pasará a una función
que lo mostrará. El programa aparte de visualizar los números tiene que mostrar las
sumas parciales de las filas y las columnas. En la esquina inferior derecha, saldrá la
suma total de la columna y fila de resultados. El programa debe de mostrar algo similar
a la siguiente tabla:

- Primero empezaremos creando un array multidimensional con 4 filas y 5 columnas (x[4][5]) el cual crearemos con un doble for,
 el cual uno sera filas y el otro columna y se iran llenando por la longitud de la propia array.

- Luego importaremos el paque java.util.random el cual utilizaremos la funcion random que sirve para poner numeros random y lo usaremos en toda la array con un bound de 10.

- Lo siguiente serà sobre sobrescribir con otro for y igualando los arrays nuestra segunda que crearemos con una fila y una columna mas,
 donde allí sumaremos los resultas de cada fila y columna con la primera array.
 
- Ahora crearemos una variable para empezar a sumar cada fila y le daremos 0 de valor, crearemos un for que recorra toda la fila hasta el ultimo no incluido y se ira sumando en la variable
 y al acabar el bucle se volvera a 0 para q lo vuelva a hacer con la siguiente, y a continuacion exactamente lo mismo pero con las columnas
 
 - Y ya solo nos faltaria sumar todos estos valores y ponerla en la posicion  [5][6] de la array.
 
 -Y luego el ultimo for para recorrel el array por filas y columnas y printearlo.

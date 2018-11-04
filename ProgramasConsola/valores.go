package main

import "fmt"

func main() {
	var suma = 5 + 5
	var div=8.5 / 2.2
	var caritaFeliz = ":D"
	var verdadFalso = 5 > 3
	const PI = 3.141592

	fmt.Println("Resultado de suma", suma)
	fmt.Println("Resultado de la división", div)
	fmt.Println("Hola " + caritaFeliz)
	fmt.Println("Resultado boolean", verdadFalso)
	fmt.Println("Resultado del áreá de un circulo: ", (PI * (div*div)))

	var a = 10.0; 
	var b = 12.0; 
	var c = 7.0;
	var volumen = (a * b * c) / 3
	fmt.Println("El volumen es de: ", volumen)

	// Declarar varias variables del mismo tipo
	var x, y, z = 10.0, 12.0, 7.0
	var volumen2 = (x * y * z) / 3
	fmt.Println("\nEl volumen es de: ", volumen2)

	var n int = 1
	
	qwerty := 806
	
	fmt.Println(n)
	fmt.Println(qwerty)
}
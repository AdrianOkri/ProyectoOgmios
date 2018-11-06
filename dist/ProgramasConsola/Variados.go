package main

import "fmt"

func menu() {
	
	var banner string =
	`
	                         _           _           
		/\   /\__ _ _ __(_) __ _  __| | ___  ___ 
		\ \ / / _  | '__| |/ _  |/ _  |/ _ \/ __|
		 \ V / (_| | |  | | (_| | (_| | (_) \__ \
		  \_/ \__,_|_|  |_|\__,_|\__,_|\___/|___/

		  1- Área de figuras
		  
		  2- Volumen de figuras
		  
		  3- Problema de calcular de promedio

		  4- Tablas de multiplicar

		  5- Cajero

		  99- Salir
	`
	fmt.Println(banner)
}

func areaFigura(lado, h float32, op int) {
	if op == 1 {
		fmt.Println("\n\nEl área del cuadrado es: ", (lado*lado))
	} else if op == 2 {
		fmt.Println("\n\nEl área del triángulo es: ", ((lado * h)/2))
	} else if op == 3 {
		fmt.Println("\n\nEl área del triángulo es: ", (3.14159265 * (lado * lado)))
	} else if op == 4 {
		fmt.Println("\n\nEl área del rombo es: ", (lado * h))
	}
}

func areaFiguras() {
	var op int = 0
	var x, y float32 = 0.0, 0.0
	var banner string = 
	`
		1- Cuadrado

		2- Triángulo

		3- Circulo

		4- Rombo

		5- Atrás
	`
	fmt.Println(banner)
	fmt.Print("Opción -> "); fmt.Scanln(&op)

	switch op {
		case 1: fmt.Print("Ingrese el lado: "); fmt.Scanln(&x); areaFigura(x,0.0,1)
		case 2: fmt.Print("Ingrese la base: "); fmt.Scanln(&x); fmt.Print("Ingrese la altura: "); fmt.Scanln(&y); areaFigura(x,y,2) 
		case 3: fmt.Print("Ingrese el radio: "); fmt.Scanln(&x); areaFigura(x,0.0,3)
		case 4: fmt.Print("Ingrese la base: "); fmt.Scanln(&x); fmt.Print("Ingrese la altura: "); fmt.Scanln(&y); areaFigura(x,y,4) 
	}
}

func volumenFiguras() {
	var banner string = 
	`
		1- Cubo

		2- Pirámide

		3- Esfera

		4- Cono
	`
	fmt.Println(banner)
}

func promedio() {
	fmt.Println("Promedio")
}

func tablasMulti() {
	fmt.Println("Tablas")
}

func cajero() {
	fmt.Println("Cajero")
}

func main() {
	op := 0
	
	for true {
		menu()
		fmt.Print("Opción: "); fmt.Scanln(&op)
		if op == 99 {	break }

		switch op {
			case 1: areaFiguras()
			case 2: volumenFiguras()
			case 3: promedio()
			case 4: tablasMulti()
			case 5: cajero()
		}
	}
}				 
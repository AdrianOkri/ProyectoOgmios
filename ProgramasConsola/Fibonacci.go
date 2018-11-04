package main

import "fmt"

var tamaño int = 0
var nombre string ="Fibonacci"

func main() {
	for true {
		banner()

		fmt.Print("\nTamaño: "); fmt.Scanln(&tamaño)
		if tamaño == 0 { break; }

		imprimirSerie()
		fmt.Scanln(&tamaño)
	}
}

func fibonacci(n int) int {
	if n > 1 { 
		return fibonacci(n-1) + fibonacci(n - 2)
	} else if n == 1 { 
		return 1 
	} else if n == 0 { 
		return 0 
	} else { 
		return -1 
	}
}

func imprimirSerie() {
	fmt.Println(nombre + " de tamaño ", tamaño, ":\n")
	for i := 0; i < tamaño; i++ {
		fmt.Print(" ", fibonacci(i));
	}
	fmt.Println();
}

func banner() {
	var fibo string = 
	`

		 _______  ___   _______  _______  __    _  _______  _______  _______  ___  
		|       ||   | |  _    ||       ||  |  | ||   _   ||       ||       ||   | 
		|    ___||   | | |_|   ||   _   ||   |_| ||  |_|  ||       ||       ||   | 
		|   |___ |   | |       ||  | |  ||       ||       ||       ||       ||   | 
		|    ___||   | |  _   | |  |_|  ||  _    ||       ||      _||      _||   | 
		|   |    |   | | |_|   ||       || | |   ||   _   ||     |_ |     |_ |   | 
		|___|    |___| |_______||_______||_|  |__||__| |__||_______||_______||___| 
	
	
	`
	fmt.Println(fibo)
}
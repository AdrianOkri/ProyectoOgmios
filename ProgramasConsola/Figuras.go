package main

import "fmt"

func menu() int {
	var op int = 1
	var banner string = 
	`
	

	 ________ ___  ________  ___  ___  ________  ________  ________      
	|\  _____\\  \|\   ____\|\  \|\  \|\   __  \|\   __  \|\   ____\     
	\ \  \__/\ \  \ \  \___|\ \  \\\  \ \  \|\  \ \  \|\  \ \  \___|_    
	 \ \   __\\ \  \ \  \  __\ \  \\\  \ \   _  _\ \   __  \ \_____  \   
	  \ \  \_| \ \  \ \  \|\  \ \  \\\  \ \  \\  \\ \  \ \  \|____|\  \  
	   \ \__\   \ \__\ \_______\ \_______\ \__\\ _\\ \__\ \__\____\_\  \ 
  	    \|__|    \|__|\|_______|\|_______|\|__|\|__|\|__|\|__|\_________\
			                                         \|_________|

		1 - Triángulo
	
		2 - Cuadrado

		3 - Rombo

		99- Salir 
	`
	fmt.Println(banner); 
	fmt.Print("Opción: "); fmt.Scanln(&op)
	return op
}

func trianguloNormal(tamaño int, c string) {
	for i := 0; i < tamaño; i++ {
		for j := 0; j <= i; j++ {
			fmt.Print(c)
		}
		fmt.Println("")
	}

	fmt.Println()
	for i:= 0; i < tamaño; i++ {
		for j := tamaño; j > i; j-- {
			fmt.Print(c)
		}
		fmt.Println()
	}
}

func trianguloInveroso(tamaño int, c string) {
	for i := 0; i < tamaño; i++ {
		for j := tamaño; j > i; j-- {
			fmt.Print(" ")
		}
		for j := 0; j <= i; j++ {
			fmt.Print(c)
		}
		fmt.Println()
	}
	fmt.Println()

	for i := 0; i < tamaño; i++ {
		for j := 0; j <= i; j++ {
			fmt.Print(" ");
		}
		for j := i; j < tamaño; j++ {
			fmt.Print(c);
		}
		fmt.Println();
	}
}

func trianguloEquilatero(tamaño int, c string) {
	fmt.Println();
	for i := 0; i < tamaño; i++ {
		for j := tamaño; j > i; j-- {
			fmt.Print(" ");
		}
		for j := 0; j <= i; j++ {
			fmt.Print(c);
		}
		for j := 0; j <= i; j++ {
			fmt.Print(c);
		}
		fmt.Println();
	}
}

func cuadrado(tamaño int, c string) {
	for i := 0; i < tamaño; i++ {
		if i == 0 || i == (tamaño - 1) {
			for  j := 1; j < tamaño; j++ {
				fmt.Print(" " + c);
			}
		} else {
			fmt.Print(c);
			for j := 1; j < (tamaño - 1); j++ {
				fmt.Print("  ");
			}
			fmt.Print(c);
		}
		fmt.Println();
	}
}

func rombo(tamaño int, c string) {
	for i := 0; i < tamaño; i++ {
		for j := tamaño; j > i; j-- {
			fmt.Print(" ");
		}
		for j := 0; j <= i; j++ {
			fmt.Print(c);
		}
		for j := 0; j <= i; j++ {
			fmt.Print(c);
		}
		fmt.Println();
	}
	for i := 0; i < tamaño; i++ {
		for j := 0; j <= i; j++ {
			fmt.Print(" ");
		}
		for j := i; j < tamaño; j++ {
			fmt.Print(c);
		}
		for j := i; j < tamaño; j++ {
			fmt.Print(c);
		}
		fmt.Println();
	}
}

func main()  {
	var op, tamaño int = 1, 10
	var c string = "*"
	
	for true {
		op = menu();
		
		if op == 99 {
			break
		}

		fmt.Print("Tamaño: "); fmt.Scanln(&tamaño)
		fmt.Print("Carácter: "); fmt.Scanln(&c)

		switch op {
			case 1: trianguloNormal(tamaño, c); trianguloInveroso(tamaño, c); trianguloEquilatero(tamaño, c);
			case 2: cuadrado(tamaño, c)
			case 3: rombo(tamaño, c)
		}
		
		
		fmt.Scanln()
	}

}
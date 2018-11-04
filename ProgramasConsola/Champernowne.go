package main

import ( 
	"fmt"
	"strconv"
)

func menu() {
	banner :=
	`
	 	 #####                                                                               
		#     # #    #   ##   #    # #####  ###### #####  #    #  ####  #    # #    # ###### 
		#       #    #  #  #  ##  ## #    # #      #    # ##   # #    # #    # ##   # #      
		#       ###### #    # # ## # #    # #####  #    # # #  # #    # #    # # #  # #####  
		#       #    # ###### #    # #####  #      #####  #  # # #    # # ## # #  # # #      
		#     # #    # #    # #    # #      #      #   #  #   ## #    # ##  ## #   ## #      
	 	 #####  #    # #    # #    # #      ###### #    # #    #  ####  #    # #    # ###### 
	
	  				Número de Champernowne - Lisbeth
	  
		
		
	`
	options :=
	`
		Base: Bits [2] - Octal [8] - Decimal [10] - Hexadecimal [16]

		Límite de la sucesión

		Salir [0]
	`	
	
	fmt.Println(banner)
	fmt.Println(options)
}

func secuencia(base, lim int) {
	var n string = "0."

	for i := 1; i <= lim; i++ {
		fmt.Println(n)
		n += strconv.FormatInt(int64(i),base)
	}
}

func main() {
	var base int = 10
	var lim int = 10

	for true {

		menu()

		fmt.Print("Base: "); fmt.Scanln(&base)
		fmt.Print("Límite: "); fmt.Scanln(&lim)

		if base != 0 && lim != 0 {
			secuencia(base,lim+1)
		} else {
			break
		}
		fmt.Scanln()
	}
}
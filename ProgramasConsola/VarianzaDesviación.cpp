// *******************  Incluir librerías  *******************
#include "iostream"
#include "string"
#include <stdlib.h>
#include <time.h>
#include <math.h>

using namespace std;
// *******************  Variables  *******************
const int lim = 50, rango = 50; // Definirá el tamaño del arreglo, y de los ciclos
int valores[lim], valoresCuadrado[lim], valorAux[lim]; // Arreglos
int num, i, j;
float media = 0;
// *******************  Funciones  *******************
void Banner() {
	cout << "                  vvvvvv vvvvvvvvvv          vvvvvvvv						  " << endl;
    cout << "vv         vv  vv vv    vv vvvvvvvvv          vv     vv vvvvvvv  vvvvvvvv	  " << endl;
	cout << " vv       vv  vvvv vv    vv    vv     vvvvvvv  vv     vv vv      vv		  " << endl;
	cout << "  vv     vv  vv  vv vv vvv      vv     vvvvvvv  vv     vv vv       vvvvvv	  " << endl;
	cout << "   vv   vv  vv~~~~vv vv    vv    vv              vv    vv  vvvvvv        vv  " << endl;
	cout << "    vv vv  vv~~~~~~vv vv    vv vvvvvvvv           vv   vv   vv            vv " << endl;
	cout << "     vvv  vv        vv vv    vv vvvvvvvv           vvvvv     vvvvvvvv vvvvvv " << endl;
	cout << "\n\n";
}
// Nos devuelve 50 números al azar, que serán los valores para la Varianza y Desviación Estándar
void NumeroAzar() {
  srand(time(NULL)); // Generar la "semilla" de números aleatorios
  for(i = 0; i < lim; i++) {
      num =  rand() % ((rango - 1) + 1); // Números aleatorios de 0 a 10
      valores[i] = num; // Guardar el número aleatorio en el arreglo
      cout << "[ " << num << " ] ";
  }
}

// Calcular media
void CalcularMedia() {
	for (i = 0; i < lim; i++) {
		media += valores[i];
	}
	media /= lim;
}
void RestarMediaElevar() {
	int a;
	for (i = 0; i < lim; i++) {
		a = valores[i] - media;
		valorAux[i] = pow(a , 2);
	}
}


// ******************* Varianza y Desviación Estándar *******************

void ObtenerV_D() {
	double varianza = 0, desviacionEstandar = 0;
	
	CalcularMedia();
	RestarMediaElevar();
	
	for (i = 0; i < lim; i++) {
		varianza += valorAux[i];
	}
	varianza /= lim;
	desviacionEstandar = pow(varianza, 0.5);
	
	cout << "\n\n\n La varianza es de: " << varianza << endl;
	cout << "\n La Desviación Estándar es de: " << desviacionEstandar << endl;
	
}

// Restar media a cada dato
int main(int argc, char** argv) {
	Banner();
	NumeroAzar();
	ObtenerV_D();
	scanf("Enter para terminar");
	return 0;
}

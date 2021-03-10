# AndroidWithKotlin

Uso basico de Android con Kotlin

* Uso de ViewBinding, vinculación entre activity
* Uso de Intent para pasar parametro en pantallas, así como putExtra y startActivity
* Layouts
	* FrameLayout -> Vista sencilla
	* LinearLayout -> Permite la distribucion de la vista con propiedades de orientacion
	* ContraintLayout -> La mas potente e imagino que usada, permite "enganchar" los componentes a los margenes o entre componentes, redimensionado el espacio y tamaño de estos de manera mas responseiv, así como añadir guideline propios.
		* contraintBottom_toBottomOf -> Como ejemplo, pero varía de start to top o a componentes por id
		* constraintVertical/Horizontal_bias -> movimiento del compnente encadenado sobre su eje en el espacio dado.
			* contraintHorizonal/Vertical_chainStyle -> reSize del espacio entre los componentes.
		* GuideLine -> Permite configurar una linea imaginaria para enganchar.
			* contraintGuide_percent -> para colocar la linea imaginaria

# AndroidWithKotlin



Uso básico de Android con Kotlin



* Uso de ViewBinding, vinculación entre activity

* Uso de Intent para pasar parámetro en pantallas, así como putExtra y startActivity

* Layouts

	* FrameLayout -> Vista sencilla

	* LinearLayout -> Permite la distribución de la vista con propiedades de orientación

	* ConstraintLayout -> La más potente e imagino que usada, permite "enganchar" los componentes a los margenes o entre componentes, redimensionado el espacio y tamaño de estos de manera más responseiv, así como añadir guideline propios.

		* consraintBottom_toBottomOf -> Como ejemplo, pero varía de start to top o a componentes por id

		* constraintVertical/Horizontal_bias -> movimiento del componente encadenado sobre su eje en el espacio dado.

			* constraintHorizonal/Vertical_chainStyle -> reSize del espacio entre los componentes.

		* GuideLine -> Permite configurar una linea imaginaria para enganchar.

			* constraintGuide_percent -> para colocar la linea imaginaria
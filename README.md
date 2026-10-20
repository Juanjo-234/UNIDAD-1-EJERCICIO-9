Este programa está diseñado para modelar y gestionar el control de almacenamiento y capacidad de un **plan de hosting web** utilizando programación orientada a objetos (por ejemplo, en Java).

A continuación se detalla exactamente lo que hace cada parte del programa:

* **Define la clase `PlanHosting`:** Modela un plan de alojamiento web conteniendo sus atributos principales: el nombre de dominio asociado (`nombreDominio`), la capacidad máxima de almacenamiento permitida en gigabytes (`capacidadMaximaGB`) y el espacio que se encuentra actualmente ocupado (`espacioOcupadoGB`).
* **Incorpora constructor y validaciones:** Utiliza un constructor parametrizado para inicializar el plan y aplica validaciones para asegurar la consistencia de los datos (por ejemplo, que las capacidades no sean valores negativos).
* **Controla la subida de archivos (`subirArchivos`):** Implementa un método que recibe el peso en gigabytes (`pesoGB`) y evalúa si hay suficiente espacio libre. Incrementa el espacio ocupado únicamente si la suma no supera la capacidad máxima permitida, emitiendo una alerta por consola en caso de que se intente exceder el límite.
* **Ejecuta la prueba (`main`):** Instancia un objeto de tipo `PlanHosting`, simula el intento de subir varios archivos (incluyendo aquellos que sobrepasan la cuota máxima) y muestra los mensajes informativos y de alerta por consola.

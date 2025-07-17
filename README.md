Preguntas:
1.	¿Qué sucede si intento acceder directamente al atributo nombre desde el método main?

Sale Error y puede ocurrir porque el nombre es un atributo private, lo que significa que solo se puede usar dentro de su propia clase.
2.	¿Qué ventaja tiene utilizar métodos getter para mostrar información?

Un método getter permite leer un dato privado de forma segura, Los getters pueden incluir reglas o validaciones, y eso da más control sobre cómo se muestran los datos.
3.	¿Cómo garantizan los métodos setter un cambio controlado en los datos?

Un setter permite cambiar un valor privado de forma controlada, se pueden agregar condiciones dentro del método para aceptar solo ciertos, con esto se puede evitar errores y a su vez mantener la seguridad de los datos.
4.	¿Qué pasa si no creo métodos setter, se pueden cambiar los datos desde afuera? 

No. Si un atributo es private y no existe un setter, no se puede modificar desde fuera de la clase. El dato queda protegido y se mantiene sin cambios a menos que la misma clase lo permita a través de sus propios métodos.
5.	¿Por qué es recomendable tener atributos privados?

Porque protegen los datos. Nadie fuera de la clase puede cambiarlos directamente. Se deben usar getters y setters, lo que ayuda a tener más control y seguridad en el programa.


PREGUNTAS DE SELECCION

1.	 ¿Qué ocurre si declaras un atributo como `private`?
Respuesta: C) Solo se puede acceder desde métodos dentro de su propia clase.
2.	¿Para qué sirve un método getter?
Respuesta: B) Obtener el valor de un atributo privado desde fuera de la clase.
3.	¿Qué opción es verdadera sobre métodos privados?
Respuesta: B) Son accesibles únicamente dentro de la misma clase.
4.	¿Es obligatorio tener un constructor en una clase?
Respuesta: B) No, pero si no se define, Java genera uno por defecto.
5.	¿Qué hace un constructor sin parámetros?
Respuesta: B) Inicializa los atributos con valores predefinidos.
6.	¿Qué es verdadero sobre constructores con parámetros?
Respuesta: B) Permiten asignar valores al momento de crear el objeto.
7.	¿Cuál es el uso principal de la palabra clave this?
Respuesta: C) Referirse a los atributos de la clase actual.
8.	¿Cómo puedes acceder a un atributo privado desde el main()?
Respuesta: B) A través de métodos getter y setter públicos.
9.	¿Se puede enviar valores desde el main() a atributos privados?
Respuesta: B) Sí, usando setters o constructores con parámetros.
10.	¿Qué opción representa una buena práctica al trabajar con atributos privados?
Respuesta: C) Utilizar getters y setters para acceder o modificar valores.
11.	¿Qué ocurre si no defines ningún constructor?
Respuesta: B) Java genera un constructor vacío por defecto.
12.	¿Qué permite un constructor con parámetros?
Respuesta: B) Inicializar atributos con valores desde la creación del objeto.
13.	¿Qué ocurre si defines un constructor con parámetros y NO defines un constructor sin parámetros?
Respuesta: B) Solo se puede crear el objeto con datos.
14.	¿Qué ventaja tiene usar this dentro del constructor?
Respuesta: B) Evita conflictos de nombres entre atributos y parámetros.
15.	¿Un método puede tener parámetros y ser privado?
Respuesta: A) Sí, cualquier método puede tener parámetros y ser privado.
16.	¿Qué sucede si defines dos constructores: uno sin parámetros y otro con parámetros?
Respuesta: B) Puedes crear objetos de ambas formas.
17.	¿Se puede sobrecargar métodos dentro de la misma clase?
Respuesta: B) Sí, si los métodos tienen diferentes parámetros.
18.	¿Cuál es el principal objetivo de los métodos getter y setter?
Respuesta: B) Controlar acceso y modificación de atributos privados.
19.	¿Qué tipo de métodos son los getter y setter?
Respuesta: B) Públicos para acceder/controlar atributos privados.
20.	¿Por qué es mejor tener atributos privados y exponerlos mediante métodos?
Respuesta: A) Evita accesos no deseados y permite validación antes de modificar.


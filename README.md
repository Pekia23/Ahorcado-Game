# 🎮 Juego del Ahorcado

Este es un proyecto interactivo del clásico **juego del ahorcado**, desarrollado como parte de la asignatura *Computación e Interfaces*. El juego pone a prueba tus conocimientos relacionados con tecnología e informática, y mide tu capacidad para adivinar palabras antes de que Adrián (nuestro muñequito) sea completamente dibujado.

## 📌 Características principales

- Sistema de puntuación con bonificación por letras acertadas y penalización por errores.
- Ranking de jugadores con los mejores puntajes.
- Base de datos con control de sesiones de juego y palabras temáticas.
- Mockups que muestran el flujo de pantallas del juego.

## 🧩 Descripción del Juego

El jugador debe adivinar una palabra oculta digitando letras. Si la letra existe en la palabra, se revela en la posición correspondiente. Si no, se dibuja una parte del cuerpo del personaje Adrián. El jugador gana si completa la palabra antes de que se dibujen las 6 partes del cuerpo (cabeza, torso, brazos, piernas).

## 🗃️ Base de Datos

El proyecto utiliza una base de datos llamada `ahorcado` con las siguientes tablas:

### `jugadores`
| Campo        | Tipo        | Descripción                         |
|--------------|-------------|-------------------------------------|
| id_jugador   | INT         | Identificador del jugador           |
| apodo        | VARCHAR(45) | Nombre único del jugador            |
| puntaje      | INT         | Puntaje acumulado                   |

### `eventos`
| Campo     | Tipo         | Descripción                                     |
|-----------|--------------|-------------------------------------------------|
| id_evento | INT          | Identificador del evento                        |
| jugador   | VARCHAR(45)  | Apodo del jugador                               |
| estado    | VARCHAR(20)  | Resultado del juego (ganó/perdió)               |
| palabra   | VARCHAR(45)  | Palabra que debía adivinar                      |
| puntuación| INT          | Puntuación obtenida en esa partida              |

### `palabras`
| Campo            | Tipo         | Descripción                                          |
|------------------|--------------|------------------------------------------------------|
| id_palabra       | VARCHAR(45)  | Identificador de la palabra                         |
| palabra          | VARCHAR(30)  | Palabra del juego (temas de tecnología/sistemas)   |
| cantidad_letras  | INT          | Número de letras de la palabra                      |
| cantidad_espacio | INT          | Número de espacios (si aplica)                      |

## 🧮 Sistema de Puntaje

- ✅ +100 puntos por cada letra adivinada correctamente.
- ❌ -50 puntos por cada error.
- ⚠️ Máximo de 6 errores antes de perder la partida.
- 📊 El puntaje es acumulativo a lo largo de diferentes partidas.

> 🛠️ **Nota:** El sistema de asignación de puntos puede mejorarse en futuras versiones, integrando factores como el tiempo de respuesta, dificultad de la palabra, o un sistema de bonificación progresiva.

## 🏆 Ranking

El ranking se calcula automáticamente mostrando los **5 jugadores con mayor puntaje acumulado**, extraídos mediante una consulta a la base de datos.

## 🖼️ Mockups del Juego
![image](https://github.com/user-attachments/assets/ce42d339-86c8-41f5-ba03-030d2253e510)


![image](https://github.com/user-attachments/assets/56a86532-e9fb-4285-a8e5-3710a5c1473b)


![image](https://github.com/user-attachments/assets/307da558-842e-487a-8e0f-89081191cabb)





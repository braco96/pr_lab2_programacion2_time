# PR_LAB2_PROGRAMACION2_TIME
**Autor:** Luis Bravo  
**Curso:** 2017–2018  
**Asignatura:** Programación II — Laboratorio 2

## Descripción
Laboratorio sobre **interfaces** y **polimorfismo** en Java modelando el tiempo de dos formas equivalentes:
- `TimeHMS`: representación **HH:MM:SS** (horas, minutos, segundos).
- `TimeSec`: representación por **segundos totales**.

Ambas implementan la interfaz `Time` y ofrecen operaciones de **construcción, suma, resta, comparación, conversión** y salida formateada.  
La guía completa se incluye en `docs/guia.pdf`.

## Estructura
```
src/
 ├─ main/java/aed/time/
 │   ├─ Time.java
 │   ├─ TimeHMS.java
 │   └─ TimeSec.java
 └─ test/java/aed/time/
     └─ Tester.java
docs/
 └─ guia.pdf
```

## Uso
```bash
# Compilar
mvn clean compile

# Ejecutar los tests
mvn test
```

## Notas
- El diseño favorece el **intercambio transparente** entre implementaciones (`TimeHMS` ↔ `TimeSec`) gracias a la interfaz común.
- Se recomienda comprobar equivalencias y normalizaciones (p.ej., arrastre de segundos/minutos).

— *Luis Bravo*
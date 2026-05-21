# Gestor de Inventario - Tienda de Videojuegos

Aplicación de consola en Java que permite gestionar el inventario de una tienda de videojuegos,
incluyendo videojuegos y consolas, con control de stock, ventas y sistema de descuentos.

---

## Descripción

El proyecto implementa un sistema de gestión de inventario con las siguientes características:

- Catálogo de **videojuegos** y **consolas** con sus atributos específicos.
- **Herencia** desde una clase abstracta `Item`.
- **Gestión de excepciones** personalizadas (`StockAgotadoException`).
- **Sistema de descuentos** sobre el precio base.
- Operaciones CRUD: añadir, buscar, vender y eliminar ítems.

---

## Compilación y Ejecución

### Compilar

1. Abre el proyecto en NetBeans.
2. Haz clic derecho sobre el nombre del proyecto.
3. Selecciona la opción **Clean and Build**.

Esto limpiará archivos temporales anteriores y generará una nueva compilación del proyecto.

### Ejecutar

Puedes ejecutar la aplicación de varias formas:

- Haz clic derecho sobre el proyecto y selecciona **Run**.
- También puedes pulsar el botón verde **Run Project** de la barra superior.
- Otra opción rápida es utilizar la tecla **F6**.

NetBeans iniciará automáticamente la aplicación principal del proyecto.

### Generar Javadoc

Para crear la documentación del proyecto:

1. Haz clic derecho sobre el proyecto.
2. Selecciona **Generate Javadoc**.

NetBeans generará la documentación en la carpeta `dist/javadoc/`.
Copia el contenido de esa carpeta dentro de **docs/** en la raíz del proyecto.

---

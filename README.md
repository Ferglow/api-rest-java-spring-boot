# API de Medicamentos

Una API REST desarrollada con Spring Boot para consultar información sobre medicamentos y sus indicaciones.

## Descripción

Esta aplicación proporciona endpoints para consultar información detallada sobre medicamentos, incluyendo nombres comerciales, vías de administración, dosis, indicaciones, contraindicaciones, efectos adversos y cuidados de enfermería.

## Características

- **Consulta de medicamentos**: Lista completa de medicamentos disponibles
- **Búsqueda por síntoma**: Encuentra medicamentos según indicaciones específicas
- **Información completa**: Incluye datos relevantes para profesionales de salud
- **API REST**: Endpoints fáciles de consumir

## Tecnologías Utilizadas

- **Java 17**
- **Spring Boot 3.5.3**
- **Spring Boot Starter Web**
- **Spring Boot Starter Actuator**
- **Maven** (gestión de dependencias)

## Instalación y Configuración

### Prerrequisitos

- Java 17 o superior
- Maven 3.6 o superior

### Instalación

1. Clona el repositorio:
```bash
git clone <url-del-repositorio>
cd medicamentos
```

2. Compila el proyecto:
```bash
./mvnw clean install
```

3. Ejecuta la aplicación:
```bash
./mvnw spring-boot:run
```

La aplicación estará disponible en `http://localhost:3000`

## Endpoints de la API

### 1. Verificación de estado
```
GET /
```
**Respuesta**: Mensaje de bienvenida

### 2. Listar todos los medicamentos
```
GET /medicamentos
```
**Respuesta**: Array JSON con todos los medicamentos disponibles

### 3. Buscar medicamentos por síntoma
```
GET /sintoma?sintoma={nombre_sintoma}
```
**Parámetros**:
- `sintoma`: Nombre del síntoma o indicación (ej: "Fiebre", "Dolor", "Nauseas")

**Respuesta**: Array JSON con medicamentos que tratan el síntoma especificado

## Estructura de Datos

Cada medicamento contiene la siguiente información:

```json
{
  "nombre": "paracetamol",
  "comercial": ["Dolex", "Panadol"],
  "via": ["oral", "rectal", "IV"],
  "dosis": "500-1000 mg cada 6-8h (max. 4g/dia)",
  "indicaciones": ["Fiebre", "Dolor leve a moderado"],
  "contraindicaciones": ["Insuficiencia hepatica grave"],
  "efectosAdversos": ["Nauseas", "Hepatoxicidad"],
  "cuidadosEnfermeria": ["No administrar con alcohol", "Controlar funcion hepatica si su uso es prolongado"]
}
```

## Medicamentos Disponibles

La API incluye información sobre los siguientes medicamentos:

- **Paracetamol** (Dolex, Panadol)
- **Metoclopramida** (Primperan, Plasil)
- **Ibuprofeno** (Advil, Motil)
- **Omeprazol** (Lozec, Zegerid)
- **Loratadina** (Claritin, Alerpriv)
- **Amoxicilina** (Amoxil, Trimox)
- **Diclofenaco** (Voltaren, Artren)
- **Salbutamol** (Ventonil, ProAir)
- **Loperamida** (Imodium)
- **Ketorolaco** (Dolac, Toradol)

## Ejemplos de Uso

### Obtener todos los medicamentos
```bash
curl http://localhost:3000/medicamentos
```

### Buscar medicamentos para fiebre
```bash
curl "http://localhost:3000/sintoma?sintoma=Fiebre"
```

### Buscar medicamentos para dolor
```bash
curl "http://localhost:3000/sintoma?sintoma=Dolor"
```

## Configuración del Servidor

- **Puerto**: 3000 (configurable en `application.properties`)
- **Contexto**: `/`
- **Actuator**: Habilitado para monitoreo

## Estructura del Proyecto

```
src/
├── main/
│   ├── java/
│   │   └── com/example/medicamentos/
│   │       ├── MedicamentosApplication.java
│   │       ├── MedicamentosController.java
│   │       └── Medicamento.java
│   └── resources/
│       └── application.properties
└── test/
    └── java/
        └── com/example/medicamentos/
            └── MedicamentosApplicationTests.java
```

## Desarrollo

### Ejecutar tests
```bash
./mvnw test
```

### Compilar JAR
```bash
./mvnw clean package
```

### Ejecutar JAR
```bash
java -jar target/medicamentos-0.0.1-SNAPSHOT.jar
```

## Consideraciones Importantes

⚠️ **Aviso**: Esta aplicación es para fines educativos y de referencia. No debe utilizarse como sustituto del consejo médico profesional. Siempre consulte a un profesional de la salud para obtener orientación médica adecuada.

## Contribuciones

1. Fork el proyecto
2. Crea una rama para tu característica (`git checkout -b feature/nueva-caracteristica`)
3. Commit tus cambios (`git commit -m 'Añadir nueva característica'`)
4. Push a la rama (`git push origin feature/nueva-caracteristica`)
5. Abre un Pull Request

## Licencia

Este proyecto está bajo la Licencia MIT - ver el archivo [LICENSE](LICENSE) para más detalles.

## Contacto

Para preguntas o sugerencias, por favor contacta al equipo de desarrollo.

---

*Desarrollado con Spring Boot y Java*
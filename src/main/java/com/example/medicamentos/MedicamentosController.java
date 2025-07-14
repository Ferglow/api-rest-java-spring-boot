package com.example.medicamentos;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController

public class MedicamentosController {

    private final List<Medicamento> medicamentos = List.of(
            Medicamento.createMedicamento(
                    "paracetamol",
                    List.of("Dolex", "Panadol"),
                    List.of("oral", "rectal", "IV"),
                    "500-1000 mg cada 6-8h (max. 4g/dia",
                    List.of("Fiebre", "Dolor leve a moderado"),
                    List.of("Insuficiencia hepatiza grave"),
                    List.of("Nauseas", "Hepatoxicidad")
            ),

            Medicamento.createMedicamento(
                    "metoclopramida",
                    List.of("Primperan", "Plasil"),
                    List.of("oral", "IM", "IV"),
                    "10 mg cada 6-8h",
                    List.of("Nuseas", "Vomito"),
                    List.of("Hemorragia gastrointestinal", "Epilepsia"),
                    List.of("Somnolencia", "Diarrea", "Mareos")
            ),

            Medicamento.createMedicamento(
                    "ibuprofeno",
                    List.of("Advil", "Motil"),
                    List.of("oral"),
                    "400-600 mg cada 6-8h (max. 2400 mg/dia",
                    List.of("Fiebre", "Dolor", "Inflamacion"),
                    List.of("Ulcera gastrica", "Insuficiencia renal"),
                    List.of("Dolor gastrico", "Nauseas")
            ),

            Medicamento.createMedicamento(
                    "omeprazol",
                    List.of("Lozec", "Zegerid"),
                    List.of("oral"),
                    "20-40 mg al dia",
                    List.of("Acidez", "Gastritis", "Reflujo"),
                    List.of("Ipersencibilidad al farmaco"),
                    List.of("Dolor abdominal", "Flatulencia", "Nauceas")
            ),

            Medicamento.createMedicamento(
                    "loratudina",
                    List.of("Claritin", "Alerpriv"),
                    List.of("oral"),
                    "10 mg al dia",
                    List.of("Rinitis", "Estornudo", "Picazon"),
                    List.of("Insuficiencia hepatiza grave"),
                    List.of("Somnolencia", "Sequedad bucal"),
                    List.of("Administrar preferiblemente de noche")
                    );

            new Medicamento(
                    "amoxicilina",
                    List.of("Amoxil", "Trimox"),
                    List.of("oral"),
                    "500 mg cada 8h por 7 dias",
                    List.of("Infeccion respiratoria", "Fiebre"),
                    List.of("Alergia a penicilinas"),
                    List.of("Diarrea", "Erupciones cutaneas"),
                    List.of("Verificar antecedentes alergicos", "Administrar con alimentos")
                    ),

            new Medicamento(
                    "diclofenaco",
                    List.of("Voltaren", "Artren"),
                    List.of("oral", "IM", "topica"),
                    "50 mg cada 8h",
                    List.of("Ulcera gastrica", "Asma inducida por AINES"),
                    List.of("Nauseas", "Hepatoxicidad"),
                    List.of("Dolor abdominal", "Mareos"),
                    List.of("Usar la minima dosis eficaz", "Evitar en pacientes con ulceras" )
                    ),

            new Medicamento(
                    "salbutamol",
                    List.of("Ventonil", "ProAir"),
                    List.of("inhalacion"),
                    "1 - 1 inhalaciones cada 4-6h",
                    List.of("Dificultad para respirar", "Tos"),
                    List.of("Hipertiroidismo no controlado", "Arritmias"),
                    List.of("Temblor", "Taquicardia"),
                    List.of("Supervisar frecuencia cardiaca", "Instruir en tecnica")

                    ),

            new Medicamento(
                    "loperamida",
                    List.of("Imodium"),
                    List.of("oral"),
                    "2 despeus de cada evacuacion diarreica (max. 8g/dia",
                    List.of("Diarrea", "Colicos"),
                    List.of("Colitis ulcerosa", "Diarrea infecciosa"),
                    List.of("Estreñimiento", "Dolor abdominal"),
                    List.of("Suspender si no hay mejoras en 48h", "Aumentar liquidos")
                    ),

            new Medicamento(
                    "ketorolaco",
                    List.of("Dolac", "Toradol"),
                    List.of("oral", "IM", "IV"),
                    "10 mg cada 6h (max. 40mg/dia oral)",
                    List.of("Dolro intenso", "Inflamacion"),
                    List.of("Ulcera peptica activa", "Isuficencia renal"),
                    List.of("Nauseas", "Somnolencia", "Dolor gastrico"),
                    List.of("Uso a corto plazo", "Evaluar funcion renal")
                    )

            );

    );

    @GetMapping("/")
    public String prueba(){
        return  "Hola Fernando";
    }

}

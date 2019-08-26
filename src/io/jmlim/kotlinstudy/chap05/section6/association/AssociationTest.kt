package io.jmlim.kotlinstudy.chap05.section6.association

class Patient(val name: String) {
    fun doctorList(d: Doctor) { //인자로 참조
        println("Patient: $name, Doctor: ${d.name}")
    }
}

class Doctor(val name: String) {
    fun patientList(p: Patient) {
        println("Doctor: $name, Patient: ${p.name}")
    }
}

fun main() {
    // 객체가 따로 생성됨
    val doc1 = Doctor("KimSaBu")
    val patient1 = Patient("Kildong")
    doc1.patientList(patient1)
    patient1.doctorList(doc1)
}
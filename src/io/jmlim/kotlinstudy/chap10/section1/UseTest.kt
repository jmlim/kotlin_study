package io.jmlim.kotlinstudy.chap10.section1

import java.io.File
import java.io.FileOutputStream
import java.io.PrintWriter

fun main() {
    PrintWriter(FileOutputStream("f:\\test\\output.txt")).use {
        it.println("hello")
    }

    val file = File("f:\\test\\output.txt")
    file.bufferedReader().use {
        println(it.readLine())
    }
}
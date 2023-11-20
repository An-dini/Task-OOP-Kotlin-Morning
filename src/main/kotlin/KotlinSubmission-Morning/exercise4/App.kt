package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini

    try {
        var num = arrayOf(10,12,23,32,44)
        var int = num[13]
        println(int)
    } catch (e: ArrayIndexOutOfBoundsException) {
        println(e)
    }



}
package amaliyot7

import FloppyDisk

fun main(args: Array<String>) {
    var cabbinet = Cabbinet()
    cabbinet.add(FloppyDisk())
    cabbinet.add(HardDrive())
    cabbinet.add(Memory())
    println("Cabinet Price: ${cabbinet.getPrice()}")//Bizga Barcha Mahsulotlarni Yigindisini ekranga chiqaradi
}
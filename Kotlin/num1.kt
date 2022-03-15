import java.util.*
import kotlin.collections.ArrayList

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val size = sc.nextInt()
    val list = ArrayList<Int>(size)
    var max = 0
    var position = 0

    for (i in 0 until 8) {
        val n = sc.nextInt()
        list.add(n)
    }

    for (i in list) {
        //list라는 array list에 [1,2,3] 이라는 값이 쌓여 있으면
        //n값을 추가한다. 그런 이후에 list[n] 값과 max 값을 비교하여 list의 값이 더 크면 max에 저장한다,
        if (list[position] > max) {
            max = list[position]
        }
    }
    print("${list.maxOrNull()} ${max}")
}

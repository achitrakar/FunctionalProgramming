def f(arr:List[Int]):List[Int] = {
    arr.map {
        case x if x < 0 => Math.abs(x)
        case x => x
    }
}

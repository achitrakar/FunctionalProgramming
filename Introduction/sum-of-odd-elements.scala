def f(arr:List[Int]):Int = {
    arr.foldLeft(0){
        case (a, v) if v % 2 != 0 => (a + v)
        case (a, _) => a
    }
}

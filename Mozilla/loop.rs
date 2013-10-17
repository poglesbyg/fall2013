use std::io;

fn main() {
    io::println("this was imported");
    
    let hi = "hi";

    let mut count = 0;

    while count < 10 {
        println(fmt!("%? count: %?", hi, count));
        count += 1;
    }
}

fun main(){
    // do type k null hote hai ek bina " ?" wala  isme hum null nhi daal skte isko hum non-nullable kehte hai  example ye rha
    val name:String="Moonlight"

    // aur ye dusrta type nullable isme Agar aapko lagta hai ki kisi variable me null aa sakta hai,
// toh aapko data type ke aage ? lagana padta hai.

    val firstName:String="Null"
    println(name.length) // .lenght hume no. of character batati hai . lemght
    println(firstName)// nullable me . lenght nhi hota hai qki value null hoti h



    // yha pr var keyword use kiya hai vo valus update k liye
    var fvtActor:String?="MAI KHUD"
    println(fvtActor)
fvtActor=null
    println(fvtActor)

    var number:Int?=24
    println(number)
    number=null
    println(number)


    // ek aur baat samjte hai
  // DONO NON-NULLABLE HAIN: Kaam ekdum aasan hai!
    val a=2
    val b=2
    println(a+b)

     //EK NULLABLE HAI: Ab dikkat shuru!
    val x:String?=null
    val y=2
// println(x + y) //  ERROR! Kotlin kahega: 'x' khali ho sakta hai, main plus kaise karun?


// "?." isko hum Safe Call Operator bolte hai
    //Case 1: Jab variable me sach me koi naam ho

    var singer: String? = "Sandra Oh"
    // Kotlin pehle check karega ki singer null hai?
    // Jawab mila: Nahi, isme "Sandra Oh" hai (jisme 9 letters hain).
    println(singer?.length)
    // Output aayega: 9

   //Case 2: Jab variable ekdum khali (null) ho
    var hero: String? = null

    // Kotlin check karega: Kya hero null hai?
    // Jawab mila: Haan, ye toh khali hai!
    // Safe Call ki wajah se program CRASH NAHI HOGA. Wo sidhe 'null' print kar dega.
    println(hero?.length)

    //Not-Null Assertion Operator "!!." ye hote hai jo "Main guarantee leta hoon ki is dibbe ke andar
// value hai aur ye null nahi hai. Tum bina dare iska kaam karo aur zyada sawal mat poocho!"
    //Computer aapki baat maan leta hai aur normal dot . ki tarah kaam karne lagta hai. Lekin
// agar aapki baat galat nikli, toh anjaam bohot bura hota hai.

    // Case 1: Jab sach me value ho (Sab sahi chalega)
    var favoriteActor: String? = "Sandra Oh"
    // Aapne kahana: "Mujhe pata hai ye null nahi hai, length batao!"
        // Computer ne check kiya, andar "Sandra Oh" tha. Sab badhiya!
        println(favoriteActor!!.length)
    // Output aayega: 9

    //Case 2: Jab variable null ho (App CRASH ho jayega!
    var dish: String? = null

    // Aapne kaha: "Ye null nahi hai, tum length nikal do!"
    // Computer ne dibba khola toh wo khali (null) tha!
   // println(dish!!.length)

    // CRASH! Aapko ye error milega:
    // Exception in thread "main" java.lang.NullPointerException


    //if/else conditionals   != (Not Equal To) operator ka use kiya jata hai.
var school:String?="UNIQUE"
    if (school!=null){
        println(school)// [Body 1] Agar null nahi hai, toh Kotlin variable ko smart-cast kar dega.
    }
else{
    println("dont have any value")// [Body 1] Agar null nahi hai, toh Kotlin variable ko smart-cast kar dega.
}


    //Use the ?: Elvis operator
    var food:String?=null
    var namelenght=food?.length?:0
    // Agat food null hai, toh ?. null return karega.
    // Jaise hi Elvis (?:) ne dekha ki left side null hai, usne turant '0' de diya!
    println(food) // same as it non nullable k liye hoga


}

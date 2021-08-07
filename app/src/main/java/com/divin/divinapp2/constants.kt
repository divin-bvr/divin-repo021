package com.divin.divinapp2



object constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getquestion(): ArrayList<Whoiam>{
        val questionlist = ArrayList<Whoiam>()

        val Q1 = Whoiam(
            1,
            "what do you see? Can you tell me what it is?",
            R.drawable.cars,
            "laptop",
            "car",
            "server",
            "ship",2)
        questionlist.add(Q1)

        val Q2 = Whoiam(
            2,
            "What do you see in this image?",
            R.drawable.chocolatecoffee,
            "laptop",
            "house",
            "chocolate tea",
            "ship",3)
        questionlist.add(Q2)

        val Q3 = Whoiam(
            3,
            "Is this a bugema office?",
            R.drawable.coffeeshop,
            "goat",
            "people",
            "tea office",
            "coffee shop",4)
        questionlist.add(Q3)

        val Q4 = Whoiam(
            4,
            "Please, how can I call this ?",
            R.drawable.diningroom,
            "dining room",
            "house",
            "bedroom",
            "light",1)
        questionlist.add(Q4)

        val Q5 = Whoiam(
            5,
            "Who is this guy, do you Know him?",
            R.drawable.div,
            "laptop",
            "phone",
            "tea",
            "divin",4)
        questionlist.add(Q5)

        val Q6 = Whoiam(
            6,
            "What about this one?",
            R.drawable.guitar,
            "tablet",
            "food",
            "guitar",
            "microphone",3)
        questionlist.add(Q6)

        val Q7 = Whoiam(
            7,
            "One more question. what is this ?",
            R.drawable.house2,
            "tablet",
            "food",
            "microphone",
            "nice house",4)
        questionlist.add(Q7)

        val Q8 = Whoiam(
            8,
            "Can you select the correct name ?",
            R.drawable.house3,
            "tablet",
            "house",
            "radio",
            "night",2)
        questionlist.add(Q8)

        val Q9 = Whoiam(
            9,
            "Is this Bugema? Please, let me know!",
            R.drawable.house5,
            "tablet",
            "a house",
            "radio",
            "none",2)
        questionlist.add(Q9)

        val Q10 = Whoiam(
            10,
            "Ooh, what about this image ?",
            R.drawable.iphone,
            "tablet",
            "apple logo",
            "iphone",
            "book story",3)
        questionlist.add(Q10)

        val Q11 = Whoiam(
            11,
            "What do you see here?",
            R.drawable.library,
            "tablet",
            "library",
            "food",
            "school",2)
        questionlist.add(Q11)

        val Q12 = Whoiam(
            12,
            "Is this an Orange or a python?",
            R.drawable.livingroom,
            "living room",
            "house",
            "python",
            "bugema",1)
        questionlist.add(Q12)

        val Q13 = Whoiam(
            13,
            "Let select a good name!",
            R.drawable.livingroom2,
            "living room",
            "inside a ship",
            "your room",
            "hotel in arua",1)
        questionlist.add(Q13)

        val Q14 = Whoiam(
            14,
            "What can be this again?",
            R.drawable.notebook,
            "living room",
            "lab3",
            "new york",
            "notebook",4)
        questionlist.add(Q14)

        val Q15 = Whoiam(
            15,
            "What about this nice image",
            R.drawable.livingroom,
            "living room",
            "house",
            "divin",
            "bugema",1)
        questionlist.add(Q15)

        val Q16 = Whoiam(
            16,
            "This can be Congo, what do you think!",
            R.drawable.paris,
            "london",
            "paris",
            "congo",
            "pen",2)
        questionlist.add(Q16)

        val Q17 = Whoiam(
            17,
            "Can you tell me what you see?",
            R.drawable.phone,
            "television",
            "white house",
            "android phone",
            "plan",3)
        questionlist.add(Q17)

        val Q18 = Whoiam(
            18,
            "My Dear, what is this again ?",
            R.drawable.room_double,
            "microphone",
            "miniphone",
            "tablet",
            "bedroom",4)
        questionlist.add(Q18)

        val Q19 = Whoiam(
            19,
            "What do you think it can be ?",
            R.drawable.tech_mic,
            "tech mic",
            "miniphone",
            "tablet",
            "aircraft",1)
        questionlist.add(Q19)

        val Q20 = Whoiam(
            20,
            "This is nice,what is it again ?",
            R.drawable.tech_tablet,
            "a nice car",
            "big train",
            "cool tablet",
            "aircraft",3)
        questionlist.add(Q20)

        val Q21 = Whoiam(
            21,
            "OMG! Do you know this? ",
            R.drawable.nice_car,
            "tech mic",
            "ship",
            "gun",
            "nice car",4)
        questionlist.add(Q21)

        return questionlist

    }
}
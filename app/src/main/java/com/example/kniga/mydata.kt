package com.example.kniga

import android.icu.text.CaseMap

data class guide(val title:String,val descr:String,val image:Int)
object List {
    val List = arrayListOf(
        guide(
            title = "Быстрая доставка!",
            descr = "Ппыапавпаыпаыв ываывлалывавыа аываыва ываываыва цууцуцц уцацуацу ацуацуацуацу фыывфвыффы ыфвфыв adfsafas asfasf fasfasfa afsfasf fasfasf asfas\n"
                    + "dasdasdasd adssadasdas",
            R.id.img1
        ),
        guide (title = "Быстрая доставка!",
        descr = "Ппыапавпаыпаыв ываывлалывавыа аываыва ываываыва цууцуцц уцацуацу ацуацуацуацу фыывфвыффы ыфвфыв adfsafas asfasf fasfasfa afsfasf fasfasf asfas\n"
                + "dasdasdasd adssadasdas",
        R.id.fast2),
        guide (title = "Быстрая доставка!",
            descr = "Ппыапавпаыпаыв ываывлалывавыа аываыва ываываыва цууцуцц уцацуацу ацуацуацуацу фыывфвыффы ыфвфыв adfsafas asfasf fasfasfa afsfasf fasfasf asfas\n"
                    + "dasdasdasd adssadasdas",
            R.id.fast3)
    )
}




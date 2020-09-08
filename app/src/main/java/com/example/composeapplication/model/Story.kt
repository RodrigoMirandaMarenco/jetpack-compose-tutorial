package com.example.composeapplication.model

data class Story(
    val url: String,
    val title: String,
    val description: String,
    val date: String
) {
    companion object {
        fun fakeStoryList() = listOf(
            "https://socialbarrel.com/wp-content/uploads/2020/01/android.jpg",
            "https://lh3.googleusercontent.com/GTmuiIZrppouc6hhdWiocybtRx1Tpbl52eYw4l-nAqHtHd4BpSMEqe-vGv7ZFiaHhG_l4v2m5Fdhapxw9aFLf28ErztHEv5WYIz5fA",
            "https://dwkujuq9vpuly.cloudfront.net/news/wp-content/uploads/2020/03/Android-main.jpg",
            "https://lh3.googleusercontent.com/GTmuiIZrppouc6hhdWiocybtRx1Tpbl52eYw4l-nAqHtHd4BpSMEqe-vGv7ZFiaHhG_l4v2m5Fdhapxw9aFLf28ErztHEv5WYIz5fA",
            "https://zdnet3.cbsistatic.com/hub/i/2019/03/16/e118b0c5-cf3c-4bdb-be71-103228677b25/android-logo.png",
            "https://lh3.googleusercontent.com/GTmuiIZrppouc6hhdWiocybtRx1Tpbl52eYw4l-nAqHtHd4BpSMEqe-vGv7ZFiaHhG_l4v2m5Fdhapxw9aFLf28ErztHEv5WYIz5fA"
        ).mapIndexed { index, urlString ->
            Story(
                url = urlString,
                title = "Title $index",
                description = "Description $index",
                date = "2020"
            )
        }
    }
}
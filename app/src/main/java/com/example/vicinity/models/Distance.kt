package com.example.vicinity.models

import com.google.gson.annotations.Expose
import java.io.Serializable

class Distance(

    @Expose
    var text: String?,

    @Expose
    var value: Int?

): Serializable
package com.example.vicinity.models

import com.google.gson.annotations.Expose
import java.io.Serializable

class Duration(

    @Expose
    var text: String?,

    @Expose
    var value: Int?

): Serializable
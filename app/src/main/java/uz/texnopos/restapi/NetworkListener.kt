package uz.texnopos.restapi

import uz.texnopos.restapi.model.Model

interface NetworkListener {
    fun onSchoolClassesResponse(models: Model)
    fun onSchoolClassesFailure(message: String?)
}
package uz.texnopos.restapi

import uz.texnopos.restapi.model.Result

interface NetworkListener {
    fun onSchoolClassesResponse(models: List<Result>?)
    fun onSchoolClassesFailure(message: String?)
}
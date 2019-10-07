package tz.co.asoft.platform.core.usecase.permission.check

interface IPermissionCheckUseCase {
    val permitted get() = isPermitted()
    val notPermitted get() = !isPermitted()
    fun isPermitted(): Boolean
}
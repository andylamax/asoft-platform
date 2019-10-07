package tz.co.asoft.platform.media.usecase.permission.camera

import tz.co.asoft.platform.core.usecase.permission.check.IPermissionCheckUseCase
import tz.co.asoft.platform.core.usecase.permission.request.IPermissionRequestUseCase
import tz.co.asoft.platform.core.usecase.permission.request.PermissionRequestUseCase

actual fun CameraPermissionRequestUseCase(cameraPermCheckUC: IPermissionCheckUseCase): IPermissionRequestUseCase = PermissionRequestUseCase(cameraPermCheckUC, listOf(), "No Title", "No Message")
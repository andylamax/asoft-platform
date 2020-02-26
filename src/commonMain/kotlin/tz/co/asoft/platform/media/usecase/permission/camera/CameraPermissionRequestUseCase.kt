package tz.co.asoft.platform.media.usecase.permission.camera

import tz.co.asoft.platform.core.usecase.permission.check.IPermissionCheckUseCase
import tz.co.asoft.platform.core.usecase.permission.request.IPermissionRequestUseCase

@Deprecated("Doo not use this")
expect fun CameraPermissionRequestUseCase(cameraPermCheckUC: IPermissionCheckUseCase): IPermissionRequestUseCase
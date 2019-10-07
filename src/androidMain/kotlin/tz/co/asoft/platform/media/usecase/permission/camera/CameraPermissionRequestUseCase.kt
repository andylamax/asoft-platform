package tz.co.asoft.platform.media.usecase.permission.camera

import android.Manifest
import tz.co.asoft.platform.core.Ctx
import tz.co.asoft.platform.core.usecase.permission.check.IPermissionCheckUseCase
import tz.co.asoft.platform.core.usecase.permission.request.IPermissionRequestUseCase
import tz.co.asoft.platform.core.usecase.permission.request.PermissionRequestUseCase

actual fun CameraPermissionRequestUseCase(cameraPermCheckUC: IPermissionCheckUseCase): IPermissionRequestUseCase = PermissionRequestUseCase(cameraPermCheckUC, listOf(Manifest.permission.CAMERA), "Camera Permission", "This app needs permission to use your camera")
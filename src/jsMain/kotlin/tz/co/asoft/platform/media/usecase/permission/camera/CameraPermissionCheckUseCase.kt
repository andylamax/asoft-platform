package tz.co.asoft.platform.media.usecase.permission.camera

import tz.co.asoft.platform.core.Ctx
import tz.co.asoft.platform.core.usecase.permission.check.IPermissionCheckUseCase
import tz.co.asoft.platform.core.usecase.permission.check.PermissionCheckUseCase

actual fun CameraPermissionCheckUseCase(ctx: Ctx): IPermissionCheckUseCase = PermissionCheckUseCase(ctx, "Camera")
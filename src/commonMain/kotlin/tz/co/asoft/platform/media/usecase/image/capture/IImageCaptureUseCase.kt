package tz.co.asoft.platform.media.usecase.image.capture

import tz.co.asoft.platform.core.Activity

interface IImageCaptureUseCase {
    operator fun invoke(a: Activity)
}
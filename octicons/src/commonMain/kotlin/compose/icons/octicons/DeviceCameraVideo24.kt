package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.DeviceCameraVideo24: ImageVector
    get() {
        if (_deviceCameraVideo24 != null) {
            return _deviceCameraVideo24!!
        }
        _deviceCameraVideo24 = Builder(name = "DeviceCameraVideo24", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 5.25f)
                verticalLineToRelative(13.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.136f, 0.643f)
                lineTo(16.5f, 15.075f)
                verticalLineToRelative(2.175f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 14.75f, 19.0f)
                horizontalLineToRelative(-13.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 0.0f, 17.25f)
                verticalLineToRelative(-11.0f)
                curveTo(0.0f, 5.284f, 0.784f, 4.5f, 1.75f, 4.5f)
                horizontalLineToRelative(13.0f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                verticalLineToRelative(2.175f)
                lineToRelative(6.364f, -3.818f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 24.0f, 5.25f)
                close()
                moveTo(15.0f, 6.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                horizontalLineToRelative(-13.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(13.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                verticalLineToRelative(-11.0f)
                close()
                moveTo(16.5f, 13.325f)
                lineTo(22.5f, 16.925f)
                lineTo(22.5f, 6.575f)
                lineToRelative(-6.0f, 3.6f)
                close()
            }
        }
        .build()
        return _deviceCameraVideo24!!
    }

private var _deviceCameraVideo24: ImageVector? = null

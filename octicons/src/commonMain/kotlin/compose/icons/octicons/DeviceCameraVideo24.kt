package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
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
                    pathFillType = EvenOdd) {
                moveTo(24.0f, 5.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.136f, -0.643f)
                lineTo(16.5f, 8.425f)
                lineTo(16.5f, 6.25f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, -1.75f, -1.75f)
                horizontalLineToRelative(-13.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 0.0f, 6.25f)
                verticalLineToRelative(11.0f)
                curveTo(0.0f, 18.216f, 0.784f, 19.0f, 1.75f, 19.0f)
                horizontalLineToRelative(13.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 1.75f, -1.75f)
                verticalLineToRelative(-2.175f)
                lineToRelative(6.364f, 3.818f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 24.0f, 18.25f)
                verticalLineToRelative(-13.0f)
                close()
                moveTo(16.5f, 13.325f)
                lineToRelative(6.0f, 3.6f)
                lineTo(22.5f, 6.575f)
                lineToRelative(-6.0f, 3.6f)
                verticalLineToRelative(3.15f)
                close()
                moveTo(15.0f, 9.75f)
                verticalLineToRelative(-3.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                horizontalLineToRelative(-13.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(13.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                verticalLineToRelative(-7.5f)
                close()
            }
        }
        .build()
        return _deviceCameraVideo24!!
    }

private var _deviceCameraVideo24: ImageVector? = null

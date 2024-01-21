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

public val Octicons.DeviceCameraVideo16: ImageVector
    get() {
        if (_deviceCameraVideo16 != null) {
            return _deviceCameraVideo16!!
        }
        _deviceCameraVideo16 = Builder(name = "DeviceCameraVideo16", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.75f)
                verticalLineToRelative(8.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.136f, 0.643f)
                lineTo(11.0f, 10.575f)
                verticalLineToRelative(0.675f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 9.25f, 13.0f)
                horizontalLineToRelative(-7.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 0.0f, 11.25f)
                verticalLineToRelative(-6.5f)
                curveTo(0.0f, 3.784f, 0.784f, 3.0f, 1.75f, 3.0f)
                horizontalLineToRelative(7.5f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                verticalLineToRelative(0.675f)
                lineToRelative(3.864f, -2.318f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 16.0f, 3.75f)
                close()
                moveTo(9.5f, 4.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                horizontalLineToRelative(-7.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(6.5f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(7.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                verticalLineToRelative(-6.5f)
                close()
                moveTo(11.0f, 8.825f)
                lineToRelative(3.5f, 2.1f)
                verticalLineToRelative(-5.85f)
                lineToRelative(-3.5f, 2.1f)
                close()
            }
        }
        .build()
        return _deviceCameraVideo16!!
    }

private var _deviceCameraVideo16: ImageVector? = null

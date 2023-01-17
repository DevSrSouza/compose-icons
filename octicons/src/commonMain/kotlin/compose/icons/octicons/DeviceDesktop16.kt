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

public val Octicons.DeviceDesktop16: ImageVector
    get() {
        if (_deviceDesktop16 != null) {
            return _deviceDesktop16!!
        }
        _deviceDesktop16 = Builder(name = "DeviceDesktop16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.25f, 1.0f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                verticalLineToRelative(7.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 14.25f, 12.0f)
                horizontalLineToRelative(-3.727f)
                curveToRelative(0.099f, 1.041f, 0.52f, 1.872f, 1.292f, 2.757f)
                arcTo(0.752f, 0.752f, 0.0f, false, true, 11.25f, 16.0f)
                horizontalLineToRelative(-6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.565f, -1.243f)
                curveToRelative(0.772f, -0.885f, 1.192f, -1.716f, 1.292f, -2.757f)
                horizontalLineTo(1.75f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 0.0f, 10.25f)
                verticalLineToRelative(-7.5f)
                curveTo(0.0f, 1.784f, 0.784f, 1.0f, 1.75f, 1.0f)
                close()
                moveTo(1.75f, 2.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(7.5f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(12.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                verticalLineToRelative(-7.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                close()
                moveTo(9.018f, 12.0f)
                horizontalLineTo(6.982f)
                arcToRelative(5.72f, 5.72f, 0.0f, false, true, -0.765f, 2.5f)
                horizontalLineToRelative(3.566f)
                arcToRelative(5.72f, 5.72f, 0.0f, false, true, -0.765f, -2.5f)
                close()
            }
        }
        .build()
        return _deviceDesktop16!!
    }

private var _deviceDesktop16: ImageVector? = null

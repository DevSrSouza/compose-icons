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

public val Octicons.DeviceDesktop16: ImageVector
    get() {
        if (_deviceDesktop16 != null) {
            return _deviceDesktop16!!
        }
        _deviceDesktop16 = Builder(name = "DeviceDesktop16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.75f, 2.5f)
                horizontalLineToRelative(12.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, 0.25f)
                verticalLineToRelative(7.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, 0.25f)
                horizontalLineTo(1.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, -0.25f)
                verticalLineToRelative(-7.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, -0.25f)
                close()
                moveTo(14.25f, 1.0f)
                horizontalLineTo(1.75f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 0.0f, 2.75f)
                verticalLineToRelative(7.5f)
                curveTo(0.0f, 11.216f, 0.784f, 12.0f, 1.75f, 12.0f)
                horizontalLineToRelative(3.727f)
                curveToRelative(-0.1f, 1.041f, -0.52f, 1.872f, -1.292f, 2.757f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 4.75f, 16.0f)
                horizontalLineToRelative(6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.565f, -1.243f)
                curveToRelative(-0.772f, -0.885f, -1.193f, -1.716f, -1.292f, -2.757f)
                horizontalLineToRelative(3.727f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 16.0f, 10.25f)
                verticalLineToRelative(-7.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 14.25f, 1.0f)
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

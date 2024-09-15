package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Bluetooth: ImageVector
    get() {
        if (_bluetooth != null) {
            return _bluetooth!!
        }
        _bluetooth = Builder(name = "Bluetooth", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(6.76f, 0.0f, 3.148f, 2.49f, 3.148f, 12.0f)
                reflectiveCurveTo(6.76f, 24.0f, 12.0f, 24.0f)
                curveToRelative(5.24f, 0.0f, 8.852f, -2.49f, 8.852f, -12.0f)
                reflectiveCurveTo(17.24f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(11.223f, 1.682f)
                lineToRelative(6.215f, 6.215f)
                lineTo(13.334f, 12.0f)
                lineToRelative(4.103f, 4.103f)
                lineToRelative(-6.215f, 6.215f)
                lineTo(11.223f, 14.125f)
                lineToRelative(-3.418f, 3.42f)
                lineToRelative(-1.242f, -1.244f)
                lineTo(10.851f, 12.0f)
                lineToRelative(-4.289f, -4.301f)
                lineToRelative(1.242f, -1.244f)
                lineToRelative(3.418f, 3.42f)
                lineTo(11.223f, 1.682f)
                close()
                moveTo(12.971f, 5.926f)
                verticalLineToRelative(3.969f)
                lineToRelative(1.984f, -1.984f)
                lineToRelative(-1.984f, -1.984f)
                close()
                moveTo(12.971f, 14.107f)
                verticalLineToRelative(3.967f)
                lineToRelative(1.984f, -1.984f)
                lineToRelative(-1.984f, -1.982f)
                close()
            }
        }
        .build()
        return _bluetooth!!
    }

private var _bluetooth: ImageVector? = null
